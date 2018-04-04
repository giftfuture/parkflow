package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.ActProcdefInfo;

public interface ActProcdefInfoData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = ActProcdefInfoProvider.class, method = "insertActProcdefInfo")
	@SelectKey(before=false,keyProperty="ID_",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertActProcdefInfo(ActProcdefInfo entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActProcdefInfoProvider.class, method = "selectActProcdefInfoByCount")
	public int selectActProcdefInfoByCount(ActProcdefInfo entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = ActProcdefInfoProvider.class, method = "selectActProcdefInfoByLimt")
	public List<ActProcdefInfo> selectActProcdefInfoByLimt(ActProcdefInfo entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActProcdefInfoProvider.class, method = "selectActProcdefInfo")
	public List<ActProcdefInfo> selectActProcdefInfo(ActProcdefInfo entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = ActProcdefInfoProvider.class, method = "selectOne")
	public ActProcdefInfo selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActProcdefInfoProvider.class, method = "updateActProcdefInfo")
	public int updateActProcdefInfo(ActProcdefInfo entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActProcdefInfoProvider.class, method = "updateActProcdefInfoByNullChk")
	public int updateActProcdefInfoByNullChk(ActProcdefInfo entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = ActProcdefInfoProvider.class, method = "deleteActProcdefInfo")
	public int deleteActProcdefInfo(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActProcdefInfoProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
