package cn.chinaflame.park.model;

import java.lang.Integer;
import java.lang.String;

/**
 * 
 * modle
 */
public class ActGeProperty extends BaseModel {

	private String name;
	private String value;
	private Integer rev;


	public String getName() {return name;}
public void setName(String name) {this.name = name;}
public String getValue() {return value;}
public void setValue(String value) {this.value = value;}
public Integer getRev() {return rev;}
public void setRev(Integer rev) {this.rev = rev;}

	
}
