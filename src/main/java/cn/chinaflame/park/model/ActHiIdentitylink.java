package cn.chinaflame.park.model;

import java.lang.String;

/**
 * 
 * modle
 */
public class ActHiIdentitylink extends BaseModel {

	private String id;
	private String groupId;
	private String type;
	private String userId;
	private String taskId;
	private String procInstId;


	public String getId() {return id;}
public void setId(String id) {this.id = id;}
public String getGroupId() {return groupId;}
public void setGroupId(String groupId) {this.groupId = groupId;}
public String getType() {return type;}
public void setType(String type) {this.type = type;}
public String getUserId() {return userId;}
public void setUserId(String userId) {this.userId = userId;}
public String getTaskId() {return taskId;}
public void setTaskId(String taskId) {this.taskId = taskId;}
public String getProcInstId() {return procInstId;}
public void setProcInstId(String procInstId) {this.procInstId = procInstId;}

	
}
