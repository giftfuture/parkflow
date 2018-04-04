package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.ActReModel;

public interface ActReModelData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = ActReModelProvider.class, method = "insertActReModel")
	@SelectKey(before=false,keyProperty="ID_",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertActReModel(ActReModel entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActReModelProvider.class, method = "selectActReModelByCount")
	public int selectActReModelByCount(ActReModel entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = ActReModelProvider.class, method = "selectActReModelByLimt")
	public List<ActReModel> selectActReModelByLimt(ActReModel entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActReModelProvider.class, method = "selectActReModel")
	public List<ActReModel> selectActReModel(ActReModel entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = ActReModelProvider.class, method = "selectOne")
	public ActReModel selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActReModelProvider.class, method = "updateActReModel")
	public int updateActReModel(ActReModel entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActReModelProvider.class, method = "updateActReModelByNullChk")
	public int updateActReModelByNullChk(ActReModel entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = ActReModelProvider.class, method = "deleteActReModel")
	public int deleteActReModel(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActReModelProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
