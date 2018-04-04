package cn.chinaflame.park.model;

import java.lang.Integer;
import java.math.BigDecimal;
import java.lang.String;

/**
 * 优惠券表
 * modle
 */
public class PaDiscount extends BaseModel {

	private Long id;
	private String dis_name;
	private BigDecimal dis_money;
	private BigDecimal dis_total_amount;
	private String dis_memo;
	private String ticket_id;
	private Integer dis_aging;
	private String dis_type;
	private String dis_use_start_time;
	private String dis_use_end_time;
	private String dis_usage_rules;
	private String dis_apply_object;
	private String start_time;
	private String end_time;
	private String createtime;
	private String updatetime;


	public Long getId() {return id;}
public void setId(Long id) {this.id = id;}
public String getDis_name() {return dis_name;}
public void setDis_name(String dis_name) {this.dis_name = dis_name;}
public BigDecimal getDis_money() {return dis_money;}
public void setDis_money(BigDecimal dis_money) {this.dis_money = dis_money;}
public BigDecimal getDis_total_amount() {return dis_total_amount;}
public void setDis_total_amount(BigDecimal dis_total_amount) {this.dis_total_amount = dis_total_amount;}
public String getDis_memo() {return dis_memo;}
public void setDis_memo(String dis_memo) {this.dis_memo = dis_memo;}
public String getTicket_id() {return ticket_id;}
public void setTicket_id(String ticket_id) {this.ticket_id = ticket_id;}
public Integer getDis_aging() {return dis_aging;}
public void setDis_aging(Integer dis_aging) {this.dis_aging = dis_aging;}
public String getDis_type() {return dis_type;}
public void setDis_type(String dis_type) {this.dis_type = dis_type;}
public String getDis_use_start_time() {return dis_use_start_time;}
public void setDis_use_start_time(String dis_use_start_time) {this.dis_use_start_time = dis_use_start_time;}
public String getDis_use_end_time() {return dis_use_end_time;}
public void setDis_use_end_time(String dis_use_end_time) {this.dis_use_end_time = dis_use_end_time;}
public String getDis_usage_rules() {return dis_usage_rules;}
public void setDis_usage_rules(String dis_usage_rules) {this.dis_usage_rules = dis_usage_rules;}
public String getDis_apply_object() {return dis_apply_object;}
public void setDis_apply_object(String dis_apply_object) {this.dis_apply_object = dis_apply_object;}
public String getStart_time() {return start_time;}
public void setStart_time(String start_time) {this.start_time = start_time;}
public String getEnd_time() {return end_time;}
public void setEnd_time(String end_time) {this.end_time = end_time;}
public String getCreatetime() {return createtime;}
public void setCreatetime(String createtime) {this.createtime = createtime;}
public String getUpdatetime() {return updatetime;}
public void setUpdatetime(String updatetime) {this.updatetime = updatetime;}

	
}
