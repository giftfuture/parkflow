package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.ActHiProcinst;

public interface ActHiProcinstData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = ActHiProcinstProvider.class, method = "insertActHiProcinst")
	@SelectKey(before=false,keyProperty="ID_",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertActHiProcinst(ActHiProcinst entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActHiProcinstProvider.class, method = "selectActHiProcinstByCount")
	public int selectActHiProcinstByCount(ActHiProcinst entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = ActHiProcinstProvider.class, method = "selectActHiProcinstByLimt")
	public List<ActHiProcinst> selectActHiProcinstByLimt(ActHiProcinst entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActHiProcinstProvider.class, method = "selectActHiProcinst")
	public List<ActHiProcinst> selectActHiProcinst(ActHiProcinst entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = ActHiProcinstProvider.class, method = "selectOne")
	public ActHiProcinst selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActHiProcinstProvider.class, method = "updateActHiProcinst")
	public int updateActHiProcinst(ActHiProcinst entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActHiProcinstProvider.class, method = "updateActHiProcinstByNullChk")
	public int updateActHiProcinstByNullChk(ActHiProcinst entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = ActHiProcinstProvider.class, method = "deleteActHiProcinst")
	public int deleteActHiProcinst(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActHiProcinstProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
