package cn.chinaflame.park.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


import cn.chinaflame.park.model.PaMerchant;
import cn.chinaflame.park.model.CoGoods;


/**
 * @author qifan.li
 *
 */
public interface Goods {
	@Select("<script>"
			+ "SELECT * FROM co_goods a  "
			+ "LEFT JOIN pa_goods_type ON a.goods_typeid=pa_goods_type.type_id AND  a.goods_status='1' "
			+ "<if test='pageNo>=0 '> "
			+ "LIMIT #{pageNo}, #{pageSize}  "
			+ "</if>"
			+ "</script>")
	public List<CoGoods> query(@Param("pageNo")int pgn, @Param("pageSize")int size);
	
	@Select("SELECT count(*)/10 FROM co_goods")
	public double queryCount();
	
	/**
	 * 添加商品
	 * @param name
	 * @param price
	 * @param cost
	 * @param creatdate
	 * @param deletedate
	 * @param inventory
	 * @param creator
	 * @param typeid
	 * @param bannerurl
	 * @param detailurl
	 * @param status
	 * @return
	 */
	@Insert("INSERT INTO co_goods (goods_name,goods_price,goods_cost,goods_creatdate,goods_deletedate,"
			+ "goods_inventory,goods_creator,goods_typeid,goods_bannerurl,goods_picurl,goods_detailurl,goods_status,"
			+ "trade_times,trade_points,trade_services,goods_format,goods_discription,"
			+ "goods_material,goods_enclose,goods_weight,goods_size) VALUES"
			+ "(#{name},#{price},#{cost},#{creatdate},#{deletedate},#{inventory},#{creator},#{typeid},#{picurl},#{bannerurl},#{detailurl},#{status})"
			+ "#{tradetimes},#{tradepoints},#{tradeservices},#{goodsformat},#{goodsdiscription},#{goodsmaterial},#{goodsenclose},#{goodsweight},#{goodssize}")
	public int add(@Param("name") String name,@Param("price")String price,@Param("cost")String cost,
				   @Param("creatdate")String creatdate,@Param("deletedate")String deletedate,@Param("inventory")String inventory,
				   @Param("creator")String creator,@Param("typeid")String typeid,@Param("bannerurl") String bannerurl,@Param("picurl") String picurl,
				   @Param("detailurl") String detailurl,@Param("status") String status,@Param("tradetimes") String tradetimes,
				   @Param("tradepoints") String tradepoints,@Param("tradeservices") String tradeservices,
				   @Param("goodsformat") String goodsformat,@Param("goodsdiscription") String goodsdiscription,
				   @Param("goodsmaterial") String goodsmaterial,@Param("goodsenclose") String goodsenclose,
				   @Param("goodsweight") String goodsweight,@Param("goodssize") String goodssize);
	 	 
	/**
	 * 修改商品接口
	 * @param name
	 * @param price
	 * @param cost
	 * @param creatdate
	 * @param deletedate
	 * @param inventory
	 * @param creator
	 * @param typeid
	 * @param bannerurl
	 * @param detailurl
	 * @param status
	 * @return
	 */
	@Update("UPDATE co_goods a set a.goods_name=#{name},a.goods_price=#{price},a.goods_cost=#{cost},"
			+ "a.goods_creatdate=#{creatdate},a.goods_deletedate=#{deletedate}, a.goods_inventory=#{inventory},a.goods_creator=#{creator},"
			+ "a.goods_typeid=#{typeid},a.goods_bannerurl=#{bannerurl},goods_detailurl=#{detailurl},goods_status=#{status}"
			+ "a.goods_picurl=#{picurl},a.trade_times=#{tradetimes},a.trade_points=#{tradepoints},a.trade_services=#{tradeservices},"
			+ "a.goods_format=#{goodsformat},a.goods_discription=#{goodsdiscription},a.goods_material=#{goodsmaterial},"
			+ "a.goods_enclose=#{goodsenclose},a.goods_weight=#{goodsweight},a.goods_size=#{goodssize} where a.goods_id=#{id}")
	public int update(@Param("id") int id,  @Param("name") String name,@Param("price")String price,@Param("cost")String cost,
			   @Param("creatdate")String creatdate,@Param("deletedate")String deletedate,@Param("inventory") String inventory,
			   @Param("creator")String creator,@Param("typeid")String typeid,@Param("bannerurl") String bannerurl,@Param("detailurl") String detailurl,@Param("picurl") String picurl,@Param("status") String status,@Param("tradetimes") String tradetimes,
			   @Param("tradepoints") String tradepoints,@Param("tradeservices") String tradeservices,
			   @Param("goodsformat") String goodsformat,@Param("goodsdiscription") String goodsdiscription,
			   @Param("goodsmaterial") String goodsmaterial,@Param("goodsenclose") String goodsenclose,
			   @Param("goodsweight") String goodsweight,@Param("goodssize") String goodssize );
	
	@Select("SELECT * FROM co_goods a where a.goods_id=#{id}")
	public CoGoods queryById(@Param("id") Integer id);
	
	
	
	@Delete("delete from co_goods where goods_id=#{id}")
	public CoGoods delete(@Param("id") Integer id);

}






