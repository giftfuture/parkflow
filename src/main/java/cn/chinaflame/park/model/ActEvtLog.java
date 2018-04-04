package cn.chinaflame.park.model;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
 * 
 * modle
 */
public class ActEvtLog extends BaseModel {

	private Long logNr;
	private String type;
	private String procDefId;
	private String procInstId;
	private String executionId;
	private String taskId;
	private String timeStamp;
	private String userId;
	private String data;
	private String lockOwner;
	private String lockTime;
	private Integer isProcessed;


	public Long getLogNr() {return logNr;}
public void setLogNr(Long logNr) {this.logNr = logNr;}
public String getType() {return type;}
public void setType(String type) {this.type = type;}
public String getProcDefId() {return procDefId;}
public void setProcDefId(String procDefId) {this.procDefId = procDefId;}
public String getProcInstId() {return procInstId;}
public void setProcInstId(String procInstId) {this.procInstId = procInstId;}
public String getExecutionId() {return executionId;}
public void setExecutionId(String executionId) {this.executionId = executionId;}
public String getTaskId() {return taskId;}
public void setTaskId(String taskId) {this.taskId = taskId;}
public String getTimeStamp() {return timeStamp;}
public void setTimeStamp(String timeStamp) {this.timeStamp = timeStamp;}
public String getUserId() {return userId;}
public void setUserId(String userId) {this.userId = userId;}
public String getData() {return data;}
public void setData(String data) {this.data = data;}
public String getLockOwner() {return lockOwner;}
public void setLockOwner(String lockOwner) {this.lockOwner = lockOwner;}
public String getLockTime() {return lockTime;}
public void setLockTime(String lockTime) {this.lockTime = lockTime;}
public Integer getIsProcessed() {return isProcessed;}
public void setIsProcessed(Integer isProcessed) {this.isProcessed = isProcessed;}

	
}
