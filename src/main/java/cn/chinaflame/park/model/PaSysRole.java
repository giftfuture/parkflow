package cn.chinaflame.park.model;

import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;

/**
 * 角色信息表 
 * modle
 */
public class PaSysRole extends BaseModel {

	private Long id;
	private Long roleid;
	private String rolename;
	private Integer state;
	private String remark;
	private Long createby;
	private String createtime;
	private Long updateby;
	private String updatetime;
	private String permissions;
	private Boolean admin;
	private String enalias;

	public Long getId() {return id;}
public void setId(Long id) {this.id = id;}
public Long getRoleid() {return roleid;}
public void setRoleid(Long roleid) {this.roleid = roleid;}
public String getRolename() {return rolename;}
public void setRolename(String rolename) {this.rolename = rolename;}
public Integer getState() {return state;}
public void setState(Integer state) {this.state = state;}
public String getRemark() {return remark;}
public void setRemark(String remark) {this.remark = remark;}
public Long getCreateby() {return createby;}
public void setCreateby(Long createby) {this.createby = createby;}
public String getCreatetime() {return createtime;}
public void setCreatetime(String createtime) {this.createtime = createtime;}
public Long getUpdateby() {return updateby;}
public void setUpdateby(Long updateby) {this.updateby = updateby;}
public String getUpdatetime() {return updatetime;}
public void setUpdatetime(String updatetime) {this.updatetime = updatetime;}
public String getPermissions() {return permissions;}
public void setPermissions(String permissions) {this.permissions = permissions;}
public Boolean getAdmin() {return admin;}
public void setAdmin(Boolean admin) {this.admin = admin;}
public String getEnalias() {
	return enalias;
}
public void setEnalias(String enalias) {
	this.enalias = enalias;
}

	
}
