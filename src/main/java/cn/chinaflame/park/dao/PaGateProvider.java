package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.PaGate;

/**
 * 闸机表
 * provider
 */
public class PaGateProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertPaGate(PaGate entity) {
		SQL sql = new SQL().INSERT_INTO("pa_gate");
		sql.VALUES("gate_name,gate_ip,gate_serial_number,gate_type,gate_status,gate_brand,gate_install_date,gate_venue_id,gate_user,gate_remarks,state,createtime,updatetime", "#{gate_name},#{gate_ip},#{gate_serial_number},#{gate_type},'1',#{gate_brand},#{gate_install_date},#{gate_venue_id},#{gate_user},#{gate_remarks},'1',#{createtime},#{updatetime}");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectPaGateByCount(PaGate entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("pa_gate");
					if(!Objects.isNull(entity.getGate_id())) {sql.WHERE("gate_id = #{gate_id}");}
			if(!Strings.isNullOrEmpty(entity.getGate_name())) {sql.WHERE("gate_name = #{gate_name}");}
			if(!Strings.isNullOrEmpty(entity.getGate_ip())) {sql.WHERE("gate_ip = #{gate_ip}");}
			if(!Strings.isNullOrEmpty(entity.getGate_serial_number())) {sql.WHERE("gate_serial_number = #{gate_serial_number}");}
			if(!Strings.isNullOrEmpty(entity.getGate_type())) {sql.WHERE("gate_type = #{gate_type}");}
			if(!Strings.isNullOrEmpty(entity.getGate_status())) {sql.WHERE("gate_status = #{gate_status}");}
			if(!Strings.isNullOrEmpty(entity.getGate_brand())) {sql.WHERE("gate_brand = #{gate_brand}");}
			if(!Strings.isNullOrEmpty(entity.getGate_install_date())) {sql.WHERE("gate_install_date = #{gate_install_date}");}
			if(!Objects.isNull(entity.getGate_venue_id())) {sql.WHERE("gate_venue_id = #{gate_venue_id}");}
			if(!Strings.isNullOrEmpty(entity.getGate_user())) {sql.WHERE("gate_user = #{gate_user}");}
			if(!Strings.isNullOrEmpty(entity.getGate_remarks())) {sql.WHERE("gate_remarks = #{gate_remarks}");}
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
	public String selectPaGateByLimt(PaGate entity) {
		SQL sql = new SQL().SELECT("*").FROM("pa_gate");
					if(!Objects.isNull(entity.getGate_id())) {sql.WHERE("gate_id = #{gate_id}");}
			if(!Strings.isNullOrEmpty(entity.getGate_name())) {sql.WHERE("gate_name = #{gate_name}");}
			if(!Strings.isNullOrEmpty(entity.getGate_ip())) {sql.WHERE("gate_ip = #{gate_ip}");}
			if(!Strings.isNullOrEmpty(entity.getGate_serial_number())) {sql.WHERE("gate_serial_number = #{gate_serial_number}");}
			if(!Strings.isNullOrEmpty(entity.getGate_type())) {sql.WHERE("gate_type = #{gate_type}");}
			if(!Strings.isNullOrEmpty(entity.getGate_status())) {sql.WHERE("gate_status = #{gate_status}");}
			if(!Strings.isNullOrEmpty(entity.getGate_brand())) {sql.WHERE("gate_brand = #{gate_brand}");}
			if(!Strings.isNullOrEmpty(entity.getGate_install_date())) {sql.WHERE("gate_install_date = #{gate_install_date}");}
			if(!Objects.isNull(entity.getGate_venue_id())) {sql.WHERE("gate_venue_id = #{gate_venue_id}");}
			if(!Strings.isNullOrEmpty(entity.getGate_user())) {sql.WHERE("gate_user = #{gate_user}");}
			if(!Strings.isNullOrEmpty(entity.getGate_remarks())) {sql.WHERE("gate_remarks = #{gate_remarks}");}
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("createtime = #{createtime}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("updatetime = #{updatetime}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectPaGate(PaGate entity) {
		SQL sql = new SQL().SELECT("*").FROM("pa_gate");
		
			if(!Objects.isNull(entity.getGate_id())) {sql.WHERE("gate_id = #{gate_id}");}
			if(!Strings.isNullOrEmpty(entity.getGate_name())) {sql.WHERE("gate_name = #{gate_name}");}
			if(!Strings.isNullOrEmpty(entity.getGate_ip())) {sql.WHERE("gate_ip = #{gate_ip}");}
			if(!Strings.isNullOrEmpty(entity.getGate_serial_number())) {sql.WHERE("gate_serial_number = #{gate_serial_number}");}
			if(!Strings.isNullOrEmpty(entity.getGate_type())) {sql.WHERE("gate_type = #{gate_type}");}
			if(!Strings.isNullOrEmpty(entity.getGate_status())) {sql.WHERE("gate_status = #{gate_status}");}
			if(!Strings.isNullOrEmpty(entity.getGate_brand())) {sql.WHERE("gate_brand = #{gate_brand}");}
			if(!Strings.isNullOrEmpty(entity.getGate_install_date())) {sql.WHERE("gate_install_date = #{gate_install_date}");}
			if(!Objects.isNull(entity.getGate_venue_id())) {sql.WHERE("gate_venue_id = #{gate_venue_id}");}
			if(!Strings.isNullOrEmpty(entity.getGate_user())) {sql.WHERE("gate_user = #{gate_user}");}
			if(!Strings.isNullOrEmpty(entity.getGate_remarks())) {sql.WHERE("gate_remarks = #{gate_remarks}");}
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("createtime = #{createtime}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("updatetime = #{updatetime}");}
			
		return sql.toString();
	}
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	public String selectOne(int id) {
		SQL sql = new SQL().SELECT("*").FROM("pa_gate");
		sql.WHERE("gate_id="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updatePaGate(PaGate entity) {
		SQL sql = new SQL().UPDATE("pa_gate");
				sql.SET("gate_name = #{gate_name}");
		sql.SET("gate_ip = #{gate_ip}");
		sql.SET("gate_serial_number = #{gate_serial_number}");
		sql.SET("gate_type = #{gate_type}");
		sql.SET("gate_status = #{gate_status}");
		sql.SET("gate_brand = #{gate_brand}");
		sql.SET("gate_install_date = #{gate_install_date}");
		sql.SET("gate_venue_id = #{gate_venue_id}");
		sql.SET("gate_user = #{gate_user}");
		sql.SET("gate_remarks = #{gate_remarks}");
		sql.SET("createtime = #{createtime}");
		sql.SET("updatetime = #{updatetime}");

		sql.WHERE("gate_id = #{gate_id}");
		return sql.toString();
	}
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public String updatePaGateByNullChk(PaGate entity) {
		SQL sql = new SQL().UPDATE("pa_gate");
					if(!Strings.isNullOrEmpty(entity.getGate_name())) {sql.SET("gate_name = #{gate_name}");}
			if(!Strings.isNullOrEmpty(entity.getGate_ip())) {sql.SET("gate_ip = #{gate_ip}");}
			if(!Strings.isNullOrEmpty(entity.getGate_serial_number())) {sql.SET("gate_serial_number = #{gate_serial_number}");}
			if(!Strings.isNullOrEmpty(entity.getGate_type())) {sql.SET("gate_type = #{gate_type}");}
			if(!Strings.isNullOrEmpty(entity.getGate_status())) {sql.SET("gate_status = #{gate_status}");}
			if(!Strings.isNullOrEmpty(entity.getGate_brand())) {sql.SET("gate_brand = #{gate_brand}");}
			if(!Strings.isNullOrEmpty(entity.getGate_install_date())) {sql.SET("gate_install_date = #{gate_install_date}");}
			if(!Objects.isNull(entity.getGate_venue_id())) {sql.SET("gate_venue_id = #{gate_venue_id}");}
			if(!Strings.isNullOrEmpty(entity.getGate_user())) {sql.SET("gate_user = #{gate_user}");}
			if(!Strings.isNullOrEmpty(entity.getGate_remarks())) {sql.SET("gate_remarks = #{gate_remarks}");}
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.SET("createtime = #{createtime}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.SET("updatetime = #{updatetime}");}

		sql.WHERE("gate_id = #{gate_id}");
		return sql.toString();
	}
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public String deletePaGate(int id) {
		SQL sql = new SQL().DELETE_FROM("pa_gate");
		sql.WHERE("gate_id = #{gate_id}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(int id) {
		SQL sql = new SQL().UPDATE("pa_gate");
		sql.SET("state=2");
		sql.WHERE("gate_id = #{gate_id}");
		return sql.toString();
	}
}
