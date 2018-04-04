package cn.chinaflame.park.model;

import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;

/**
 * 
 * modle
 */
public class VwTicketRefund extends BaseModel {

	private Long order_id;
	private String add_time;
	private String order_channel;
	private BigDecimal ticket_price;
	private String original_orderid;
	private String pay_type;
	private BigDecimal cost_money;
	private String staffname;


	public Long getOrder_id() {return order_id;}
public void setOrder_id(Long order_id) {this.order_id = order_id;}
public String getAdd_time() {return add_time;}
public void setAdd_time(String add_time) {this.add_time = add_time;}
public String getOrder_channel() {return order_channel;}
public void setOrder_channel(String order_channel) {this.order_channel = order_channel;}
public BigDecimal getTicket_price() {return ticket_price;}
public void setTicket_price(BigDecimal ticket_price) {this.ticket_price = ticket_price;}
public String getOriginal_orderid() {return original_orderid;}
public void setOriginal_orderid(String original_orderid) {this.original_orderid = original_orderid;}
public String getPay_type() {return pay_type;}
public void setPay_type(String pay_type) {this.pay_type = pay_type;}
public BigDecimal getCost_money() {return cost_money;}
public void setCost_money(BigDecimal cost_money) {this.cost_money = cost_money;}
public String getStaffname() {return staffname;}
public void setStaffname(String staffname) {this.staffname = staffname;}

	
}
