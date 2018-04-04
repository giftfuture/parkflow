package cn.chinaflame.park.model;

import java.lang.String;

/**
 * 
 * modle
 */
public class ActReDeployment extends BaseModel {

	private String id;
	private String name;
	private String category;
	private String tenantId;
	private String deployTime;


	public String getId() {return id;}
public void setId(String id) {this.id = id;}
public String getName() {return name;}
public void setName(String name) {this.name = name;}
public String getCategory() {return category;}
public void setCategory(String category) {this.category = category;}
public String getTenantId() {return tenantId;}
public void setTenantId(String tenantId) {this.tenantId = tenantId;}
public String getDeployTime() {return deployTime;}
public void setDeployTime(String deployTime) {this.deployTime = deployTime;}

	
}
