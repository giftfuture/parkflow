package cn.chinaflame.park.model;

import java.lang.Long;
import java.lang.String;

/**
 * 微信联系人表
 * modle
 */
public class PaContact extends BaseModel {

	private Long id;
	private Long member_id;
	private String name;
	private String mobile;
	private String id_no;
	private String province;
	private String province_code;
	private String city;
	private String city_code;
	private String county;
	private String county_code;
	private String address;
	private String defaults;
	private String state;
	private String createtime;
	private String updatetime;


	public Long getId() {return id;}
public void setId(Long id) {this.id = id;}
public Long getMember_id() {return member_id;}
public void setMember_id(Long member_id) {this.member_id = member_id;}
public String getName() {return name;}
public void setName(String name) {this.name = name;}
public String getMobile() {return mobile;}
public void setMobile(String mobile) {this.mobile = mobile;}
public String getId_no() {return id_no;}
public void setId_no(String id_no) {this.id_no = id_no;}
public String getProvince() {return province;}
public void setProvince(String province) {this.province = province;}
public String getProvince_code() {return province_code;}
public void setProvince_code(String province_code) {this.province_code = province_code;}
public String getCity() {return city;}
public void setCity(String city) {this.city = city;}
public String getCity_code() {return city_code;}
public void setCity_code(String city_code) {this.city_code = city_code;}
public String getCounty() {return county;}
public void setCounty(String county) {this.county = county;}
public String getCounty_code() {return county_code;}
public void setCounty_code(String county_code) {this.county_code = county_code;}
public String getAddress() {return address;}
public void setAddress(String address) {this.address = address;}
public String getDefaults() {return defaults;}
public void setDefaults(String defaults) {this.defaults = defaults;}
public String getState() {return state;}
public void setState(String state) {this.state = state;}
public String getCreatetime() {return createtime;}
public void setCreatetime(String createtime) {this.createtime = createtime;}
public String getUpdatetime() {return updatetime;}
public void setUpdatetime(String updatetime) {this.updatetime = updatetime;}

	
}
