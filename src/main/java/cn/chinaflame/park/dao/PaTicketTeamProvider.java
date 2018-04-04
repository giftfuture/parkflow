package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.PaTicketTeam;

/**
 * 通票票券表
 * provider
 */
public class PaTicketTeamProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertPaTicketTeam(PaTicketTeam entity) {
		SQL sql = new SQL().INSERT_INTO("pa_ticket_team");
		sql.VALUES("name,price,type,venue_id,start_date,end_date,start_time,end_time,deadline,days,object_id,person_type,rule,memo,createtime,updatetime,state", "#{name},#{price},#{type},#{venue_id},#{start_date},#{end_date},#{start_time},#{end_time},#{deadline},#{days},#{object_id},#{person_type},#{rule},#{memo},now(),now(),#{state}");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectPaTicketTeamByCount(PaTicketTeam entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("pa_ticket_team");
					if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Objects.isNull(entity.getPrice())) {sql.WHERE("price = #{price}");}
			if(!Strings.isNullOrEmpty(entity.getType())) {sql.WHERE("type = #{type}");}
			if(!Strings.isNullOrEmpty(entity.getVenue_id())) {sql.WHERE("venue_id = #{venue_id}");}
			if(!Strings.isNullOrEmpty(entity.getStart_date())) {sql.WHERE("start_date = #{start_date}");}
			if(!Strings.isNullOrEmpty(entity.getEnd_date())) {sql.WHERE("end_date = #{end_date}");}
			if(!Strings.isNullOrEmpty(entity.getStart_time())) {sql.WHERE("start_time = #{start_time}");}
			if(!Strings.isNullOrEmpty(entity.getEnd_time())) {sql.WHERE("end_time = #{end_time}");}
			if(!Objects.isNull(entity.getDeadline())) {sql.WHERE("deadline = #{deadline}");}
			if(!Objects.isNull(entity.getDays())) {sql.WHERE("days = #{days}");}
			if(!Strings.isNullOrEmpty(entity.getObject_id())) {sql.WHERE("object_id = #{object_id}");}
			if(!Strings.isNullOrEmpty(entity.getPerson_type())) {sql.WHERE("person_type = #{person_type}");}
			if(!Strings.isNullOrEmpty(entity.getRule())) {sql.WHERE("rule = #{rule}");}
			if(!Strings.isNullOrEmpty(entity.getMemo())) {sql.WHERE("memo = #{memo}");}
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
	public String selectPaTicketTeamByLimt(PaTicketTeam entity) {
		SQL sql = new SQL().SELECT("*").FROM("pa_ticket_team");
					if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Objects.isNull(entity.getPrice())) {sql.WHERE("price = #{price}");}
			if(!Strings.isNullOrEmpty(entity.getType())) {sql.WHERE("type = #{type}");}
			if(!Strings.isNullOrEmpty(entity.getVenue_id())) {sql.WHERE("venue_id = #{venue_id}");}
			if(!Strings.isNullOrEmpty(entity.getStart_date())) {sql.WHERE("start_date = #{start_date}");}
			if(!Strings.isNullOrEmpty(entity.getEnd_date())) {sql.WHERE("end_date = #{end_date}");}
			if(!Strings.isNullOrEmpty(entity.getStart_time())) {sql.WHERE("start_time = #{start_time}");}
			if(!Strings.isNullOrEmpty(entity.getEnd_time())) {sql.WHERE("end_time = #{end_time}");}
			if(!Objects.isNull(entity.getDeadline())) {sql.WHERE("deadline = #{deadline}");}
			if(!Objects.isNull(entity.getDays())) {sql.WHERE("days = #{days}");}
			if(!Strings.isNullOrEmpty(entity.getObject_id())) {sql.WHERE("object_id = #{object_id}");}
			if(!Strings.isNullOrEmpty(entity.getPerson_type())) {sql.WHERE("person_type = #{person_type}");}
			if(!Strings.isNullOrEmpty(entity.getRule())) {sql.WHERE("rule = #{rule}");}
			if(!Strings.isNullOrEmpty(entity.getMemo())) {sql.WHERE("memo = #{memo}");}
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
	public String selectPaTicketTeam(PaTicketTeam entity) {
		SQL sql = new SQL().SELECT("*").FROM("pa_ticket_team");
			if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Objects.isNull(entity.getPrice())) {sql.WHERE("price = #{price}");}
			if(!Strings.isNullOrEmpty(entity.getType())) {sql.WHERE("type = #{type}");}
			if(!Strings.isNullOrEmpty(entity.getVenue_id())) {sql.WHERE("venue_id = #{venue_id}");}
			if(!Strings.isNullOrEmpty(entity.getStart_date())) {sql.WHERE("start_date = #{start_date}");}
			if(!Strings.isNullOrEmpty(entity.getEnd_date())) {sql.WHERE("end_date = #{end_date}");}
			if(!Strings.isNullOrEmpty(entity.getStart_time())) {sql.WHERE("start_time = #{start_time}");}
			if(!Strings.isNullOrEmpty(entity.getEnd_time())) {sql.WHERE("end_time = #{end_time}");}
			if(!Objects.isNull(entity.getDeadline())) {sql.WHERE("deadline = #{deadline}");}
			if(!Objects.isNull(entity.getDays())) {sql.WHERE("days = #{days}");}
			if(!Strings.isNullOrEmpty(entity.getObject_id())) {sql.WHERE("object_id = #{object_id}");}
			if(!Strings.isNullOrEmpty(entity.getPerson_type())) {sql.WHERE("person_type = #{person_type}");}
			if(!Strings.isNullOrEmpty(entity.getRule())) {sql.WHERE("rule = #{rule}");}
			if(!Strings.isNullOrEmpty(entity.getMemo())) {sql.WHERE("memo = #{memo}");}
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
		SQL sql = new SQL().SELECT("*").FROM("pa_ticket_team");
		sql.WHERE("id="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updatePaTicketTeam(PaTicketTeam entity) {
		SQL sql = new SQL().UPDATE("pa_ticket_team");
				sql.SET("name = #{name}");
		sql.SET("price = #{price}");
		sql.SET("type = #{type}");
		sql.SET("venue_id = #{venue_id}");
		sql.SET("start_date = #{start_date}");
		sql.SET("end_date = #{end_date}");
		sql.SET("start_time = #{start_time}");
		sql.SET("end_time = #{end_time}");
		sql.SET("deadline = #{deadline}");
		sql.SET("days = #{days}");
		sql.SET("object_id = #{object_id}");
		sql.SET("person_type = #{person_type}");
		sql.SET("rule = #{rule}");
		sql.SET("memo = #{memo}");
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
	public String updatePaTicketTeamByNullChk(PaTicketTeam entity) {
		SQL sql = new SQL().UPDATE("pa_ticket_team");
					if(!Strings.isNullOrEmpty(entity.getName())) {sql.SET("name = #{name}");}
			if(!Objects.isNull(entity.getPrice())) {sql.SET("price = #{price}");}
			if(!Strings.isNullOrEmpty(entity.getType())) {sql.SET("type = #{type}");}
			if(!Strings.isNullOrEmpty(entity.getVenue_id())) {sql.SET("venue_id = #{venue_id}");}
			if(!Strings.isNullOrEmpty(entity.getStart_date())) {sql.SET("start_date = #{start_date}");}
			if(!Strings.isNullOrEmpty(entity.getEnd_date())) {sql.SET("end_date = #{end_date}");}
			if(!Strings.isNullOrEmpty(entity.getStart_time())) {sql.SET("start_time = #{start_time}");}
			if(!Strings.isNullOrEmpty(entity.getEnd_time())) {sql.SET("end_time = #{end_time}");}
			if(!Objects.isNull(entity.getDeadline())) {sql.SET("deadline = #{deadline}");}
			if(!Objects.isNull(entity.getDays())) {sql.SET("days = #{days}");}
			if(!Strings.isNullOrEmpty(entity.getObject_id())) {sql.SET("object_id = #{object_id}");}
			if(!Strings.isNullOrEmpty(entity.getPerson_type())) {sql.SET("person_type = #{person_type}");}
			if(!Strings.isNullOrEmpty(entity.getRule())) {sql.SET("rule = #{rule}");}
			if(!Strings.isNullOrEmpty(entity.getMemo())) {sql.SET("memo = #{memo}");}
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
	public String deletePaTicketTeam(int id) {
		SQL sql = new SQL().DELETE_FROM("pa_ticket_team");
		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(int id) {
		SQL sql = new SQL().UPDATE("pa_ticket_team");
		sql.SET("state=2");
		sql.WHERE("id = #{id}");
		return sql.toString();
	}
}
