package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.ActHiDetail;

public interface ActHiDetailData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = ActHiDetailProvider.class, method = "insertActHiDetail")
	@SelectKey(before=false,keyProperty="ID_",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertActHiDetail(ActHiDetail entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActHiDetailProvider.class, method = "selectActHiDetailByCount")
	public int selectActHiDetailByCount(ActHiDetail entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = ActHiDetailProvider.class, method = "selectActHiDetailByLimt")
	public List<ActHiDetail> selectActHiDetailByLimt(ActHiDetail entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActHiDetailProvider.class, method = "selectActHiDetail")
	public List<ActHiDetail> selectActHiDetail(ActHiDetail entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = ActHiDetailProvider.class, method = "selectOne")
	public ActHiDetail selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActHiDetailProvider.class, method = "updateActHiDetail")
	public int updateActHiDetail(ActHiDetail entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActHiDetailProvider.class, method = "updateActHiDetailByNullChk")
	public int updateActHiDetailByNullChk(ActHiDetail entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = ActHiDetailProvider.class, method = "deleteActHiDetail")
	public int deleteActHiDetail(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActHiDetailProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
