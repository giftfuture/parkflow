package cn.chinaflame.park.model;

import java.lang.Long;
import java.math.BigDecimal;
import java.lang.String;

/**
 * 
 * modle
 */
public class VwTicketType extends BaseModel {

	private Long id;
	private String name;
	private BigDecimal price;
	private String type;
	private String venue_id;
	private String start_time;
	private String end_time;
	private String start_date;
	private String end_date;
	private Long deadline;
	private Long days;
	private String object_id;
	private String person_type;
	private String rule;
	private String memo;
	private String object_child;
	private String num_child;
	private String object_old;
	private String num_old;
	private String object_grown;
	private String num_grown;
	private String createtime;
	private String updatetime;
	private String venue_name;
	private String state;


	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getVenue_name() {
		return venue_name;
	}
	public void setVenue_name(String venue_name) {
		this.venue_name = venue_name;
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
public String getStart_time() {return start_time;}
public void setStart_time(String start_time) {this.start_time = start_time;}
public String getEnd_time() {return end_time;}
public void setEnd_time(String end_time) {this.end_time = end_time;}
public String getStart_date() {return start_date;}
public void setStart_date(String start_date) {this.start_date = start_date;}
public String getEnd_date() {return end_date;}
public void setEnd_date(String end_date) {this.end_date = end_date;}
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
public String getObject_child() {return object_child;}
public void setObject_child(String object_child) {this.object_child = object_child;}
public String getNum_child() {return num_child;}
public void setNum_child(String num_child) {this.num_child = num_child;}
public String getObject_old() {return object_old;}
public void setObject_old(String object_old) {this.object_old = object_old;}
public String getNum_old() {return num_old;}
public void setNum_old(String num_old) {this.num_old = num_old;}
public String getObject_grown() {return object_grown;}
public void setObject_grown(String object_grown) {this.object_grown = object_grown;}
public String getNum_grown() {return num_grown;}
public void setNum_grown(String num_grown) {this.num_grown = num_grown;}
public String getCreatetime() {return createtime;}
public void setCreatetime(String createtime) {this.createtime = createtime;}
public String getUpdatetime() {return updatetime;}
public void setUpdatetime(String updatetime) {this.updatetime = updatetime;}

	
}
