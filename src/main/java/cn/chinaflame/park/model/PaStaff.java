package cn.chinaflame.park.model;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
 * 员工信息表 
 * modle
 */
public class PaStaff extends BaseModel {
	
	
	
	private Long id;
	private String staffname;
	private String staffno;
	private String loginname;
	private Long staffdept;
	private String email;
	private String jobtitle;
	private String phone;
	private Integer gender;
	private Integer state;
	private String cardno;
	private String pwd;
	private Long createby;
	private String createtime;
	private Long updateby;
	private String updatetime;
	private Integer stafflevel;
	private String lastlogintime;
	private Integer logincount;
	private Long role;
	private String ip;

	public Long getId() {return id;}
public void setId(Long id) {this.id = id;}
public String getStaffname() {return staffname;}
public void setStaffname(String staffname) {this.staffname = staffname;}
public String getStaffno() {return staffno;}
public void setStaffno(String staffno) {this.staffno = staffno;}
public String getLoginname() {return loginname;}
public void setLoginname(String loginname) {this.loginname = loginname;}
public Long getStaffdept() {return staffdept;}
public void setStaffdept(Long staffdept) {this.staffdept = staffdept;}
public String getEmail() {return email;}
public void setEmail(String email) {this.email = email;}
public String getJobtitle() {return jobtitle;}
public void setJobtitle(String jobtitle) {this.jobtitle = jobtitle;}
public String getPhone() {return phone;}
public void setPhone(String phone) {this.phone = phone;}
public Integer getGender() {return gender;}
public void setGender(Integer gender) {this.gender = gender;}
public Integer getState() {return state;}
public void setState(Integer state) {this.state = state;}
public String getCardno() {return cardno;}
public void setCardno(String cardno) {this.cardno = cardno;}
public String getPwd() {return pwd;}
public void setPwd(String pwd) {this.pwd = pwd;}
public Long getCreateby() {return createby;}
public void setCreateby(Long createby) {this.createby = createby;}
public String getCreatetime() {return createtime;}
public void setCreatetime(String createtime) {this.createtime = createtime;}
public Long getUpdateby() {return updateby;}
public void setUpdateby(Long updateby) {this.updateby = updateby;}
public String getUpdatetime() {return updatetime;}
public void setUpdatetime(String updatetime) {this.updatetime = updatetime;}
public Integer getStafflevel() {return stafflevel;}
public void setStafflevel(Integer stafflevel) {this.stafflevel = stafflevel;}
public String getLastlogintime() {return lastlogintime;}
public void setLastlogintime(String lastlogintime) {this.lastlogintime = lastlogintime;}
public Integer getLogincount() {return logincount;}
public void setLogincount(Integer logincount) {this.logincount = logincount;}
public Long getRole() {return role;}
public void setRole(Long role) {this.role = role;}
public String getIp() {
	return ip;
}
public void setIp(String ip) {
	this.ip = ip;
}

	
}
