package cn.chinaflame.park.vo;

import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;

public class PaVenueVO extends Response{

    private Integer venue_id;
    private String venue_name;
    private String venue_contact;
    private String venue_phone;
    private String venue_grade;
    private String venue_father;
    private String venue_authorized;
    private String venue_status;
    private String venue_description;
    private String venue_start_time;
    private String venue_end_time;
    private String venue_image1;
    private String venue_image2;
    private String venue_image3;
    private String venue_image4;
    private String venue_user;
    private String venue_remarks;
    private String createtime;
    private String updatetime;
    private String userId;
    private String processInstanceId;
    private Task task;
    private ProcessInstance processInstance;
    private ProcessDefinition processDefinition;
    private HistoricProcessInstance historicProcessInstance;
    
    
	public HistoricProcessInstance getHistoricProcessInstance() {
		return historicProcessInstance;
	}
	public void setHistoricProcessInstance(HistoricProcessInstance historicProcessInstance) {
		this.historicProcessInstance = historicProcessInstance;
	}
	public ProcessDefinition getProcessDefinition() {
		return processDefinition;
	}
	public void setProcessDefinition(ProcessDefinition processDefinition) {
		this.processDefinition = processDefinition;
	}
	public ProcessInstance getProcessInstance() {
		return processInstance;
	}
	public void setProcessInstance(ProcessInstance processInstance) {
		this.processInstance = processInstance;
	}
	public Task getTask() {
		return task;
	}
	public void setTask(Task task) {
		this.task = task;
	}
	public Integer getVenue_id() {
		return venue_id;
	}
	public void setVenue_id(Integer venue_id) {
		this.venue_id = venue_id;
	}
	public String getVenue_name() {
		return venue_name;
	}
	public void setVenue_name(String venue_name) {
		this.venue_name = venue_name;
	}
	public String getVenue_contact() {
		return venue_contact;
	}
	public void setVenue_contact(String venue_contact) {
		this.venue_contact = venue_contact;
	}
	public String getVenue_phone() {
		return venue_phone;
	}
	public void setVenue_phone(String venue_phone) {
		this.venue_phone = venue_phone;
	}
	public String getVenue_grade() {
		return venue_grade;
	}
	public void setVenue_grade(String venue_grade) {
		this.venue_grade = venue_grade;
	}
	public String getVenue_father() {
		return venue_father;
	}
	public void setVenue_father(String venue_father) {
		this.venue_father = venue_father;
	}
	public String getVenue_authorized() {
		return venue_authorized;
	}
	public void setVenue_authorized(String venue_authorized) {
		this.venue_authorized = venue_authorized;
	}
	public String getVenue_status() {
		return venue_status;
	}
	public void setVenue_status(String venue_status) {
		this.venue_status = venue_status;
	}
	public String getVenue_description() {
		return venue_description;
	}
	public void setVenue_description(String venue_description) {
		this.venue_description = venue_description;
	}
	public String getVenue_start_time() {
		return venue_start_time;
	}
	public void setVenue_start_time(String venue_start_time) {
		this.venue_start_time = venue_start_time;
	}
	public String getVenue_end_time() {
		return venue_end_time;
	}
	public void setVenue_end_time(String venue_end_time) {
		this.venue_end_time = venue_end_time;
	}
	public String getVenue_image1() {
		return venue_image1;
	}
	public void setVenue_image1(String venue_image1) {
		this.venue_image1 = venue_image1;
	}
	public String getVenue_image2() {
		return venue_image2;
	}
	public void setVenue_image2(String venue_image2) {
		this.venue_image2 = venue_image2;
	}
	public String getVenue_image3() {
		return venue_image3;
	}
	public void setVenue_image3(String venue_image3) {
		this.venue_image3 = venue_image3;
	}
	public String getVenue_image4() {
		return venue_image4;
	}
	public void setVenue_image4(String venue_image4) {
		this.venue_image4 = venue_image4;
	}
	public String getVenue_user() {
		return venue_user;
	}
	public void setVenue_user(String venue_user) {
		this.venue_user = venue_user;
	}
	public String getVenue_remarks() {
		return venue_remarks;
	}
	public void setVenue_remarks(String venue_remarks) {
		this.venue_remarks = venue_remarks;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public String getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(String updatetime) {
		this.updatetime = updatetime;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getProcessInstanceId() {
		return processInstanceId;
	}
	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}
    
}
