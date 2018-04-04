package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.PaTerminal;

/**
 * 终端表
 * provider
 */
public class PaTerminalProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertPaTerminal(PaTerminal entity) {
		SQL sql = new SQL().INSERT_INTO("pa_terminal");
		sql.VALUES("terminal_name,terminal_ip,terminal_brand,terminal_serial_number,terminal_venue_id,terminal_venue_grade,terminal_merchants_id,terminal_user,terminal_remarks,state,createtime,updatetime", "#{terminal_name},#{terminal_ip},#{terminal_brand},#{terminal_serial_number},#{terminal_venue_id},#{terminal_venue_grade},#{terminal_merchants_id},#{terminal_user},#{terminal_remarks},#{state},now(),now()");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectPaTerminalByCount(PaTerminal entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("pa_terminal");
					if(!Objects.isNull(entity.getTerminal_id())) {sql.WHERE("terminal_id = #{terminal_id}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_name())) {sql.WHERE("terminal_name = #{terminal_name}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_ip())) {sql.WHERE("terminal_ip = #{terminal_ip}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_brand())) {sql.WHERE("terminal_brand = #{terminal_brand}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_serial_number())) {sql.WHERE("terminal_serial_number = #{terminal_serial_number}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_venue_id())) {sql.WHERE("terminal_venue_id = #{terminal_venue_id}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_venue_grade())) {sql.WHERE("terminal_venue_grade = #{terminal_venue_grade}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_merchants_id())) {sql.WHERE("terminal_merchants_id = #{terminal_merchants_id}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_user())) {sql.WHERE("terminal_user = #{terminal_user}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_remarks())) {sql.WHERE("terminal_remarks = #{terminal_remarks}");}
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
	public String selectPaTerminalByLimt(PaTerminal entity) {
		SQL sql = new SQL().SELECT("*").FROM("pa_terminal");
					if(!Objects.isNull(entity.getTerminal_id())) {sql.WHERE("terminal_id = #{terminal_id}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_name())) {sql.WHERE("terminal_name = #{terminal_name}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_ip())) {sql.WHERE("terminal_ip = #{terminal_ip}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_brand())) {sql.WHERE("terminal_brand = #{terminal_brand}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_serial_number())) {sql.WHERE("terminal_serial_number = #{terminal_serial_number}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_venue_id())) {sql.WHERE("terminal_venue_id = #{terminal_venue_id}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_venue_grade())) {sql.WHERE("terminal_venue_grade = #{terminal_venue_grade}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_merchants_id())) {sql.WHERE("terminal_merchants_id = #{terminal_merchants_id}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_user())) {sql.WHERE("terminal_user = #{terminal_user}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_remarks())) {sql.WHERE("terminal_remarks = #{terminal_remarks}");}
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
	public String selectPaTerminal(PaTerminal entity) {
		SQL sql = new SQL().SELECT("*").FROM("pa_terminal");
			if(!Objects.isNull(entity.getTerminal_id())) {sql.WHERE("terminal_id = #{terminal_id}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_name())) {sql.WHERE("terminal_name = #{terminal_name}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_ip())) {sql.WHERE("terminal_ip = #{terminal_ip}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_brand())) {sql.WHERE("terminal_brand = #{terminal_brand}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_serial_number())) {sql.WHERE("terminal_serial_number = #{terminal_serial_number}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_venue_id())) {sql.WHERE("terminal_venue_id = #{terminal_venue_id}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_venue_grade())) {sql.WHERE("terminal_venue_grade = #{terminal_venue_grade}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_merchants_id())) {sql.WHERE("terminal_merchants_id = #{terminal_merchants_id}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_user())) {sql.WHERE("terminal_user = #{terminal_user}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_remarks())) {sql.WHERE("terminal_remarks = #{terminal_remarks}");}
			if(!Strings.isNullOrEmpty(entity.getState())) {sql.WHERE("state = #{state}");}
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
		SQL sql = new SQL().SELECT("*").FROM("pa_terminal");
		sql.WHERE("terminal_id="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updatePaTerminal(PaTerminal entity) {
		SQL sql = new SQL().UPDATE("pa_terminal");
				sql.SET("terminal_name = #{terminal_name}");
		sql.SET("terminal_ip = #{terminal_ip}");
		sql.SET("terminal_brand = #{terminal_brand}");
		sql.SET("terminal_serial_number = #{terminal_serial_number}");
		sql.SET("terminal_venue_id = #{terminal_venue_id}");
		sql.SET("terminal_venue_grade = #{terminal_venue_grade}");
		sql.SET("terminal_merchants_id = #{terminal_merchants_id}");
		sql.SET("terminal_user = #{terminal_user}");
		sql.SET("terminal_remarks = #{terminal_remarks}");
		sql.SET("state = #{state}");
		sql.SET("updatetime = now()");

		sql.WHERE("terminal_id = #{terminal_id}");
		return sql.toString();
	}
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public String updatePaTerminalByNullChk(PaTerminal entity) {
		SQL sql = new SQL().UPDATE("pa_terminal");
					if(!Strings.isNullOrEmpty(entity.getTerminal_name())) {sql.SET("terminal_name = #{terminal_name}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_ip())) {sql.SET("terminal_ip = #{terminal_ip}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_brand())) {sql.SET("terminal_brand = #{terminal_brand}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_serial_number())) {sql.SET("terminal_serial_number = #{terminal_serial_number}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_venue_id())) {sql.SET("terminal_venue_id = #{terminal_venue_id}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_venue_grade())) {sql.SET("terminal_venue_grade = #{terminal_venue_grade}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_merchants_id())) {sql.SET("terminal_merchants_id = #{terminal_merchants_id}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_user())) {sql.SET("terminal_user = #{terminal_user}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_remarks())) {sql.SET("terminal_remarks = #{terminal_remarks}");}
			if(!Strings.isNullOrEmpty(entity.getState())) {sql.SET("state = #{state}");}
		sql.SET("updatetime = now()");

		sql.WHERE("terminal_id = #{terminal_id}");
		return sql.toString();
	}
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public String deletePaTerminal(int id) {
		SQL sql = new SQL().DELETE_FROM("pa_terminal");
		sql.WHERE("terminal_id = #{terminal_id}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(int id) {
		SQL sql = new SQL().UPDATE("pa_terminal");
		sql.SET("state=2");
		sql.WHERE("terminal_id = #{terminal_id}");
		return sql.toString();
	}
}
