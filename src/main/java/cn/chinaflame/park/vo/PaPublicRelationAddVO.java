package cn.chinaflame.park.vo;

import java.lang.String;

import cn.chinaflame.park.model.BaseModel;

/**
 * 公关增票添加bean
 * @author bm
 * 2018年3月15日 上午11:38:34
 */
public class PaPublicRelationAddVO extends BaseModel {

	private Integer order_id;  //订单id
	private Long department_id;  //部门id
	private Long staff_id;  //赠送员工id
	private String increase_time;  //赠送时间
	private String memo;  //备注
	
	public Integer getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	public Long getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(Long department_id) {
		this.department_id = department_id;
	}
	public Long getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(Long staff_id) {
		this.staff_id = staff_id;
	}
	public String getIncrease_time() {
		return increase_time;
	}
	public void setIncrease_time(String increase_time) {
		this.increase_time = increase_time;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
}
