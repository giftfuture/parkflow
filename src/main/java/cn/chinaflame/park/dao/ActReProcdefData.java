package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.ActReProcdef;

public interface ActReProcdefData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = ActReProcdefProvider.class, method = "insertActReProcdef")
	@SelectKey(before=false,keyProperty="ID_",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertActReProcdef(ActReProcdef entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActReProcdefProvider.class, method = "selectActReProcdefByCount")
	public int selectActReProcdefByCount(ActReProcdef entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = ActReProcdefProvider.class, method = "selectActReProcdefByLimt")
	public List<ActReProcdef> selectActReProcdefByLimt(ActReProcdef entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActReProcdefProvider.class, method = "selectActReProcdef")
	public List<ActReProcdef> selectActReProcdef(ActReProcdef entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = ActReProcdefProvider.class, method = "selectOne")
	public ActReProcdef selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActReProcdefProvider.class, method = "updateActReProcdef")
	public int updateActReProcdef(ActReProcdef entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActReProcdefProvider.class, method = "updateActReProcdefByNullChk")
	public int updateActReProcdefByNullChk(ActReProcdef entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = ActReProcdefProvider.class, method = "deleteActReProcdef")
	public int deleteActReProcdef(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActReProcdefProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
