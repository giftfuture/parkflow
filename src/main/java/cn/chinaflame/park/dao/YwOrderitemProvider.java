package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.YwOrderitem;

/**
 * 订单详情表（票表）
 * provider
 */
public class YwOrderitemProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertYwOrderitem(YwOrderitem entity) {
		SQL sql = new SQL().INSERT_INTO("yw_orderitem");
		sql.VALUES("order_id,member_id,product_id,product_number,money,product_status,effiect_start_time,effiect_end_time,memo,createtime,updatetime", "#{order_id},#{member_id},#{product_id},#{product_number},#{money},#{product_status},#{effiect_start_time},#{effiect_end_time},#{memo},now(),now()");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectYwOrderitemByCount(YwOrderitem entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("yw_orderitem");
					if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getOrder_id())) {sql.WHERE("order_id = #{order_id}");}
			if(!Strings.isNullOrEmpty(entity.getMember_id())) {sql.WHERE("member_id = #{member_id}");}
			if(!Strings.isNullOrEmpty(entity.getProduct_id())) {sql.WHERE("product_id = #{product_id}");}
			if(!Objects.isNull(entity.getProduct_number())) {sql.WHERE("product_number = #{product_number}");}
			if(!Objects.isNull(entity.getMoney())) {sql.WHERE("money = #{money}");}
			if(!Strings.isNullOrEmpty(entity.getProduct_status())) {sql.WHERE("product_status = #{product_status}");}
			if(!Strings.isNullOrEmpty(entity.getEffiect_start_time())) {sql.WHERE("effiect_start_time = #{effiect_start_time}");}
			if(!Strings.isNullOrEmpty(entity.getEffiect_end_time())) {sql.WHERE("effiect_end_time = #{effiect_end_time}");}
			if(!Strings.isNullOrEmpty(entity.getMemo())) {sql.WHERE("memo = #{memo}");}
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
	public String selectYwOrderitemByLimt(YwOrderitem entity) {
		SQL sql = new SQL().SELECT("*").FROM("yw_orderitem");
					if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getOrder_id())) {sql.WHERE("order_id = #{order_id}");}
			if(!Strings.isNullOrEmpty(entity.getMember_id())) {sql.WHERE("member_id = #{member_id}");}
			if(!Strings.isNullOrEmpty(entity.getProduct_id())) {sql.WHERE("product_id = #{product_id}");}
			if(!Objects.isNull(entity.getProduct_number())) {sql.WHERE("product_number = #{product_number}");}
			if(!Objects.isNull(entity.getMoney())) {sql.WHERE("money = #{money}");}
			if(!Strings.isNullOrEmpty(entity.getProduct_status())) {sql.WHERE("product_status = #{product_status}");}
			if(!Strings.isNullOrEmpty(entity.getEffiect_start_time())) {sql.WHERE("effiect_start_time = #{effiect_start_time}");}
			if(!Strings.isNullOrEmpty(entity.getEffiect_end_time())) {sql.WHERE("effiect_end_time = #{effiect_end_time}");}
			if(!Strings.isNullOrEmpty(entity.getMemo())) {sql.WHERE("memo = #{memo}");}
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("createtime = #{createtime}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("updatetime = #{updatetime}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectYwOrderitem(YwOrderitem entity) {
		SQL sql = new SQL().SELECT("*").FROM("yw_orderitem");
			if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getOrder_id())) {sql.WHERE("order_id = #{order_id}");}
			if(!Strings.isNullOrEmpty(entity.getMember_id())) {sql.WHERE("member_id = #{member_id}");}
			if(!Strings.isNullOrEmpty(entity.getProduct_id())) {sql.WHERE("product_id = #{product_id}");}
			if(!Objects.isNull(entity.getProduct_number())) {sql.WHERE("product_number = #{product_number}");}
			if(!Objects.isNull(entity.getMoney())) {sql.WHERE("money = #{money}");}
			if(!Strings.isNullOrEmpty(entity.getProduct_status())) {sql.WHERE("product_status = #{product_status}");}
			if(!Strings.isNullOrEmpty(entity.getEffiect_start_time())) {sql.WHERE("effiect_start_time = #{effiect_start_time}");}
			if(!Strings.isNullOrEmpty(entity.getEffiect_end_time())) {sql.WHERE("effiect_end_time = #{effiect_end_time}");}
			if(!Strings.isNullOrEmpty(entity.getMemo())) {sql.WHERE("memo = #{memo}");}
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
		SQL sql = new SQL().SELECT("*").FROM("yw_orderitem");
		sql.WHERE("id="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updateYwOrderitem(YwOrderitem entity) {
		SQL sql = new SQL().UPDATE("yw_orderitem");
				sql.SET("order_id = #{order_id}");
		sql.SET("member_id = #{member_id}");
		sql.SET("product_id = #{product_id}");
		sql.SET("product_number = #{product_number}");
		sql.SET("money = #{money}");
		sql.SET("product_status = #{product_status}");
		sql.SET("effiect_start_time = #{effiect_start_time}");
		sql.SET("effiect_end_time = #{effiect_end_time}");
		sql.SET("memo = #{memo}");
		sql.SET("updatetime = now()");

		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public String updateYwOrderitemByNullChk(YwOrderitem entity) {
		SQL sql = new SQL().UPDATE("yw_orderitem");
					if(!Objects.isNull(entity.getOrder_id())) {sql.SET("order_id = #{order_id}");}
			if(!Strings.isNullOrEmpty(entity.getMember_id())) {sql.SET("member_id = #{member_id}");}
			if(!Strings.isNullOrEmpty(entity.getProduct_id())) {sql.SET("product_id = #{product_id}");}
			if(!Objects.isNull(entity.getProduct_number())) {sql.SET("product_number = #{product_number}");}
			if(!Objects.isNull(entity.getMoney())) {sql.SET("money = #{money}");}
			if(!Strings.isNullOrEmpty(entity.getProduct_status())) {sql.SET("product_status = #{product_status}");}
			if(!Strings.isNullOrEmpty(entity.getEffiect_start_time())) {sql.SET("effiect_start_time = #{effiect_start_time}");}
			if(!Strings.isNullOrEmpty(entity.getEffiect_end_time())) {sql.SET("effiect_end_time = #{effiect_end_time}");}
			if(!Strings.isNullOrEmpty(entity.getMemo())) {sql.SET("memo = #{memo}");}
		sql.SET("updatetime = now()");

		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public String deleteYwOrderitem(int id) {
		SQL sql = new SQL().DELETE_FROM("yw_orderitem");
		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(int id) {
		SQL sql = new SQL().UPDATE("yw_orderitem");
		sql.SET("state=2");
		sql.WHERE("id = #{id}");
		return sql.toString();
	}
}
