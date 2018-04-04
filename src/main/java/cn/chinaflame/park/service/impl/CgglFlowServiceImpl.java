package cn.chinaflame.park.service.impl;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.activiti.engine.ActivitiObjectNotFoundException;
import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.history.HistoricProcessInstanceQuery;
import org.activiti.engine.history.HistoricTaskInstance;
import org.activiti.engine.history.HistoricTaskInstanceQuery;
import org.activiti.engine.impl.Page;
import org.activiti.engine.impl.RepositoryServiceImpl;
import org.activiti.engine.impl.interceptor.Command;
import org.activiti.engine.impl.persistence.entity.ProcessDefinitionEntity;
import org.activiti.engine.impl.persistence.entity.TaskEntity;
import org.activiti.engine.impl.pvm.process.ActivityImpl;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.runtime.ProcessInstanceQuery;
import org.activiti.engine.task.Task;
import org.activiti.engine.task.TaskQuery;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Lists;

//import com.moutum.mtplatform.common.utils.WorkFlowConstant;

import cn.chinaflame.park.cmd.DeleteActiveTaskCmd;
import cn.chinaflame.park.cmd.StartActivityCmd;
import cn.chinaflame.park.consts.WorkFlowConstant;
import cn.chinaflame.park.dao.Venue;
import cn.chinaflame.park.model.BaseModel;
import cn.chinaflame.park.model.PaVenue;
import cn.chinaflame.park.shiro.ShiroUser;
import cn.chinaflame.park.util.PageInfo;
import cn.chinaflame.park.vo.CommonVo;
import cn.chinaflame.park.vo.ProcessDefinitionVo;
import cn.chinaflame.park.vo.TaskVo;
import cn.chinaflame.park.vo.PaVenueVO;


public class CgglFlowServiceImpl extends  BaseProcessServiceImpl{
	protected final Logger logger =  LoggerFactory.getLogger(getClass());
	
	@Autowired
	private Venue venue;
    /**
     * 启动流程
     * @param <T>
     *
     * @param entity
     */
    public <T> ProcessInstance startWorkflow(PaVenueVO entity, Map<String, Object> variables) {
    	venue.add(entity.getVenue_name(), entity.getVenue_phone(), entity.getVenue_contact(), entity.getVenue_grade(), entity.getVenue_father(),
    			entity.getVenue_user(), entity.getVenue_remarks(), entity.getVenue_description(), 
    			entity.getVenue_start_time(), entity.getVenue_end_time(), entity.getVenue_image1(), entity.getVenue_image2(), entity.getVenue_image3(), entity.getVenue_image4());
        logger.debug("save entity: {}", entity);
        String businessKey = entity.getVenue_id().toString();
        ProcessInstance processInstance = null;
        try {
            // 用来设置启动流程的人员ID，引擎会自动把用户ID保存到activiti:initiator中
            identityService.setAuthenticatedUserId(entity.getUserId());

            processInstance = runtimeService.startProcessInstanceByKey("PaVenue", businessKey, variables);
            String processInstanceId = processInstance.getId();
            
            entity.setProcessInstanceId(processInstanceId);
            venue.update(entity.getVenue_id(),entity.getVenue_name(), entity.getVenue_phone(), entity.getVenue_contact(), entity.getVenue_grade(), entity.getVenue_father(),
        			entity.getVenue_user(), entity.getVenue_remarks(), entity.getVenue_description(), 
        			entity.getVenue_start_time(), entity.getVenue_end_time(), entity.getVenue_image1(), entity.getVenue_image2(), entity.getVenue_image3(), entity.getVenue_image4());
            logger.debug("start process of {key={}, bkey={}, pid={}, variables={}}",
                    new Object[] { "PaVenue", businessKey, processInstanceId, variables });
        } finally {
            identityService.setAuthenticatedUserId(null);
        }
        return processInstance;
    }

    /**
     * 查询待办任务
     *
     * @param userId
     *            用户ID
     * @return
     */
    @Transactional(readOnly = true)
    public List<PaVenueVO> findTodoTasks(String userId, PageInfo<PaVenue> page) {
        List<PaVenueVO> results = Lists.newArrayList();
        // 根据当前人的ID查询
        TaskQuery taskQuery = taskService.createTaskQuery().taskCandidateOrAssigned(userId);
        List<Task> tasks = taskQuery.list();

        // 根据流程的业务ID查询实体并关联
        for (Task task : tasks) {
            String processInstanceId = task.getProcessInstanceId();
            ProcessInstance processInstance = runtimeService.createProcessInstanceQuery()
                    .processInstanceId(processInstanceId).active().singleResult();
            String businessKey = processInstance.getBusinessKey();
            if (businessKey == null) {
                continue;
            }
            PaVenueVO pavenue = venue.queryById(new Integer(businessKey));
            pavenue.setTask(task);
            pavenue.setProcessInstance(processInstance);
            pavenue.setProcessDefinition(getProcessDefinition(processInstance.getProcessDefinitionId()));
            results.add(pavenue);
        }
        page.setTotal((int) taskQuery.count());
        page.setRows(results);
        return results;
    }

    private ProcessDefinition getProcessDefinition(String processDefinitionId) {
		return null;
	}

	/**
     * 读取运行中的流程
     *
     * @return
     */
    @Transactional(readOnly = true)
    public List<PaVenueVO> findRunningProcessInstaces(PageInfo<PaVenueVO> page) {
        List<PaVenueVO> results =Lists.newArrayList();
        ProcessInstanceQuery query = runtimeService.createProcessInstanceQuery().processDefinitionKey("PaVenue").active()
                .orderByProcessInstanceId().desc();
        List<ProcessInstance> list = query.listPage(page.getFrom(), page.getFrom()+page.getSize());
        // 关联业务实体
        for (ProcessInstance processInstance : list) {
            String businessKey = processInstance.getBusinessKey();
            if (businessKey == null) {
                continue;
            }
            PaVenueVO PaVenue = venue.queryById(new Integer(businessKey));
            if (PaVenue != null) {
                PaVenue.setProcessInstance(processInstance);
                PaVenue.setProcessDefinition(getProcessDefinition(processInstance.getProcessDefinitionId()));
                
                // 设置当前任务信息
                List<Task> tasks = taskService.createTaskQuery().processInstanceId(processInstance.getId()).active()
                        .orderByTaskCreateTime().desc().listPage(0, 1);
                PaVenue.setTask(tasks.get(0));
                
                results.add(PaVenue);
            }

        }
        page.setTotal((int) query.count());
        page.setRows(results);
        return results;
    }

    /**
     * 读取已结束中的流程
     *
     * @return
     */
    @Transactional(readOnly = true)
    public List<PaVenueVO> findFinishedProcessInstaces(PageInfo<PaVenueVO> page) {
        List<PaVenueVO> results = Lists.newArrayList();
        HistoricProcessInstanceQuery query = historyService.createHistoricProcessInstanceQuery()
                .processDefinitionKey("PaVenue").finished().orderByProcessInstanceEndTime().desc();
        List<HistoricProcessInstance> list = query.listPage(page.getFrom(), page.getFrom()+page.getSize());
        // 关联业务实体
        for (HistoricProcessInstance historicProcessInstance : list) {
            String businessKey = historicProcessInstance.getBusinessKey();
            PaVenueVO PaVenue = venue.queryById(new Integer(businessKey));
            PaVenue.setProcessDefinition(getProcessDefinition(historicProcessInstance.getProcessDefinitionId()));
            PaVenue.setHistoricProcessInstance(historicProcessInstance);
            results.add(PaVenue);
        }
        page.setTotal((int) query.count());
        page.setRows(results);
        return results;
    }
   // @Override
	public void selectProcessDefinitionDataGrid(PageInfo pageInfo) {
		List<ProcessDefinitionVo> list = new ArrayList<ProcessDefinitionVo>();
		//查询流程定义
		List<ProcessDefinition> pdList = repositoryService
				.createProcessDefinitionQuery()
				.orderByProcessDefinitionVersion()
				.asc()
				.listPage(pageInfo.getFrom(), pageInfo.getSize());
		//过滤出最新版本
		Map<String, ProcessDefinition> map = new LinkedHashMap<String, ProcessDefinition>();
        if(pdList!=null && pdList.size()>0){
            for(ProcessDefinition pd:pdList){
                map.put(pd.getKey(), pd);
            }
        }
        
        List<ProcessDefinition> mapList = new ArrayList<ProcessDefinition>(map.values());
        if(mapList!=null && mapList.size()>0){
        	for(ProcessDefinition pd : mapList){
    			ProcessDefinitionVo vo = new ProcessDefinitionVo(); 
    			String deploymentId = pd.getDeploymentId();
                Deployment deployment = repositoryService.createDeploymentQuery()
                		.deploymentId(deploymentId).singleResult();
                vo.setDeploymentId(deploymentId);
                vo.setDeployTime(deployment.getDeploymentTime());
                vo.setId(pd.getId());
                vo.setName(pd.getName());
                vo.setKey(pd.getKey());
                vo.setVersion(pd.getVersion());
                vo.setImageName(pd.getDiagramResourceName());
                vo.setResourceName(pd.getResourceName());
                vo.setSuspended(pd.isSuspended()?"2":"1");//挂起状态(1.未挂起 2.已挂起)
                list.add(vo);
    		}
        }
        pageInfo.setRows(list);
        //查询流程定义
        long count= repositoryService.createProcessDefinitionQuery().count();
        pageInfo.setTotal(Integer.parseInt(String.valueOf(count)));
	}

	//@Override
	public void selectTaskDataGrid(PageInfo pageInfo) {
		List<TaskVo> list = new ArrayList<TaskVo>();
		//获取Shiro中的用户信息
    	ShiroUser shiroUser= (ShiroUser)SecurityUtils.getSubject().getPrincipal();
    	
    	TaskQuery taskQuery= taskService.createTaskQuery().taskCandidateOrAssigned(shiroUser.getId());
		List<Task> taskList = taskQuery.orderByTaskCreateTime().desc()
				.listPage(pageInfo.getFrom(), pageInfo.getSize());
		
		for(Task task : taskList){
			TaskVo vo = new TaskVo();
			vo.setId(task.getId());
			vo.setTaskName(task.getName());
			vo.setTaskAssign(task.getAssignee());
			vo.setTaskState(task.getAssignee()==null?"1":"2");
			vo.setTaskCreateTime(task.getCreateTime());
			ProcessInstance processInstance= runtimeService.createProcessInstanceQuery()
			.processInstanceId(task.getProcessInstanceId()).singleResult();
			CommonVo commonVo= (CommonVo)runtimeService.getVariable(processInstance.getId(), WorkFlowConstant.MODEL_KEY);
			vo.setSuspended(processInstance.isSuspended()==true?"2":"1");
			vo.setProcessDefinitionId(processInstance.getProcessDefinitionId());
			vo.setBusinessName(commonVo.getApplyTitle());
			vo.setProcessOwner(commonVo.getApplyUserName());
			vo.setTaskDefinitionKey(task.getTaskDefinitionKey());
			//vo.setProcessDefinitionKey(processDefinitionKey);
			list.add(vo);
		}
		pageInfo.setRows(list);
		pageInfo.setTotal(taskQuery.list().size());
	}

	@Override
	public void claimTask(String userId, String taskId) {
		identityService.setAuthenticatedUserId(userId);
        taskService.claim(taskId, userId);
	}

	//@Override
	public InputStream getProcessResource(String resourceType, String processDefinitionId) {
        ProcessDefinition pd = repositoryService
        		.createProcessDefinitionQuery()
        		.processDefinitionId(processDefinitionId)
                .singleResult();
        String resourceName = "";
        if (resourceType.equals("image")) {
            resourceName = pd.getDiagramResourceName();
        } else if (resourceType.equals("xml")) {
            resourceName = pd.getResourceName();
        }
        InputStream in = repositoryService.getResourceAsStream(pd.getDeploymentId(), resourceName);
        return in;
    }

	//@Override
	public void delegateTask(String userId, String taskId) {
		taskService.delegateTask(taskId, userId);
	}

	//@Override
	public void transferTask(String userId, String taskId) {
		Task task = taskService.createTaskQuery().taskId(taskId).singleResult();
		if(task != null){
			String assign = task.getAssignee();
			taskService.setAssignee(taskId, userId);
			taskService.setOwner(taskId, assign);
		}else{
			throw new ActivitiObjectNotFoundException("任务不存在！", this.getClass());
		}
	}

	//@Override
	public void jumpTask(String taskId, String taskDefinitionKey) {
		TaskEntity currentTaskEntity = (TaskEntity) this.taskService.createTaskQuery().taskId(taskId).singleResult();
		ProcessDefinitionEntity pde = (ProcessDefinitionEntity) ((RepositoryServiceImpl)this.repositoryService)
				.getDeployedProcessDefinition(currentTaskEntity.getProcessDefinitionId()); 
		ActivityImpl activity = (ActivityImpl) pde.findActivity(taskDefinitionKey);
		Command<Void> deleteCmd = new DeleteActiveTaskCmd(currentTaskEntity, "jump", true);
		Command<Void> StartCmd = new StartActivityCmd(currentTaskEntity.getExecutionId(), activity);
		managementService.executeCommand(deleteCmd);
		managementService.executeCommand(StartCmd);
	}

	//@Override
	public void selectHisTaskDataGrid(PageInfo pageInfo) {
		ShiroUser shiroUser= (ShiroUser)SecurityUtils.getSubject().getPrincipal();
		HistoricTaskInstanceQuery taskQuery= historyService.createHistoricTaskInstanceQuery();
		List<HistoricTaskInstance> list= taskQuery.taskAssignee(shiroUser.getId())
										.orderByTaskCreateTime().desc()
										.listPage(pageInfo.getFrom(), pageInfo.getSize());
		List<TaskVo> tasks = new ArrayList<TaskVo>();
		for(HistoricTaskInstance his : list){
			TaskVo vo = new TaskVo();
			vo.setTaskCreateTime(his.getCreateTime());
			vo.setTaskName(his.getName());
			CommonVo commonVo= (CommonVo)historyService.createHistoricVariableInstanceQuery()
						.processInstanceId(his.getProcessInstanceId())
						.variableName(WorkFlowConstant.MODEL_KEY)
						.singleResult().getValue();
			vo.setBusinessName(commonVo.getApplyTitle());
			vo.setProcessOwner(commonVo.getApplyUserName());
			tasks.add(vo);
		}
		pageInfo.setRows(tasks);
		pageInfo.setTotal(taskQuery.list().size());
	}

	//@Override
	public void sendMailService(Map<String, Object> params) {
		runtimeService.startProcessInstanceByKey(WorkFlowConstant.MAILKEY, params);
	}
}
