package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.ActRuExecution;

public interface ActRuExecutionData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = ActRuExecutionProvider.class, method = "insertActRuExecution")
	@SelectKey(before=false,keyProperty="ID_",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertActRuExecution(ActRuExecution entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActRuExecutionProvider.class, method = "selectActRuExecutionByCount")
	public int selectActRuExecutionByCount(ActRuExecution entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = ActRuExecutionProvider.class, method = "selectActRuExecutionByLimt")
	public List<ActRuExecution> selectActRuExecutionByLimt(ActRuExecution entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActRuExecutionProvider.class, method = "selectActRuExecution")
	public List<ActRuExecution> selectActRuExecution(ActRuExecution entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = ActRuExecutionProvider.class, method = "selectOne")
	public ActRuExecution selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActRuExecutionProvider.class, method = "updateActRuExecution")
	public int updateActRuExecution(ActRuExecution entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActRuExecutionProvider.class, method = "updateActRuExecutionByNullChk")
	public int updateActRuExecutionByNullChk(ActRuExecution entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = ActRuExecutionProvider.class, method = "deleteActRuExecution")
	public int deleteActRuExecution(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActRuExecutionProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
