package cn.chinaflame.park.vo;

import java.lang.String;

import cn.chinaflame.park.model.BaseModel;

/**
 * 微信联系人添加请求bean
 * 
 */
public class WebchatOrderQryVO extends BaseModel {

	private String mobile;
	private String orderState;
	private String code;
	private String msg;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getOrderState() {
		return orderState;
	}
	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}

	
}
