package cn.chinaflame.park.model;

import java.lang.Long;
import java.lang.Integer;
import java.math.BigDecimal;
import java.lang.String;

/**
 * 
 * modle
 */
public class PaWorkStatistic extends BaseModel {

	private Long id;
	private Integer type;
	private Long staff_id;
	private String statistic_date;
	private String terminal_ip;
	private BigDecimal consume_money;
	private Integer discount;
	private Integer consume_count;
	private BigDecimal refund_money;
	private Integer refund_count;
	private BigDecimal wechat_money;
	private BigDecimal alipay_money;
	private BigDecimal unionpay_money;
	private BigDecimal cash;
	private BigDecimal previous_cash;
	private BigDecimal previous_cash_total;
	private BigDecimal day_consume_money;
	private Integer day_discount;
	private Integer day_consume_count;
	private BigDecimal day_refund_money;
	private Integer day_refund_count;
	private BigDecimal day_wechat_money;
	private BigDecimal day_alipay_money;
	private BigDecimal day_unionpay_money;
	private BigDecimal day_cash;
	private String createtime;
	private String updatetime;
	private String staff_no;
	private String staff_name;
	private String finish_display_name;
	private String field1;
	private String field2;
	


	public String getField1() {
		return field1;
	}
	public void setField1(String field1) {
		this.field1 = field1;
	}
	public String getField2() {
		return field2;
	}
	public void setField2(String field2) {
		this.field2 = field2;
	}
	public String getStaff_no() {
		return staff_no;
	}
	public void setStaff_no(String staff_no) {
		this.staff_no = staff_no;
	}
	public String getStaff_name() {
		return staff_name;
	}
	public void setStaff_name(String staff_name) {
		this.staff_name = staff_name;
	}
	public String getFinish_display_name() {
		return finish_display_name;
	}
	public void setFinish_display_name(String finish_display_name) {
		this.finish_display_name = finish_display_name;
	}
	public Long getId() {return id;}
public void setId(Long id) {this.id = id;}
public Integer getType() {return type;}
public void setType(Integer type) {this.type = type;}
public Long getStaff_id() {return staff_id;}
public void setStaff_id(Long staff_id) {this.staff_id = staff_id;}
public String getStatistic_date() {return statistic_date;}
public void setStatistic_date(String statistic_date) {this.statistic_date = statistic_date;}
public String getTerminal_ip() {return terminal_ip;}
public void setTerminal_ip(String terminal_ip) {this.terminal_ip = terminal_ip;}
public BigDecimal getConsume_money() {return consume_money;}
public void setConsume_money(BigDecimal consume_money) {this.consume_money = consume_money;}
public Integer getDiscount() {return discount;}
public void setDiscount(Integer discount) {this.discount = discount;}
public Integer getConsume_count() {return consume_count;}
public void setConsume_count(Integer consume_count) {this.consume_count = consume_count;}
public BigDecimal getRefund_money() {return refund_money;}
public void setRefund_money(BigDecimal refund_money) {this.refund_money = refund_money;}
public Integer getRefund_count() {return refund_count;}
public void setRefund_count(Integer refund_count) {this.refund_count = refund_count;}
public BigDecimal getWechat_money() {return wechat_money;}
public void setWechat_money(BigDecimal wechat_money) {this.wechat_money = wechat_money;}
public BigDecimal getAlipay_money() {return alipay_money;}
public void setAlipay_money(BigDecimal alipay_money) {this.alipay_money = alipay_money;}
public BigDecimal getUnionpay_money() {return unionpay_money;}
public void setUnionpay_money(BigDecimal unionpay_money) {this.unionpay_money = unionpay_money;}
public BigDecimal getCash() {return cash;}
public void setCash(BigDecimal cash) {this.cash = cash;}
public BigDecimal getPrevious_cash() {return previous_cash;}
public void setPrevious_cash(BigDecimal previous_cash) {this.previous_cash = previous_cash;}
public BigDecimal getPrevious_cash_total() {return previous_cash_total;}
public void setPrevious_cash_total(BigDecimal previous_cash_total) {this.previous_cash_total = previous_cash_total;}
public BigDecimal getDay_consume_money() {return day_consume_money;}
public void setDay_consume_money(BigDecimal day_consume_money) {this.day_consume_money = day_consume_money;}
public Integer getDay_discount() {return day_discount;}
public void setDay_discount(Integer day_discount) {this.day_discount = day_discount;}
public Integer getDay_consume_count() {return day_consume_count;}
public void setDay_consume_count(Integer day_consume_count) {this.day_consume_count = day_consume_count;}
public BigDecimal getDay_refund_money() {return day_refund_money;}
public void setDay_refund_money(BigDecimal day_refund_money) {this.day_refund_money = day_refund_money;}
public Integer getDay_refund_count() {return day_refund_count;}
public void setDay_refund_count(Integer day_refund_count) {this.day_refund_count = day_refund_count;}
public BigDecimal getDay_wechat_money() {return day_wechat_money;}
public void setDay_wechat_money(BigDecimal day_wechat_money) {this.day_wechat_money = day_wechat_money;}
public BigDecimal getDay_alipay_money() {return day_alipay_money;}
public void setDay_alipay_money(BigDecimal day_alipay_money) {this.day_alipay_money = day_alipay_money;}
public BigDecimal getDay_unionpay_money() {return day_unionpay_money;}
public void setDay_unionpay_money(BigDecimal day_unionpay_money) {this.day_unionpay_money = day_unionpay_money;}
public BigDecimal getDay_cash() {return day_cash;}
public void setDay_cash(BigDecimal day_cash) {this.day_cash = day_cash;}
public String getCreatetime() {return createtime;}
public void setCreatetime(String createtime) {this.createtime = createtime;}
public String getUpdatetime() {return updatetime;}
public void setUpdatetime(String updatetime) {this.updatetime = updatetime;}

	
}
