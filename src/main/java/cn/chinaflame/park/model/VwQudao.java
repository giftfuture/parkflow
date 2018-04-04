package cn.chinaflame.park.model;

import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;

/**
 * 
 * modle
 */
public class VwQudao extends BaseModel {

	private String order_channel;
	private String product_type;
	private Long number;
	private BigDecimal actual_money;
	private BigDecimal accept_money;
	private String start_time;
	private String end_time;

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
	public String getOrder_channel() {return order_channel;}
public void setOrder_channel(String order_channel) {this.order_channel = order_channel;}
public String getProduct_type() {return product_type;}
public void setProduct_type(String product_type) {this.product_type = product_type;}
public Long getNumber() {return number;}
public void setNumber(Long number) {this.number = number;}
public BigDecimal getActual_money() {return actual_money;}
public void setActual_money(BigDecimal actual_money) {this.actual_money = actual_money;}
public BigDecimal getAccept_money() {return accept_money;}
public void setAccept_money(BigDecimal accept_money) {this.accept_money = accept_money;}

	
}
