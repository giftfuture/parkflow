package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.ActRuEventSubscr;

public interface ActRuEventSubscrData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = ActRuEventSubscrProvider.class, method = "insertActRuEventSubscr")
	@SelectKey(before=false,keyProperty="ID_",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertActRuEventSubscr(ActRuEventSubscr entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActRuEventSubscrProvider.class, method = "selectActRuEventSubscrByCount")
	public int selectActRuEventSubscrByCount(ActRuEventSubscr entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = ActRuEventSubscrProvider.class, method = "selectActRuEventSubscrByLimt")
	public List<ActRuEventSubscr> selectActRuEventSubscrByLimt(ActRuEventSubscr entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActRuEventSubscrProvider.class, method = "selectActRuEventSubscr")
	public List<ActRuEventSubscr> selectActRuEventSubscr(ActRuEventSubscr entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = ActRuEventSubscrProvider.class, method = "selectOne")
	public ActRuEventSubscr selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActRuEventSubscrProvider.class, method = "updateActRuEventSubscr")
	public int updateActRuEventSubscr(ActRuEventSubscr entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActRuEventSubscrProvider.class, method = "updateActRuEventSubscrByNullChk")
	public int updateActRuEventSubscrByNullChk(ActRuEventSubscr entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = ActRuEventSubscrProvider.class, method = "deleteActRuEventSubscr")
	public int deleteActRuEventSubscr(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActRuEventSubscrProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
