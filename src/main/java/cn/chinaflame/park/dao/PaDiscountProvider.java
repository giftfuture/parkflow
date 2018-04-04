package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.PaDiscount;

/**
 * 优惠券表
 * provider
 */
public class PaDiscountProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertPaDiscount(PaDiscount entity) {
		SQL sql = new SQL().INSERT_INTO("pa_discount");
		sql.VALUES("dis_name,dis_money,dis_total_amount,dis_memo,ticket_id,dis_aging,dis_type,dis_use_start_time,dis_use_end_time,dis_usage_rules,dis_apply_object,start_time,end_time,createtime,updatetime", "#{dis_name},#{dis_money},#{dis_total_amount},#{dis_memo},#{ticket_id},#{dis_aging},#{dis_type},#{dis_use_start_time},#{dis_use_end_time},#{dis_usage_rules},#{dis_apply_object},#{start_time},#{end_time},now(),now()");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectPaDiscountByCount(PaDiscount entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("pa_discount");
					if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getDis_name())) {sql.WHERE("dis_name = #{dis_name}");}
			if(!Objects.isNull(entity.getDis_money())) {sql.WHERE("dis_money = #{dis_money}");}
			if(!Objects.isNull(entity.getDis_total_amount())) {sql.WHERE("dis_total_amount = #{dis_total_amount}");}
			if(!Strings.isNullOrEmpty(entity.getDis_memo())) {sql.WHERE("dis_memo = #{dis_memo}");}
			if(!Strings.isNullOrEmpty(entity.getTicket_id())) {sql.WHERE("ticket_id = #{ticket_id}");}
			if(!Objects.isNull(entity.getDis_aging())) {sql.WHERE("dis_aging = #{dis_aging}");}
			if(!Strings.isNullOrEmpty(entity.getDis_type())) {sql.WHERE("dis_type = #{dis_type}");}
			if(!Strings.isNullOrEmpty(entity.getDis_use_start_time())) {sql.WHERE("dis_use_start_time = #{dis_use_start_time}");}
			if(!Strings.isNullOrEmpty(entity.getDis_use_end_time())) {sql.WHERE("dis_use_end_time = #{dis_use_end_time}");}
			if(!Strings.isNullOrEmpty(entity.getDis_usage_rules())) {sql.WHERE("dis_usage_rules = #{dis_usage_rules}");}
			if(!Strings.isNullOrEmpty(entity.getDis_apply_object())) {sql.WHERE("dis_apply_object = #{dis_apply_object}");}
			if(!Strings.isNullOrEmpty(entity.getStart_time())) {sql.WHERE("start_time = #{start_time}");}
			if(!Strings.isNullOrEmpty(entity.getEnd_time())) {sql.WHERE("end_time = #{end_time}");}
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
	public String selectPaDiscountByLimt(PaDiscount entity) {
		SQL sql = new SQL().SELECT("*").FROM("pa_discount");
					if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getDis_name())) {sql.WHERE("dis_name = #{dis_name}");}
			if(!Objects.isNull(entity.getDis_money())) {sql.WHERE("dis_money = #{dis_money}");}
			if(!Objects.isNull(entity.getDis_total_amount())) {sql.WHERE("dis_total_amount = #{dis_total_amount}");}
			if(!Strings.isNullOrEmpty(entity.getDis_memo())) {sql.WHERE("dis_memo = #{dis_memo}");}
			if(!Strings.isNullOrEmpty(entity.getTicket_id())) {sql.WHERE("ticket_id = #{ticket_id}");}
			if(!Objects.isNull(entity.getDis_aging())) {sql.WHERE("dis_aging = #{dis_aging}");}
			if(!Strings.isNullOrEmpty(entity.getDis_type())) {sql.WHERE("dis_type = #{dis_type}");}
			if(!Strings.isNullOrEmpty(entity.getDis_use_start_time())) {sql.WHERE("dis_use_start_time = #{dis_use_start_time}");}
			if(!Strings.isNullOrEmpty(entity.getDis_use_end_time())) {sql.WHERE("dis_use_end_time = #{dis_use_end_time}");}
			if(!Strings.isNullOrEmpty(entity.getDis_usage_rules())) {sql.WHERE("dis_usage_rules = #{dis_usage_rules}");}
			if(!Strings.isNullOrEmpty(entity.getDis_apply_object())) {sql.WHERE("dis_apply_object = #{dis_apply_object}");}
			if(!Strings.isNullOrEmpty(entity.getStart_time())) {sql.WHERE("start_time = #{start_time}");}
			if(!Strings.isNullOrEmpty(entity.getEnd_time())) {sql.WHERE("end_time = #{end_time}");}
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("createtime = #{createtime}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("updatetime = #{updatetime}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectPaDiscount(PaDiscount entity) {
		SQL sql = new SQL().SELECT("*").FROM("pa_discount");
			if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getDis_name())) {sql.WHERE("dis_name = #{dis_name}");}
			if(!Objects.isNull(entity.getDis_money())) {sql.WHERE("dis_money = #{dis_money}");}
			if(!Objects.isNull(entity.getDis_total_amount())) {sql.WHERE("dis_total_amount = #{dis_total_amount}");}
			if(!Strings.isNullOrEmpty(entity.getDis_memo())) {sql.WHERE("dis_memo = #{dis_memo}");}
			if(!Strings.isNullOrEmpty(entity.getTicket_id())) {sql.WHERE("ticket_id = #{ticket_id}");}
			if(!Objects.isNull(entity.getDis_aging())) {sql.WHERE("dis_aging = #{dis_aging}");}
			if(!Strings.isNullOrEmpty(entity.getDis_type())) {sql.WHERE("dis_type = #{dis_type}");}
			if(!Strings.isNullOrEmpty(entity.getDis_use_start_time())) {sql.WHERE("dis_use_start_time = #{dis_use_start_time}");}
			if(!Strings.isNullOrEmpty(entity.getDis_use_end_time())) {sql.WHERE("dis_use_end_time = #{dis_use_end_time}");}
			if(!Strings.isNullOrEmpty(entity.getDis_usage_rules())) {sql.WHERE("dis_usage_rules = #{dis_usage_rules}");}
			if(!Strings.isNullOrEmpty(entity.getDis_apply_object())) {sql.WHERE("dis_apply_object = #{dis_apply_object}");}
			if(!Strings.isNullOrEmpty(entity.getStart_time())) {sql.WHERE("start_time = #{start_time}");}
			if(!Strings.isNullOrEmpty(entity.getEnd_time())) {sql.WHERE("end_time = #{end_time}");}
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
		SQL sql = new SQL().SELECT("*").FROM("pa_discount");
		sql.WHERE("id="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updatePaDiscount(PaDiscount entity) {
		SQL sql = new SQL().UPDATE("pa_discount");
				sql.SET("dis_name = #{dis_name}");
		sql.SET("dis_money = #{dis_money}");
		sql.SET("dis_total_amount = #{dis_total_amount}");
		sql.SET("dis_memo = #{dis_memo}");
		sql.SET("ticket_id = #{ticket_id}");
		sql.SET("dis_aging = #{dis_aging}");
		sql.SET("dis_type = #{dis_type}");
		sql.SET("dis_use_start_time = #{dis_use_start_time}");
		sql.SET("dis_use_end_time = #{dis_use_end_time}");
		sql.SET("dis_usage_rules = #{dis_usage_rules}");
		sql.SET("dis_apply_object = #{dis_apply_object}");
		sql.SET("start_time = #{start_time}");
		sql.SET("end_time = #{end_time}");
		sql.SET("updatetime = now()");

		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public String updatePaDiscountByNullChk(PaDiscount entity) {
		SQL sql = new SQL().UPDATE("pa_discount");
					if(!Strings.isNullOrEmpty(entity.getDis_name())) {sql.SET("dis_name = #{dis_name}");}
			if(!Objects.isNull(entity.getDis_money())) {sql.SET("dis_money = #{dis_money}");}
			if(!Objects.isNull(entity.getDis_total_amount())) {sql.SET("dis_total_amount = #{dis_total_amount}");}
			if(!Strings.isNullOrEmpty(entity.getDis_memo())) {sql.SET("dis_memo = #{dis_memo}");}
			if(!Strings.isNullOrEmpty(entity.getTicket_id())) {sql.SET("ticket_id = #{ticket_id}");}
			if(!Objects.isNull(entity.getDis_aging())) {sql.SET("dis_aging = #{dis_aging}");}
			if(!Strings.isNullOrEmpty(entity.getDis_type())) {sql.SET("dis_type = #{dis_type}");}
			if(!Strings.isNullOrEmpty(entity.getDis_use_start_time())) {sql.SET("dis_use_start_time = #{dis_use_start_time}");}
			if(!Strings.isNullOrEmpty(entity.getDis_use_end_time())) {sql.SET("dis_use_end_time = #{dis_use_end_time}");}
			if(!Strings.isNullOrEmpty(entity.getDis_usage_rules())) {sql.SET("dis_usage_rules = #{dis_usage_rules}");}
			if(!Strings.isNullOrEmpty(entity.getDis_apply_object())) {sql.SET("dis_apply_object = #{dis_apply_object}");}
			if(!Strings.isNullOrEmpty(entity.getStart_time())) {sql.SET("start_time = #{start_time}");}
			if(!Strings.isNullOrEmpty(entity.getEnd_time())) {sql.SET("end_time = #{end_time}");}
		sql.SET("updatetime = now()");

		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public String deletePaDiscount(int id) {
		SQL sql = new SQL().DELETE_FROM("pa_discount");
		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(int id) {
		SQL sql = new SQL().UPDATE("pa_discount");
		sql.SET("state=2");
		sql.WHERE("id = #{id}");
		return sql.toString();
	}
}
