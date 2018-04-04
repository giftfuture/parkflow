package cn.chinaflame.park.model;

import java.lang.Integer;
import java.lang.String;

/**
 * 系统变量表
 * modle
 */
public class PaSysVars extends BaseModel {

	private String id;
	private String varname;
	private String oldvalue;
	private String originvalue;
	private String newvalue;
	private String varhost;
	private String varhostip;
	private String remark;
	private String varproject;
	private Integer valid;


	public String getId() {return id;}
public void setId(String id) {this.id = id;}
public String getVarname() {return varname;}
public void setVarname(String varname) {this.varname = varname;}
public String getOldvalue() {return oldvalue;}
public void setOldvalue(String oldvalue) {this.oldvalue = oldvalue;}
public String getOriginvalue() {return originvalue;}
public void setOriginvalue(String originvalue) {this.originvalue = originvalue;}
public String getNewvalue() {return newvalue;}
public void setNewvalue(String newvalue) {this.newvalue = newvalue;}
public String getVarhost() {return varhost;}
public void setVarhost(String varhost) {this.varhost = varhost;}
public String getVarhostip() {return varhostip;}
public void setVarhostip(String varhostip) {this.varhostip = varhostip;}
public String getRemark() {return remark;}
public void setRemark(String remark) {this.remark = remark;}
public String getVarproject() {return varproject;}
public void setVarproject(String varproject) {this.varproject = varproject;}
public Integer getValid() {return valid;}
public void setValid(Integer valid) {this.valid = valid;}

	
}
