package cn.chinaflame.park.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.activiti.editor.constants.ModelDataJsonConstants;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.Model;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

@RestController  
@RequestMapping("/CgglFlowController")  
public class CgglFlowController extends BaseController{
	      
	    @RequestMapping("/firstDemo")  
	    public void firstDemo() {  
	        //根据bpmn文件部署流程  
	        Deployment deployment = repositoryService.createDeployment().addClasspathResource("demo2.bpmn").deploy();  
	        //获取流程定义  
	        ProcessDefinition processDefinition = repositoryService.createProcessDefinitionQuery().deploymentId(deployment.getId()).singleResult();  
	        //启动流程定义，返回流程实例  
	        ProcessInstance pi = runtimeService.startProcessInstanceById(processDefinition.getId());  
	        String processId = pi.getId();  
	        System.out.println("流程创建成功，当前流程实例ID："+processId);  
	          
	        Task task=taskService.createTaskQuery().processInstanceId(processId).singleResult();  
	        System.out.println("第一次执行前，任务名称："+task.getName());  
	        taskService.complete(task.getId());  
	  
	        task = taskService.createTaskQuery().processInstanceId(processId).singleResult();  
	        System.out.println("第二次执行前，任务名称："+task.getName());  
	        taskService.complete(task.getId());  
	  
	        task = taskService.createTaskQuery().processInstanceId(processId).singleResult();  
	        System.out.println("task为null，任务执行完毕："+task);  
	    }  
	    
	    /**
	     * 创建模型
	     */
	    @RequestMapping("create")
	    public void create(HttpServletRequest request, HttpServletResponse response) {
	        try {
	        	ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
	        	RepositoryService repositoryService = processEngine.getRepositoryService();
	            ObjectMapper objectMapper = new ObjectMapper();
	            ObjectNode editorNode = objectMapper.createObjectNode();
	            editorNode.put("id", "canvas");
	            editorNode.put("resourceId", "canvas");
	            ObjectNode stencilSetNode = objectMapper.createObjectNode();
	            stencilSetNode.put("namespace", "http://b3mn.org/stencilset/bpmn2.0#");
	            editorNode.put("stencilset", stencilSetNode);
	            Model modelData = repositoryService.newModel();

	            ObjectNode modelObjectNode = objectMapper.createObjectNode();
	            modelObjectNode.put(ModelDataJsonConstants.MODEL_NAME, "lutiannan");
	            modelObjectNode.put(ModelDataJsonConstants.MODEL_REVISION, 1);
	            String description = "lutiannan---";
	            modelObjectNode.put(ModelDataJsonConstants.MODEL_DESCRIPTION, description);
	            modelData.setMetaInfo(modelObjectNode.toString());
	            modelData.setName("lutiannan");
	            modelData.setKey("12313123");

	            //保存模型
	            repositoryService.saveModel(modelData);
	            repositoryService.addModelEditorSource(modelData.getId(), editorNode.toString().getBytes("utf-8"));
	            response.sendRedirect(request.getContextPath() + "/act/rest/modeler.html?modelId=" + modelData.getId());
	        } catch (Exception e) {
	            System.out.println("创建模型失败：");
	        }
	    }
	    
}
