package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.VwTicketType;

public class VwTicketTypeProvider {
	
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectVwTicketTypeByCount(VwTicketType entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("vw_ticket_type");
					if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name LIKE CONCAT('%',#{name},'%')");}
			if(!Objects.isNull(entity.getPrice())) {sql.WHERE("price = #{price}");}
			if(!Strings.isNullOrEmpty(entity.getType())) {sql.WHERE("type = #{type}");}
			if(!Strings.isNullOrEmpty(entity.getVenue_id())) {sql.WHERE("venue_id LIKE CONCAT('%',#{venue_id},'%')");}
			if(!Strings.isNullOrEmpty(entity.getStart_time())) {sql.WHERE("start_time = #{start_time}");}
			if(!Strings.isNullOrEmpty(entity.getEnd_time())) {sql.WHERE("end_time = #{end_time}");}
//			if(!Strings.isNullOrEmpty(entity.getStart_date())) {sql.WHERE("start_date = #{end_date}");}
			if(!Strings.isNullOrEmpty(entity.getEnd_date())) {sql.WHERE("start_date <= #{end_date}").WHERE("end_date >= #{end_date}");}
			if(!Objects.isNull(entity.getDeadline())) {sql.WHERE("deadline = #{deadline}");}
			if(!Objects.isNull(entity.getDays())) {sql.WHERE("days = #{days}");}
			if(!Strings.isNullOrEmpty(entity.getObject_id())) {sql.WHERE("object_id = #{object_id}");}
			if(!Strings.isNullOrEmpty(entity.getPerson_type())) {sql.WHERE("person_type = #{person_type}");}
			if(!Strings.isNullOrEmpty(entity.getRule())) {sql.WHERE("rule = #{rule}");}
			if(!Strings.isNullOrEmpty(entity.getMemo())) {sql.WHERE("memo = #{memo}");}
			if(!Strings.isNullOrEmpty(entity.getObject_child())) {sql.WHERE("object_child = #{object_child}");}
			if(!Strings.isNullOrEmpty(entity.getNum_child())) {sql.WHERE("num_child = #{num_child}");}
			if(!Strings.isNullOrEmpty(entity.getObject_old())) {sql.WHERE("object_old = #{object_old}");}
			if(!Strings.isNullOrEmpty(entity.getNum_old())) {sql.WHERE("num_old = #{num_old}");}
			if(!Strings.isNullOrEmpty(entity.getObject_grown())) {sql.WHERE("object_grown = #{object_grown}");}
			if(!Strings.isNullOrEmpty(entity.getNum_grown())) {sql.WHERE("num_grown = #{num_grown}");}
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
	public String selectVwTicketTypeByLimt(VwTicketType entity) {
		SQL sql = new SQL().SELECT("*").FROM("vw_ticket_type");
					if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name LIKE CONCAT('%',#{name},'%')");}
			if(!Objects.isNull(entity.getPrice())) {sql.WHERE("price = #{price}");}
			if(!Strings.isNullOrEmpty(entity.getType())) {sql.WHERE("type = #{type}");}
			if(!Strings.isNullOrEmpty(entity.getVenue_id())) {sql.WHERE("venue_id LIKE CONCAT('%',#{venue_id},'%')");}
			if(!Strings.isNullOrEmpty(entity.getStart_time())) {sql.WHERE("start_time = #{start_time}");}
			if(!Strings.isNullOrEmpty(entity.getEnd_time())) {sql.WHERE("end_time = #{end_time}");}
//			if(!Strings.isNullOrEmpty(entity.getStart_date())) {sql.WHERE("start_date = #{end_date}");}
			if(!Strings.isNullOrEmpty(entity.getEnd_date())) {sql.WHERE("start_date <= #{end_date}").WHERE("end_date >= #{end_date}");}
			if(!Objects.isNull(entity.getDeadline())) {sql.WHERE("deadline = #{deadline}");}
			if(!Objects.isNull(entity.getDays())) {sql.WHERE("days = #{days}");}
			if(!Strings.isNullOrEmpty(entity.getObject_id())) {sql.WHERE("object_id = #{object_id}");}
			if(!Strings.isNullOrEmpty(entity.getPerson_type())) {sql.WHERE("person_type = #{person_type}");}
			if(!Strings.isNullOrEmpty(entity.getRule())) {sql.WHERE("rule = #{rule}");}
			if(!Strings.isNullOrEmpty(entity.getMemo())) {sql.WHERE("memo = #{memo}");}
			if(!Strings.isNullOrEmpty(entity.getObject_child())) {sql.WHERE("object_child = #{object_child}");}
			if(!Strings.isNullOrEmpty(entity.getNum_child())) {sql.WHERE("num_child = #{num_child}");}
			if(!Strings.isNullOrEmpty(entity.getObject_old())) {sql.WHERE("object_old = #{object_old}");}
			if(!Strings.isNullOrEmpty(entity.getNum_old())) {sql.WHERE("num_old = #{num_old}");}
			if(!Strings.isNullOrEmpty(entity.getObject_grown())) {sql.WHERE("object_grown = #{object_grown}");}
			if(!Strings.isNullOrEmpty(entity.getNum_grown())) {sql.WHERE("num_grown = #{num_grown}");}
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
	public String selectVwTicketType(VwTicketType entity) {
		SQL sql = new SQL().SELECT("*").FROM("vw_ticket_type");
			if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name LIKE CONCAT('%',#{name},'%')");}
			if(!Objects.isNull(entity.getPrice())) {sql.WHERE("price = #{price}");}
			if(!Strings.isNullOrEmpty(entity.getType())) {sql.WHERE("type = #{type}");}
			if(!Strings.isNullOrEmpty(entity.getVenue_id())) {sql.WHERE("venue_id LIKE CONCAT('%',#{venue_id},'%')");}
			if(!Strings.isNullOrEmpty(entity.getStart_time())) {sql.WHERE("start_time = #{start_time}");}
			if(!Strings.isNullOrEmpty(entity.getEnd_time())) {sql.WHERE("end_time = #{end_time}");}
//			if(!Strings.isNullOrEmpty(entity.getStart_date())) {sql.WHERE("start_date = #{end_date}");}
			if(!Strings.isNullOrEmpty(entity.getEnd_date())) {sql.WHERE("start_date <= #{end_date}").WHERE("end_date >= #{end_date}");}
			if(!Objects.isNull(entity.getDeadline())) {sql.WHERE("deadline = #{deadline}");}
			if(!Objects.isNull(entity.getDays())) {sql.WHERE("days = #{days}");}
			if(!Strings.isNullOrEmpty(entity.getObject_id())) {sql.WHERE("object_id = #{object_id}");}
			if(!Strings.isNullOrEmpty(entity.getPerson_type())) {sql.WHERE("person_type = #{person_type}");}
			if(!Strings.isNullOrEmpty(entity.getRule())) {sql.WHERE("rule = #{rule}");}
			if(!Strings.isNullOrEmpty(entity.getMemo())) {sql.WHERE("memo = #{memo}");}
			if(!Strings.isNullOrEmpty(entity.getObject_child())) {sql.WHERE("object_child = #{object_child}");}
			if(!Strings.isNullOrEmpty(entity.getNum_child())) {sql.WHERE("num_child = #{num_child}");}
			if(!Strings.isNullOrEmpty(entity.getObject_old())) {sql.WHERE("object_old = #{object_old}");}
			if(!Strings.isNullOrEmpty(entity.getNum_old())) {sql.WHERE("num_old = #{num_old}");}
			if(!Strings.isNullOrEmpty(entity.getObject_grown())) {sql.WHERE("object_grown = #{object_grown}");}
			if(!Strings.isNullOrEmpty(entity.getNum_grown())) {sql.WHERE("num_grown = #{num_grown}");}
			if(!Strings.isNullOrEmpty(entity.getState())) {sql.WHERE("state = #{state}");}
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("createtime = #{createtime}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("updatetime = #{updatetime}");}

		return sql.toString();
	}
	
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectVwTicketTypePrivateByCount(VwTicketType entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("vw_ticket_type").WHERE("<![CDATA[ start_date <= #{end_date}]]>").WHERE("<![CDATA[ end_date >= #{end_date}]]>");
			if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name LIKE CONCAT('%',#{name},'%')");}
			if(!Objects.isNull(entity.getPrice())) {sql.WHERE("price = #{price}");}
			if(!Strings.isNullOrEmpty(entity.getType())) {sql.WHERE("type = #{type}");}
			if(!Strings.isNullOrEmpty(entity.getVenue_id())) {sql.WHERE("venue_id LIKE CONCAT('%',#{venue_id},'%')");}
			if(!Strings.isNullOrEmpty(entity.getStart_time())) {sql.WHERE("start_time = #{start_time}");}
			if(!Strings.isNullOrEmpty(entity.getEnd_time())) {sql.WHERE("end_time = #{end_time}");}
//			if(!Strings.isNullOrEmpty(entity.getStart_date())) {sql.WHERE("start_date = #{start_date}");}
//			if(!Strings.isNullOrEmpty(entity.getEnd_date())) {sql.WHERE("end_date = #{end_date}");}
			if(!Objects.isNull(entity.getDeadline())) {sql.WHERE("deadline = #{deadline}");}
			if(!Objects.isNull(entity.getDays())) {sql.WHERE("days = #{days}");}
			if(!Strings.isNullOrEmpty(entity.getObject_id())) {sql.WHERE("object_id = #{object_id}");}
			if(!Strings.isNullOrEmpty(entity.getPerson_type())) {sql.WHERE("person_type = #{person_type}");}
			if(!Strings.isNullOrEmpty(entity.getRule())) {sql.WHERE("rule = #{rule}");}
			if(!Strings.isNullOrEmpty(entity.getMemo())) {sql.WHERE("memo = #{memo}");}
			if(!Strings.isNullOrEmpty(entity.getObject_child())) {sql.WHERE("object_child = #{object_child}");}
			if(!Strings.isNullOrEmpty(entity.getNum_child())) {sql.WHERE("num_child = #{num_child}");}
			if(!Strings.isNullOrEmpty(entity.getObject_old())) {sql.WHERE("object_old = #{object_old}");}
			if(!Strings.isNullOrEmpty(entity.getNum_old())) {sql.WHERE("num_old = #{num_old}");}
			if(!Strings.isNullOrEmpty(entity.getObject_grown())) {sql.WHERE("object_grown = #{object_grown}");}
			if(!Strings.isNullOrEmpty(entity.getNum_grown())) {sql.WHERE("num_grown = #{num_grown}");}
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
	public String selectVwTicketTypePrivateByLimt(VwTicketType entity) {
		SQL sql = new SQL().SELECT("*").FROM("vw_ticket_type").WHERE("<![CDATA[ start_date <= #{end_date}]]>").WHERE("<![CDATA[ end_date >= #{end_date}]]>");
			if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name LIKE CONCAT('%',#{name},'%')");}
			if(!Objects.isNull(entity.getPrice())) {sql.WHERE("price = #{price}");}
			if(!Strings.isNullOrEmpty(entity.getType())) {sql.WHERE("type = #{type}");}
			if(!Strings.isNullOrEmpty(entity.getVenue_id())) {sql.WHERE("venue_id LIKE CONCAT('%',#{venue_id},'%')");}
			if(!Strings.isNullOrEmpty(entity.getStart_time())) {sql.WHERE("start_time = #{start_time}");}
			if(!Strings.isNullOrEmpty(entity.getEnd_time())) {sql.WHERE("end_time = #{end_time}");}
//			if(!Strings.isNullOrEmpty(entity.getStart_date())) {sql.WHERE("start_date = #{start_date}");}
//			if(!Strings.isNullOrEmpty(entity.getEnd_date())) {sql.WHERE("end_date = #{end_date}");}
			if(!Objects.isNull(entity.getDeadline())) {sql.WHERE("deadline = #{deadline}");}
			if(!Objects.isNull(entity.getDays())) {sql.WHERE("days = #{days}");}
			if(!Strings.isNullOrEmpty(entity.getObject_id())) {sql.WHERE("object_id = #{object_id}");}
			if(!Strings.isNullOrEmpty(entity.getPerson_type())) {sql.WHERE("person_type = #{person_type}");}
			if(!Strings.isNullOrEmpty(entity.getRule())) {sql.WHERE("rule = #{rule}");}
			if(!Strings.isNullOrEmpty(entity.getMemo())) {sql.WHERE("memo = #{memo}");}
			if(!Strings.isNullOrEmpty(entity.getObject_child())) {sql.WHERE("object_child = #{object_child}");}
			if(!Strings.isNullOrEmpty(entity.getNum_child())) {sql.WHERE("num_child = #{num_child}");}
			if(!Strings.isNullOrEmpty(entity.getObject_old())) {sql.WHERE("object_old = #{object_old}");}
			if(!Strings.isNullOrEmpty(entity.getNum_old())) {sql.WHERE("num_old = #{num_old}");}
			if(!Strings.isNullOrEmpty(entity.getObject_grown())) {sql.WHERE("object_grown = #{object_grown}");}
			if(!Strings.isNullOrEmpty(entity.getNum_grown())) {sql.WHERE("num_grown = #{num_grown}");}
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
	public String selectVwTicketTypePrivate(VwTicketType entity) {
		SQL sql = new SQL().SELECT("*").FROM("vw_ticket_type").WHERE("start_date <= #{end_date}").WHERE("end_date >= #{end_date}");
			if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name LIKE CONCAT('%',#{name},'%')");}
			if(!Objects.isNull(entity.getPrice())) {sql.WHERE("price = #{price}");}
			if(!Strings.isNullOrEmpty(entity.getType())) {sql.WHERE("type = #{type}");}
			if(!Strings.isNullOrEmpty(entity.getVenue_id())) {sql.WHERE("venue_id LIKE CONCAT('%',#{venue_id},'%')");}
			if(!Strings.isNullOrEmpty(entity.getStart_time())) {sql.WHERE("start_time = #{start_time}");}
			if(!Strings.isNullOrEmpty(entity.getEnd_time())) {sql.WHERE("end_time = #{end_time}");}
//			if(!Strings.isNullOrEmpty(entity.getStart_date())) {sql.WHERE("start_date = #{start_date}");}
//			if(!Strings.isNullOrEmpty(entity.getEnd_date())) {sql.WHERE("end_date = #{end_date}");}
			if(!Objects.isNull(entity.getDeadline())) {sql.WHERE("deadline = #{deadline}");}
			if(!Objects.isNull(entity.getDays())) {sql.WHERE("days = #{days}");}
			if(!Strings.isNullOrEmpty(entity.getObject_id())) {sql.WHERE("object_id = #{object_id}");}
			if(!Strings.isNullOrEmpty(entity.getPerson_type())) {sql.WHERE("person_type = #{person_type}");}
			if(!Strings.isNullOrEmpty(entity.getRule())) {sql.WHERE("rule = #{rule}");}
			if(!Strings.isNullOrEmpty(entity.getMemo())) {sql.WHERE("memo = #{memo}");}
			if(!Strings.isNullOrEmpty(entity.getObject_child())) {sql.WHERE("object_child = #{object_child}");}
			if(!Strings.isNullOrEmpty(entity.getNum_child())) {sql.WHERE("num_child = #{num_child}");}
			if(!Strings.isNullOrEmpty(entity.getObject_old())) {sql.WHERE("object_old = #{object_old}");}
			if(!Strings.isNullOrEmpty(entity.getNum_old())) {sql.WHERE("num_old = #{num_old}");}
			if(!Strings.isNullOrEmpty(entity.getObject_grown())) {sql.WHERE("object_grown = #{object_grown}");}
			if(!Strings.isNullOrEmpty(entity.getNum_grown())) {sql.WHERE("num_grown = #{num_grown}");}
			if(!Strings.isNullOrEmpty(entity.getState())) {sql.WHERE("state = #{state}");}
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("createtime = #{createtime}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("updatetime = #{updatetime}");}
		return sql.toString();
	}
	
}
