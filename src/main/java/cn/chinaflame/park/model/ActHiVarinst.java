package cn.chinaflame.park.model;

import java.lang.Integer;
import java.lang.Long;
import java.lang.Double;
import java.lang.String;

/**
 * 
 * modle
 */
public class ActHiVarinst extends BaseModel {

	private String id;
	private String procInstId;
	private String executionId;
	private String taskId;
	private String name;
	private String varType;
	private Integer rev;
	private String bytearrayId;
	private double double_;
	private Long long_;
	private String text;
	private String text2;
	private String createTime;
	private String lastUpdatedTime;


	public String getId() {return id;}
public void setId(String id) {this.id = id;}
public String getProcInstId() {return procInstId;}
public void setProcInstId(String procInstId) {this.procInstId = procInstId;}
public String getExecutionId() {return executionId;}
public void setExecutionId(String executionId) {this.executionId = executionId;}
public String getTaskId() {return taskId;}
public void setTaskId(String taskId) {this.taskId = taskId;}
public String getName() {return name;}
public void setName(String name) {this.name = name;}
public String getVarType() {return varType;}
public void setVarType(String varType) {this.varType = varType;}
public Integer getRev() {return rev;}
public void setRev(Integer rev) {this.rev = rev;}
public String getBytearrayId() {return bytearrayId;}
public void setBytearrayId(String bytearrayId) {this.bytearrayId = bytearrayId;}
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
public String getText() {return text;}
public void setText(String text) {this.text = text;}
public String getText2() {return text2;}
public void setText2(String text2) {this.text2 = text2;}
public String getCreateTime() {return createTime;}
public void setCreateTime(String createTime) {this.createTime = createTime;}
public String getLastUpdatedTime() {return lastUpdatedTime;}
public void setLastUpdatedTime(String lastUpdatedTime) {this.lastUpdatedTime = lastUpdatedTime;}

	
}
