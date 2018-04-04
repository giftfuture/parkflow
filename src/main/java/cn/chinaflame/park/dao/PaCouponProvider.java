package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.PaCoupon;

/**
 * 优是惠卷关联表
 * provider
 */
public class PaCouponProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertPaCoupon(PaCoupon entity) {
		SQL sql = new SQL().INSERT_INTO("pa_coupon");
		sql.VALUES("member_id,discount_id,effiect_start_time,effiect_end_time,coupon_status,createtime,updatetime", "#{member_id},#{discount_id},#{effiect_start_time},#{effiect_end_time},#{coupon_status},now(),now()");
		System.out.println("SQL:"+sql);
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectPaCouponByCount(PaCoupon entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("pa_coupon");
					if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getMember_id())) {sql.WHERE("member_id = #{member_id}");}
			if(!Objects.isNull(entity.getDiscount_id())) {sql.WHERE("discount_id = #{discount_id}");}
			if(!Strings.isNullOrEmpty(entity.getEffiect_start_time())) {sql.WHERE("effiect_start_time = #{effiect_start_time}");}
			if(!Strings.isNullOrEmpty(entity.getEffiect_end_time())) {sql.WHERE("effiect_end_time = #{effiect_end_time}");}
			if(!Strings.isNullOrEmpty(entity.getCoupon_status())) {sql.WHERE("coupon_status = #{coupon_status}");}
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
	public String selectPaCouponByLimt(PaCoupon entity) {
		SQL sql = new SQL().SELECT("*").FROM("pa_coupon");
					if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getMember_id())) {sql.WHERE("member_id = #{member_id}");}
			if(!Objects.isNull(entity.getDiscount_id())) {sql.WHERE("discount_id = #{discount_id}");}
			if(!Strings.isNullOrEmpty(entity.getEffiect_start_time())) {sql.WHERE("effiect_start_time = #{effiect_start_time}");}
			if(!Strings.isNullOrEmpty(entity.getEffiect_end_time())) {sql.WHERE("effiect_end_time = #{effiect_end_time}");}
			if(!Strings.isNullOrEmpty(entity.getCoupon_status())) {sql.WHERE("coupon_status = #{coupon_status}");}
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("createtime = #{createtime}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("updatetime = #{updatetime}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectPaCoupon(PaCoupon entity) {
		SQL sql = new SQL().SELECT("*").FROM("pa_coupon");
			if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getMember_id())) {sql.WHERE("member_id = #{member_id}");}
			if(!Objects.isNull(entity.getDiscount_id())) {sql.WHERE("discount_id = #{discount_id}");}
			if(!Strings.isNullOrEmpty(entity.getEffiect_start_time())) {sql.WHERE("effiect_start_time = #{effiect_start_time}");}
			if(!Strings.isNullOrEmpty(entity.getEffiect_end_time())) {sql.WHERE("effiect_end_time = #{effiect_end_time}");}
			if(!Strings.isNullOrEmpty(entity.getCoupon_status())) {sql.WHERE("coupon_status = #{coupon_status}");}
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
		SQL sql = new SQL().SELECT("*").FROM("pa_coupon");
		sql.WHERE("id="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updatePaCoupon(PaCoupon entity) {
		SQL sql = new SQL().UPDATE("pa_coupon");
				sql.SET("member_id = #{member_id}");
		sql.SET("discount_id = #{discount_id}");
		sql.SET("effiect_start_time = #{effiect_start_time}");
		sql.SET("effiect_end_time = #{effiect_end_time}");
		sql.SET("coupon_status = #{coupon_status}");
		sql.SET("updatetime = now()");

		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public String updatePaCouponByNullChk(PaCoupon entity) {
		SQL sql = new SQL().UPDATE("pa_coupon");
					if(!Objects.isNull(entity.getMember_id())) {sql.SET("member_id = #{member_id}");}
			if(!Objects.isNull(entity.getDiscount_id())) {sql.SET("discount_id = #{discount_id}");}
			if(!Strings.isNullOrEmpty(entity.getEffiect_start_time())) {sql.SET("effiect_start_time = #{effiect_start_time}");}
			if(!Strings.isNullOrEmpty(entity.getEffiect_end_time())) {sql.SET("effiect_end_time = #{effiect_end_time}");}
			if(!Strings.isNullOrEmpty(entity.getCoupon_status())) {sql.SET("coupon_status = #{coupon_status}");}
		sql.SET("updatetime = now()");

		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public String deletePaCoupon(int id) {
		SQL sql = new SQL().DELETE_FROM("pa_coupon");
		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(int id) {
		SQL sql = new SQL().UPDATE("pa_coupon");
		sql.SET("state=2");
		sql.WHERE("id = #{id}");
		return sql.toString();
	}
}
