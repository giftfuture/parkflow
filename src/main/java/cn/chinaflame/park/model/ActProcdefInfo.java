package cn.chinaflame.park.model;

import java.lang.Integer;
import java.lang.String;

/**
 * 
 * modle
 */
public class ActProcdefInfo extends BaseModel {

	private String id;
	private String procDefId;
	private Integer rev;
	private String infoJsonId;


	public String getId() {return id;}
public void setId(String id) {this.id = id;}
public String getProcDefId() {return procDefId;}
public void setProcDefId(String procDefId) {this.procDefId = procDefId;}
public Integer getRev() {return rev;}
public void setRev(Integer rev) {this.rev = rev;}
public String getInfoJsonId() {return infoJsonId;}
public void setInfoJsonId(String infoJsonId) {this.infoJsonId = infoJsonId;}

	
}
