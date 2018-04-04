package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.ActIdUser;

public interface ActIdUserData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = ActIdUserProvider.class, method = "insertActIdUser")
	@SelectKey(before=false,keyProperty="ID_",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertActIdUser(ActIdUser entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActIdUserProvider.class, method = "selectActIdUserByCount")
	public int selectActIdUserByCount(ActIdUser entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = ActIdUserProvider.class, method = "selectActIdUserByLimt")
	public List<ActIdUser> selectActIdUserByLimt(ActIdUser entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActIdUserProvider.class, method = "selectActIdUser")
	public List<ActIdUser> selectActIdUser(ActIdUser entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = ActIdUserProvider.class, method = "selectOne")
	public ActIdUser selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActIdUserProvider.class, method = "updateActIdUser")
	public int updateActIdUser(ActIdUser entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActIdUserProvider.class, method = "updateActIdUserByNullChk")
	public int updateActIdUserByNullChk(ActIdUser entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = ActIdUserProvider.class, method = "deleteActIdUser")
	public int deleteActIdUser(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActIdUserProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
