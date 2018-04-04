package cn.chinaflame.park.vo;

import cn.chinaflame.park.model.BaseModel;

/**
 * 
 * modle
 */
public class PaPositionVO extends BaseModel {

	private Long id;
	private String name;
	private String memo;
	private Long createby;
	private String createtime;
	private Long updateby;
	private String updatetime;
	private String enalias;
	private Long department;
	private int state;
	private String departmentname;
	public Long getId() {return id;}
public void setId(Long id) {this.id = id;}
public String getName() {return name;}
public void setName(String name) {this.name = name;}
public String getMemo() {return memo;}
public void setMemo(String memo) {this.memo = memo;}
public Long getCreateby() {return createby;}
public void setCreateby(Long createby) {this.createby = createby;}
public String getCreatetime() {return createtime;}
public void setCreatetime(String createtime) {this.createtime = createtime;}
public Long getUpdateby() {return updateby;}
public void setUpdateby(Long updateby) {this.updateby = updateby;}
public String getUpdatetime() {return updatetime;}
public void setUpdatetime(String updatetime) {this.updatetime = updatetime;}
public String getEnalias() {return enalias;}
public void setEnalias(String enalias) {this.enalias = enalias;}
public Long getDepartment() {return department;}
public void setDepartment(Long department) {this.department = department;}
public int getState() {
	return state;
}
public void setState(int state) {
	this.state = state;
}
public String getDepartmentname() {
	return departmentname;
}
public void setDepartmentname(String departmentname) {
	this.departmentname = departmentname;
}

	
}
