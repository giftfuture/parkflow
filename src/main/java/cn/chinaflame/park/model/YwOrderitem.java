package cn.chinaflame.park.model;

import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;

/**
 * 订单详情表（票表）
 * modle
 */
public class YwOrderitem extends BaseModel {

	private Long id;
	private Long order_id;
	private String member_id;	
	private String product_id;
	private Integer product_number;
	private BigDecimal money;
	private String product_status;
	private String effiect_start_time;
	private String effiect_end_time;
	private String memo;
	private String createtime;
	private String updatetime;


	public Long getId() {return id;}
public void setId(Long id) {this.id = id;}
public Long getOrder_id() {return order_id;}
public void setOrder_id(Long order_id) {this.order_id = order_id;}
public String getMember_id() {return member_id;}
public void setMember_id(String member_id) {this.member_id = member_id;}
public String getProduct_id() {return product_id;}
public void setProduct_id(String product_id) {this.product_id = product_id;}
public Integer getProduct_number() {return product_number;}
public void setProduct_number(Integer product_number) {this.product_number = product_number;}
public BigDecimal getMoney() {return money;}
public void setMoney(BigDecimal money) {this.money = money;}
public String getProduct_status() {return product_status;}
public void setProduct_status(String product_status) {this.product_status = product_status;}
public String getEffiect_start_time() {return effiect_start_time;}
public void setEffiect_start_time(String effiect_start_time) {this.effiect_start_time = effiect_start_time;}
public String getEffiect_end_time() {return effiect_end_time;}
public void setEffiect_end_time(String effiect_end_time) {this.effiect_end_time = effiect_end_time;}

public String getMemo() {return memo;}
public void setMemo(String memo) {this.memo = memo;}

public String getCreatetime() {return createtime;}
public void setCreatetime(String createtime) {this.createtime = createtime;}
public String getUpdatetime() {return updatetime;}
public void setUpdatetime(String updatetime) {this.updatetime = updatetime;}

	
}
