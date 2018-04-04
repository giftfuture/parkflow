package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.ActIdGroup;

public interface ActIdGroupData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = ActIdGroupProvider.class, method = "insertActIdGroup")
	@SelectKey(before=false,keyProperty="ID_",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertActIdGroup(ActIdGroup entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActIdGroupProvider.class, method = "selectActIdGroupByCount")
	public int selectActIdGroupByCount(ActIdGroup entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = ActIdGroupProvider.class, method = "selectActIdGroupByLimt")
	public List<ActIdGroup> selectActIdGroupByLimt(ActIdGroup entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActIdGroupProvider.class, method = "selectActIdGroup")
	public List<ActIdGroup> selectActIdGroup(ActIdGroup entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = ActIdGroupProvider.class, method = "selectOne")
	public ActIdGroup selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActIdGroupProvider.class, method = "updateActIdGroup")
	public int updateActIdGroup(ActIdGroup entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActIdGroupProvider.class, method = "updateActIdGroupByNullChk")
	public int updateActIdGroupByNullChk(ActIdGroup entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = ActIdGroupProvider.class, method = "deleteActIdGroup")
	public int deleteActIdGroup(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActIdGroupProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
