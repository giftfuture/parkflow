package cn.chinaflame.park.vo;

import java.lang.String;

import cn.chinaflame.park.model.BaseModel;

/**
 * 交接班报表查询对象
 * @author bm
 * 2018年3月20日 下午1:24:00
 */
public class WorkStatisticAddVO extends BaseModel {

	private Long type;
	private Long operatorId;
	private String terminalIp;
	private String statisticDate;
	private String code;
	private String msg;
	public Long getType() {
		return type;
	}
	public void setType(Long type) {
		this.type = type;
	}
	public Long getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
	}
	public String getTerminalIp() {
		return terminalIp;
	}
	public void setTerminalIp(String terminalIp) {
		this.terminalIp = terminalIp;
	}
	public String getStatisticDate() {
		return statisticDate;
	}
	public void setStatisticDate(String statisticDate) {
		this.statisticDate = statisticDate;
	}
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
	
}
