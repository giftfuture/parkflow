package cn.chinaflame.park.model;

import java.lang.Integer;
import java.lang.String;

/**
 * 
 * modle
 */
public class ActHiAttachment extends BaseModel {

	private String id;
	private Integer rev;
	private String userId;
	private String name;
	private String description;
	private String type;
	private String taskId;
	private String procInstId;
	private String url;
	private String contentId;
	private String time;


	public String getId() {return id;}
public void setId(String id) {this.id = id;}
public Integer getRev() {return rev;}
public void setRev(Integer rev) {this.rev = rev;}
public String getUserId() {return userId;}
public void setUserId(String userId) {this.userId = userId;}
public String getName() {return name;}
public void setName(String name) {this.name = name;}
public String getDescription() {return description;}
public void setDescription(String description) {this.description = description;}
public String getType() {return type;}
public void setType(String type) {this.type = type;}
public String getTaskId() {return taskId;}
public void setTaskId(String taskId) {this.taskId = taskId;}
public String getProcInstId() {return procInstId;}
public void setProcInstId(String procInstId) {this.procInstId = procInstId;}
public String getUrl() {return url;}
public void setUrl(String url) {this.url = url;}
public String getContentId() {return contentId;}
public void setContentId(String contentId) {this.contentId = contentId;}
public String getTime() {return time;}
public void setTime(String time) {this.time = time;}

	
}
