package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.ActEvtLog;

public interface ActEvtLogData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = ActEvtLogProvider.class, method = "insertActEvtLog")
	@SelectKey(before=false,keyProperty="LOG_NR_",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertActEvtLog(ActEvtLog entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActEvtLogProvider.class, method = "selectActEvtLogByCount")
	public int selectActEvtLogByCount(ActEvtLog entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = ActEvtLogProvider.class, method = "selectActEvtLogByLimt")
	public List<ActEvtLog> selectActEvtLogByLimt(ActEvtLog entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActEvtLogProvider.class, method = "selectActEvtLog")
	public List<ActEvtLog> selectActEvtLog(ActEvtLog entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = ActEvtLogProvider.class, method = "selectOne")
	public ActEvtLog selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActEvtLogProvider.class, method = "updateActEvtLog")
	public int updateActEvtLog(ActEvtLog entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActEvtLogProvider.class, method = "updateActEvtLogByNullChk")
	public int updateActEvtLogByNullChk(ActEvtLog entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = ActEvtLogProvider.class, method = "deleteActEvtLog")
	public int deleteActEvtLog(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActEvtLogProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
