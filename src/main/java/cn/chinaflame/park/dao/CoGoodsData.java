package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.CoGoods;

public interface CoGoodsData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = CoGoodsProvider.class, method = "insertCoGoods")
	//@SelectKey(before=false,keyProperty="id",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertCoGoods(CoGoods entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = CoGoodsProvider.class, method = "selectCoGoodsByCount")
	public int selectCoGoodsByCount(CoGoods entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = CoGoodsProvider.class, method = "selectCoGoodsByLimt")
	public List<CoGoods> selectCoGoodsByLimt(CoGoods entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = CoGoodsProvider.class, method = "selectCoGoods")
	public List<CoGoods> selectCoGoods(CoGoods entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = CoGoodsProvider.class, method = "selectOne")
	public CoGoods selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = CoGoodsProvider.class, method = "updateCoGoods")
	public int updateCoGoods(CoGoods entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = CoGoodsProvider.class, method = "updateCoGoodsByNullChk")
	public int updateCoGoodsByNullChk(CoGoods entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = CoGoodsProvider.class, method = "deleteCoGoods")
	public int deleteCoGoods(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = CoGoodsProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
