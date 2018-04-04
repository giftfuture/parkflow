package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import org.springframework.util.StringUtils;

import com.google.common.base.Strings;
import java.util.Objects;

import cn.chinaflame.park.model.PaTuiPiao;
import cn.chinaflame.park.model.VwQudao;
import cn.chinaflame.park.model.VwTicketRefund;

public class VwTicketRefundProvider {
	
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectVwTicketRefundByCount(PaTuiPiao entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("vw_ticket_refund");
				

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
	public String selectVwTicketRefundByLimt(VwTicketRefund entity) {
		SQL sql = new SQL().SELECT("*").FROM("vw_ticket_refund");
					if(!Objects.isNull(entity.getOrder_id())) {sql.WHERE("order_id = #{order_id}");}
			if(!Strings.isNullOrEmpty(entity.getAdd_time())) {sql.WHERE("add_time = #{add_time}");}
			if(!Strings.isNullOrEmpty(entity.getOrder_channel())) {sql.WHERE("order_channel = #{order_channel}");}
			if(!Objects.isNull(entity.getTicket_price())) {sql.WHERE("ticket_price = #{ticket_price}");}
			if(!Strings.isNullOrEmpty(entity.getOriginal_orderid())) {sql.WHERE("original_orderid = #{original_orderid}");}
			if(!Strings.isNullOrEmpty(entity.getPay_type())) {sql.WHERE("pay_type = #{pay_type}");}
			if(!Objects.isNull(entity.getCost_money())) {sql.WHERE("cost_money = #{cost_money}");}
			if(!Strings.isNullOrEmpty(entity.getStaffname())) {sql.WHERE("staffname = #{staffname}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectVwTicketRefund(VwTicketRefund entity) {
		SQL sql = new SQL().SELECT("*").FROM("vw_ticket_refund");
			if(!Objects.isNull(entity.getOrder_id())) {sql.WHERE("order_id = #{order_id}");}
			if(!Strings.isNullOrEmpty(entity.getAdd_time())) {sql.WHERE("add_time = #{add_time}");}
			if(!Strings.isNullOrEmpty(entity.getOrder_channel())) {sql.WHERE("order_channel = #{order_channel}");}
			if(!Objects.isNull(entity.getTicket_price())) {sql.WHERE("ticket_price = #{ticket_price}");}
			if(!Strings.isNullOrEmpty(entity.getOriginal_orderid())) {sql.WHERE("original_orderid = #{original_orderid}");}
			if(!Strings.isNullOrEmpty(entity.getPay_type())) {sql.WHERE("pay_type = #{pay_type}");}
			if(!Objects.isNull(entity.getCost_money())) {sql.WHERE("cost_money = #{cost_money}");}
			if(!Strings.isNullOrEmpty(entity.getStaffname())) {sql.WHERE("staffname = #{staffname}");}

		return sql.toString();
	}
	
	
	
	
	/**
	 * 强哥
	 */
	
	public String selectTuiPiao(PaTuiPiao entity) {
		String sql = new SQL(){
			{
				SELECT(" a.id AS order_id, " //a为退票单，b为原订单
				+ " a.add_time AS add_time,  "
				+ "	a.order_channel AS order_channel,"
				+ " a.money AS ticket_price,"
				+ " a.suborders_id AS original_orderid," //原订单号
				+ " a.pay_type AS pay_type,"
				+ " b.order_channel AS old_channel,"
				+ " b.money AS old_money,"
				+ " c.staffname AS staffname");
				FROM("yw_order a ");
				INNER_JOIN("yw_order b on (a.suborders_id = b.id)");
				INNER_JOIN("pa_staff c on (a.operator_id = c.id)");
				
				WHERE("b.pay_status = '6' ");
				if(!StringUtils.isEmpty(entity.getStart_time())){
                    WHERE("a.add_time >= #{start_time}");
                }
				if(!StringUtils.isEmpty(entity.getEnd_time())){
					WHERE("a.add_time <= #{end_time}");
				}
				if(!Objects.isNull(entity.getOrder_id())) {
					WHERE("a.id  = #{order_id}");
				}
				if(!Strings.isNullOrEmpty(entity.getOrder_channel())) {
					WHERE("a.order_channel = #{order_channel}");
				}
				if(!Strings.isNullOrEmpty(entity.getStaffname())) {
					WHERE("c.staffname = #{staffname}");
				}
			}
		}.toString();
		System.out.println(sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen());
		
		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	
	
	
	
}
