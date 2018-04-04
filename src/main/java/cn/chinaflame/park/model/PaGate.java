package cn.chinaflame.park.model;

import java.lang.Long;
import java.lang.String;

/**
 * 闸机表
 * modle
 */
public class PaGate extends BaseModel {

	private Long gate_id;
	private String gate_name;
	private String gate_ip;
	private String gate_serial_number;
	private String gate_type;
	private String gate_status;
	private String gate_brand;
	private String gate_install_date;
	private Long gate_venue_id;
	private String gate_user;
	private String gate_remarks;
	private String state;
	private String createtime;
	private String updatetime;


	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Long getGate_id() {return gate_id;}
public void setGate_id(Long gate_id) {this.gate_id = gate_id;}
public String getGate_name() {return gate_name;}
public void setGate_name(String gate_name) {this.gate_name = gate_name;}
public String getGate_ip() {return gate_ip;}
public void setGate_ip(String gate_ip) {this.gate_ip = gate_ip;}
public String getGate_serial_number() {return gate_serial_number;}
public void setGate_serial_number(String gate_serial_number) {this.gate_serial_number = gate_serial_number;}
public String getGate_type() {return gate_type;}
public void setGate_type(String gate_type) {this.gate_type = gate_type;}
public String getGate_status() {return gate_status;}
public void setGate_status(String gate_status) {this.gate_status = gate_status;}
public String getGate_brand() {return gate_brand;}
public void setGate_brand(String gate_brand) {this.gate_brand = gate_brand;}
public String getGate_install_date() {return gate_install_date;}
public void setGate_install_date(String gate_install_date) {this.gate_install_date = gate_install_date;}
public Long getGate_venue_id() {return gate_venue_id;}
public void setGate_venue_id(Long gate_venue_id) {this.gate_venue_id = gate_venue_id;}
public String getGate_user() {return gate_user;}
public void setGate_user(String gate_user) {this.gate_user = gate_user;}
public String getGate_remarks() {return gate_remarks;}
public void setGate_remarks(String gate_remarks) {this.gate_remarks = gate_remarks;}
public String getCreatetime() {return createtime;}
public void setCreatetime(String createtime) {this.createtime = createtime;}
public String getUpdatetime() {return updatetime;}
public void setUpdatetime(String updatetime) {this.updatetime = updatetime;}

	
}
