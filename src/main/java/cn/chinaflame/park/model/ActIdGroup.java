package cn.chinaflame.park.model;

import java.lang.Integer;
import java.lang.String;

/**
 * 
 * modle
 */
public class ActIdGroup extends BaseModel {

	private String id;
	private Integer rev;
	private String name;
	private String type;


	public String getId() {return id;}
public void setId(String id) {this.id = id;}
public Integer getRev() {return rev;}
public void setRev(Integer rev) {this.rev = rev;}
public String getName() {return name;}
public void setName(String name) {this.name = name;}
public String getType() {return type;}
public void setType(String type) {this.type = type;}

	
}
