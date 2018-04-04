package cn.chinaflame.park.model;

import java.lang.String;

/**
 * 用户任务表
 * modle
 */
public class PaUserTask extends BaseModel {

	private String id;
	private String procDefKey;
	private String procDefName;
	private String taskDefKey;
	private String taskName;
	private String taskType;
	private String candidateName;
	private String candidateIds;


	public String getId() {return id;}
public void setId(String id) {this.id = id;}
public String getProcDefKey() {return procDefKey;}
public void setProcDefKey(String procDefKey) {this.procDefKey = procDefKey;}
public String getProcDefName() {return procDefName;}
public void setProcDefName(String procDefName) {this.procDefName = procDefName;}
public String getTaskDefKey() {return taskDefKey;}
public void setTaskDefKey(String taskDefKey) {this.taskDefKey = taskDefKey;}
public String getTaskName() {return taskName;}
public void setTaskName(String taskName) {this.taskName = taskName;}
public String getTaskType() {return taskType;}
public void setTaskType(String taskType) {this.taskType = taskType;}
public String getCandidateName() {return candidateName;}
public void setCandidateName(String candidateName) {this.candidateName = candidateName;}
public String getCandidateIds() {return candidateIds;}
public void setCandidateIds(String candidateIds) {this.candidateIds = candidateIds;}

	
}
