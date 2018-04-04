package cn.chinaflame.park.model;

import java.lang.Integer;
import java.lang.String;

/**
 * 会员表
 * modle
 */
@SuppressWarnings("serial")
public class PaMember extends BaseModel {

	private Integer id;
	private String mobile;
	private String id_card;
	private String name;
	private String sex;
	private String password;
	private String openid;
	private String createtime;
	private String updatetime;
	private Integer discount_number;


	public Integer getId() {return id;}
public void setId(Integer id) {this.id = id;}
public String getMobile() {return mobile;}
public void setMobile(String mobile) {this.mobile = mobile;}



public String getId_card() {
	return id_card;
}
public void setId_card(String id_card) {
	this.id_card = id_card;
}
public String getOpenid() {
	return openid;
}
public void setOpenid(String openid) {
	this.openid = openid;
}
public String getName() {return name;}
public void setName(String name) {this.name = name;}
public String getPassword() {return password;}
public void setPassword(String password) {this.password = password;}
public String getCreatetime() {return createtime;}
public void setCreatetime(String createtime) {this.createtime = createtime;}
public String getUpdatetime() {return updatetime;}
public void setUpdatetime(String updatetime) {this.updatetime = updatetime;}
public Integer getDiscount_number() {
	return discount_number;
}
public void setDiscount_number(Integer discount_number) {
	this.discount_number = discount_number;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}

	
}
