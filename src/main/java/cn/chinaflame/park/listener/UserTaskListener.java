package cn.chinaflame.park.listener;

import java.util.ArrayList;
import java.util.List;

import org.activiti.engine.RepositoryService;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;
import org.activiti.engine.repository.ProcessDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.mapper.EntityWrapper;

import cn.chinaflame.park.model.PaUserTask;
import cn.chinaflame.park.service.PaUserTaskService;

/**
 * 流程配置监听器
 */
@Component("userTaskListener")
public class UserTaskListener implements TaskListener{
	private static final long serialVersionUID = 1L;
	
	@Autowired
    private RepositoryService repositoryService;
	@Autowired
	private PaUserTaskService paUserTaskService;
	
	@Override
	public void notify(DelegateTask delegateTask) {/*
		//获取流程定义KEY
		ProcessDefinition processDefinition = repositoryService
				.createProcessDefinitionQuery()
				.processDefinitionId(delegateTask.getProcessDefinitionId())
				.singleResult();
		String processDefinitionKey = processDefinition.getKey();
		//获取任务KEY
		String taskDefinitionKey = delegateTask.getTaskDefinitionKey();
		try {
			//获取流程对应的任务列表
			EntityWrapper<PaUserTask> wrapper = new EntityWrapper<PaUserTask>();
			wrapper.where("proc_def_key = {0}", processDefinitionKey);
			List<PaUserTask> taskList = PaUserTaskService.selectList(wrapper);
			for(PaUserTask userTask : taskList){
				String taskKey = userTask.getTaskDefKey();
				String taskType = userTask.getTaskType();
				String ids = userTask.getCandidateIds();
				if(taskDefinitionKey.equals(taskKey)){
					switch (taskType){
						case "assignee" : {
							delegateTask.setAssignee(ids);
							break;
						}
						case "candidateUser" : {
							String[] userIds = ids.split(",");
							List<String> users = new ArrayList<String>();
							for(int i=0; i<userIds.length;i++){
								users.add(userIds[i]);
							}
							delegateTask.addCandidateUsers(users);
							break;
						}
						case "candidateGroup" : {
							String[] groupIds = ids.split(",");
							List<String> groups = new ArrayList<String>();
							for(int i=0; i<groupIds.length;i++){
								groups.add(groupIds[i]);
							}
							delegateTask.addCandidateGroups(groups);
							break;
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	*/}
}
