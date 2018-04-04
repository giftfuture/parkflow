package cn.chinaflame.park.model;

import java.lang.Long;
import java.lang.String;

/**
 * 终端表
 * modle
 */
public class PaTerminal extends BaseModel {

	private Long terminal_id;
	private String terminal_name;
	private String terminal_ip;
	private String terminal_brand;
	private String terminal_serial_number;
	private String terminal_venue_id;
	private String terminal_venue_grade;
	private String terminal_merchants_id;
	private String terminal_user;
	private String terminal_remarks;
	private String state;
	private String createtime;
	private String updatetime;


	public Long getTerminal_id() {return terminal_id;}
public void setTerminal_id(Long terminal_id) {this.terminal_id = terminal_id;}
public String getTerminal_name() {return terminal_name;}
public void setTerminal_name(String terminal_name) {this.terminal_name = terminal_name;}
public String getTerminal_ip() {return terminal_ip;}
public void setTerminal_ip(String terminal_ip) {this.terminal_ip = terminal_ip;}
public String getTerminal_brand() {return terminal_brand;}
public void setTerminal_brand(String terminal_brand) {this.terminal_brand = terminal_brand;}
public String getTerminal_serial_number() {return terminal_serial_number;}
public void setTerminal_serial_number(String terminal_serial_number) {this.terminal_serial_number = terminal_serial_number;}
public String getTerminal_venue_id() {return terminal_venue_id;}
public void setTerminal_venue_id(String terminal_venue_id) {this.terminal_venue_id = terminal_venue_id;}
public String getTerminal_venue_grade() {return terminal_venue_grade;}
public void setTerminal_venue_grade(String terminal_venue_grade) {this.terminal_venue_grade = terminal_venue_grade;}
public String getTerminal_merchants_id() {return terminal_merchants_id;}
public void setTerminal_merchants_id(String terminal_merchants_id) {this.terminal_merchants_id = terminal_merchants_id;}
public String getTerminal_user() {return terminal_user;}
public void setTerminal_user(String terminal_user) {this.terminal_user = terminal_user;}
public String getTerminal_remarks() {return terminal_remarks;}
public void setTerminal_remarks(String terminal_remarks) {this.terminal_remarks = terminal_remarks;}
public String getState() {return state;}
public void setState(String state) {this.state = state;}
public String getCreatetime() {return createtime;}
public void setCreatetime(String createtime) {this.createtime = createtime;}
public String getUpdatetime() {return updatetime;}
public void setUpdatetime(String updatetime) {this.updatetime = updatetime;}

	
}
