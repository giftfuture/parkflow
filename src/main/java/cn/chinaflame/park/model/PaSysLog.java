package cn.chinaflame.park.model;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
 * 日志记录表
 * modle
 */
public class PaSysLog extends BaseModel {

	private Long id;
	private String operdate;
	private Long operator;
	private String opersort;
	private String opercontent;
	private String ip;
	private Integer state;
	private String operresult;
	private String method;
	private String exceptioncode;
	private String exceptiondetail;
	private String params;


	public Long getId() {return id;}
public void setId(Long id) {this.id = id;}
public String getOperdate() {return operdate;}
public void setOperdate(String operdate) {this.operdate = operdate;}
public Long getOperator() {return operator;}
public void setOperator(Long operator) {this.operator = operator;}
public String getOpersort() {return opersort;}
public void setOpersort(String opersort) {this.opersort = opersort;}
public String getOpercontent() {return opercontent;}
public void setOpercontent(String opercontent) {this.opercontent = opercontent;}
public String getIp() {return ip;}
public void setIp(String ip) {this.ip = ip;}
public Integer getState() {return state;}
public void setState(Integer state) {this.state = state;}
public String getOperresult() {return operresult;}
public void setOperresult(String operresult) {this.operresult = operresult;}
public String getMethod() {return method;}
public void setMethod(String method) {this.method = method;}
public String getExceptioncode() {return exceptioncode;}
public void setExceptioncode(String exceptioncode) {this.exceptioncode = exceptioncode;}
public String getExceptiondetail() {return exceptiondetail;}
public void setExceptiondetail(String exceptiondetail) {this.exceptiondetail = exceptiondetail;}
public String getParams() {return params;}
public void setParams(String params) {this.params = params;}

	
}
