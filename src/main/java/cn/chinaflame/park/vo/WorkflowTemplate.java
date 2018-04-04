package cn.chinaflame.park.vo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

//import org.activiti.bpmn.model.Task;
import org.activiti.engine.HistoryService;
import org.activiti.engine.ManagementService;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.runtime.Execution;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;



/**
 * activiti模板类(初步实现)
 * 
 * @author Administrator
 * 
 */
public class WorkflowTemplate {
	private ProcessEngine processEngine;
	private RepositoryService repositoryService = null;
	private RuntimeService runtimeService = null;
	private TaskService taskService = null;
	private HistoryService historyService = null;
	private ManagementService managementService = null;
	
	/**
	 * 部署流程到数据库
	 * 
	 * @param resourceName资源文件名字 比如(org/forever/jbpm/jpdl/process.jpdl.xml)
	 * @return 返回流程定义id(格式：key-version)
	 */
	public Deployment deploy(String resourceName) {
		return repositoryService.createDeployment().addClasspathResource(resourceName).deploy();
	}	
	/**
	 * 部署流程到数据库
	 * 
	 * @param filexml文件作为file对象
	 * @return 返回流程定义的id
	 */
	public Deployment deploy(File file) {
		try {
			return repositoryService.createDeployment().addInputStream(file.getName(), new FileInputStream(file)).deploy();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}	
	/**
	 * 部署流程到数据库
	 * @param resourceName 资源文件名
	 * @param xml 字符串
	 * @return
	 */
	public Deployment deploy(String resourceName,String xml){
		return repositoryService.createDeployment().addString(resourceName+".jpdl.xml", xml)
		.name(resourceName).activateProcessDefinitionsOn(new Date()).deploy();
	}	
	/**
	 * 部署流程到数据库
	 * @param resourceName 资源文件名
	 * @param xml 字符串
	 * @return
	 */
	public Deployment deploy(String resourceName,InputStream inputStream){
		return repositoryService.createDeployment().addInputStream(resourceName, inputStream).deploy();
	}
	/**
	 * 创建一个新的流程实例
	 * 
	 * @param processDefinitionKey(process.jpdl.xml中process标签的key)
	 * @param processInstanceKey(用户给的key，比如一个请假单的id)
	 * @return 流程实例
	 */
	public ProcessInstance addProcessInstance(String processDefinitionKey,String processInstanceKey) {
		return runtimeService.startProcessInstanceByKey(processDefinitionKey,processInstanceKey);
	}
	/**
	 * 创建一个新的流程实例
	 * 
	 * @param processDefinitionKey(process.jpdl.xml中process标签的key)
	 * @param variables该流程实例要用到的变量
	 * @param processInstanceKey(用户给定的业务key)
	 * @return
	 */
	public String addProcessInstance(String processDefinitionKey,Map<String, Object> variables, String processInstanceKey) {
		return runtimeService.startProcessInstanceByKey(processDefinitionKey, processInstanceKey,variables).getId();
	}
	
	/**
	 * 创建一个新的流程实例
	 * 
	 * @param processDefinitionKey(process.jpdl.xml中process标签的key)
	 * @param variables该流程实例要用到的变量
	 * @return
	 */
	public ProcessInstance addProcessInstance(String processDefinitionKey,Map<String, String> variables) {
		//return runtimeService.startProcessInstanceByKey(processDefinitionKey,variables);
		return null;
	}
	
	/**
	 * 级联删除流程实例
	 * @param id 流程实例ID
	 */
	public void deleteProcessInstanceCasecade(String id){
	//	runtimeService.deleteProcessInstance(processInstanceId, deleteReason);
		//runtimeService.deleteProcessInstanceCascade(id);
	}

	/**
	 * 提交任务
	 * 
	 * @param taskId
	 *            任务名字
	 */
	public void completeTaskByName(String taskName) {
		/*Task task = taskService.createTaskQuery()
				.activityName(taskName).uniqueResult();
		if(task!=null){
			String taskId = task.getId();
			taskService.completeTask(taskId);
		}	*/
	}
	
	/**
	 * 提交流程实例下的任务名字的任务
	 * @param processInstanceId
	 * @param taskName
	 */
	public void completeTaskBy(String processInstanceId,String taskName){
	/*	Task task = taskService.createTaskQuery().processInstanceId(processInstanceId)
					.activityName(taskName).uniqueResult();
		if(task!=null){
			taskService.completeTask(task.getId());
		}	*/
	}
	
	/**
	 * 提交流程实例下的任务名字的任务,更新变量集合
	 * @param processInstanceId
	 * @param taskName
	 */
	public void completeTaskBy(String processInstanceId,String taskName,Map<String, Object> variables){/*
		Task task = taskService.createTaskQuery().processInstanceId(processInstanceId)
					.activityName(taskName).uniqueResult();
		if(task!=null){
			Set<String> variableNames = taskService.getVariableNames(task.getId());
			Map<String, Object> var = taskService.getVariables(task.getId(), variableNames);
			for (String key : variables.keySet()) {
				var.put(key, variables.get(key));
			}
			taskService.setVariables(task.getId(), var);
			taskService.completeTask(task.getId());
		}	
	*/}
	
	/**
	 * 提交流程实例下的任务名字的任务,更新变量集合
	 * @param processInstanceId
	 * @param taskName
	 */
	public void completeTaskBy(String processInstanceId,String taskName,String key,String value){
		/*Task task = taskService.createTaskQuery().processInstanceId(processInstanceId)
		.activityName(taskName).uniqueResult();
		if(task!=null){
			Set<String> variableNames = taskService.getVariableNames(task.getId());
			Map<String, Object> var = taskService.getVariables(task.getId(), variableNames);
			
			var.put(key, value);
			
			taskService.setVariables(task.getId(), var);
			taskService.completeTask(task.getId());
		}*/	
	}	
	/**
	 * 提交任务根据id
	 * @param taskId
	 */
	public void completeTaskById(String taskId,String variables){
		//taskService.completeTask(taskId);
	}
	
	/**
	 * 提交任务根据id
	 * @param taskId
	 */
	public void completeTaskById(String taskId){
		//taskService.completeTask(taskId);
	}

	/**
	 * 将任务流转到指定名字的流程中去
	 * 
	 * @param taskId
	 * @param outcome
	 */
	public void completeTask(String taskId, String outcome) {
		//taskService.completeTask(taskId, outcome);
	}

	/**
	 * 根据key获取流程实例(这里我使用的uuid)
	 * 
	 * @param key(对应于数据库表jbpm4_execution中的KEY_字段)
	 * @return 返回查找到得流程实例，没有返回null
	 */
	public ProcessInstance getProcessInstance(String key) {
		//return runtimeService.createProcessInstanceQuery().processInstanceKey(key).uniqueResult();
		return null;
	}

	/**
	 * 根据executionId获取指定的变量值
	 * 
	 * @param executionId
	 * @param variableName
	 * @return
	 */
	public Object getVariableByexecutionId(String executionId,String variableName) {
		return runtimeService.getVariable(executionId, variableName);
	}
	
	/**
	 * 根据历史流程实例ID查询历史变量
	 * @param historyExecutionId
	 * @param variableName
	 * @return
	 */
	public Object getHistoryVariable(String historyExecutionId,String variableName){
		//return historyService.getVariable(historyExecutionId, variableName);
		return null;
	}

	/**
	 * 根据任务id获取指定变量值
	 * 
	 * @param taskId
	 * @param variableName
	 * @return
	 */
	public Object getVariableByTaskId(String taskId, String variableName) {
		return taskService.getVariable(taskId, variableName);
	}
	
	/**
	 * 重新给任务变量集合
	 * @param taskId
	 * @param variables
	 */
	public void setVariables(String taskId, Map<String,Object> variables){
		taskService.setVariables(taskId, variables);
		//System.out.println("ok");
	}
	
	/**
	 * 获取某个任务的变量值集合
	 * @param taskId
	 * @param variableNames
	 * @return
	 */
	public Map<String,Object> getVariables(String taskId,Set<String> variableNames){
		return taskService.getVariables(taskId, variableNames);
	}
	
	/**
	 * 获取任务的变量名集合
	 * @param taskId
	 * @return
	 */
	/*public Set<String> getVariableNames(String taskId){
		return taskService.getVariableNames(taskId);
	}*/

	/**
	 * 获取指定用户名字的任务
	 * 
	 * @param userId
	 * @return
	 */
	/*public List<Task> findPersonalTasks(String assignee) {
		return taskService.findPersonalTasks(assignee);
	}*/

	/**
	 * 根据任务id获取任务
	 * 
	 * @param taskId
	 * @return
	 */
	/*public Task getTask(String taskId) {
		return taskService.getTask(taskId);
	}*/
	
	/**
	 * 根据任务id获取历史任务
	 * @param taskId
	 * @return
	 */
	/*public HistoryTask getHistoryTask(String taskId){
		return historyService.createHistoryTaskQuery().taskId(taskId).uniqueResult();
	}*/

	/**
	 * 根据流程实例id获取
	 * 
	 * @param executionId
	 * @return
	 */
	/*public Execution findExecutionById(String executionId) {
		
		return runtimeService.findExecutionById(executionId);
	}
	
	public ProcessInstance findProcessInstanceById(String processInstanceId){
		return runtimeService.findProcessInstanceById(processInstanceId);
	}*/

	/**
	 * 彻底删除文件的部署
	 * 
	 * @param deploymentId流程定义id
	 */
	public void deleteDeploymentCascade(String deploymentId) {
		repositoryService.deleteDeploymentCascade(deploymentId);
	}
	
	/**
	 * 启动流程实例
	 * @param id
	 */
/*	public void startProcessInstance(String executionId,String signalName) {
		runtimeService.signalExecutionById(executionId, signalName);
		
	}
	
	public void setVariableByexEcutionId(String executionId, String name, String value){
		runtimeService.setVariable(executionId, name, value);
	}*/
	/**
	 * 将流程网往下走
	 * 
	 * @param id流程实例id
	 * @return
	 */
	public ProcessInstance signalExecutionById(String id) {
		//return runtimeService.signalExecutionById(id);
		return null;
	}
	
	public ProcessInstance signalExecutionById(String executionId,Map<String,?> parameters){
		//return runtimeService.signalExecutionById(executionId, parameters);
		return null;
	}	

	public WorkflowTemplate() {
		repositoryService = processEngine.getRepositoryService();
		runtimeService = processEngine.getRuntimeService();
		taskService = processEngine.getTaskService();
		historyService = processEngine.getHistoryService();
		managementService = processEngine.getManagementService();
	}

	public WorkflowTemplate(ProcessEngine processEngine) {
		//System.out.println("----引擎启动:"+processEngine);
		this.processEngine = processEngine;
		repositoryService = processEngine.getRepositoryService();
		runtimeService = processEngine.getRuntimeService();
		taskService = processEngine.getTaskService();
		historyService = processEngine.getHistoryService();
		managementService = processEngine.getManagementService();
	}
	public ProcessEngine getProcessEngine() {
		return processEngine;
	}
	public void setProcessEngine(ProcessEngine processEngine) {
		this.processEngine = processEngine;
		repositoryService = processEngine.getRepositoryService();
		runtimeService = processEngine.getRuntimeService();
		taskService = processEngine.getTaskService();
		historyService = processEngine.getHistoryService();
		managementService = processEngine.getManagementService();
	}

	public RepositoryService getRepositoryService() {
		return repositoryService;
	}

	public void setRepositoryService(RepositoryService repositoryService) {
		this.repositoryService = repositoryService;
	}

	public RuntimeService getruntimeService() {
		return runtimeService;
	}

	public void setruntimeService(RuntimeService runtimeService) {
		this.runtimeService = runtimeService;
	}

	public TaskService getTaskService() {
		return taskService;
	}

	public void setTaskService(TaskService taskService) {
		this.taskService = taskService;
	}

	public HistoryService getHistoryService() {
		return historyService;
	}

	public void setHistoryService(HistoryService historyService) {
		this.historyService = historyService;
	}

	public ManagementService getManagementService() {
		return managementService;
	}

	public void setManagementService(ManagementService managementService) {
		this.managementService = managementService;
	}
}
