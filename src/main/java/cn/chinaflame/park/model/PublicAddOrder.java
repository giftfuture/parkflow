package cn.chinaflame.park.model;

import java.lang.String;
import java.math.BigDecimal;

/**
 * 公关增票记录表
 * modle
 */
public class PublicAddOrder extends BaseModel {

	private Integer ticket_object;
	private String ticket_type;
	private Integer ticket_number;
	private String ticket_id;
	private Long ticket_department;
	private BigDecimal ticket_money;
	private String ticket_date;
	private Long ticket_user;
	private String memo;
	public Integer getTicket_object() {
		return ticket_object;
	}
	public void setTicket_object(Integer ticket_object) {
		this.ticket_object = ticket_object;
	}
	public String getTicket_type() {
		return ticket_type;
	}
	public void setTicket_type(String ticket_type) {
		this.ticket_type = ticket_type;
	}
	public Integer getTicket_number() {
		return ticket_number;
	}
	public void setTicket_number(Integer ticket_number) {
		this.ticket_number = ticket_number;
	}
	public String getTicket_id() {
		return ticket_id;
	}
	public void setTicket_id(String ticket_id) {
		this.ticket_id = ticket_id;
	}
	public Long getTicket_department() {
		return ticket_department;
	}
	public void setTicket_department(Long ticket_department) {
		this.ticket_department = ticket_department;
	}
	public BigDecimal getTicket_money() {
		return ticket_money;
	}
	public void setTicket_money(BigDecimal ticket_money) {
		this.ticket_money = ticket_money;
	}
	public String getTicket_date() {
		return ticket_date;
	}
	public void setTicket_date(String ticket_date) {
		this.ticket_date = ticket_date;
	}
	public Long getTicket_user() {
		return ticket_user;
	}
	public void setTicket_user(Long ticket_user) {
		this.ticket_user = ticket_user;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}


	

	
}
