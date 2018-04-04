package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.ActRuVariable;

public interface ActRuVariableData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = ActRuVariableProvider.class, method = "insertActRuVariable")
	@SelectKey(before=false,keyProperty="ID_",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertActRuVariable(ActRuVariable entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActRuVariableProvider.class, method = "selectActRuVariableByCount")
	public int selectActRuVariableByCount(ActRuVariable entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = ActRuVariableProvider.class, method = "selectActRuVariableByLimt")
	public List<ActRuVariable> selectActRuVariableByLimt(ActRuVariable entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActRuVariableProvider.class, method = "selectActRuVariable")
	public List<ActRuVariable> selectActRuVariable(ActRuVariable entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = ActRuVariableProvider.class, method = "selectOne")
	public ActRuVariable selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActRuVariableProvider.class, method = "updateActRuVariable")
	public int updateActRuVariable(ActRuVariable entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActRuVariableProvider.class, method = "updateActRuVariableByNullChk")
	public int updateActRuVariableByNullChk(ActRuVariable entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = ActRuVariableProvider.class, method = "deleteActRuVariable")
	public int deleteActRuVariable(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActRuVariableProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
