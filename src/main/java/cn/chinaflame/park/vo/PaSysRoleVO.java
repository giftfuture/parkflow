package cn.chinaflame.park.vo;

import cn.chinaflame.park.model.BaseModel;

public class PaSysRoleVO extends BaseModel {


	private Long id;
	private String rolename;
	private String state;
	private String remark;
	private Long createby;
	private String createtime;
	private Long updateby;
	private String updatetime;
	private String permissions;
	private String admin;
	private String enalias;

	public Long getId() {return id;}
public void setId(Long id) {this.id = id;}
public String getRolename() {return rolename;}
public void setRolename(String rolename) {this.rolename = rolename;}
 
 
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
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
public String getAdmin() {
	return admin;
}
public void setAdmin(String admin) {
	this.admin = admin;
}
public String getEnalias() {
	return enalias;
}
public void setEnalias(String enalias) {
	this.enalias = enalias;
}

	

}
