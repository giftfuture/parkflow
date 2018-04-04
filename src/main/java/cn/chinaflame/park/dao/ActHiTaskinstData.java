package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.ActHiTaskinst;

public interface ActHiTaskinstData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = ActHiTaskinstProvider.class, method = "insertActHiTaskinst")
	@SelectKey(before=false,keyProperty="ID_",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertActHiTaskinst(ActHiTaskinst entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActHiTaskinstProvider.class, method = "selectActHiTaskinstByCount")
	public int selectActHiTaskinstByCount(ActHiTaskinst entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = ActHiTaskinstProvider.class, method = "selectActHiTaskinstByLimt")
	public List<ActHiTaskinst> selectActHiTaskinstByLimt(ActHiTaskinst entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActHiTaskinstProvider.class, method = "selectActHiTaskinst")
	public List<ActHiTaskinst> selectActHiTaskinst(ActHiTaskinst entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = ActHiTaskinstProvider.class, method = "selectOne")
	public ActHiTaskinst selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActHiTaskinstProvider.class, method = "updateActHiTaskinst")
	public int updateActHiTaskinst(ActHiTaskinst entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActHiTaskinstProvider.class, method = "updateActHiTaskinstByNullChk")
	public int updateActHiTaskinstByNullChk(ActHiTaskinst entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = ActHiTaskinstProvider.class, method = "deleteActHiTaskinst")
	public int deleteActHiTaskinst(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActHiTaskinstProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
