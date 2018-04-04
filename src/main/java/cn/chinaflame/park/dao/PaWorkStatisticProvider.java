package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.PaWorkStatistic;

/**
 * 
 * provider
 */
public class PaWorkStatisticProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertPaWorkStatistic(PaWorkStatistic entity) {
		SQL sql = new SQL().INSERT_INTO("pa_work_statistic");
		sql.VALUES("type,staff_id,statistic_date,terminal_ip,consume_money,discount,consume_count,refund_money,refund_count,wechat_money,alipay_money,unionpay_money,cash,previous_cash,previous_cash_total,day_consume_money,day_discount,day_consume_count,day_refund_money,day_refund_count,day_wechat_money,day_alipay_money,day_unionpay_money,day_cash,createtime,updatetime", "#{type},#{staff_id},#{statistic_date},#{terminal_ip},#{consume_money},#{discount},#{consume_count},#{refund_money},#{refund_count},#{wechat_money},#{alipay_money},#{unionpay_money},#{cash},#{previous_cash},#{previous_cash_total},#{day_consume_money},#{day_discount},#{day_consume_count},#{day_refund_money},#{day_refund_count},#{day_wechat_money},#{day_alipay_money},#{day_unionpay_money},#{day_cash},now(),now()");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectPaWorkStatisticByCount(PaWorkStatistic entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("pa_work_statistic");
					if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getType())) {sql.WHERE("type = #{type}");}
			if(!Objects.isNull(entity.getStaff_id())) {sql.WHERE("staff_id = #{staff_id}");}
			if(!Strings.isNullOrEmpty(entity.getStatistic_date())) {sql.WHERE("statistic_date = #{statistic_date}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_ip())) {sql.WHERE("terminal_ip = #{terminal_ip}");}
			if(!Objects.isNull(entity.getConsume_money())) {sql.WHERE("consume_money = #{consume_money}");}
			if(!Objects.isNull(entity.getDiscount())) {sql.WHERE("discount = #{discount}");}
			if(!Objects.isNull(entity.getConsume_count())) {sql.WHERE("consume_count = #{consume_count}");}
			if(!Objects.isNull(entity.getRefund_money())) {sql.WHERE("refund_money = #{refund_money}");}
			if(!Objects.isNull(entity.getRefund_count())) {sql.WHERE("refund_count = #{refund_count}");}
			if(!Objects.isNull(entity.getWechat_money())) {sql.WHERE("wechat_money = #{wechat_money}");}
			if(!Objects.isNull(entity.getAlipay_money())) {sql.WHERE("alipay_money = #{alipay_money}");}
			if(!Objects.isNull(entity.getUnionpay_money())) {sql.WHERE("unionpay_money = #{unionpay_money}");}
			if(!Objects.isNull(entity.getCash())) {sql.WHERE("cash = #{cash}");}
			if(!Objects.isNull(entity.getPrevious_cash())) {sql.WHERE("previous_cash = #{previous_cash}");}
			if(!Objects.isNull(entity.getPrevious_cash_total())) {sql.WHERE("previous_cash_total = #{previous_cash_total}");}
			if(!Objects.isNull(entity.getDay_consume_money())) {sql.WHERE("day_consume_money = #{day_consume_money}");}
			if(!Objects.isNull(entity.getDay_discount())) {sql.WHERE("day_discount = #{day_discount}");}
			if(!Objects.isNull(entity.getDay_consume_count())) {sql.WHERE("day_consume_count = #{day_consume_count}");}
			if(!Objects.isNull(entity.getDay_refund_money())) {sql.WHERE("day_refund_money = #{day_refund_money}");}
			if(!Objects.isNull(entity.getDay_refund_count())) {sql.WHERE("day_refund_count = #{day_refund_count}");}
			if(!Objects.isNull(entity.getDay_wechat_money())) {sql.WHERE("day_wechat_money = #{day_wechat_money}");}
			if(!Objects.isNull(entity.getDay_alipay_money())) {sql.WHERE("day_alipay_money = #{day_alipay_money}");}
			if(!Objects.isNull(entity.getDay_unionpay_money())) {sql.WHERE("day_unionpay_money = #{day_unionpay_money}");}
			if(!Objects.isNull(entity.getDay_cash())) {sql.WHERE("day_cash = #{day_cash}");}
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
	public String selectPaWorkStatisticByLimt(PaWorkStatistic entity) {
		SQL sql = new SQL().SELECT("*").FROM("pa_work_statistic");
					if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getType())) {sql.WHERE("type = #{type}");}
			if(!Objects.isNull(entity.getStaff_id())) {sql.WHERE("staff_id = #{staff_id}");}
			if(!Strings.isNullOrEmpty(entity.getStatistic_date())) {sql.WHERE("statistic_date = #{statistic_date}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_ip())) {sql.WHERE("terminal_ip = #{terminal_ip}");}
			if(!Objects.isNull(entity.getConsume_money())) {sql.WHERE("consume_money = #{consume_money}");}
			if(!Objects.isNull(entity.getDiscount())) {sql.WHERE("discount = #{discount}");}
			if(!Objects.isNull(entity.getConsume_count())) {sql.WHERE("consume_count = #{consume_count}");}
			if(!Objects.isNull(entity.getRefund_money())) {sql.WHERE("refund_money = #{refund_money}");}
			if(!Objects.isNull(entity.getRefund_count())) {sql.WHERE("refund_count = #{refund_count}");}
			if(!Objects.isNull(entity.getWechat_money())) {sql.WHERE("wechat_money = #{wechat_money}");}
			if(!Objects.isNull(entity.getAlipay_money())) {sql.WHERE("alipay_money = #{alipay_money}");}
			if(!Objects.isNull(entity.getUnionpay_money())) {sql.WHERE("unionpay_money = #{unionpay_money}");}
			if(!Objects.isNull(entity.getCash())) {sql.WHERE("cash = #{cash}");}
			if(!Objects.isNull(entity.getPrevious_cash())) {sql.WHERE("previous_cash = #{previous_cash}");}
			if(!Objects.isNull(entity.getPrevious_cash_total())) {sql.WHERE("previous_cash_total = #{previous_cash_total}");}
			if(!Objects.isNull(entity.getDay_consume_money())) {sql.WHERE("day_consume_money = #{day_consume_money}");}
			if(!Objects.isNull(entity.getDay_discount())) {sql.WHERE("day_discount = #{day_discount}");}
			if(!Objects.isNull(entity.getDay_consume_count())) {sql.WHERE("day_consume_count = #{day_consume_count}");}
			if(!Objects.isNull(entity.getDay_refund_money())) {sql.WHERE("day_refund_money = #{day_refund_money}");}
			if(!Objects.isNull(entity.getDay_refund_count())) {sql.WHERE("day_refund_count = #{day_refund_count}");}
			if(!Objects.isNull(entity.getDay_wechat_money())) {sql.WHERE("day_wechat_money = #{day_wechat_money}");}
			if(!Objects.isNull(entity.getDay_alipay_money())) {sql.WHERE("day_alipay_money = #{day_alipay_money}");}
			if(!Objects.isNull(entity.getDay_unionpay_money())) {sql.WHERE("day_unionpay_money = #{day_unionpay_money}");}
			if(!Objects.isNull(entity.getDay_cash())) {sql.WHERE("day_cash = #{day_cash}");}
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("createtime = #{createtime}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("updatetime = #{updatetime}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectPaWorkStatistic(PaWorkStatistic entity) {
		SQL sql = new SQL().SELECT("*").FROM("pa_work_statistic");
			if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getType())) {sql.WHERE("type = #{type}");}
			if(!Objects.isNull(entity.getStaff_id())) {sql.WHERE("staff_id = #{staff_id}");}
			if(!Strings.isNullOrEmpty(entity.getStatistic_date())) {sql.WHERE("statistic_date = #{statistic_date}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_ip())) {sql.WHERE("terminal_ip = #{terminal_ip}");}
			if(!Objects.isNull(entity.getConsume_money())) {sql.WHERE("consume_money = #{consume_money}");}
			if(!Objects.isNull(entity.getDiscount())) {sql.WHERE("discount = #{discount}");}
			if(!Objects.isNull(entity.getConsume_count())) {sql.WHERE("consume_count = #{consume_count}");}
			if(!Objects.isNull(entity.getRefund_money())) {sql.WHERE("refund_money = #{refund_money}");}
			if(!Objects.isNull(entity.getRefund_count())) {sql.WHERE("refund_count = #{refund_count}");}
			if(!Objects.isNull(entity.getWechat_money())) {sql.WHERE("wechat_money = #{wechat_money}");}
			if(!Objects.isNull(entity.getAlipay_money())) {sql.WHERE("alipay_money = #{alipay_money}");}
			if(!Objects.isNull(entity.getUnionpay_money())) {sql.WHERE("unionpay_money = #{unionpay_money}");}
			if(!Objects.isNull(entity.getCash())) {sql.WHERE("cash = #{cash}");}
			if(!Objects.isNull(entity.getPrevious_cash())) {sql.WHERE("previous_cash = #{previous_cash}");}
			if(!Objects.isNull(entity.getPrevious_cash_total())) {sql.WHERE("previous_cash_total = #{previous_cash_total}");}
			if(!Objects.isNull(entity.getDay_consume_money())) {sql.WHERE("day_consume_money = #{day_consume_money}");}
			if(!Objects.isNull(entity.getDay_discount())) {sql.WHERE("day_discount = #{day_discount}");}
			if(!Objects.isNull(entity.getDay_consume_count())) {sql.WHERE("day_consume_count = #{day_consume_count}");}
			if(!Objects.isNull(entity.getDay_refund_money())) {sql.WHERE("day_refund_money = #{day_refund_money}");}
			if(!Objects.isNull(entity.getDay_refund_count())) {sql.WHERE("day_refund_count = #{day_refund_count}");}
			if(!Objects.isNull(entity.getDay_wechat_money())) {sql.WHERE("day_wechat_money = #{day_wechat_money}");}
			if(!Objects.isNull(entity.getDay_alipay_money())) {sql.WHERE("day_alipay_money = #{day_alipay_money}");}
			if(!Objects.isNull(entity.getDay_unionpay_money())) {sql.WHERE("day_unionpay_money = #{day_unionpay_money}");}
			if(!Objects.isNull(entity.getDay_cash())) {sql.WHERE("day_cash = #{day_cash}");}
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
		SQL sql = new SQL().SELECT("*").FROM("pa_work_statistic");
		sql.WHERE("id="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updatePaWorkStatistic(PaWorkStatistic entity) {
		SQL sql = new SQL().UPDATE("pa_work_statistic");
				sql.SET("type = #{type}");
		sql.SET("staff_id = #{staff_id}");
		sql.SET("statistic_date = #{statistic_date}");
		sql.SET("terminal_ip = #{terminal_ip}");
		sql.SET("consume_money = #{consume_money}");
		sql.SET("discount = #{discount}");
		sql.SET("consume_count = #{consume_count}");
		sql.SET("refund_money = #{refund_money}");
		sql.SET("refund_count = #{refund_count}");
		sql.SET("wechat_money = #{wechat_money}");
		sql.SET("alipay_money = #{alipay_money}");
		sql.SET("unionpay_money = #{unionpay_money}");
		sql.SET("cash = #{cash}");
		sql.SET("previous_cash = #{previous_cash}");
		sql.SET("previous_cash_total = #{previous_cash_total}");
		sql.SET("day_consume_money = #{day_consume_money}");
		sql.SET("day_discount = #{day_discount}");
		sql.SET("day_consume_count = #{day_consume_count}");
		sql.SET("day_refund_money = #{day_refund_money}");
		sql.SET("day_refund_count = #{day_refund_count}");
		sql.SET("day_wechat_money = #{day_wechat_money}");
		sql.SET("day_alipay_money = #{day_alipay_money}");
		sql.SET("day_unionpay_money = #{day_unionpay_money}");
		sql.SET("day_cash = #{day_cash}");
		sql.SET("updatetime = now()");

		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public String updatePaWorkStatisticByNullChk(PaWorkStatistic entity) {
		SQL sql = new SQL().UPDATE("pa_work_statistic");
					if(!Objects.isNull(entity.getType())) {sql.SET("type = #{type}");}
			if(!Objects.isNull(entity.getStaff_id())) {sql.SET("staff_id = #{staff_id}");}
			if(!Strings.isNullOrEmpty(entity.getStatistic_date())) {sql.SET("statistic_date = #{statistic_date}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_ip())) {sql.SET("terminal_ip = #{terminal_ip}");}
			if(!Objects.isNull(entity.getConsume_money())) {sql.SET("consume_money = #{consume_money}");}
			if(!Objects.isNull(entity.getDiscount())) {sql.SET("discount = #{discount}");}
			if(!Objects.isNull(entity.getConsume_count())) {sql.SET("consume_count = #{consume_count}");}
			if(!Objects.isNull(entity.getRefund_money())) {sql.SET("refund_money = #{refund_money}");}
			if(!Objects.isNull(entity.getRefund_count())) {sql.SET("refund_count = #{refund_count}");}
			if(!Objects.isNull(entity.getWechat_money())) {sql.SET("wechat_money = #{wechat_money}");}
			if(!Objects.isNull(entity.getAlipay_money())) {sql.SET("alipay_money = #{alipay_money}");}
			if(!Objects.isNull(entity.getUnionpay_money())) {sql.SET("unionpay_money = #{unionpay_money}");}
			if(!Objects.isNull(entity.getCash())) {sql.SET("cash = #{cash}");}
			if(!Objects.isNull(entity.getPrevious_cash())) {sql.SET("previous_cash = #{previous_cash}");}
			if(!Objects.isNull(entity.getPrevious_cash_total())) {sql.SET("previous_cash_total = #{previous_cash_total}");}
			if(!Objects.isNull(entity.getDay_consume_money())) {sql.SET("day_consume_money = #{day_consume_money}");}
			if(!Objects.isNull(entity.getDay_discount())) {sql.SET("day_discount = #{day_discount}");}
			if(!Objects.isNull(entity.getDay_consume_count())) {sql.SET("day_consume_count = #{day_consume_count}");}
			if(!Objects.isNull(entity.getDay_refund_money())) {sql.SET("day_refund_money = #{day_refund_money}");}
			if(!Objects.isNull(entity.getDay_refund_count())) {sql.SET("day_refund_count = #{day_refund_count}");}
			if(!Objects.isNull(entity.getDay_wechat_money())) {sql.SET("day_wechat_money = #{day_wechat_money}");}
			if(!Objects.isNull(entity.getDay_alipay_money())) {sql.SET("day_alipay_money = #{day_alipay_money}");}
			if(!Objects.isNull(entity.getDay_unionpay_money())) {sql.SET("day_unionpay_money = #{day_unionpay_money}");}
			if(!Objects.isNull(entity.getDay_cash())) {sql.SET("day_cash = #{day_cash}");}
		sql.SET("updatetime = now()");

		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public String deletePaWorkStatistic(int id) {
		SQL sql = new SQL().DELETE_FROM("pa_work_statistic");
		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(int id) {
		SQL sql = new SQL().UPDATE("pa_work_statistic");
		sql.SET("state=2");
		sql.WHERE("id = #{id}");
		return sql.toString();
	}
}
