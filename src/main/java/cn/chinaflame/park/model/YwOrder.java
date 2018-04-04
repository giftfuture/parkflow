package cn.chinaflame.park.model;

import java.lang.Long;
import java.math.BigDecimal;
import java.util.List;
import java.lang.String;

/**
 * 乐园订单表
 * modle
 */
public class YwOrder extends BaseModel {

	private Long id;
	private String member_id;
	private String member_phone;
	private String member_card;
	private String operator_id;
	private BigDecimal money;
	private BigDecimal total_money;
	private String coupon_id;
	private String order_channel;
	private String trans_type;
	private String pay_type;
	private String pay_status;
	private String pay_channel;
	private String error_msg;	
	private String serial_number;
	private String ip;
	private String add_time;
	private String pay_time;
	private String pay_finish_time;
	private String suborders_id;
	private String createtime;
	private String updatetime;
	private List<YwOrderitem> item;
	private String order_type;
	private String goods_total;
	private String goods_id;
	private String contact_id;


	public Long getId() {return id;}
	public void setId(Long id) {this.id = id;}
	public String getMember_phone() {return member_phone;}
	public void setMember_phone(String member_phone) {this.member_phone = member_phone;}
	
	public String getMember_card() {return member_card;}
	public void setMember_card(String member_card) {this.member_card = member_card;}
	
	public String getMember_id() {return member_id;}
	public void setMember_id(String member_id) {this.member_id = member_id;}
	
	
	public String getOperator_id() {return operator_id;}
	public void setOperator_id(String operator_id) {this.operator_id = operator_id;}
	public BigDecimal getMoney() {return money;}
	public void setMoney(BigDecimal money) {this.money = money;}
	
	public BigDecimal getTotal_money() {
		return total_money;
	}
	public void setTotal_money(BigDecimal total_money) {
		this.total_money = total_money;
	}
	public String getCoupon_id() {
		return coupon_id;
	}
	public void setCoupon_id(String coupon_id) {
		this.coupon_id = coupon_id;
	}
	public String getOrder_channel() {return order_channel;}
	public void setOrder_channel(String order_channel) {this.order_channel = order_channel;}
	public String getTrans_type() {return trans_type;}
	public void setTrans_type(String trans_type) {this.trans_type = trans_type;}
	public String getPay_type() {return pay_type;}
	public void setPay_type(String pay_type) {this.pay_type = pay_type;}
	public String getPay_status() {return pay_status;}
	public void setPay_status(String pay_status) {this.pay_status = pay_status;}
	public String getError_msg() {return error_msg;}
	public void setError_msg(String error_msg) {this.error_msg = error_msg;}
	public String getPay_channel() {return pay_channel;}
	public void setPay_channel(String pay_channel) {this.pay_channel = pay_channel;}
	public String getSerial_number() {return serial_number;}
	public void setSerial_number(String serial_number) {this.serial_number = serial_number;}
	public String getIp() {return ip;}
	public void setIp(String ip) {this.ip = ip;}
	public String getAdd_time() {return add_time;}
	public void setAdd_time(String add_time) {this.add_time = add_time;}
	public String getPay_time() {return pay_time;}
	public void setPay_time(String pay_time) {this.pay_time = pay_time;}
	public String getPay_finish_time() {return pay_finish_time;}
	public void setPay_finish_time(String pay_finish_time) {this.pay_finish_time = pay_finish_time;}

	public String getSuborders_id() {
		return suborders_id;
	}
	public void setSuborders_id(String suborders_id) {
		this.suborders_id = suborders_id;
	}
	public String getCreatetime() {return createtime;}
	public void setCreatetime(String createtime) {this.createtime = createtime;}
	public String getUpdatetime() {return updatetime;}
	public void setUpdatetime(String updatetime) {this.updatetime = updatetime;}
	
	public String getOrder_type() {
		return order_type;
	}
	public void setOrder_type(String order_type) {
		this.order_type = order_type;
	}
	public List<YwOrderitem> getItem() {
		return item;
	}
	public void setItem(List<YwOrderitem> item) {
		this.item = item;
	}
	public String getIs_goods() {
		return order_type;
	}
	public void setIs_goods(String order_type) {
		this.order_type = order_type;
	}
	public String getGoods_total() {
		return goods_total;
	}
	public void setGoods_total(String goods_total) {
		this.goods_total = goods_total;
	}
	public String getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(String goods_id) {
		this.goods_id = goods_id;
	}
	public String getContact_id() {
		return contact_id;
	}
	public void setContact_id(String contact_id) {
		this.contact_id = contact_id;
	}
	

}
