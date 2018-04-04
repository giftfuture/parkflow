package cn.chinaflame.park.model;

import java.lang.Integer;
import java.lang.String;

/**
 * 优是惠卷关联表
 * modle
 */
public class PaCoupon extends BaseModel {

	private Long id;
	private Integer member_id;
	private Integer discount_id;
	private String effiect_start_time;
	private String effiect_end_time;
	private String coupon_status;
	private String createtime;
	private String updatetime;
	private String phone;
	private String product_id;
	private String dis_apply_object;


	public Long getId() {return id;}
public void setId(Long id) {this.id = id;}
public Integer getMember_id() {return member_id;}
public void setMember_id(Integer member_id) {this.member_id = member_id;}
public Integer getDiscount_id() {return discount_id;}
public void setDiscount_id(Integer discount_id) {this.discount_id = discount_id;}
public String getEffiect_start_time() {return effiect_start_time;}
public void setEffiect_start_time(String effiect_start_time) {this.effiect_start_time = effiect_start_time;}
public String getEffiect_end_time() {return effiect_end_time;}
public void setEffiect_end_time(String effiect_end_time) {this.effiect_end_time = effiect_end_time;}
public String getCoupon_status() {return coupon_status;}
public void setCoupon_status(String coupon_status) {this.coupon_status = coupon_status;}
public String getCreatetime() {return createtime;}
public void setCreatetime(String createtime) {this.createtime = createtime;}
public String getUpdatetime() {return updatetime;}
public void setUpdatetime(String updatetime) {this.updatetime = updatetime;}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}

public String getProduct_id() {
	return product_id;
}
public void setProduct_id(String product_id) {
	this.product_id = product_id;
}

public String getDis_apply_object() {
	return dis_apply_object;
}
public void setDis_apply_object(String dis_apply_object) {
	this.dis_apply_object = dis_apply_object;
}




	
}
