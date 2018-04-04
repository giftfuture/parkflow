package cn.chinaflame.park.model;

import java.lang.Integer;
import java.lang.String;

/**
 * 
 * modle
 */
public class ActIdInfo extends BaseModel {

	private String id;
	private Integer rev;
	private String userId;
	private String type;
	private String key;
	private String value;
	private String password;
	private String parentId;


	public String getId() {return id;}
public void setId(String id) {this.id = id;}
public Integer getRev() {return rev;}
public void setRev(Integer rev) {this.rev = rev;}
public String getUserId() {return userId;}
public void setUserId(String userId) {this.userId = userId;}
public String getType() {return type;}
public void setType(String type) {this.type = type;}
public String getKey() {return key;}
public void setKey(String key) {this.key = key;}
public String getValue() {return value;}
public void setValue(String value) {this.value = value;}
public String getPassword() {return password;}
public void setPassword(String password) {this.password = password;}
public String getParentId() {return parentId;}
public void setParentId(String parentId) {this.parentId = parentId;}

	
}
