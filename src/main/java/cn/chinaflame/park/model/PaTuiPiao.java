package cn.chinaflame.park.model;

import java.math.BigDecimal;

/**
* @author    created by lbq
* @date	     2018年3月29日 上午11:33:38
**/
public class PaTuiPiao extends BaseModel {
	private Long order_id;
	private String add_time;
	private String order_channel;
	private BigDecimal ticket_price;
	private String original_orderid;
	private String pay_type;
	private String old_channel;
	private BigDecimal old_money;
	private String staffname;
	private String start_time;
	private String end_time;
	public Long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}
	public String getAdd_time() {
		return add_time;
	}
	public void setAdd_time(String add_time) {
		this.add_time = add_time;
	}
	public String getOrder_channel() {
		return order_channel;
	}
	public void setOrder_channel(String order_channel) {
		this.order_channel = order_channel;
	}
	public BigDecimal getTicket_price() {
		return ticket_price;
	}
	public void setTicket_price(BigDecimal ticket_price) {
		this.ticket_price = ticket_price;
	}
	public String getOriginal_orderid() {
		return original_orderid;
	}
	public void setOriginal_orderid(String original_orderid) {
		this.original_orderid = original_orderid;
	}
	public String getPay_type() {
		return pay_type;
	}
	public void setPay_type(String pay_type) {
		this.pay_type = pay_type;
	}
	public String getOld_channel() {
		return old_channel;
	}
	public void setOld_channel(String old_channel) {
		this.old_channel = old_channel;
	}
	public BigDecimal getOld_money() {
		return old_money;
	}
	public void setOld_money(BigDecimal old_money) {
		this.old_money = old_money;
	}
	public String getStaffname() {
		return staffname;
	}
	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	
	
}
