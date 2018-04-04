package cn.chinaflame.park.model;

import java.lang.String;

/**
 * 
 * modle
 */
public class ActHiComment extends BaseModel {

	private String id;
	private String type;
	private String time;
	private String userId;
	private String taskId;
	private String procInstId;
	private String action;
	private String message;
	private String fullMsg;


	public String getId() {return id;}
public void setId(String id) {this.id = id;}
public String getType() {return type;}
public void setType(String type) {this.type = type;}
public String getTime() {return time;}
public void setTime(String time) {this.time = time;}
public String getUserId() {return userId;}
public void setUserId(String userId) {this.userId = userId;}
public String getTaskId() {return taskId;}
public void setTaskId(String taskId) {this.taskId = taskId;}
public String getProcInstId() {return procInstId;}
public void setProcInstId(String procInstId) {this.procInstId = procInstId;}
public String getAction() {return action;}
public void setAction(String action) {this.action = action;}
public String getMessage() {return message;}
public void setMessage(String message) {this.message = message;}
public String getFullMsg() {return fullMsg;}
public void setFullMsg(String fullMsg) {this.fullMsg = fullMsg;}

	
}
