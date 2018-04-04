package cn.chinaflame.park.vo;

import java.lang.String;

import cn.chinaflame.park.model.BaseModel;

/**
 * 交接班报表查询对象
 * @author bm
 * 2018年3月20日 下午1:24:00
 */
public class VwWebsiteOrderQryVO extends BaseModel {


	private Long memberId;
	private String useStatus;
	public Long getMemberId() {
		return memberId;
	}
	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	public String getUseStatus() {
		return useStatus;
	}
	public void setUseStatus(String useStatus) {
		this.useStatus = useStatus;
	}
	
}
