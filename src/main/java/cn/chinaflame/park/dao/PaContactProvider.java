package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.PaContact;

/**
 * 微信联系人表
 * provider
 */
public class PaContactProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertPaContact(PaContact entity) {
		SQL sql = new SQL().INSERT_INTO("pa_contact");
		sql.VALUES("member_id,name,mobile,id_no,province,province_code,city,city_code,county,county_code,address,defaults,state,createtime,updatetime", "#{member_id},#{name},#{mobile},#{id_no},#{province},#{province_code},#{city},#{city_code},#{county},#{county_code},#{address},#{defaults},#{state},now(),now()");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectPaContactByCount(PaContact entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("pa_contact");
					if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getMember_id())) {sql.WHERE("member_id = #{member_id}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getMobile())) {sql.WHERE("mobile = #{mobile}");}
			if(!Strings.isNullOrEmpty(entity.getId_no())) {sql.WHERE("id_no = #{id_no}");}
			if(!Strings.isNullOrEmpty(entity.getProvince())) {sql.WHERE("province = #{province}");}
			if(!Strings.isNullOrEmpty(entity.getProvince_code())) {sql.WHERE("province_code = #{province_code}");}
			if(!Strings.isNullOrEmpty(entity.getCity())) {sql.WHERE("city = #{city}");}
			if(!Strings.isNullOrEmpty(entity.getCity_code())) {sql.WHERE("city_code = #{city_code}");}
			if(!Strings.isNullOrEmpty(entity.getCounty())) {sql.WHERE("county = #{county}");}
			if(!Strings.isNullOrEmpty(entity.getCounty_code())) {sql.WHERE("county_code = #{county_code}");}
			if(!Strings.isNullOrEmpty(entity.getAddress())) {sql.WHERE("address = #{address}");}
			if(!Strings.isNullOrEmpty(entity.getDefaults())) {sql.WHERE("defaults = #{defaults}");}
			if(!Strings.isNullOrEmpty(entity.getState())) {sql.WHERE("state = #{state}");}
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("createtime = #{createtime}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("updatetime = #{updatetime}");}

		return sql.toString();
	}
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	public String selectPaContactByLimt(PaContact entity) {
		SQL sql = new SQL().SELECT("*").FROM("pa_contact");
					if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getMember_id())) {sql.WHERE("member_id = #{member_id}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getMobile())) {sql.WHERE("mobile = #{mobile}");}
			if(!Strings.isNullOrEmpty(entity.getId_no())) {sql.WHERE("id_no = #{id_no}");}
			if(!Strings.isNullOrEmpty(entity.getProvince())) {sql.WHERE("province = #{province}");}
			if(!Strings.isNullOrEmpty(entity.getProvince_code())) {sql.WHERE("province_code = #{province_code}");}
			if(!Strings.isNullOrEmpty(entity.getCity())) {sql.WHERE("city = #{city}");}
			if(!Strings.isNullOrEmpty(entity.getCity_code())) {sql.WHERE("city_code = #{city_code}");}
			if(!Strings.isNullOrEmpty(entity.getCounty())) {sql.WHERE("county = #{county}");}
			if(!Strings.isNullOrEmpty(entity.getCounty_code())) {sql.WHERE("county_code = #{county_code}");}
			if(!Strings.isNullOrEmpty(entity.getAddress())) {sql.WHERE("address = #{address}");}
			if(!Strings.isNullOrEmpty(entity.getDefaults())) {sql.WHERE("defaults = #{defaults}");}
			if(!Strings.isNullOrEmpty(entity.getState())) {sql.WHERE("state = #{state}");}
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("createtime = #{createtime}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("updatetime = #{updatetime}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectPaContact(PaContact entity) {
		SQL sql = new SQL().SELECT("*").FROM("pa_contact");
			if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getMember_id())) {sql.WHERE("member_id = #{member_id}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getMobile())) {sql.WHERE("mobile = #{mobile}");}
			if(!Strings.isNullOrEmpty(entity.getId_no())) {sql.WHERE("id_no = #{id_no}");}
			if(!Strings.isNullOrEmpty(entity.getProvince())) {sql.WHERE("province = #{province}");}
			if(!Strings.isNullOrEmpty(entity.getProvince_code())) {sql.WHERE("province_code = #{province_code}");}
			if(!Strings.isNullOrEmpty(entity.getCity())) {sql.WHERE("city = #{city}");}
			if(!Strings.isNullOrEmpty(entity.getCity_code())) {sql.WHERE("city_code = #{city_code}");}
			if(!Strings.isNullOrEmpty(entity.getCounty())) {sql.WHERE("county = #{county}");}
			if(!Strings.isNullOrEmpty(entity.getCounty_code())) {sql.WHERE("county_code = #{county_code}");}
			if(!Strings.isNullOrEmpty(entity.getAddress())) {sql.WHERE("address = #{address}");}
			if(!Strings.isNullOrEmpty(entity.getDefaults())) {sql.WHERE("defaults = #{defaults}");}
			if(!Strings.isNullOrEmpty(entity.getState())) {sql.WHERE("state = #{state}");}
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("createtime = #{createtime}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("updatetime = #{updatetime}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc";
	}
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	public String selectOne(int id) {
		SQL sql = new SQL().SELECT("*").FROM("pa_contact");
		sql.WHERE("id="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updatePaContact(PaContact entity) {
		SQL sql = new SQL().UPDATE("pa_contact");
				sql.SET("member_id = #{member_id}");
		sql.SET("name = #{name}");
		sql.SET("mobile = #{mobile}");
		sql.SET("id_no = #{id_no}");
		sql.SET("province = #{province}");
		sql.SET("province_code = #{province_code}");
		sql.SET("city = #{city}");
		sql.SET("city_code = #{city_code}");
		sql.SET("county = #{county}");
		sql.SET("county_code = #{county_code}");
		sql.SET("address = #{address}");
		sql.SET("defaults = #{defaults}");
		sql.SET("state = #{state}");
		sql.SET("updatetime = now()");

		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public String updatePaContactByNullChk(PaContact entity) {
		SQL sql = new SQL().UPDATE("pa_contact");
					if(!Objects.isNull(entity.getMember_id())) {sql.SET("member_id = #{member_id}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.SET("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getMobile())) {sql.SET("mobile = #{mobile}");}
			if(!Strings.isNullOrEmpty(entity.getId_no())) {sql.SET("id_no = #{id_no}");}
			if(!Strings.isNullOrEmpty(entity.getProvince())) {sql.SET("province = #{province}");}
			if(!Strings.isNullOrEmpty(entity.getProvince_code())) {sql.SET("province_code = #{province_code}");}
			if(!Strings.isNullOrEmpty(entity.getCity())) {sql.SET("city = #{city}");}
			if(!Strings.isNullOrEmpty(entity.getCity_code())) {sql.SET("city_code = #{city_code}");}
			if(!Strings.isNullOrEmpty(entity.getCounty())) {sql.SET("county = #{county}");}
			if(!Strings.isNullOrEmpty(entity.getCounty_code())) {sql.SET("county_code = #{county_code}");}
			if(!Strings.isNullOrEmpty(entity.getAddress())) {sql.SET("address = #{address}");}
			if(!Strings.isNullOrEmpty(entity.getDefaults())) {sql.SET("defaults = #{defaults}");}
			if(!Strings.isNullOrEmpty(entity.getState())) {sql.SET("state = #{state}");}
		sql.SET("updatetime = now()");

		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public String deletePaContact(int id) {
		SQL sql = new SQL().DELETE_FROM("pa_contact");
		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(int id) {
		SQL sql = new SQL().UPDATE("pa_contact");
		sql.SET("state=2");
		sql.WHERE("id = #{id}");
		return sql.toString();
	}
}
