package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.ActRuTask;

public interface ActRuTaskData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = ActRuTaskProvider.class, method = "insertActRuTask")
	@SelectKey(before=false,keyProperty="ID_",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertActRuTask(ActRuTask entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActRuTaskProvider.class, method = "selectActRuTaskByCount")
	public int selectActRuTaskByCount(ActRuTask entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = ActRuTaskProvider.class, method = "selectActRuTaskByLimt")
	public List<ActRuTask> selectActRuTaskByLimt(ActRuTask entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActRuTaskProvider.class, method = "selectActRuTask")
	public List<ActRuTask> selectActRuTask(ActRuTask entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = ActRuTaskProvider.class, method = "selectOne")
	public ActRuTask selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActRuTaskProvider.class, method = "updateActRuTask")
	public int updateActRuTask(ActRuTask entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActRuTaskProvider.class, method = "updateActRuTaskByNullChk")
	public int updateActRuTaskByNullChk(ActRuTask entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = ActRuTaskProvider.class, method = "deleteActRuTask")
	public int deleteActRuTask(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActRuTaskProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
