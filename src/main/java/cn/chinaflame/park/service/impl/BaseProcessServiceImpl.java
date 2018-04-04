package cn.chinaflame.park.service.impl;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.activiti.bpmn.model.BpmnModel;
import org.activiti.bpmn.model.FlowNode;
import org.activiti.bpmn.model.SequenceFlow;
import org.activiti.engine.FormService;
import org.activiti.engine.HistoryService;
import org.activiti.engine.IdentityService;
import org.activiti.engine.ManagementService;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.history.HistoricActivityInstance;
import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.impl.RepositoryServiceImpl;
import org.activiti.engine.impl.bpmn.behavior.UserTaskActivityBehavior;
import org.activiti.engine.impl.persistence.entity.ProcessDefinitionEntity;
import org.activiti.engine.impl.pvm.PvmActivity;
import org.activiti.engine.impl.pvm.PvmTransition;
import org.activiti.engine.impl.pvm.process.ActivityImpl;
import org.activiti.engine.impl.task.TaskDefinition;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.repository.ProcessDefinitionQuery;
import org.activiti.engine.runtime.Execution;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.activiti.image.ProcessDiagramGenerator;
import org.activiti.spring.ProcessEngineFactoryBean;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cn.chinaflame.park.exception.WorkflowException;
import cn.chinaflame.park.service.BaseProcessService;
import cn.chinaflame.park.util.CollectionUtil;
 
//import com.shine.util.CollectionUtil;
//import com.shine.workflow2.exception.WorkflowException;
 
/**
 *
 * 类说明: 常用工作流核心操作封装 .
 *
 * <pre>
 * 修改日期          修改人              修改原因
 * </pre>
 */
public class BaseProcessServiceImpl implements BaseProcessService {
	
   /**
     * log
     */
    private static Logger logger = LoggerFactory.getLogger(BaseProcessServiceImpl.class);
        
    @Autowired
    protected RepositoryService repositoryService;
     
    @Autowired
    protected RuntimeService runtimeService;
     
    @Autowired
    protected TaskService taskService;
     
    @Autowired
    protected HistoryService historyService;
     
    @Autowired
    protected IdentityService identityService;
    
    @Autowired
    protected ManagementService managementService;
    
    @Autowired
    protected FormService formService;
    
    @Autowired    
    protected ProcessEngineConfiguration processEngineConfiguration;    
   
    @Autowired
    protected ProcessEngineFactoryBean processEngine;

    protected static Map<String, ProcessDefinition> PROCESS_DEFINITION_CACHE = new HashMap<String, ProcessDefinition>();
    /**
	 * 获取图片流
	 * @Date 2017-1-3 15:11
	 * @param processDefinitionId
	 *            流程定义ID
	 * @param resourceName
	 *            资源名称
	 */
	public void readResource(String processDefinitionId, String resourceName,String pProcessInstanceId) throws Exception {
		ProcessDefinitionQuery pdq = repositoryService.createProcessDefinitionQuery();
		ProcessDefinition pd = pdq.processDefinitionId(processDefinitionId).singleResult();
		if (resourceName.endsWith(".png")&& StringUtils.isEmpty(pProcessInstanceId) == false) {
			getActivitiProccessImage(pProcessInstanceId);
			// ProcessDiagramGenerator.generateDiagram(pde, "png",
			// getRuntimeService().getActiveActivityIds(processInstanceId));
		} else {
			// 通过接口读取
			InputStream resourceAsStream = repositoryService.getResourceAsStream(pd.getDeploymentId(), resourceName);
			// 输出资源内容到相应对象
			byte[] b = new byte[1024];
			int len = -1;
			while ((len = resourceAsStream.read(b, 0, 1024)) != -1) {
			}
		}
	}

	/**
	 * 获取流程图像，已执行节点和流程线高亮显示
	 */
	public void getActivitiProccessImage(String pProcessInstanceId) {
		// logger.info("[开始]-获取流程图图像");
		try {
			// 获取历史流程实例
			HistoricProcessInstance historicProcessInstance = historyService
					.createHistoricProcessInstanceQuery()
					.processInstanceId(pProcessInstanceId).singleResult();
			if (historicProcessInstance == null) {
				// throw new BusinessException("获取流程实例ID[" + pProcessInstanceId
				// + "]对应的历史流程实例失败！");
			} else {
				// 获取流程定义
				ProcessDefinitionEntity processDefinition = (ProcessDefinitionEntity) ((RepositoryServiceImpl) repositoryService)
						.getDeployedProcessDefinition(historicProcessInstance
								.getProcessDefinitionId());
				// 获取流程历史中已执行节点，并按照节点在流程中执行先后顺序排序
				List<HistoricActivityInstance> historicActivityInstanceList = historyService
						.createHistoricActivityInstanceQuery()
						.processInstanceId(pProcessInstanceId)
						.orderByHistoricActivityInstanceId().asc().list();
				// 已执行的节点ID集合
				List<String> executedActivityIdList = new ArrayList<String>();
				int index = 1;
				// logger.info("获取已经执行的节点ID");
				for (HistoricActivityInstance activityInstance : historicActivityInstanceList) {
					executedActivityIdList.add(activityInstance.getActivityId());
					// logger.info("第[" + index + "]个已执行节点=" +
					// activityInstance.getActivityId() + " : "
					// +activityInstance.getActivityName());
					index++;
				}
				BpmnModel bpmnModel = repositoryService
						.getBpmnModel(historicProcessInstance
								.getProcessDefinitionId());
				// 已执行的线集合
				List<String> flowIds = new ArrayList<String>();
				// 获取流程走过的线 (getHighLightedFlows是下面的方法)
				flowIds = getHighLightedFlows(bpmnModel, processDefinition,
						historicActivityInstanceList);

				// 获取流程图图像字符流
				ProcessDiagramGenerator pec = processEngine
						.getProcessEngineConfiguration()
						.getProcessDiagramGenerator();
				// 配置字体
				InputStream imageStream = pec.generateDiagram(bpmnModel, "png",
						executedActivityIdList, flowIds, "宋体", "微软雅黑", "黑体",
						null, 2.0);

				// response.setContentType("image/png");
				OutputStream os = new FileOutputStream("D:\\activiti_1.png");
				int bytesRead = 0;
				byte[] buffer = new byte[8192];
				while ((bytesRead = imageStream.read(buffer, 0, 8192)) != -1) {
					os.write(buffer, 0, bytesRead);
				}
				os.close();
				imageStream.close();
			}
			// logger.info("[完成]-获取流程图图像");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// logger.error("【异常】-获取流程图失败！" + e.getMessage());
			// throw new BusinessException("获取流程图失败！" + e.getMessage());
		}
	}

	public List<String> getHighLightedFlows(BpmnModel bpmnModel,
			ProcessDefinitionEntity processDefinitionEntity,
			List<HistoricActivityInstance> historicActivityInstances) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 24小时制
		List<String> highFlows = new ArrayList<String>();// 用以保存高亮的线flowId

		for (int i = 0; i < historicActivityInstances.size() - 1; i++) {
			// 对历史流程节点进行遍历
			// 得到节点定义的详细信息
			FlowNode activityImpl = (FlowNode) bpmnModel.getMainProcess()
					.getFlowElement(
							historicActivityInstances.get(i).getActivityId());

			List<FlowNode> sameStartTimeNodes = new ArrayList<FlowNode>();// 用以保存后续开始时间相同的节点
			FlowNode sameActivityImpl1 = null;

			HistoricActivityInstance activityImpl_ = historicActivityInstances
					.get(i);// 第一个节点
			HistoricActivityInstance activityImp2_;

			for (int k = i + 1; k <= historicActivityInstances.size() - 1; k++) {
				activityImp2_ = historicActivityInstances.get(k);// 后续第1个节点

				if (activityImpl_.getActivityType().equals("userTask")
						&& activityImp2_.getActivityType().equals("userTask")
						&& df.format(activityImpl_.getStartTime()).equals(
								df.format(activityImp2_.getStartTime()))) // 都是usertask，且主节点与后续节点的开始时间相同，说明不是真实的后继节点
				{

				} else {
					sameActivityImpl1 = (FlowNode) bpmnModel.getMainProcess()
							.getFlowElement(
									historicActivityInstances.get(k)
											.getActivityId());// 找到紧跟在后面的一个节点
					break;
				}

			}
			sameStartTimeNodes.add(sameActivityImpl1); // 将后面第一个节点放在时间相同节点的集合里
			for (int j = i + 1; j < historicActivityInstances.size() - 1; j++) {
				HistoricActivityInstance activityImpl1 = historicActivityInstances
						.get(j);// 后续第一个节点
				HistoricActivityInstance activityImpl2 = historicActivityInstances
						.get(j + 1);// 后续第二个节点

				if (df.format(activityImpl1.getStartTime()).equals(
						df.format(activityImpl2.getStartTime()))) {// 如果第一个节点和第二个节点开始时间相同保存
					FlowNode sameActivityImpl2 = (FlowNode) bpmnModel
							.getMainProcess().getFlowElement(
									activityImpl2.getActivityId());
					sameStartTimeNodes.add(sameActivityImpl2);
				} else {// 有不相同跳出循环
					break;
				}
			}
			List<SequenceFlow> pvmTransitions = activityImpl.getOutgoingFlows(); // 取出节点的所有出去的线

			for (SequenceFlow pvmTransition : pvmTransitions) {// 对所有的线进行遍历
				FlowNode pvmActivityImpl = (FlowNode) bpmnModel
						.getMainProcess().getFlowElement(
								pvmTransition.getTargetRef());// 如果取出的线的目标节点存在时间相同的节点里，保存该线的id，进行高亮显示
				if (sameStartTimeNodes.contains(pvmActivityImpl)) {
					highFlows.add(pvmTransition.getId());
				}
			}

		}
		return highFlows;

	}	
    /**
     * 方法说明 ： 根据流程定义Key查询最新流程定义.
     *
     * @param processDefinitionKey  流程定义Key
     * @return
     * @throws WorkflowException
     */
    @Override
    public ProcessDefinition findLatestProcessDefinitionByPrcDefKey(String processDefinitionKey) throws WorkflowException{
        ProcessDefinition processDefinition = repositoryService.createProcessDefinitionQuery()
       .processDefinitionKey(processDefinitionKey)
       .latestVersion()
       .singleResult();
        return processDefinition;
                                 
    }
     
    /**
     * 方法说明 ： 根据流程定义Id查询最新流程定义.
     *
     * @param processDefinitionId 流程定义Id
     * @return
     * @throws WorkflowException
     */
    @Override
    public ProcessDefinition findProcessDefinitionByPrcDefId(String processDefinitionId) throws WorkflowException{
        ProcessDefinition processDefinition = repositoryService.createProcessDefinitionQuery()
                .processDefinitionId(processDefinitionId)
                .orderByProcessDefinitionVersion()
                .desc()
                .singleResult();
         
        return processDefinition;
    }
     
    /**
     * 方法说明 ： 根据流程定义Id查询流程定义.
     *
     * @param processDefinitionId  流程定义Id
     * @return 
     * @throws WorkflowException
     */
    @Override
    public ProcessDefinitionEntity findProcessDefinitionEntityByProcDefId(String processDefinitionId) throws WorkflowException{
        ProcessDefinitionEntity processDefinitionEntity  = (ProcessDefinitionEntity) ((RepositoryServiceImpl) repositoryService).getDeployedProcessDefinition(processDefinitionId);
        return processDefinitionEntity;
    }
     
    /**
     *
     * 方法说明  ： 根据流程实例Id查询流程实例.
     *
     * @param processInstanceId 流程实例Id
     * @return
     * @throws WorkflowException
     */
    @Override
    public ProcessInstance findProcessInstanceByProcInst(String processInstanceId) throws WorkflowException{
        return runtimeService.createProcessInstanceQuery()
                             .processInstanceId(processInstanceId)
                             .singleResult();
    }
     
     
    /**
     * 根据流程实例Id查询流程实例.
     *
     * @param processInstanceId
     * @return
     * @throws WorkflowException
     */
    @Override
    public Execution findExecutionByProcInst(String processInstanceId) throws WorkflowException{
        return runtimeService.createExecutionQuery().processInstanceId(processInstanceId).singleResult();
    }
     
    /**
     * 方法说明 ： 根据流程实例Id查询任务.
     *
     * @param processInstanceId 流程实例Id
     * @return
     * @throws WorkflowException
     */
    @Override
    public Task findTaskByProcInstId(String processInstanceId) throws WorkflowException{
        return taskService.createTaskQuery().processInstanceId(processInstanceId).singleResult();
    }
     
    /**
     * 方法说明 ： 根据实例Id查询任务.
     *
     * @param executionId 实例Id
     * @return
     * @throws WorkflowException
     */
    @Override
    public Task findTaskByExecutionId(String executionId) throws WorkflowException{
        return taskService.createTaskQuery().executionId(executionId).singleResult();
    }
     
    /**
     * 方法说明 ： 根据活动节点查询任务定义.
     *
     * @param activityImpl  活动节点
     * @return
     * @throws WorkflowException
     */
    @Override
    public TaskDefinition findTaskDefinitionByActivityImpl(ActivityImpl activityImpl) throws WorkflowException{
          return ((UserTaskActivityBehavior)activityImpl.getActivityBehavior()).getTaskDefinition(); 
    }
     
    /**
     * 方法说明 : 查询上一个节点.
     *
     * @param activityImpl 活动节点
     * @param activityId 当前活动节点ID 
     * @param elString
     * @return
     * @throws ShineException
     */
    @Override
    public TaskDefinition beforeTaskDefinition(ActivityImpl activityImpl,String activityId, String elString) throws WorkflowException {
        if("userTask".equals(activityImpl.getProperty("type")) && !activityId.equals(activityImpl.getId())){ 
            TaskDefinition taskDefinition = null;
            if(activityImpl != null){
                taskDefinition = findTaskDefinitionByActivityImpl(activityImpl);
            }
            return taskDefinition;
        }else{ 
            List<PvmTransition> inTransitions = activityImpl.getIncomingTransitions();   //通过活动节点查询所有线路
            if(CollectionUtil.isNotEmpty(inTransitions)){
                List<PvmTransition> inTransitionsTemp = null; 
                for(PvmTransition tr:inTransitions){   
                    PvmActivity ac = tr.getSource();      //获取线路的前节点   
                    if("exclusiveGateway".equals(ac.getProperty("type"))){ 
                        inTransitionsTemp = ac.getIncomingTransitions(); 
                        if(inTransitionsTemp.size() == 1){ 
                            return beforeTaskDefinition((ActivityImpl)inTransitionsTemp.get(0).getSource(), activityId, elString); 
                        }else if(inTransitionsTemp.size() > 1){ 
                            for(PvmTransition tr1 : inTransitionsTemp){ 
                                Object s = tr1.getProperty("conditionText"); 
                                if(elString.equals(StringUtils.replacePattern(StringUtils.trim(s.toString()), " ", ""))){ 
                                    return beforeTaskDefinition((ActivityImpl)tr1.getSource(), activityId, elString); 
                                } 
                            } 
                        } 
                    }
                }
            }
            return null; 
        } 
    }
     
     
    /**
     * 方法说明 : 查询下一个节点.
     *
     * @param activityImpl 活动节点
     * @param activityId 当前活动节点ID 
     * @param elString
     * @return
     * @throws ShineException
     */
    @Override
    public TaskDefinition nextTaskDefinition(ActivityImpl activityImpl,String activityId, String elString) throws WorkflowException {
         
        if("userTask".equals(activityImpl.getProperty("type")) && !activityId.equals(activityImpl.getId())){ 
            TaskDefinition taskDefinition = null;
            if(activityImpl != null){
                taskDefinition = findTaskDefinitionByActivityImpl(activityImpl);
            }
            return taskDefinition;
        }else{
            List<PvmTransition> outTransitions = activityImpl.getOutgoingTransitions();   //通过活动节点查询所有线路
            if(CollectionUtil.isNotEmpty(outTransitions)){
                List<PvmTransition> outTransitionsTemp = null; 
                for(PvmTransition tr:outTransitions){  
                    PvmActivity ac = tr.getDestination();         //获取线路的终点节点   
                    if("exclusiveGateway".equals(ac.getProperty("type"))){ 
                        outTransitionsTemp = ac.getOutgoingTransitions(); 
                        if(outTransitionsTemp.size() == 1){ 
                            return nextTaskDefinition((ActivityImpl)outTransitionsTemp.get(0).getDestination(), activityId, elString); 
                        }else if(outTransitionsTemp.size() > 1){ 
                            for(PvmTransition tr1 : outTransitionsTemp){ 
                                Object s = tr1.getProperty("conditionText"); 
                                if(s != null && elString.equals(StringUtils.replacePattern(StringUtils.trim(s.toString()), " ", ""))){ 
                                    return nextTaskDefinition((ActivityImpl)tr1.getDestination(), activityId, elString); 
                                } 
                            } 
                        } 
                    }else if("userTask".equals(ac.getProperty("type"))){ 
                        return findTaskDefinitionByActivityImpl((ActivityImpl)ac);
                    }
                    else if("startEvent".equals(ac.getProperty("type"))){ 
                        return findTaskDefinitionByActivityImpl((ActivityImpl)ac);
                    }
                    else{ 
                        logger.info(ac.getProperty("type").toString()); 
                    } 
                }
            }
            return null; 
        }
     
    }
     
    /**
     * 方法说明： 根据活动节点、活动线路查询线路的连接线.
     *
     * @return
     * @throws WorkflowException
     */
    @SuppressWarnings("rawtypes")
    @Override
    public PvmActivity findPvmActivity(ActivityImpl activityImpl, String transitions) throws WorkflowException{
         
        PvmActivity activity = null;
        List<PvmTransition> pvmTransitions = activityImpl.getOutgoingTransitions();   //获取所有线路
         
        for (Iterator iterator = pvmTransitions.iterator(); iterator.hasNext();) {
                PvmTransition pvmTransition = (PvmTransition) iterator.next();
                PvmActivity pvmActivity = pvmTransition.getDestination();           //获取下一个任务节点
                String transitionsVal = (String) pvmActivity.getProperty("name");
                if(transitions.equals(transitionsVal)){
                    activity = pvmActivity;
                    break;
                }
        }
        return activity;
    }
     
    /**
     * 方法说明 ：根据流程定义Id查询任务定义
     *
     * @param processDefinitionId 流程定义Id
     * @return
     * @throws WorkflowException
     */
    @Override
    public TaskDefinition findTaskDefinition(String processDefinitionId) throws WorkflowException{
         
        //获取流程定义
        ProcessDefinitionEntity processDefinitionEntity = findProcessDefinitionEntityByProcDefId(processDefinitionId);
        TaskDefinition tdf = null;
         
        if(processDefinitionEntity != null){
            List<ActivityImpl> activityImpls = processDefinitionEntity.getActivities();    //获取所有活动的节点
            for(int i = activityImpls.size() - 1; i > 0; i-- ){
                ActivityImpl activityImpl = activityImpls.get(i);    
                String startEventType = (String) activityImpl.getProperty("type");
                if("startEvent".equals(startEventType)){
                    tdf = nextTaskDefinition(activityImpl, activityImpl.getId(), null);
                }
            }  
        }
        return tdf;
    }
     
    /**
     * 方法说明 ： 添加任务意见.
     *
     * @param taskId      任务Id
     * @param processInstanceId   流程实例Id
     * @param comment     意见
     * @throws WorkflowException
     */
    @Override
    public void addTaskComment(String taskId,String processInstanceId,String comment) throws WorkflowException{
         taskService.addComment(taskId, processInstanceId, comment);
    }
     
    /**
     * 方法说明 ： 拾取任务.
     *
     * @param taskId  任务Id
     * @param operator 办理人
     * @throws WorkflowException
     */
    @Override
    public void claimTask(String taskId,String operator) throws WorkflowException{
         taskService.claim(taskId, operator);
    }
}
