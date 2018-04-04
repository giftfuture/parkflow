package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.VwWorkStatistic;

public class VwWorkStatisticProvider {
	
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectVwWorkStatisticByCount(VwWorkStatistic entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("vw_work_statistic");
					if(!Strings.isNullOrEmpty(entity.getType_name())) {sql.WHERE("type_name = #{type_name}");}
			if(!Strings.isNullOrEmpty(entity.getStaff_name())) {sql.WHERE("staff_name = #{staff_name}");}
			if(!Strings.isNullOrEmpty(entity.getStaff_no())) {sql.WHERE("staff_no = #{staff_no}");}
			if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getType())) {sql.WHERE("type = #{type}");}
			if(!Objects.isNull(entity.getStaff_id())) {sql.WHERE("staff_id = #{staff_id}");}
			if(!Strings.isNullOrEmpty(entity.getStatistic_date())) {sql.WHERE("statistic_date = #{statistic_date}");}
			if(!Strings.isNullOrEmpty(entity.getStartDate())) {sql.WHERE("statistic_date >= #{startDate}");}
			if(!Strings.isNullOrEmpty(entity.getEndDate())) {sql.WHERE("statistic_date <= #{endDate}");}
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
			if(!Strings.isNullOrEmpty(entity.getTerminal_name())) {sql.WHERE("terminal_name = #{terminal_name}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_venue_id())) {sql.WHERE("terminal_venue_id = #{terminal_venue_id}");}

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
	public String selectVwWorkStatisticByLimt(VwWorkStatistic entity) {
		SQL sql = new SQL().SELECT("*").FROM("vw_work_statistic");
					if(!Strings.isNullOrEmpty(entity.getType_name())) {sql.WHERE("type_name = #{type_name}");}
			if(!Strings.isNullOrEmpty(entity.getStaff_name())) {sql.WHERE("staff_name = #{staff_name}");}
			if(!Strings.isNullOrEmpty(entity.getStaff_no())) {sql.WHERE("staff_no = #{staff_no}");}
			if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getType())) {sql.WHERE("type = #{type}");}
			if(!Objects.isNull(entity.getStaff_id())) {sql.WHERE("staff_id = #{staff_id}");}
			if(!Strings.isNullOrEmpty(entity.getStatistic_date())) {sql.WHERE("statistic_date = #{statistic_date}");}
			if(!Strings.isNullOrEmpty(entity.getStartDate())) {sql.WHERE("statistic_date >= #{startDate}");}
			if(!Strings.isNullOrEmpty(entity.getEndDate())) {sql.WHERE("statistic_date <= #{endDate}");}
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
			if(!Strings.isNullOrEmpty(entity.getTerminal_name())) {sql.WHERE("terminal_name = #{terminal_name}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_venue_id())) {sql.WHERE("terminal_venue_id = #{terminal_venue_id}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectVwWorkStatistic(VwWorkStatistic entity) {
		SQL sql = new SQL().SELECT("*").FROM("vw_work_statistic");
			if(!Strings.isNullOrEmpty(entity.getType_name())) {sql.WHERE("type_name = #{type_name}");}
			if(!Strings.isNullOrEmpty(entity.getStaff_name())) {sql.WHERE("staff_name = #{staff_name}");}
			if(!Strings.isNullOrEmpty(entity.getStaff_no())) {sql.WHERE("staff_no = #{staff_no}");}
			if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getType())) {sql.WHERE("type = #{type}");}
			if(!Objects.isNull(entity.getStaff_id())) {sql.WHERE("staff_id = #{staff_id}");}
			if(!Strings.isNullOrEmpty(entity.getStatistic_date())) {sql.WHERE("statistic_date = #{statistic_date}");}
			if(!Strings.isNullOrEmpty(entity.getStartDate())) {sql.WHERE("statistic_date >= #{startDate}");}
			if(!Strings.isNullOrEmpty(entity.getEndDate())) {sql.WHERE("statistic_date <= #{endDate}");}
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
			if(!Strings.isNullOrEmpty(entity.getTerminal_name())) {sql.WHERE("terminal_name = #{terminal_name}");}
			if(!Strings.isNullOrEmpty(entity.getTerminal_venue_id())) {sql.WHERE("terminal_venue_id = #{terminal_venue_id}");}

		return sql.toString();
	}
}
