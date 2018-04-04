package cn.chinaflame.park.model;

import java.lang.Long;
import java.math.BigDecimal;
import java.lang.String;

/**
 * 通票票券表
 * modle
 */
public class PaTicketTeam extends BaseModel {

	private Long id;
	private String name;
	private BigDecimal price;
	private String type;
	private String venue_id;
	private String start_date;
	private String end_date;
	private String start_time;
	private String end_time;
	private Long deadline;
	private Long days;
	private String object_id;
	private String person_type;
	private String rule;
	private String memo;
	private String state;
	private String createtime;
	private String updatetime;


	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Long getId() {return id;}
public void setId(Long id) {this.id = id;}
public String getName() {return name;}
public void setName(String name) {this.name = name;}
public BigDecimal getPrice() {return price;}
public void setPrice(BigDecimal price) {this.price = price;}
public String getType() {return type;}
public void setType(String type) {this.type = type;}
public String getVenue_id() {return venue_id;}
public void setVenue_id(String venue_id) {this.venue_id = venue_id;}
public String getStart_date() {return start_date;}
public void setStart_date(String start_date) {this.start_date = start_date;}
public String getEnd_date() {return end_date;}
public void setEnd_date(String end_date) {this.end_date = end_date;}
public String getStart_time() {return start_time;}
public void setStart_time(String start_time) {this.start_time = start_time;}
public String getEnd_time() {return end_time;}
public void setEnd_time(String end_time) {this.end_time = end_time;}
public Long getDeadline() {return deadline;}
public void setDeadline(Long deadline) {this.deadline = deadline;}
public Long getDays() {return days;}
public void setDays(Long days) {this.days = days;}
public String getObject_id() {return object_id;}
public void setObject_id(String object_id) {this.object_id = object_id;}
public String getPerson_type() {return person_type;}
public void setPerson_type(String person_type) {this.person_type = person_type;}
public String getRule() {return rule;}
public void setRule(String rule) {this.rule = rule;}
public String getMemo() {return memo;}
public void setMemo(String memo) {this.memo = memo;}
public String getCreatetime() {return createtime;}
public void setCreatetime(String createtime) {this.createtime = createtime;}
public String getUpdatetime() {return updatetime;}
public void setUpdatetime(String updatetime) {this.updatetime = updatetime;}

	
}
