package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.ActIdInfo;

public interface ActIdInfoData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = ActIdInfoProvider.class, method = "insertActIdInfo")
	@SelectKey(before=false,keyProperty="ID_",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertActIdInfo(ActIdInfo entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActIdInfoProvider.class, method = "selectActIdInfoByCount")
	public int selectActIdInfoByCount(ActIdInfo entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = ActIdInfoProvider.class, method = "selectActIdInfoByLimt")
	public List<ActIdInfo> selectActIdInfoByLimt(ActIdInfo entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActIdInfoProvider.class, method = "selectActIdInfo")
	public List<ActIdInfo> selectActIdInfo(ActIdInfo entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = ActIdInfoProvider.class, method = "selectOne")
	public ActIdInfo selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActIdInfoProvider.class, method = "updateActIdInfo")
	public int updateActIdInfo(ActIdInfo entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActIdInfoProvider.class, method = "updateActIdInfoByNullChk")
	public int updateActIdInfoByNullChk(ActIdInfo entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = ActIdInfoProvider.class, method = "deleteActIdInfo")
	public int deleteActIdInfo(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActIdInfoProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
