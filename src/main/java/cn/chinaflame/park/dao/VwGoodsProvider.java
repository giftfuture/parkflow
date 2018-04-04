package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.VwGoods;

public class VwGoodsProvider {
	
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectVwGoodsByCount(VwGoods entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("vw_goods");
					if(!Objects.isNull(entity.getGoods_id())) {sql.WHERE("goods_id = #{goods_id}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_name())) {sql.WHERE("goods_name = #{goods_name}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_price())) {
				int a= Integer.parseInt(entity.getGoods_price());
				
				sql.WHERE("goods_price >="+a) ;
			}
			if(!Strings.isNullOrEmpty(entity.getGoods_price_end())){
				int b= Integer.parseInt(entity.getGoods_price_end());
				sql.WHERE("goods_price <= "+b);
			}
			
			
			
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
			if(!Strings.isNullOrEmpty(entity.getType_name())) {sql.WHERE("type_name = #{type_name}");}
			if(!Objects.isNull(entity.getTrade_times())){sql.WHERE("trade_times=#{trade_times}");}
			if(!Strings.isNullOrEmpty(entity.getTrade_points())){sql.WHERE("trade_points=#{trade_points}");}
			if(!Strings.isNullOrEmpty(entity.getTrade_services())){sql.WHERE("trade_services=#{trade_services}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_format())){sql.WHERE("goods_format=#{goods_format}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_discription())){sql.WHERE("goods_discription=#{goods_discription}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_material())){sql.WHERE("goods_material=#{goods_material}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_enclose())){sql.WHERE("goods_enclose=#{goods_enclose}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_weight())){sql.WHERE("goods_weight=#{goods_weight}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_size())){sql.WHERE("goods_size=#{goods_size}");}

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
	public String selectVwGoodsByLimt(VwGoods entity) {
		SQL sql = new SQL().SELECT("*").FROM("vw_goods");
					if(!Objects.isNull(entity.getGoods_id())) {sql.WHERE("goods_id = #{goods_id}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_name())) {sql.WHERE("goods_name = #{goods_name}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_price())) {
				int a= Integer.parseInt(entity.getGoods_price());
				
				sql.WHERE("goods_price >="+a) ;
			}
			if(!Strings.isNullOrEmpty(entity.getGoods_price_end())){
				int b= Integer.parseInt(entity.getGoods_price_end());
				sql.WHERE("goods_price <= "+b);
			}
			
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
			if(!Strings.isNullOrEmpty(entity.getType_name())) {sql.WHERE("type_name = #{type_name}");}
			if(!Objects.isNull(entity.getTrade_times())){sql.WHERE("trade_times=#{trade_times}");}
			if(!Strings.isNullOrEmpty(entity.getTrade_points())){sql.WHERE("trade_points=#{trade_points}");}
			if(!Strings.isNullOrEmpty(entity.getTrade_services())){sql.WHERE("trade_services=#{trade_services}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_format())){sql.WHERE("goods_format=#{goods_format}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_discription())){sql.WHERE("goods_discription=#{goods_discription}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_material())){sql.WHERE("goods_material=#{goods_material}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_enclose())){sql.WHERE("goods_enclose=#{goods_enclose}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_weight())){sql.WHERE("goods_weight=#{goods_weight}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_size())){sql.WHERE("goods_size=#{goods_size}");}
			System.out.println(sql);
		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectVwGoods(VwGoods entity) {
		SQL sql = new SQL().SELECT("*").FROM("vw_goods");
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
			if(!Strings.isNullOrEmpty(entity.getType_name())) {sql.WHERE("type_name = #{type_name}");}
			if(!Objects.isNull(entity.getTrade_times())){sql.WHERE("trade_times=#{trade_times}");}
			if(!Strings.isNullOrEmpty(entity.getTrade_points())){sql.WHERE("trade_points=#{trade_points}");}
			if(!Strings.isNullOrEmpty(entity.getTrade_services())){sql.WHERE("trade_services=#{trade_services}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_format())){sql.WHERE("goods_format=#{goods_format}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_discription())){sql.WHERE("goods_discription=#{goods_discription}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_material())){sql.WHERE("goods_material=#{goods_material}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_enclose())){sql.WHERE("goods_enclose=#{goods_enclose}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_weight())){sql.WHERE("goods_weight=#{goods_weight}");}
			if(!Strings.isNullOrEmpty(entity.getGoods_size())){sql.WHERE("goods_size=#{goods_size}");}

		return sql.toString();
	}
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	public String selectOne(int id) {
		SQL sql = new SQL().SELECT("*").FROM("vw_goods");
		sql.WHERE("goods_id="+id);
		return sql.toString();
	}
}
