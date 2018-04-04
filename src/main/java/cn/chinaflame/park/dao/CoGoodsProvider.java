package cn.chinaflame.park.dao;

import java.util.Objects;

import org.apache.ibatis.jdbc.SQL;

import com.google.common.base.Strings;

import cn.chinaflame.park.model.CoGoods;

/**
 * 
 * provider
 */
public class CoGoodsProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertCoGoods(CoGoods entity) {
		SQL sql = new SQL().INSERT_INTO("co_goods");
		sql.VALUES("goods_name,goods_price,goods_cost,goods_creatdate,goods_deletedate,goods_inventory,goods_creator,goods_typeid,goods_bannerurl,goods_picurl,goods_detailurl,goods_status,updatetime,createtime", "#{goods_name},#{goods_price},#{goods_cost},#{goods_creatdate},#{goods_deletedate},#{goods_inventory},#{goods_creator},#{goods_typeid},#{goods_bannerurl},#{goods_picurl},#{goods_detailurl},'1',#{updatetime},#{createtime}");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectCoGoodsByCount(CoGoods entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("co_goods");
					if(!Objects.isNull(entity.getGoods_id())) {sql.WHERE("goods_id = #{goods_id}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_name())) {sql.WHERE("goods_name = #{goods_name}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_price())) {sql.WHERE("goods_price = #{goods_price}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_cost())) {sql.WHERE("goods_cost = #{goods_cost}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_creatdate())) {sql.WHERE("goods_creatdate = #{goods_creatdate}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_deletedate())) {sql.WHERE("goods_deletedate = #{goods_deletedate}");}
			if(!Objects.isNull(entity.getGoods_inventory())) {sql.WHERE("goods_inventory = #{goods_inventory}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_creator())) {sql.WHERE("goods_creator = #{goods_creator}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_typeid())) {sql.WHERE("goods_typeid = #{goods_typeid}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_bannerurl())) {sql.WHERE("goods_bannerurl = #{goods_bannerurl}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_picurl())) {sql.WHERE("goods_picurl = #{goods_picurl}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_detailurl())) {sql.WHERE("goods_detailurl = #{goods_detailurl}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_status())) {sql.WHERE("goods_status = #{goods_status}");}
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
	public String selectCoGoodsByLimt(CoGoods entity) {
		SQL sql = new SQL().SELECT("*").FROM("co_goods");
			if(!Objects.isNull(entity.getGoods_id())) {sql.WHERE("goods_id = #{goods_id}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_name())) {sql.WHERE("goods_name = #{goods_name}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_price())) {sql.WHERE("goods_price = #{goods_price}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_cost())) {sql.WHERE("goods_cost = #{goods_cost}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_creatdate())) {sql.WHERE("goods_creatdate = #{goods_creatdate}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_deletedate())) {sql.WHERE("goods_deletedate = #{goods_deletedate}");}
			if(!Objects.isNull(entity.getGoods_inventory())) {sql.WHERE("goods_inventory = #{goods_inventory}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_creator())) {sql.WHERE("goods_creator = #{goods_creator}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_typeid())) {sql.WHERE("goods_typeid = #{goods_typeid}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_bannerurl())) {sql.WHERE("goods_bannerurl = #{goods_bannerurl}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_picurl())) {sql.WHERE("goods_picurl = #{goods_picurl}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_detailurl())) {sql.WHERE("goods_detailurl = #{goods_detailurl}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_status())) {sql.WHERE("goods_status = #{goods_status}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("updatetime = #{updatetime}");}
			String sqlaa= sql.toString() + " order by " + entity.getGoods_id() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
			System.out.println(sqlaa);
		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectCoGoods(CoGoods entity) {
		SQL sql = new SQL().SELECT("*").FROM("co_goods");
			if(!Objects.isNull(entity.getGoods_id())) {sql.WHERE("goods_id = #{goods_id}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_name())) {sql.WHERE("goods_name = #{goods_name}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_price())) {sql.WHERE("goods_price = #{goods_price}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_cost())) {sql.WHERE("goods_cost = #{goods_cost}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_creatdate())) {sql.WHERE("goods_creatdate = #{goods_creatdate}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_deletedate())) {sql.WHERE("goods_deletedate = #{goods_deletedate}");}
			if(!Objects.isNull(entity.getGoods_inventory())) {sql.WHERE("goods_inventory = #{goods_inventory}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_creator())) {sql.WHERE("goods_creator = #{goods_creator}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_typeid())) {sql.WHERE("goods_typeid = #{goods_typeid}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_bannerurl())) {sql.WHERE("goods_bannerurl = #{goods_bannerurl}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_picurl())) {sql.WHERE("goods_picurl = #{goods_picurl}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_detailurl())) {sql.WHERE("goods_detailurl = #{goods_detailurl}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_status())) {sql.WHERE("goods_status = #{goods_status}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("updatetime = #{updatetime}");}

		return sql.toString();
	}
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	public String selectOne(int id) {
		SQL sql = new SQL().SELECT("*").FROM("co_goods");
		sql.WHERE("goods_id="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updateCoGoods(CoGoods entity) {
		SQL sql = new SQL().UPDATE("co_goods");
				sql.SET("goods_name = #{goods_name}");
		sql.SET("goods_price = #{goods_price}");
		sql.SET("goods_cost = #{goods_cost}");
		sql.SET("goods_creatdate = #{goods_creatdate}");
		sql.SET("goods_deletedate = #{goods_deletedate}");
		sql.SET("goods_inventory = #{goods_inventory}");
		sql.SET("goods_creator = #{goods_creator}");
		sql.SET("goods_typeid = #{goods_typeid}");
		sql.SET("goods_bannerurl = #{goods_bannerurl}");
		sql.SET("goods_picurl = #{goods_picurl}");
		sql.SET("goods_detailurl = #{goods_detailurl}");
		sql.SET("goods_status = #{goods_status}");
		sql.SET("updatetime = #{updatetime}");

		sql.WHERE("goods_id = #{goods_id}");
		return sql.toString();
	}
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public String updateCoGoodsByNullChk(CoGoods entity) {
		SQL sql = new SQL().UPDATE("co_goods");
					if(!Strings.isNullOrEmpty(entity.getGoods_name())) {sql.SET("goods_name = #{goods_name}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_price())) {sql.SET("goods_price = #{goods_price}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_cost())) {sql.SET("goods_cost = #{goods_cost}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_creatdate())) {sql.SET("goods_creatdate = #{goods_creatdate}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_deletedate())) {sql.SET("goods_deletedate = #{goods_deletedate}");}
			if(!Objects.isNull(entity.getGoods_inventory())) {sql.SET("goods_inventory = #{goods_inventory}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_creator())) {sql.SET("goods_creator = #{goods_creator}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_typeid())) {sql.SET("goods_typeid = #{goods_typeid}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_bannerurl())) {sql.SET("goods_bannerurl = #{goods_bannerurl}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_picurl())) {sql.WHERE("goods_picurl = #{goods_picurl}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_detailurl())) {sql.SET("goods_detailurl = #{goods_detailurl}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_status())) {sql.SET("goods_status = #{goods_status}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.SET("updatetime = #{updatetime}");}

		sql.WHERE("goods_id = #{goods_id}");
		return sql.toString();
	}
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public String deleteCoGoods(int id) {
		SQL sql = new SQL().DELETE_FROM("co_goods");
		sql.WHERE("goods_id = #{goods_id}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(int id) {
		SQL sql = new SQL().UPDATE("co_goods");
		sql.SET("state=1");
		sql.WHERE("goods_id = #{goods_id}");
		return sql.toString();
	}
}
