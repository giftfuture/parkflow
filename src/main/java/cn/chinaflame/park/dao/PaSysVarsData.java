package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.PaSysVars;

public interface PaSysVarsData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = PaSysVarsProvider.class, method = "insertPaSysVars")
	@SelectKey(before=false,keyProperty="varname",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertPaSysVars(PaSysVars entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaSysVarsProvider.class, method = "selectPaSysVarsByCount")
	public int selectPaSysVarsByCount(PaSysVars entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = PaSysVarsProvider.class, method = "selectPaSysVarsByLimt")
	public List<PaSysVars> selectPaSysVarsByLimt(PaSysVars entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaSysVarsProvider.class, method = "selectPaSysVars")
	public List<PaSysVars> selectPaSysVars(PaSysVars entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = PaSysVarsProvider.class, method = "selectOne")
	public PaSysVars selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaSysVarsProvider.class, method = "updatePaSysVars")
	public int updatePaSysVars(PaSysVars entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaSysVarsProvider.class, method = "updatePaSysVarsByNullChk")
	public int updatePaSysVarsByNullChk(PaSysVars entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = PaSysVarsProvider.class, method = "deletePaSysVars")
	public int deletePaSysVars(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaSysVarsProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
