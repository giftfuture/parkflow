package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;

import cn.chinaflame.park.model.VwOrderitemOrder;
import cn.chinaflame.park.util.SysConst;
import cn.chinaflame.park.vo.VwWebsiteOrderQryVO;

public class VwOrderitemOrderProvider {
	
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectVwOrderitemOrderByCount(VwOrderitemOrder entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("vw_orderitem_order");
			if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getOrder_id())) {sql.WHERE("order_id = #{order_id}");}
			if(!Strings.isNullOrEmpty(entity.getMember_id())) {sql.WHERE("member_id = #{member_id}");}
			if(!Strings.isNullOrEmpty(entity.getProduct_id())) {sql.WHERE("product_id = #{product_id}");}
			if(!Objects.isNull(entity.getMoney())) {sql.WHERE("money = #{money}");}
			if(!Strings.isNullOrEmpty(entity.getEffiect_start_time())) {sql.WHERE("effiect_start_time = #{effiect_start_time}");}
			if(!Strings.isNullOrEmpty(entity.getEffiect_end_time())) {sql.WHERE("effiect_end_time = #{effiect_end_time}");}
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("createtime = #{createtime}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("updatetime = #{updatetime}");}
			if(!Strings.isNullOrEmpty(entity.getProduct_status())) {sql.WHERE("product_status = #{product_status}");}
			if(!Strings.isNullOrEmpty(entity.getStart_time())) {sql.WHERE("start_time = #{start_time}");}
			if(!Strings.isNullOrEmpty(entity.getEnd_time())) {sql.WHERE("end_time = #{end_time}");}
			if(!Strings.isNullOrEmpty(entity.getPay_status())) {sql.WHERE("pay_status = #{pay_status}");}

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
	public String selectVwOrderitemOrderByLimt(VwOrderitemOrder entity) {
		SQL sql = new SQL().SELECT("*").FROM("vw_orderitem_order");
					if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getOrder_id())) {sql.WHERE("order_id = #{order_id}");}
			if(!Strings.isNullOrEmpty(entity.getMember_id())) {sql.WHERE("member_id = #{member_id}");}
			if(!Strings.isNullOrEmpty(entity.getProduct_id())) {sql.WHERE("product_id = #{product_id}");}
			if(!Objects.isNull(entity.getMoney())) {sql.WHERE("money = #{money}");}
			if(!Strings.isNullOrEmpty(entity.getEffiect_start_time())) {sql.WHERE("effiect_start_time = #{effiect_start_time}");}
			if(!Strings.isNullOrEmpty(entity.getEffiect_end_time())) {sql.WHERE("effiect_end_time = #{effiect_end_time}");}
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("createtime = #{createtime}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("updatetime = #{updatetime}");}
			if(!Strings.isNullOrEmpty(entity.getProduct_status())) {sql.WHERE("product_status = #{product_status}");}
			if(!Strings.isNullOrEmpty(entity.getStart_time())) {sql.WHERE("start_time = #{start_time}");}
			if(!Strings.isNullOrEmpty(entity.getEnd_time())) {sql.WHERE("end_time = #{end_time}");}
			if(!Strings.isNullOrEmpty(entity.getPay_status())) {sql.WHERE("pay_status = #{pay_status}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectVwOrderitemOrder(VwOrderitemOrder entity) {
		SQL sql = new SQL().SELECT("*").FROM("vw_orderitem_order");
			if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getOrder_id())) {sql.WHERE("order_id = #{order_id}");}
			if(!Strings.isNullOrEmpty(entity.getMember_id())) {sql.WHERE("member_id = #{member_id}");}
			if(!Strings.isNullOrEmpty(entity.getProduct_id())) {sql.WHERE("product_id = #{product_id}");}
			if(!Objects.isNull(entity.getMoney())) {sql.WHERE("money = #{money}");}
			if(!Strings.isNullOrEmpty(entity.getEffiect_start_time())) {sql.WHERE("effiect_start_time = #{effiect_start_time}");}
			if(!Strings.isNullOrEmpty(entity.getEffiect_end_time())) {sql.WHERE("effiect_end_time = #{effiect_end_time}");}
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("createtime = #{createtime}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("updatetime = #{updatetime}");}
			if(!Strings.isNullOrEmpty(entity.getProduct_status())) {sql.WHERE("product_status = #{product_status}");}
			if(!Strings.isNullOrEmpty(entity.getStart_time())) {sql.WHERE("start_time = #{start_time}");}
			if(!Strings.isNullOrEmpty(entity.getEnd_time())) {sql.WHERE("end_time = #{end_time}");}
			if(!Strings.isNullOrEmpty(entity.getPay_status())) {sql.WHERE("pay_status = #{pay_status}");}

		return sql.toString();
	}
	
	public String selectOrderitemListByWebsite(VwWebsiteOrderQryVO req) {
		String sql = "";
		if(req.getLimit() >= 0 && req.getLimitLen() > 0) {
			if(!Strings.isNullOrEmpty(req.getUseStatus())) {
				sql = SysConst.ORDER_LIST_WEBCHAT_SQL + SysConst.ORDER_LIST_WEBCHAT_WHERE + SysConst.ORDER_LIST_WEBCHAT_PAGE;
			}else {
				sql = SysConst.ORDER_LIST_WEBCHAT_SQL + SysConst.ORDER_LIST_WEBCHAT_PAGE;
			}
			return sql;
		}else {
			if(!Strings.isNullOrEmpty(req.getUseStatus())) {
				sql = SysConst.ORDER_LIST_WEBCHAT_SQL + SysConst.ORDER_LIST_WEBCHAT_WHERE;
			}else {
				sql = SysConst.ORDER_LIST_WEBCHAT_SQL;
			}
			return sql;
		}
	}
	public String selectOrderitemListByWebsiteCount(VwWebsiteOrderQryVO req) {
		String sql = "";
		if(!Strings.isNullOrEmpty(req.getUseStatus())) {
			sql = SysConst.ORDER_LIST_WEBCHAT_COUNT_SQL + SysConst.ORDER_LIST_WEBCHAT_WHERE;
		}else {
			sql = SysConst.ORDER_LIST_WEBCHAT_COUNT_SQL;
		}
		return sql;
	}
}
