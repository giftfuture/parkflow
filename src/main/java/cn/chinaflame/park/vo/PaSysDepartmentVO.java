package cn.chinaflame.park.vo;

import java.util.List;

import cn.chinaflame.park.model.BaseModel;

public class PaSysDepartmentVO extends BaseModel {
    private String code;
	private Long id;
	private String name;
	private String supername;
	private Long pid;
	private String deptremark;
	private Integer level;
	private Long createby;
	private String createtime;
	private Long updateby;
	private String updatetime;
	private Integer state;
	private Boolean open;
	private List<PaSysDepartmentVO> children;

	public Long getId() {return id;}
public void setId(Long id) {this.id = id;}
public String getName() {return name;}
public void setName(String name) {this.name = name;}
public Long getPid() {return pid;}
public void setPid(Long pid) {this.pid = pid;}
public String getDeptremark() {return deptremark;}
public void setDeptremark(String deptremark) {this.deptremark = deptremark;}
public Integer getLevel() {return level;}
public void setLevel(Integer level) {this.level = level;}
public Long getCreateby() {return createby;}
public void setCreateby(Long createby) {this.createby = createby;}
public String getCreatetime() {return createtime;}
public void setCreatetime(String createtime) {this.createtime = createtime;}
public Long getUpdateby() {return updateby;}
public void setUpdateby(Long updateby) {this.updateby = updateby;}
public String getUpdatetime() {return updatetime;}
public void setUpdatetime(String updatetime) {this.updatetime = updatetime;}
public Integer getState() {return state;}
public void setState(Integer state) {this.state = state;}
public Boolean getOpen() {return open;}
public void setOpen(Boolean open) {this.open = open;}
public List<PaSysDepartmentVO> getChildren() {
	return children;
}
public void setChildren(List<PaSysDepartmentVO> children) {
	this.children = children;
}
public String getSupername() {
	return supername;
}
public void setSupername(String supername) {
	this.supername = supername;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}

	
}
