package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.YwOrder;

/**
 * 乐园订单表
 * provider
 */
public class YwOrderProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertYwOrder(YwOrder entity) {
		SQL sql = new SQL().INSERT_INTO("yw_order");
		sql.VALUES("member_id,member_phone,member_card,operator_id,money,total_money,coupon_id,order_channel,trans_type,pay_type,pay_status,error_msg,pay_channel,serial_number,ip,add_time,pay_time,pay_finish_time,suborders_id,createtime,updatetime,order_type,goods_total,goods_id,contact_id", "#{member_id},#{member_phone},#{member_card},#{operator_id},#{money},#{total_money},#{coupon_id},#{order_channel},#{trans_type},#{pay_type},#{pay_status},#{error_msg},#{pay_channel},#{serial_number},#{ip},#{add_time},#{pay_time},#{pay_finish_time},#{suborders_id},now(),now(),#{order_type},#{goods_total},#{goods_id},#{contact_id}");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectYwOrderByCount(YwOrder entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("yw_order");
					if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getMember_id())) {sql.WHERE("member_id = #{member_id}");}
			if(!Strings.isNullOrEmpty(entity.getMember_phone())) {sql.WHERE("member_phone = #{member_phone}");}
			if(!Strings.isNullOrEmpty(entity.getMember_card())) {sql.WHERE("member_card = #{member_card}");}
			if(!Strings.isNullOrEmpty(entity.getOperator_id())) {sql.WHERE("operator_id = #{operator_id}");}
			if(!Objects.isNull(entity.getMoney())) {sql.WHERE("money = #{money}");}
			if(!Objects.isNull(entity.getTotal_money())) {sql.WHERE("total_money = #{total_money}");}
			if(!Strings.isNullOrEmpty(entity.getCoupon_id())) {sql.WHERE("coupon_id = #{coupon_id}");}
			if(!Strings.isNullOrEmpty(entity.getOrder_channel())) {sql.WHERE("order_channel = #{order_channel}");}
			if(!Strings.isNullOrEmpty(entity.getTrans_type())) {sql.WHERE("trans_type = #{trans_type}");}
			if(!Strings.isNullOrEmpty(entity.getPay_type())) {sql.WHERE("pay_type = #{pay_type}");}
			if(!Strings.isNullOrEmpty(entity.getPay_status())) {sql.WHERE("pay_status = #{pay_status}");}
			if(!Strings.isNullOrEmpty(entity.getError_msg())) {sql.WHERE("error_msg = #{error_msg}");}
			if(!Strings.isNullOrEmpty(entity.getPay_channel())) {sql.WHERE("pay_channel = #{pay_channel}");}
			if(!Strings.isNullOrEmpty(entity.getSerial_number())) {sql.WHERE("serial_number = #{serial_number}");}
			if(!Strings.isNullOrEmpty(entity.getIp())) {sql.WHERE("ip = #{ip}");}
			if(!Strings.isNullOrEmpty(entity.getAdd_time())) {sql.WHERE("add_time = #{add_time}");}
			if(!Strings.isNullOrEmpty(entity.getPay_time())) {sql.WHERE("pay_time = #{pay_time}");}
			if(!Strings.isNullOrEmpty(entity.getPay_finish_time())) {sql.WHERE("pay_finish_time = #{pay_finish_time}");}			
			if(!Strings.isNullOrEmpty(entity.getSuborders_id())) {sql.WHERE("suborders_id = #{suborders_id}");}
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
	public String selectYwOrderByLimt(YwOrder entity) {
		SQL sql = new SQL().SELECT("*").FROM("yw_order");
					if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getMember_id())) {sql.WHERE("member_id = #{member_id}");}
			if(!Strings.isNullOrEmpty(entity.getMember_phone())) {sql.WHERE("member_phone = #{member_phone}");}
			if(!Strings.isNullOrEmpty(entity.getMember_card())) {sql.WHERE("member_card = #{member_card}");}
			if(!Strings.isNullOrEmpty(entity.getOperator_id())) {sql.WHERE("operator_id = #{operator_id}");}
			if(!Objects.isNull(entity.getMoney())) {sql.WHERE("money = #{money}");}
			if(!Objects.isNull(entity.getTotal_money())) {sql.WHERE("total_money = #{total_money}");}
			if(!Strings.isNullOrEmpty(entity.getCoupon_id())) {sql.WHERE("coupon_id = #{coupon_id}");}
			if(!Strings.isNullOrEmpty(entity.getOrder_channel())) {sql.WHERE("order_channel = #{order_channel}");}
			if(!Strings.isNullOrEmpty(entity.getTrans_type())) {sql.WHERE("trans_type = #{trans_type}");}
			if(!Strings.isNullOrEmpty(entity.getPay_type())) {sql.WHERE("pay_type = #{pay_type}");}
			if(!Strings.isNullOrEmpty(entity.getPay_status())) {sql.WHERE("pay_status = #{pay_status}");}
			if(!Strings.isNullOrEmpty(entity.getError_msg())) {sql.WHERE("error_msg = #{error_msg}");}
			if(!Strings.isNullOrEmpty(entity.getPay_channel())) {sql.WHERE("pay_channel = #{pay_channel}");}
			if(!Strings.isNullOrEmpty(entity.getSerial_number())) {sql.WHERE("serial_number = #{serial_number}");}
			if(!Strings.isNullOrEmpty(entity.getIp())) {sql.WHERE("ip = #{ip}");}
			if(!Strings.isNullOrEmpty(entity.getAdd_time())) {sql.WHERE("add_time = #{add_time}");}
			if(!Strings.isNullOrEmpty(entity.getPay_time())) {sql.WHERE("pay_time = #{pay_time}");}
			if(!Strings.isNullOrEmpty(entity.getPay_finish_time())) {sql.WHERE("pay_finish_time = #{pay_finish_time}");}
			if(!Strings.isNullOrEmpty(entity.getSuborders_id())) {sql.WHERE("suborders_id = #{suborders_id}");}
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("createtime = #{createtime}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("updatetime = #{updatetime}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectYwOrder(YwOrder entity) {
		SQL sql = new SQL().SELECT("*").FROM("yw_order");
			if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getMember_id())) {sql.WHERE("member_id = #{member_id}");}
			if(!Strings.isNullOrEmpty(entity.getMember_phone())) {sql.WHERE("member_phone = #{member_phone}");}
			if(!Strings.isNullOrEmpty(entity.getMember_card())) {sql.WHERE("member_card = #{member_card}");}
			if(!Strings.isNullOrEmpty(entity.getOperator_id())) {sql.WHERE("operator_id = #{operator_id}");}
			if(!Objects.isNull(entity.getMoney())) {sql.WHERE("money = #{money}");}
			if(!Objects.isNull(entity.getTotal_money())) {sql.WHERE("total_money = #{total_money}");}
			if(!Strings.isNullOrEmpty(entity.getCoupon_id())) {sql.WHERE("coupon_id = #{coupon_id}");}
			if(!Strings.isNullOrEmpty(entity.getOrder_channel())) {sql.WHERE("order_channel = #{order_channel}");}
			if(!Strings.isNullOrEmpty(entity.getTrans_type())) {sql.WHERE("trans_type = #{trans_type}");}
			if(!Strings.isNullOrEmpty(entity.getPay_type())) {sql.WHERE("pay_type = #{pay_type}");}
			if(!Strings.isNullOrEmpty(entity.getPay_status())) {sql.WHERE("pay_status = #{pay_status}");}
			if(!Strings.isNullOrEmpty(entity.getError_msg())) {sql.WHERE("error_msg = #{error_msg}");}
			if(!Strings.isNullOrEmpty(entity.getPay_channel())) {sql.WHERE("pay_channel = #{pay_channel}");}
			if(!Strings.isNullOrEmpty(entity.getSerial_number())) {sql.WHERE("serial_number = #{serial_number}");}
			if(!Strings.isNullOrEmpty(entity.getIp())) {sql.WHERE("ip = #{ip}");}
			if(!Strings.isNullOrEmpty(entity.getAdd_time())) {sql.WHERE("add_time = #{add_time}");}
			if(!Strings.isNullOrEmpty(entity.getPay_time())) {sql.WHERE("pay_time = #{pay_time}");}
			if(!Strings.isNullOrEmpty(entity.getPay_finish_time())) {sql.WHERE("pay_finish_time = #{pay_finish_time}");}
			if(!Strings.isNullOrEmpty(entity.getSuborders_id())) {sql.WHERE("suborders_id = #{suborders_id}");}
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
		SQL sql = new SQL().SELECT("*").FROM("yw_order");
		sql.WHERE("id="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updateYwOrder(YwOrder entity) {
		SQL sql = new SQL().UPDATE("yw_order");
				sql.SET("member_id = #{member_id}");
				sql.SET("member_phone = #{member_phone}");
				sql.SET("member_card = #{member_card}");
		sql.SET("operator_id = #{operator_id}");
		sql.SET("money = #{money}");
		sql.SET("total_money = #{total_money}");
		sql.SET("coupon_id = #{coupon_id}");
		sql.SET("order_channel = #{order_channel}");
		sql.SET("trans_type = #{trans_type}");
		sql.SET("pay_type = #{pay_type}");
		sql.SET("pay_status = #{pay_status}");
		sql.SET("error_msg = #{error_msg}");
		sql.SET("pay_channel = #{pay_channel}");
		sql.SET("serial_number = #{serial_number}");
		sql.SET("ip = #{ip}");
		sql.SET("add_time = #{add_time}");
		sql.SET("pay_time = #{pay_time}");
		sql.SET("pay_finish_time = #{pay_finish_time}");
		sql.SET("suborders_id = #{suborders_id}");
		sql.SET("updatetime = now()");

		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public String updateYwOrderByNullChk(YwOrder entity) {
		SQL sql = new SQL().UPDATE("yw_order");
					if(!Strings.isNullOrEmpty(entity.getMember_id())) {sql.SET("member_id = #{member_id}");}
					if(!Strings.isNullOrEmpty(entity.getMember_phone())) {sql.SET("member_phone = #{member_phone}");}
					if(!Strings.isNullOrEmpty(entity.getMember_card())) {sql.SET("member_card = #{member_card}");}
			if(!Strings.isNullOrEmpty(entity.getOperator_id())) {sql.SET("operator_id = #{operator_id}");}
			if(!Objects.isNull(entity.getMoney())) {sql.SET("money = #{money}");}
			if(!Objects.isNull(entity.getTotal_money())) {sql.SET("total_money = #{total_money}");}
			if(!Strings.isNullOrEmpty(entity.getCoupon_id())) {sql.SET("coupon_id = #{coupon_id}");}
			if(!Strings.isNullOrEmpty(entity.getOrder_channel())) {sql.SET("order_channel = #{order_channel}");}
			if(!Strings.isNullOrEmpty(entity.getTrans_type())) {sql.SET("trans_type = #{trans_type}");}
			if(!Strings.isNullOrEmpty(entity.getPay_type())) {sql.SET("pay_type = #{pay_type}");}
			if(!Strings.isNullOrEmpty(entity.getPay_status())) {sql.SET("pay_status = #{pay_status}");}
			if(!Strings.isNullOrEmpty(entity.getError_msg())) {sql.SET("error_msg = #{error_msg}");}
			if(!Strings.isNullOrEmpty(entity.getPay_channel())) {sql.SET("pay_channel = #{pay_channel}");}
			if(!Strings.isNullOrEmpty(entity.getSerial_number())) {sql.SET("serial_number = #{serial_number}");}
			if(!Strings.isNullOrEmpty(entity.getIp())) {sql.SET("ip = #{ip}");}
			if(!Strings.isNullOrEmpty(entity.getAdd_time())) {sql.SET("add_time = #{add_time}");}
			if(!Strings.isNullOrEmpty(entity.getPay_time())) {sql.SET("pay_time = #{pay_time}");}
			if(!Strings.isNullOrEmpty(entity.getSuborders_id())) {sql.SET("suborders_id = #{suborders_id}");}
			if(!Strings.isNullOrEmpty(entity.getPay_finish_time())) {sql.SET("pay_finish_time = #{pay_finish_time}");}
		sql.SET("updatetime = now()");

		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public String deleteYwOrder(int id) {
		SQL sql = new SQL().DELETE_FROM("yw_order");
		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(int id) {
		SQL sql = new SQL().UPDATE("yw_order");
		sql.SET("state=2");
		sql.WHERE("id = #{id}");
		return sql.toString();
	}
}
