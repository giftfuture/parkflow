package cn.chinaflame.park.vo;

import org.hibernate.validator.constraints.NotEmpty;

import com.google.common.base.Strings;

import cn.chinaflame.park.model.BaseModel;
import cn.chinaflame.park.util.SysConst;

/**
 * 微信联系人添加请求bean
 * 
 */
public class PaContactAddVO extends BaseModel {

	@NotEmpty(message = "会员手机号不能为空")
	private String my_mobile;
	@NotEmpty(message = "联系人姓名不能为空")
	private String name;
	private String mobile;
//	@NotEmpty(message = "联系人身份证号不能为空")
	private String id_no;
	private String province;
	private String province_code;
	private String city;
	private String city_code;
	private String county;
	private String county_code;
	private String address;
	private String defaults;
	public String getMy_mobile() {
		return my_mobile;
	}
	public void setMy_mobile(String my_mobile) {
		this.my_mobile = my_mobile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getId_no() {
		return id_no;
	}
	public void setId_no(String id_no) {
		this.id_no = id_no;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getProvince_code() {
		return province_code;
	}
	public void setProvince_code(String province_code) {
		this.province_code = province_code;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCity_code() {
		return city_code;
	}
	public void setCity_code(String city_code) {
		this.city_code = city_code;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getCounty_code() {
		return county_code;
	}
	public void setCounty_code(String county_code) {
		this.county_code = county_code;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDefaults() {
		return defaults;
	}
	public void setDefaults(String defaults) {
		if(Strings.isNullOrEmpty(defaults))
			defaults = SysConst.ContactDefaultsNo;
		this.defaults = defaults;
	}
	
}
