package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.ActReDeployment;

public interface ActReDeploymentData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = ActReDeploymentProvider.class, method = "insertActReDeployment")
	@SelectKey(before=false,keyProperty="ID_",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertActReDeployment(ActReDeployment entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActReDeploymentProvider.class, method = "selectActReDeploymentByCount")
	public int selectActReDeploymentByCount(ActReDeployment entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = ActReDeploymentProvider.class, method = "selectActReDeploymentByLimt")
	public List<ActReDeployment> selectActReDeploymentByLimt(ActReDeployment entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActReDeploymentProvider.class, method = "selectActReDeployment")
	public List<ActReDeployment> selectActReDeployment(ActReDeployment entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = ActReDeploymentProvider.class, method = "selectOne")
	public ActReDeployment selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActReDeploymentProvider.class, method = "updateActReDeployment")
	public int updateActReDeployment(ActReDeployment entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActReDeploymentProvider.class, method = "updateActReDeploymentByNullChk")
	public int updateActReDeploymentByNullChk(ActReDeployment entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = ActReDeploymentProvider.class, method = "deleteActReDeployment")
	public int deleteActReDeployment(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActReDeploymentProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
