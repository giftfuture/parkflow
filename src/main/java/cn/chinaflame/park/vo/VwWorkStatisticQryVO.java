package cn.chinaflame.park.vo;

import java.lang.String;

import cn.chinaflame.park.model.BaseModel;

/**
 * 交接班报表查询对象
 * @author bm
 * 2018年3月20日 下午1:24:00
 */
public class VwWorkStatisticQryVO extends BaseModel {

	private Long type;
	private String venueId;
	private String startDate;
	private String endDate;
	public Long getType() {
		return type;
	}
	public void setType(Long type) {
		this.type = type;
	}
	public String getVenueId() {
		return venueId;
	}
	public void setVenueId(String venueId) {
		this.venueId = venueId;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
}
