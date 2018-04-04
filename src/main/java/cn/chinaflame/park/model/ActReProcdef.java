package cn.chinaflame.park.model;

import java.lang.Integer;
import java.lang.String;

/**
 * 
 * modle
 */
public class ActReProcdef extends BaseModel {

	private String id;
	private Integer rev;
	private String category;
	private String name;
	private String key;
	private Integer version;
	private String deploymentId;
	private String resourceName;
	private String dgrmResourceName;
	private String description;
	private Integer hasStartFormKey;
	private Integer hasGraphicalNotation;
	private Integer suspensionState;
	private String tenantId;


	public String getId() {return id;}
public void setId(String id) {this.id = id;}
public Integer getRev() {return rev;}
public void setRev(Integer rev) {this.rev = rev;}
public String getCategory() {return category;}
public void setCategory(String category) {this.category = category;}
public String getName() {return name;}
public void setName(String name) {this.name = name;}
public String getKey() {return key;}
public void setKey(String key) {this.key = key;}
public Integer getVersion() {return version;}
public void setVersion(Integer version) {this.version = version;}
public String getDeploymentId() {return deploymentId;}
public void setDeploymentId(String deploymentId) {this.deploymentId = deploymentId;}
public String getResourceName() {return resourceName;}
public void setResourceName(String resourceName) {this.resourceName = resourceName;}
public String getDgrmResourceName() {return dgrmResourceName;}
public void setDgrmResourceName(String dgrmResourceName) {this.dgrmResourceName = dgrmResourceName;}
public String getDescription() {return description;}
public void setDescription(String description) {this.description = description;}
public Integer getHasStartFormKey() {return hasStartFormKey;}
public void setHasStartFormKey(Integer hasStartFormKey) {this.hasStartFormKey = hasStartFormKey;}
public Integer getHasGraphicalNotation() {return hasGraphicalNotation;}
public void setHasGraphicalNotation(Integer hasGraphicalNotation) {this.hasGraphicalNotation = hasGraphicalNotation;}
public Integer getSuspensionState() {return suspensionState;}
public void setSuspensionState(Integer suspensionState) {this.suspensionState = suspensionState;}
public String getTenantId() {return tenantId;}
public void setTenantId(String tenantId) {this.tenantId = tenantId;}

	
}
