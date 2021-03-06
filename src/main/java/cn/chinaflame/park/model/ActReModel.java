package cn.chinaflame.park.model;

import java.lang.Integer;
import java.lang.String;

/**
 * 
 * modle
 */
public class ActReModel extends BaseModel {

	private String id;
	private Integer rev;
	private String name;
	private String key;
	private String category;
	private String createTime;
	private String lastUpdateTime;
	private Integer version;
	private String metaInfo;
	private String deploymentId;
	private String editorSourceValueId;
	private String editorSourceExtraValueId;
	private String tenantId;


	public String getId() {return id;}
public void setId(String id) {this.id = id;}
public Integer getRev() {return rev;}
public void setRev(Integer rev) {this.rev = rev;}
public String getName() {return name;}
public void setName(String name) {this.name = name;}
public String getKey() {return key;}
public void setKey(String key) {this.key = key;}
public String getCategory() {return category;}
public void setCategory(String category) {this.category = category;}
public String getCreateTime() {return createTime;}
public void setCreateTime(String createTime) {this.createTime = createTime;}
public String getLastUpdateTime() {return lastUpdateTime;}
public void setLastUpdateTime(String lastUpdateTime) {this.lastUpdateTime = lastUpdateTime;}
public Integer getVersion() {return version;}
public void setVersion(Integer version) {this.version = version;}
public String getMetaInfo() {return metaInfo;}
public void setMetaInfo(String metaInfo) {this.metaInfo = metaInfo;}
public String getDeploymentId() {return deploymentId;}
public void setDeploymentId(String deploymentId) {this.deploymentId = deploymentId;}
public String getEditorSourceValueId() {return editorSourceValueId;}
public void setEditorSourceValueId(String editorSourceValueId) {this.editorSourceValueId = editorSourceValueId;}
public String getEditorSourceExtraValueId() {return editorSourceExtraValueId;}
public void setEditorSourceExtraValueId(String editorSourceExtraValueId) {this.editorSourceExtraValueId = editorSourceExtraValueId;}
public String getTenantId() {return tenantId;}
public void setTenantId(String tenantId) {this.tenantId = tenantId;}

	
}
