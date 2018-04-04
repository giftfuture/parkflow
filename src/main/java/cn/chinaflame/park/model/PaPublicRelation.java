package cn.chinaflame.park.model;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
 * 公关增票记录表
 * modle
 */
public class PaPublicRelation extends BaseModel {

	private Long id;
	private Integer object_id;
	private Integer order_id;
	private Long department_id;
	private Long staff_id;
	private String increase_time;
	private String memo;
	private String createtime;
	private String updatetime;


	public Long getId() {return id;}
public void setId(Long id) {this.id = id;}
public Integer getObject_id() {return object_id;}
public void setObject_id(Integer object_id) {this.object_id = object_id;}
public Integer getOrder_id() {return order_id;}
public void setOrder_id(Integer order_id) {this.order_id = order_id;}
public Long getDepartment_id() {return department_id;}
public void setDepartment_id(Long department_id) {this.department_id = department_id;}
public Long getStaff_id() {return staff_id;}
public void setStaff_id(Long staff_id) {this.staff_id = staff_id;}
public String getIncrease_time() {return increase_time;}
public void setIncrease_time(String increase_time) {this.increase_time = increase_time;}
public String getMemo() {return memo;}
public void setMemo(String memo) {this.memo = memo;}
public String getCreatetime() {return createtime;}
public void setCreatetime(String createtime) {this.createtime = createtime;}
public String getUpdatetime() {return updatetime;}
public void setUpdatetime(String updatetime) {this.updatetime = updatetime;}

	
}
