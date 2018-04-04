package cn.chinaflame.park.model;

import java.lang.Long;
import java.lang.String;

/**
 * 
 * modle
 */
public class ActHiProcinst extends BaseModel {

	private String id;
	private String procInstId;
	private String businessKey;
	private String procDefId;
	private String startTime;
	private String endTime;
	private Long duration;
	private String startUserId;
	private String startActId;
	private String endActId;
	private String superProcessInstanceId;
	private String deleteReason;
	private String tenantId;
	private String name;


	public String getId() {return id;}
public void setId(String id) {this.id = id;}
public String getProcInstId() {return procInstId;}
public void setProcInstId(String procInstId) {this.procInstId = procInstId;}
public String getBusinessKey() {return businessKey;}
public void setBusinessKey(String businessKey) {this.businessKey = businessKey;}
public String getProcDefId() {return procDefId;}
public void setProcDefId(String procDefId) {this.procDefId = procDefId;}
public String getStartTime() {return startTime;}
public void setStartTime(String startTime) {this.startTime = startTime;}
public String getEndTime() {return endTime;}
public void setEndTime(String endTime) {this.endTime = endTime;}
public Long getDuration() {return duration;}
public void setDuration(Long duration) {this.duration = duration;}
public String getStartUserId() {return startUserId;}
public void setStartUserId(String startUserId) {this.startUserId = startUserId;}
public String getStartActId() {return startActId;}
public void setStartActId(String startActId) {this.startActId = startActId;}
public String getEndActId() {return endActId;}
public void setEndActId(String endActId) {this.endActId = endActId;}
public String getSuperProcessInstanceId() {return superProcessInstanceId;}
public void setSuperProcessInstanceId(String superProcessInstanceId) {this.superProcessInstanceId = superProcessInstanceId;}
public String getDeleteReason() {return deleteReason;}
public void setDeleteReason(String deleteReason) {this.deleteReason = deleteReason;}
public String getTenantId() {return tenantId;}
public void setTenantId(String tenantId) {this.tenantId = tenantId;}
public String getName() {return name;}
public void setName(String name) {this.name = name;}

	
}
