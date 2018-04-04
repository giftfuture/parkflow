package cn.chinaflame.park.model;

import java.lang.Long;
import java.math.BigDecimal;
import java.lang.String;

/**
 * 
 * modle
 */
public class VwWorkStatistic extends BaseModel {

	private String type_name;
	private String staff_name;
	private String staff_no;
	private Long id;
	private Long type;
	private Long staff_id;
	private String statistic_date;
	private String terminal_ip;
	private BigDecimal consume_money;
	private Long discount;
	private Long consume_count;
	private BigDecimal refund_money;
	private Long refund_count;
	private BigDecimal wechat_money;
	private BigDecimal alipay_money;
	private BigDecimal unionpay_money;
	private BigDecimal cash;
	private BigDecimal previous_cash;
	private BigDecimal previous_cash_total;
	private BigDecimal day_consume_money;
	private Long day_discount;
	private Long day_consume_count;
	private BigDecimal day_refund_money;
	private Long day_refund_count;
	private BigDecimal day_wechat_money;
	private BigDecimal day_alipay_money;
	private BigDecimal day_unionpay_money;
	private BigDecimal day_cash;
	private String createtime;
	private String updatetime;
	private String terminal_name;
	private String terminal_venue_id;
	private String startDate;
	private String endDate;


	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getType_name() {return type_name;}
public void setType_name(String type_name) {this.type_name = type_name;}
public String getStaff_name() {return staff_name;}
public void setStaff_name(String staff_name) {this.staff_name = staff_name;}
public String getStaff_no() {return staff_no;}
public void setStaff_no(String staff_no) {this.staff_no = staff_no;}
public Long getId() {return id;}
public void setId(Long id) {this.id = id;}
public Long getType() {return type;}
public void setType(Long type) {this.type = type;}
public Long getStaff_id() {return staff_id;}
public void setStaff_id(Long staff_id) {this.staff_id = staff_id;}
public String getStatistic_date() {return statistic_date;}
public void setStatistic_date(String statistic_date) {this.statistic_date = statistic_date;}
public String getTerminal_ip() {return terminal_ip;}
public void setTerminal_ip(String terminal_ip) {this.terminal_ip = terminal_ip;}
public BigDecimal getConsume_money() {return consume_money;}
public void setConsume_money(BigDecimal consume_money) {this.consume_money = consume_money;}
public Long getDiscount() {return discount;}
public void setDiscount(Long discount) {this.discount = discount;}
public Long getConsume_count() {return consume_count;}
public void setConsume_count(Long consume_count) {this.consume_count = consume_count;}
public BigDecimal getRefund_money() {return refund_money;}
public void setRefund_money(BigDecimal refund_money) {this.refund_money = refund_money;}
public Long getRefund_count() {return refund_count;}
public void setRefund_count(Long refund_count) {this.refund_count = refund_count;}
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
public Long getDay_discount() {return day_discount;}
public void setDay_discount(Long day_discount) {this.day_discount = day_discount;}
public Long getDay_consume_count() {return day_consume_count;}
public void setDay_consume_count(Long day_consume_count) {this.day_consume_count = day_consume_count;}
public BigDecimal getDay_refund_money() {return day_refund_money;}
public void setDay_refund_money(BigDecimal day_refund_money) {this.day_refund_money = day_refund_money;}
public Long getDay_refund_count() {return day_refund_count;}
public void setDay_refund_count(Long day_refund_count) {this.day_refund_count = day_refund_count;}
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
public String getTerminal_name() {return terminal_name;}
public void setTerminal_name(String terminal_name) {this.terminal_name = terminal_name;}
public String getTerminal_venue_id() {return terminal_venue_id;}
public void setTerminal_venue_id(String terminal_venue_id) {this.terminal_venue_id = terminal_venue_id;}

	
}
