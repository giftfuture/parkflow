package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.ActRuJob;

public interface ActRuJobData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = ActRuJobProvider.class, method = "insertActRuJob")
	@SelectKey(before=false,keyProperty="ID_",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertActRuJob(ActRuJob entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActRuJobProvider.class, method = "selectActRuJobByCount")
	public int selectActRuJobByCount(ActRuJob entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = ActRuJobProvider.class, method = "selectActRuJobByLimt")
	public List<ActRuJob> selectActRuJobByLimt(ActRuJob entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActRuJobProvider.class, method = "selectActRuJob")
	public List<ActRuJob> selectActRuJob(ActRuJob entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = ActRuJobProvider.class, method = "selectOne")
	public ActRuJob selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActRuJobProvider.class, method = "updateActRuJob")
	public int updateActRuJob(ActRuJob entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActRuJobProvider.class, method = "updateActRuJobByNullChk")
	public int updateActRuJobByNullChk(ActRuJob entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = ActRuJobProvider.class, method = "deleteActRuJob")
	public int deleteActRuJob(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActRuJobProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
