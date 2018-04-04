package cn.chinaflame.park.model;

import java.lang.Long;
import java.lang.String;

/**
 * 
 * modle
 */
public class PaGoodsType extends BaseModel {

	private Long type_id;
	private String type_name;
	private Long status;


	public Long getType_id() {return type_id;}
	public void setType_id(Long type_id) {this.type_id = type_id;}
	public String getType_name() {return type_name;}
	public void setType_name(String type_name) {this.type_name = type_name;}
	public Long getStatus() {return status;}
	public void setStatus(Long status) {this.status = status;}

	
}
