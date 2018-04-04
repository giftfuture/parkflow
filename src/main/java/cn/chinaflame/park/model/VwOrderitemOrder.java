package cn.chinaflame.park.model;

import java.lang.Long;
import java.math.BigDecimal;
import java.lang.String;

/**
 * 
 * modle
 */
public class VwOrderitemOrder extends BaseModel {

	private Long id;
	private Long order_id;
	private String member_id;
	private String product_id;
	private BigDecimal money;
	private String effiect_start_time;
	private String effiect_end_time;
	private String createtime;
	private String updatetime;
	private String product_status;
	private String start_time;
	private String end_time;
	private String pay_status;


	public Long getId() {return id;}
public void setId(Long id) {this.id = id;}
public Long getOrder_id() {return order_id;}
public void setOrder_id(Long order_id) {this.order_id = order_id;}
public String getMember_id() {return member_id;}
public void setMember_id(String member_id) {this.member_id = member_id;}
public String getProduct_id() {return product_id;}
public void setProduct_id(String product_id) {this.product_id = product_id;}
public BigDecimal getMoney() {return money;}
public void setMoney(BigDecimal money) {this.money = money;}
public String getEffiect_start_time() {return effiect_start_time;}
public void setEffiect_start_time(String effiect_start_time) {this.effiect_start_time = effiect_start_time;}
public String getEffiect_end_time() {return effiect_end_time;}
public void setEffiect_end_time(String effiect_end_time) {this.effiect_end_time = effiect_end_time;}
public String getCreatetime() {return createtime;}
public void setCreatetime(String createtime) {this.createtime = createtime;}
public String getUpdatetime() {return updatetime;}
public void setUpdatetime(String updatetime) {this.updatetime = updatetime;}
public String getProduct_status() {return product_status;}
public void setProduct_status(String product_status) {this.product_status = product_status;}
public String getStart_time() {return start_time;}
public void setStart_time(String start_time) {this.start_time = start_time;}
public String getEnd_time() {return end_time;}
public void setEnd_time(String end_time) {this.end_time = end_time;}
public String getPay_status() {return pay_status;}
public void setPay_status(String pay_status) {this.pay_status = pay_status;}

	
}
