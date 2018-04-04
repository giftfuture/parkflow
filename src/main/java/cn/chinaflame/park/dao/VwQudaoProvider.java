package cn.chinaflame.park.dao;

import java.util.Objects;

import org.apache.ibatis.jdbc.SQL;
import org.springframework.util.StringUtils;

import com.google.common.base.Strings;

import cn.chinaflame.park.model.VwQudao;

public class VwQudaoProvider {
	
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectVwQudaoByCount(VwQudao entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("vw_qudao");
					if(!Strings.isNullOrEmpty(entity.getOrder_channel())) {sql.WHERE("order_channel = #{order_channel}");}
			if(!Strings.isNullOrEmpty(entity.getProduct_type())) {sql.WHERE("product_type = #{product_type}");}
			if(!Objects.isNull(entity.getNumber())) {sql.WHERE("number = #{number}");}
			if(!Objects.isNull(entity.getActual_money())) {sql.WHERE("actual_money = #{actual_money}");}
			if(!Objects.isNull(entity.getAccept_money())) {sql.WHERE("accept_money = #{accept_money}");}

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
	public String selectVwQudaoByLimt(VwQudao entity) {
		SQL sql = new SQL().SELECT("*").FROM("vw_qudao");
					if(!Strings.isNullOrEmpty(entity.getOrder_channel())) {sql.WHERE("order_channel = #{order_channel}");}
			if(!Strings.isNullOrEmpty(entity.getProduct_type())) {sql.WHERE("product_type = #{product_type}");}
			if(!Objects.isNull(entity.getNumber())) {sql.WHERE("number = #{number}");}
			if(!Objects.isNull(entity.getActual_money())) {sql.WHERE("actual_money = #{actual_money}");}
			if(!Objects.isNull(entity.getAccept_money())) {sql.WHERE("accept_money = #{accept_money}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectVwQudao(VwQudao entity) {
		SQL sql = new SQL().SELECT("*").FROM("vw_qudao");
			if(!Strings.isNullOrEmpty(entity.getOrder_channel())) {sql.WHERE("order_channel = #{order_channel}");}
			if(!Strings.isNullOrEmpty(entity.getProduct_type())) {sql.WHERE("product_type = #{product_type}");}
			if(!Objects.isNull(entity.getNumber())) {sql.WHERE("number = #{number}");}
			if(!Objects.isNull(entity.getActual_money())) {sql.WHERE("actual_money = #{actual_money}");}
			if(!Objects.isNull(entity.getAccept_money())) {sql.WHERE("accept_money = #{accept_money}");}

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
	public String selectVwQudaoByLimt2(VwQudao entity) {
		String sql = new SQL(){
			
		{
			
				SELECT(" order_channel AS order_channel, "
				+ "product_type AS product_type, count(0) AS number, "
				+ "sum(money) AS actual_money, sum(money) AS accept_money ");
				FROM("vw_orderitem_order ");
				WHERE(" trans_type= 'PAY' AND pay_status = '2' AND order_type = '2' ");
				if(!StringUtils.isEmpty(entity.getStart_time())){
                    WHERE("order_add_time >= #{start_time}");
                }
				if(!StringUtils.isEmpty(entity.getEnd_time())){
					WHERE("order_add_time <= #{end_time}");
				}
				if(!Strings.isNullOrEmpty(entity.getOrder_channel())) {
					WHERE("order_channel = #{order_channel}");
				}
				if(!Strings.isNullOrEmpty(entity.getProduct_type())) {
					WHERE("product_type = #{product_type}");
				}
				
				GROUP_BY("order_channel,product_type");
		}
	}.toString();
				
			/*	+ "FROM `vw_orderitem_order` AS a WHERE ((a.`trans_type` = 'PAY') "
				+ "AND (a.`pay_status` = '2') AND (a.`order_type` = '2')) "
				+ "GROUP BY a.`order_channel`, a.`product_type` ");*/
		
		
//			if(!Strings.isNullOrEmpty(entity.getOrder_channel())) {sql.WHERE("order_channel = #{order_channel}");}
//			if(!Strings.isNullOrEmpty(entity.getProduct_type())) {sql.WHERE("product_type = #{product_type}");}
//			if(!Objects.isNull(entity.getNumber())) {sql.WHERE("number = #{number}");}
//			if(!Objects.isNull(entity.getActual_money())) {sql.WHERE("actual_money = #{actual_money}");}
//			if(!Objects.isNull(entity.getAccept_money())) {sql.WHERE("accept_money = #{accept_money}");}
//	return sql;
		String aaaaaaa=(sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen()).toString();
		System.out.println(aaaaaaa);	
		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
