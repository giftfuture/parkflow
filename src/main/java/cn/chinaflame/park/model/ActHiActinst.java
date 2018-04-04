package cn.chinaflame.park.model;

import java.lang.Long;
import java.lang.String;

/**
 * 
 * modle
 */
public class ActHiActinst extends BaseModel {

	private String id;
	private String procDefId;
	private String procInstId;
	private String executionId;
	private String actId;
	private String taskId;
	private String callProcInstId;
	private String actName;
	private String actType;
	private String assignee;
	private String startTime;
	private String endTime;
	private Long duration;
	private String tenantId;


	public String getId() {return id;}
public void setId(String id) {this.id = id;}
public String getProcDefId() {return procDefId;}
public void setProcDefId(String procDefId) {this.procDefId = procDefId;}
public String getProcInstId() {return procInstId;}
public void setProcInstId(String procInstId) {this.procInstId = procInstId;}
public String getExecutionId() {return executionId;}
public void setExecutionId(String executionId) {this.executionId = executionId;}
public String getActId() {return actId;}
public void setActId(String actId) {this.actId = actId;}
public String getTaskId() {return taskId;}
public void setTaskId(String taskId) {this.taskId = taskId;}
public String getCallProcInstId() {return callProcInstId;}
public void setCallProcInstId(String callProcInstId) {this.callProcInstId = callProcInstId;}
public String getActName() {return actName;}
public void setActName(String actName) {this.actName = actName;}
public String getActType() {return actType;}
public void setActType(String actType) {this.actType = actType;}
public String getAssignee() {return assignee;}
public void setAssignee(String assignee) {this.assignee = assignee;}
public String getStartTime() {return startTime;}
public void setStartTime(String startTime) {this.startTime = startTime;}
public String getEndTime() {return endTime;}
public void setEndTime(String endTime) {this.endTime = endTime;}
public Long getDuration() {return duration;}
public void setDuration(Long duration) {this.duration = duration;}
public String getTenantId() {return tenantId;}
public void setTenantId(String tenantId) {this.tenantId = tenantId;}

	
}
