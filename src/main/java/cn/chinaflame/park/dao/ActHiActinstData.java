package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.ActHiActinst;

public interface ActHiActinstData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = ActHiActinstProvider.class, method = "insertActHiActinst")
	@SelectKey(before=false,keyProperty="ID_",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertActHiActinst(ActHiActinst entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActHiActinstProvider.class, method = "selectActHiActinstByCount")
	public int selectActHiActinstByCount(ActHiActinst entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = ActHiActinstProvider.class, method = "selectActHiActinstByLimt")
	public List<ActHiActinst> selectActHiActinstByLimt(ActHiActinst entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActHiActinstProvider.class, method = "selectActHiActinst")
	public List<ActHiActinst> selectActHiActinst(ActHiActinst entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = ActHiActinstProvider.class, method = "selectOne")
	public ActHiActinst selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActHiActinstProvider.class, method = "updateActHiActinst")
	public int updateActHiActinst(ActHiActinst entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActHiActinstProvider.class, method = "updateActHiActinstByNullChk")
	public int updateActHiActinstByNullChk(ActHiActinst entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = ActHiActinstProvider.class, method = "deleteActHiActinst")
	public int deleteActHiActinst(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActHiActinstProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
