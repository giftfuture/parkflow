package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.PaGoodsType;

public interface PaGoodsTypeData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = PaGoodsTypeProvider.class, method = "insertPaGoodsType")
	//@SelectKey(before=false,keyProperty="id",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertPaGoodsType(PaGoodsType entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaGoodsTypeProvider.class, method = "selectPaGoodsTypeByCount")
	public int selectPaGoodsTypeByCount(PaGoodsType entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = PaGoodsTypeProvider.class, method = "selectPaGoodsTypeByLimt")
	public List<PaGoodsType> selectPaGoodsTypeByLimt(PaGoodsType entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaGoodsTypeProvider.class, method = "selectPaGoodsType")
	public List<PaGoodsType> selectPaGoodsType(PaGoodsType entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = PaGoodsTypeProvider.class, method = "selectOne")
	public PaGoodsType selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaGoodsTypeProvider.class, method = "updatePaGoodsType")
	public int updatePaGoodsType(PaGoodsType entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaGoodsTypeProvider.class, method = "updatePaGoodsTypeByNullChk")
	public int updatePaGoodsTypeByNullChk(PaGoodsType entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = PaGoodsTypeProvider.class, method = "deletePaGoodsType")
	public int deletePaGoodsType(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaGoodsTypeProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
