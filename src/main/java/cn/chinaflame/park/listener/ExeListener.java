package cn.chinaflame.park.listener;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.ExecutionListener;
import org.activiti.engine.repository.ProcessDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.mapper.EntityWrapper;

import cn.chinaflame.park.consts.WorkFlowConstant;
import cn.chinaflame.park.model.PaUserTask;
import cn.chinaflame.park.service.BaseService;
import cn.chinaflame.park.service.PaUserTaskService;

/**
 * 执行监听器
 */
@Component("exeListener")
public class ExeListener implements ExecutionListener,Serializable{
	
	private static final long serialVersionUID = 1L;
 
	@Autowired
	private BaseService baseService;
    @Autowired
    protected RepositoryService repositoryService;
     
    @Autowired
    protected RuntimeService runtimeService;
     
    @Autowired
    protected TaskService taskService;
	@Override
	public void notify(DelegateExecution execution) throws Exception {/*
		//获取流程定义KEY
		ProcessDefinition processDefinition = repositoryService
				.createProcessDefinitionQuery()
				.processDefinitionId(execution.getProcessDefinitionId())
				.singleResult();
		String processDefinitionKey = processDefinition.getKey();
		if("start".equals(execution.getEventName())){
			//如果是会签业务
			if("CounterSign".equals(processDefinitionKey)){
				//获取流程对应的任务列表
//				EntityWrapper<PaUserTask> wrapper = new EntityWrapper<PaUserTask>();
				//PaUserTask pausertask = new PaUserTask();
				wrapper.where("proc_def_key = {0}", processDefinitionKey);
				List<PaUserTask> taskList = PaUserTaskService.selectList(wrapper);
				for(PaUserTask userTask : taskList){
					String taskKey = userTask.getTaskDefKey();
					String taskType = userTask.getTaskType();
					String ids = userTask.getCandidateIds();
					if("CounterSignTask".equals(taskKey)){
						switch (taskType){
							case "counterSign" : {
								String[] userIds = ids.split(",");
								List<String> users = new ArrayList<String>();
								for(int i=0; i<userIds.length;i++){
									users.add(userIds[i]);
								}
								execution.setVariable("signUsers", users);
								break;
							}
						}
					}
				}
			}
		}else if("end".equals(execution.getEventName())){
			//如果是请假任务
			if("TVacation".equals(processDefinitionKey)){
				//得到存的变量值
				String result = (String) runtimeService.getVariable(execution.getProcessInstanceId(), "vacationResult");
				//得到当前流程实例对应的请假实例
				EntityWrapper<TVacation> wrapper = new EntityWrapper<TVacation>();
				wrapper.where("proc_inst_id = {0}", execution.getProcessInstanceId());
				TVacation vacation = tVacationService.selectOne(wrapper);
				if("pass".equals(result)){
					vacation.setVacationStatus(WorkFlowConstant.vacationStatus.PASSED.getValue());
				}else if("notPass".equals(result)){
					vacation.setVacationStatus(WorkFlowConstant.vacationStatus.NOT_PASSED.getValue());
				}
				//更新请假业务
	        	tVacationService.updateById(vacation);
			}else if("SVacation".equals(processDefinitionKey)){

				//得到存的变量值
				String result = (String) runtimeService.getVariable(execution.getProcessInstanceId(), "vacationResult");
				//得到当前流程实例对应的请假实例
				EntityWrapper<TVacation> wrapper = new EntityWrapper<TVacation>();
				wrapper.where("proc_inst_id = {0}", execution.getProcessInstanceId());
				TVacation vacation = tVacationService.selectOne(wrapper);
				if("pass".equals(result)){
					vacation.setVacationStatus(WorkFlowConstant.vacationStatus.PASSED.getValue());
				}else if("notPass".equals(result)){
					vacation.setVacationStatus(WorkFlowConstant.vacationStatus.NOT_PASSED.getValue());
				}
				//更新请假业务
	        	tVacationService.updateById(vacation);
			
			}
		}
		
	*/}

}
