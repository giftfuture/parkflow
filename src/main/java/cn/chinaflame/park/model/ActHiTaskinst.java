package cn.chinaflame.park.model;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
 * 
 * modle
 */
public class ActHiTaskinst extends BaseModel {

	private String id;
	private String procDefId;
	private String taskDefKey;
	private String procInstId;
	private String executionId;
	private String name;
	private String parentTaskId;
	private String description;
	private String owner;
	private String assignee;
	private String startTime;
	private String claimTime;
	private String endTime;
	private Long duration;
	private String deleteReason;
	private Integer priority;
	private String dueDate;
	private String formKey;
	private String category;
	private String tenantId;


	public String getId() {return id;}
public void setId(String id) {this.id = id;}
public String getProcDefId() {return procDefId;}
public void setProcDefId(String procDefId) {this.procDefId = procDefId;}
public String getTaskDefKey() {return taskDefKey;}
public void setTaskDefKey(String taskDefKey) {this.taskDefKey = taskDefKey;}
public String getProcInstId() {return procInstId;}
public void setProcInstId(String procInstId) {this.procInstId = procInstId;}
public String getExecutionId() {return executionId;}
public void setExecutionId(String executionId) {this.executionId = executionId;}
public String getName() {return name;}
public void setName(String name) {this.name = name;}
public String getParentTaskId() {return parentTaskId;}
public void setParentTaskId(String parentTaskId) {this.parentTaskId = parentTaskId;}
public String getDescription() {return description;}
public void setDescription(String description) {this.description = description;}
public String getOwner() {return owner;}
public void setOwner(String owner) {this.owner = owner;}
public String getAssignee() {return assignee;}
public void setAssignee(String assignee) {this.assignee = assignee;}
public String getStartTime() {return startTime;}
public void setStartTime(String startTime) {this.startTime = startTime;}
public String getClaimTime() {return claimTime;}
public void setClaimTime(String claimTime) {this.claimTime = claimTime;}
public String getEndTime() {return endTime;}
public void setEndTime(String endTime) {this.endTime = endTime;}
public Long getDuration() {return duration;}
public void setDuration(Long duration) {this.duration = duration;}
public String getDeleteReason() {return deleteReason;}
public void setDeleteReason(String deleteReason) {this.deleteReason = deleteReason;}
public Integer getPriority() {return priority;}
public void setPriority(Integer priority) {this.priority = priority;}
public String getDueDate() {return dueDate;}
public void setDueDate(String dueDate) {this.dueDate = dueDate;}
public String getFormKey() {return formKey;}
public void setFormKey(String formKey) {this.formKey = formKey;}
public String getCategory() {return category;}
public void setCategory(String category) {this.category = category;}
public String getTenantId() {return tenantId;}
public void setTenantId(String tenantId) {this.tenantId = tenantId;}

	
}
