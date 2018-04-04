package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.PaWorkStatistic;

public interface PaWorkStatisticData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = PaWorkStatisticProvider.class, method = "insertPaWorkStatistic")
	@SelectKey(before=false,keyProperty="id",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertPaWorkStatistic(PaWorkStatistic entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaWorkStatisticProvider.class, method = "selectPaWorkStatisticByCount")
	public int selectPaWorkStatisticByCount(PaWorkStatistic entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = PaWorkStatisticProvider.class, method = "selectPaWorkStatisticByLimt")
	public List<PaWorkStatistic> selectPaWorkStatisticByLimt(PaWorkStatistic entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaWorkStatisticProvider.class, method = "selectPaWorkStatistic")
	public List<PaWorkStatistic> selectPaWorkStatistic(PaWorkStatistic entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = PaWorkStatisticProvider.class, method = "selectOne")
	public PaWorkStatistic selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaWorkStatisticProvider.class, method = "updatePaWorkStatistic")
	public int updatePaWorkStatistic(PaWorkStatistic entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaWorkStatisticProvider.class, method = "updatePaWorkStatisticByNullChk")
	public int updatePaWorkStatisticByNullChk(PaWorkStatistic entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = PaWorkStatisticProvider.class, method = "deletePaWorkStatistic")
	public int deletePaWorkStatistic(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaWorkStatisticProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
