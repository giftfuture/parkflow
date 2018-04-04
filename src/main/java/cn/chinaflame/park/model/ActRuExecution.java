package cn.chinaflame.park.model;

import java.lang.Integer;
import java.lang.String;

/**
 * 
 * modle
 */
public class ActRuExecution extends BaseModel {

	private String id;
	private Integer rev;
	private String procInstId;
	private String businessKey;
	private String parentId;
	private String procDefId;
	private String superExec;
	private String actId;
	private Integer isActive;
	private Integer isConcurrent;
	private Integer isScope;
	private Integer isEventScope;
	private Integer suspensionState;
	private Integer cachedEntState;
	private String tenantId;
	private String name;
	private String lockTime;


	public String getId() {return id;}
public void setId(String id) {this.id = id;}
public Integer getRev() {return rev;}
public void setRev(Integer rev) {this.rev = rev;}
public String getProcInstId() {return procInstId;}
public void setProcInstId(String procInstId) {this.procInstId = procInstId;}
public String getBusinessKey() {return businessKey;}
public void setBusinessKey(String businessKey) {this.businessKey = businessKey;}
public String getParentId() {return parentId;}
public void setParentId(String parentId) {this.parentId = parentId;}
public String getProcDefId() {return procDefId;}
public void setProcDefId(String procDefId) {this.procDefId = procDefId;}
public String getSuperExec() {return superExec;}
public void setSuperExec(String superExec) {this.superExec = superExec;}
public String getActId() {return actId;}
public void setActId(String actId) {this.actId = actId;}
public Integer getIsActive() {return isActive;}
public void setIsActive(Integer isActive) {this.isActive = isActive;}
public Integer getIsConcurrent() {return isConcurrent;}
public void setIsConcurrent(Integer isConcurrent) {this.isConcurrent = isConcurrent;}
public Integer getIsScope() {return isScope;}
public void setIsScope(Integer isScope) {this.isScope = isScope;}
public Integer getIsEventScope() {return isEventScope;}
public void setIsEventScope(Integer isEventScope) {this.isEventScope = isEventScope;}
public Integer getSuspensionState() {return suspensionState;}
public void setSuspensionState(Integer suspensionState) {this.suspensionState = suspensionState;}
public Integer getCachedEntState() {return cachedEntState;}
public void setCachedEntState(Integer cachedEntState) {this.cachedEntState = cachedEntState;}
public String getTenantId() {return tenantId;}
public void setTenantId(String tenantId) {this.tenantId = tenantId;}
public String getName() {return name;}
public void setName(String name) {this.name = name;}
public String getLockTime() {return lockTime;}
public void setLockTime(String lockTime) {this.lockTime = lockTime;}

	
}
