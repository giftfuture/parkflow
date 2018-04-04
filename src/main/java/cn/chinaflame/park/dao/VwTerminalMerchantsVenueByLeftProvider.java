package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.VwTerminalMerchantsVenueByLeft;

public class VwTerminalMerchantsVenueByLeftProvider {
	
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectVwTerminalMerchantsVenueByLeftByCount(VwTerminalMerchantsVenueByLeft entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("vw_terminal_merchants_venue_by_left");
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
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("createtime = #{createtime}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("updatetime = #{updatetime}");}
			if(!Strings.isNullOrEmpty(entity.getState())) {sql.WHERE("state = #{state}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_name())) {sql.WHERE("merchants_name = #{merchants_name}");}
			if(!Objects.isNull(entity.getMerchants_id())) {sql.WHERE("merchants_id = #{merchants_id}");}
			if(!Objects.isNull(entity.getVenue_id())) {sql.WHERE("venue_id = #{venue_id}");}
			if(!Strings.isNullOrEmpty(entity.getVenue_name())) {sql.WHERE("venue_name = #{venue_name}");}
			if(!Strings.isNullOrEmpty(entity.getVenue_grade())) {sql.WHERE("venue_grade = #{venue_grade}");}
			if(!Strings.isNullOrEmpty(entity.getVenue_status())) {sql.WHERE("venue_status = #{venue_status}");}

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
	public String selectVwTerminalMerchantsVenueByLeftByLimt(VwTerminalMerchantsVenueByLeft entity) {
		SQL sql = new SQL().SELECT("*").FROM("vw_terminal_merchants_venue_by_left");
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
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("createtime = #{createtime}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("updatetime = #{updatetime}");}
			if(!Strings.isNullOrEmpty(entity.getState())) {sql.WHERE("state = #{state}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_name())) {sql.WHERE("merchants_name = #{merchants_name}");}
			if(!Objects.isNull(entity.getMerchants_id())) {sql.WHERE("merchants_id = #{merchants_id}");}
			if(!Objects.isNull(entity.getVenue_id())) {sql.WHERE("venue_id = #{venue_id}");}
			if(!Strings.isNullOrEmpty(entity.getVenue_name())) {sql.WHERE("venue_name = #{venue_name}");}
			if(!Strings.isNullOrEmpty(entity.getVenue_grade())) {sql.WHERE("venue_grade = #{venue_grade}");}
			if(!Strings.isNullOrEmpty(entity.getVenue_status())) {sql.WHERE("venue_status = #{venue_status}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectVwTerminalMerchantsVenueByLeft(VwTerminalMerchantsVenueByLeft entity) {
		SQL sql = new SQL().SELECT("*").FROM("vw_terminal_merchants_venue_by_left");
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
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("createtime = #{createtime}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("updatetime = #{updatetime}");}
			if(!Strings.isNullOrEmpty(entity.getState())) {sql.WHERE("state = #{state}");}
			if(!Strings.isNullOrEmpty(entity.getMerchants_name())) {sql.WHERE("merchants_name = #{merchants_name}");}
			if(!Objects.isNull(entity.getMerchants_id())) {sql.WHERE("merchants_id = #{merchants_id}");}
			if(!Objects.isNull(entity.getVenue_id())) {sql.WHERE("venue_id = #{venue_id}");}
			if(!Strings.isNullOrEmpty(entity.getVenue_name())) {sql.WHERE("venue_name = #{venue_name}");}
			if(!Strings.isNullOrEmpty(entity.getVenue_grade())) {sql.WHERE("venue_grade = #{venue_grade}");}
			if(!Strings.isNullOrEmpty(entity.getVenue_status())) {sql.WHERE("venue_status = #{venue_status}");}

		return sql.toString();
	}
}
