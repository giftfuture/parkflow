package cn.chinaflame.park.model;

import java.lang.Integer;
import java.lang.String;

/**
 * 
 * modle
 */
public class ActRuEventSubscr extends BaseModel {

	private String id;
	private Integer rev;
	private String eventType;
	private String eventName;
	private String executionId;
	private String procInstId;
	private String activityId;
	private String configuration;
	private String created;
	private String procDefId;
	private String tenantId;


	public String getId() {return id;}
public void setId(String id) {this.id = id;}
public Integer getRev() {return rev;}
public void setRev(Integer rev) {this.rev = rev;}
public String getEventType() {return eventType;}
public void setEventType(String eventType) {this.eventType = eventType;}
public String getEventName() {return eventName;}
public void setEventName(String eventName) {this.eventName = eventName;}
public String getExecutionId() {return executionId;}
public void setExecutionId(String executionId) {this.executionId = executionId;}
public String getProcInstId() {return procInstId;}
public void setProcInstId(String procInstId) {this.procInstId = procInstId;}
public String getActivityId() {return activityId;}
public void setActivityId(String activityId) {this.activityId = activityId;}
public String getConfiguration() {return configuration;}
public void setConfiguration(String configuration) {this.configuration = configuration;}
public String getCreated() {return created;}
public void setCreated(String created) {this.created = created;}
public String getProcDefId() {return procDefId;}
public void setProcDefId(String procDefId) {this.procDefId = procDefId;}
public String getTenantId() {return tenantId;}
public void setTenantId(String tenantId) {this.tenantId = tenantId;}

	
}
