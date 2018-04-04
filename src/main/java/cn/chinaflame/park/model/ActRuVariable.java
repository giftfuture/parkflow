package cn.chinaflame.park.model;

import java.lang.Integer;
import java.lang.Long;
import java.lang.Double;
import java.lang.String;

/**
 * 
 * modle
 */
public class ActRuVariable extends BaseModel {

	private String id;
	private Integer rev;
	private String type;
	private String name;
	private String executionId;
	private String procInstId;
	private String taskId;
	private String bytearrayId;
	private double double_;
	private Long long_;
	private String text;
	private String text2;


	public String getId() {return id;}
public void setId(String id) {this.id = id;}
public Integer getRev() {return rev;}
public void setRev(Integer rev) {this.rev = rev;}
public String getType() {return type;}
public void setType(String type) {this.type = type;}
public String getName() {return name;}
public void setName(String name) {this.name = name;}
public String getExecutionId() {return executionId;}
public void setExecutionId(String executionId) {this.executionId = executionId;}
public String getProcInstId() {return procInstId;}
public void setProcInstId(String procInstId) {this.procInstId = procInstId;}
public String getTaskId() {return taskId;}
public void setTaskId(String taskId) {this.taskId = taskId;}
public String getBytearrayId() {return bytearrayId;}
public void setBytearrayId(String bytearrayId) {this.bytearrayId = bytearrayId;}
public String getText() {return text;}
public void setText(String text) {this.text = text;}
public String getText2() {return text2;}
public void setText2(String text2) {this.text2 = text2;}
public double getDouble_() {
	return double_;
}
public void setDouble_(double double_) {
	this.double_ = double_;
}
public Long getLong_() {
	return long_;
}
public void setLong_(Long long_) {
	this.long_ = long_;
}

	
}
