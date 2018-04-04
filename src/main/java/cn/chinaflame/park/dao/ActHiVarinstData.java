package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.ActHiVarinst;

public interface ActHiVarinstData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = ActHiVarinstProvider.class, method = "insertActHiVarinst")
	@SelectKey(before=false,keyProperty="ID_",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertActHiVarinst(ActHiVarinst entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActHiVarinstProvider.class, method = "selectActHiVarinstByCount")
	public int selectActHiVarinstByCount(ActHiVarinst entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = ActHiVarinstProvider.class, method = "selectActHiVarinstByLimt")
	public List<ActHiVarinst> selectActHiVarinstByLimt(ActHiVarinst entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActHiVarinstProvider.class, method = "selectActHiVarinst")
	public List<ActHiVarinst> selectActHiVarinst(ActHiVarinst entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = ActHiVarinstProvider.class, method = "selectOne")
	public ActHiVarinst selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActHiVarinstProvider.class, method = "updateActHiVarinst")
	public int updateActHiVarinst(ActHiVarinst entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActHiVarinstProvider.class, method = "updateActHiVarinstByNullChk")
	public int updateActHiVarinstByNullChk(ActHiVarinst entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = ActHiVarinstProvider.class, method = "deleteActHiVarinst")
	public int deleteActHiVarinst(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActHiVarinstProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
