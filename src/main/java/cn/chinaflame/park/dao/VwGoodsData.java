package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.CoGoods;
import cn.chinaflame.park.model.VwGoods;

public interface VwGoodsData {
	
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = VwGoodsProvider.class, method = "selectVwGoodsByCount")
	public int selectVwGoodsByCount(VwGoods entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = VwGoodsProvider.class, method = "selectVwGoodsByLimt")
	public List<VwGoods> selectVwGoodsByLimt(VwGoods entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = VwGoodsProvider.class, method = "selectVwGoods")
	public List<VwGoods> selectVwGoods(VwGoods entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = VwGoodsProvider.class, method = "selectOne")
	public VwGoods selectOne(int id);
}
