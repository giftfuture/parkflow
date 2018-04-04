package cn.chinaflame.park.dao;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.chinaflame.park.model.PaTicketOrdinary;
import cn.chinaflame.park.model.PaTicketPlan;
import cn.chinaflame.park.model.PaTicketTeam;
import cn.chinaflame.park.model.PaTicketThrough;

/**
  * @author wwt
  * @date 2018年2月27日 上午9:59:55
  * 
  */
public interface TicketDate {

	/*
	 * 一般票种添加
	 */
	@Insert("INSERT INTO pa_ticket_ordinary(name, price, type, venue_id, start_time, end_time, deadline, days, object_id, person_type, rule, memo) "
			+ "VALUES(#{name}, #{price}, 'ordinary',#{venue_id}, #{start_time}, #{end_time}, #{deadline}, #{days}, #{object_id}, #{person_type}, #{rule}, #{memo});")
	public Integer createPaTicketOrdinary(@Param("name") String name, @Param("price") Integer price, @Param("venue_id") String venue_id, 
			@Param("start_time") Timestamp start_time, @Param("end_time") Timestamp end_time, @Param("deadline") Integer deadline, @Param("days") Integer days, 
			@Param("object_id") String object_id, @Param("person_type") String person_type, @Param("rule") String rule, @Param("memo") String memo);
	
	/*
	 * 通用票种添加
	 */
	@Insert("INSERT INTO pa_ticket_through(name, price, type, venue_id, start_time, end_time, deadline, days, object_id, person_type, rule, memo) "
			+ "VALUES(#{name}, #{price}, 'universal', #{venue_id}, #{start_time}, #{end_time}, #{deadline}, #{days}, #{object_id}, #{person_type}, #{rule}, #{memo});")
	public Integer createPaTicketThrough(@Param("name") String name, @Param("price") Integer price, @Param("venue_id") String venue_id, 
			@Param("start_time") Timestamp start_time, @Param("end_time") Timestamp end_time, @Param("deadline") Integer deadline, @Param("days") Integer days, 
			@Param("object_id") String object_id, @Param("person_type") String person_type, @Param("rule") String rule, @Param("memo") String memo);
	
	/*
	 * 团队票种添加
	 */
	@Insert("INSERT INTO pa_ticket_team(name, price, type, venue_id, start_time, end_time, deadline, days, object_id, person_type, rule, memo) "
			+ "VALUES(#{name}, #{price}, 'team', #{venue_id}, #{start_time}, #{end_time}, #{deadline}, #{days}, #{object_id}, #{person_type}, #{rule}, #{memo});")
	public Integer createPaTicketTeam(@Param("name") String name, @Param("price") Integer price, @Param("venue_id") String venue_id, 
			@Param("start_time") Timestamp start_time, @Param("end_time") Timestamp end_time, @Param("deadline") Integer deadline, @Param("days") Integer days, 
			@Param("object_id") String object_id, @Param("person_type") String person_type, @Param("rule") String rule, @Param("memo") String memo);
	
	/*
	 * 套票票种添加
	 */
	@Insert("INSERT INTO pa_ticket_plan(name, price, type, venue_id, start_time, end_time, deadline,days, object_child, num_child, object_old, num_old, "
			+ "object_grown, num_grown, person_type, rule, memo) VALUES(#{name}, #{price}, 'plan', #{venue_id}, #{start_time}, #{end_time}, #{deadline}, #{days}, "
			+ "#{object_child}, #{num_child}, #{object_old}, #{num_old}, #{object_grown}, #{num_grown}, #{person_type}, #{rule}, #{memo});")
	public Integer createPaTicketPlan(@Param("name") String name, @Param("price") Integer price, @Param("venue_id") String venue_id, 
			@Param("start_time") Timestamp start_time, @Param("end_time") Timestamp end_time, @Param("deadline") Integer deadline, 
			@Param("days") Integer days, @Param("object_child") String object_child, @Param("num_child") String num_child, 
			@Param("object_old") String object_old, @Param("num_old") String num_old, @Param("object_grown") String object_grown, 
			@Param("num_grown") String num_grown, @Param("person_type") String person_type, @Param("rule") String rule, @Param("memo") String memo);
	
	/*
	 * 一般票种修改
	 */
	@Update("UPDATE pa_ticket_ordinary SET name = #{name}, price = #{price}, venue_id = #{venue_id}, start_time = #{start_time}, end_time = #{end_time}, "
			+ "deadline = #{deadline}, days = #{days}, object_id = #{object_id}, person_type = #{person_type}, rule = #{rule}, memo = #{memo} WHERE id = #{id} AND 1 = 1")
	public Integer updatePaTicketOrdinary(@Param("id") Integer id, @Param("name") String name, @Param("price") Integer price, @Param("venue_id") String venue_id, 
			@Param("start_time") Timestamp start_time, @Param("end_time") Timestamp end_time, @Param("deadline") Integer deadline, @Param("days") Integer days, 
			@Param("object_id") String object_id, @Param("person_type") String person_type, @Param("rule") String rule, @Param("memo") String memo);
	
	/*
	 * 通用票种修改
	 */
	@Update("UPDATE pa_ticket_through SET name = #{name}, price = #{price}, venue_id = #{venue_id}, start_time = #{start_time}, end_time = #{end_time}, "
			+ "deadline = #{deadline}, days = #{days}, object_id = #{object_id}, person_type = #{person_type}, rule = #{rule}, memo = #{memo} WHERE id = #{id} AND 1 = 1")
	public Integer updatePaTicketThrough(@Param("id") Integer id, @Param("name") String name, @Param("price") Integer price, @Param("venue_id") String venue_id, 
			@Param("start_time") Timestamp start_time, @Param("end_time") Timestamp end_time, @Param("deadline") Integer deadline, @Param("days") Integer days, 
			@Param("object_id") String object_id, @Param("person_type") String person_type, @Param("rule") String rule, @Param("memo") String memo);
	
	/*
	 * 团队票种修改
	 */
	@Update("UPDATE pa_ticket_team SET name = #{name}, price = #{price}, venue_id = #{venue_id}, start_time = #{start_time}, end_time = #{end_time}, "
			+ "deadline = #{deadline}, days = #{days}, object_id = #{object_id}, person_type = #{person_type}, rule = #{rule}, memo = #{memo} WHERE id = #{id} AND 1 = 1")
	public Integer updatePaTicketTeam(@Param("id") Integer id, @Param("name") String name, @Param("price") Integer price, @Param("venue_id") String venue_id, 
			@Param("start_time") Timestamp start_time, @Param("end_time") Timestamp end_time, @Param("deadline") Integer deadline, @Param("days") Integer days, 
			@Param("object_id") String object_id, @Param("person_type") String person_type, @Param("rule") String rule, @Param("memo") String memo);
	
	/*
	 * 套票票种修改
	 */
	@Update("UPDATE pa_ticket_plan SET name = #{name}, price = #{price}, venue_id = #{venue_id}, start_time = #{start_time}, end_time = #{end_time}, "
			+ "deadline = #{deadline}, days = #{days}, object_child = #{object_child}, num_child = #{num_child}, object_old = #{object_old}, "
			+ "num_old = #{num_old}, object_grown = #{object_grown}, num_grown = #{num_grown}, "
			+ "person_type = #{person_type}, rule = #{rule}, memo = #{memo} WHERE id = #{id} AND 1 = 1")
	public Integer updatePaTicketPlan(@Param("id") Integer id, @Param("name") String name, @Param("price") Integer price, @Param("venue_id") String venue_id, 
			@Param("start_time") Timestamp start_time, @Param("end_time") Timestamp end_time, @Param("deadline") Integer deadline, 
			@Param("days") Integer days, @Param("object_child") String object_child, @Param("num_child") String num_child, 
			@Param("object_old") String object_old, @Param("num_old") String num_old, @Param("object_grown") String object_grown, 
			@Param("num_grown") String num_grown, @Param("person_type") String person_type, @Param("rule") String rule, @Param("memo") String memo);
	
	/*
	 * 一般票种查询
	 */
	@Select("<script> SELECT * FROM pa_ticket_ordinary WHERE 1 = 1 <if test = 'date != null' > AND <![CDATA[ start_time <= #{date}]]> AND <![CDATA[ end_time >= #{date}]]> </if> "
			+ "<if test = 'id != null'>AND id = #{id} </if> <if test = 'name != null' >AND name LIKE CONCAT('%',#{name},'%') </if>"
			+ "<if test = 'type != null'> AND type = #{type}</if> <if test = 'venue_id != null'>AND venue_id LIKE CONCAT('%',#{venue_id},'%')</if> </script>")
	public List<PaTicketOrdinary> ptoList(@Param("id") Integer id, @Param("name") String name, @Param("type") String type, @Param("venue_id") String venue_id, @Param("date") String date);
	
	/*
	 * 通用票种查询
	 */
	@Select("<script> SELECT * FROM pa_ticket_through WHERE 1 = 1 <if test = 'date != null' > AND <![CDATA[ start_time <= #{date}]]> AND <![CDATA[ end_time >= #{date}]]> </if> "
			+ "<if test = 'id != null'> AND id = #{id} </if> <if test = 'name != null' >AND name LIKE CONCAT('%',#{name},'%') </if>"
			+ "<if test = 'type != null'> AND type = #{type}</if> <if test = 'venue_id != null'>AND venue_id LIKE CONCAT('%',#{venue_id},'%')</if> </script>")
	public List<PaTicketThrough> pttList(@Param("id") Integer id, @Param("name") String name, @Param("type") String type, @Param("venue_id") String venue_id, @Param("date") String date);
	
	/*
	 * 团队票种查询
	 */
	@Select("<script> SELECT * FROM pa_ticket_team WHERE 1 = 1 <if test = 'date != null' > AND <![CDATA[ start_time <= #{date}]]> AND <![CDATA[ end_time >= #{date}]]> </if> "
			+ "<if test = 'id != null'>AND id = #{id} </if> <if test = 'name != null' >AND name LIKE CONCAT('%',#{name},'%') </if>"
			+ "<if test = 'type != null'> AND type = #{type}</if> <if test = 'venue_id != null'>AND venue_id LIKE CONCAT('%',#{venue_id},'%')</if> </script>")
	public List<PaTicketTeam> pttteamList(@Param("id") Integer id, @Param("name") String name, @Param("type") String type, @Param("venue_id") String venue_id, @Param("date") String date);
	
	/*
	 * 套票票种查询
	 */
	@Select("<script> SELECT * FROM pa_ticket_plan WHERE 1 = 1 <if test = 'date != null' > AND <![CDATA[ start_time <= #{date}]]> AND <![CDATA[ end_time >= #{date}]]> </if> "
			+ "<if test = 'id != null'>AND id = #{id} </if> <if test = 'name != null' >AND name LIKE CONCAT('%',#{name},'%') </if>"
			+ "<if test = 'type != null'> AND type = #{type}</if> <if test = 'venue_id != null'>AND venue_id LIKE CONCAT('%',#{venue_id},'%')</if> </script>")
	public List<PaTicketPlan> ptpList(@Param("id") Integer id, @Param("name") String name, @Param("type") String type, @Param("venue_id") String venue_id, @Param("date") String date);
	
	
	
	
	
	

}
