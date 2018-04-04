package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.PaTicketPlan;

public interface PaTicketPlanData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = PaTicketPlanProvider.class, method = "insertPaTicketPlan")
	@SelectKey(before=false,keyProperty="id",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertPaTicketPlan(PaTicketPlan entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaTicketPlanProvider.class, method = "selectPaTicketPlanByCount")
	public int selectPaTicketPlanByCount(PaTicketPlan entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = PaTicketPlanProvider.class, method = "selectPaTicketPlanByLimt")
	public List<PaTicketPlan> selectPaTicketPlanByLimt(PaTicketPlan entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaTicketPlanProvider.class, method = "selectPaTicketPlan")
	public List<PaTicketPlan> selectPaTicketPlan(PaTicketPlan entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = PaTicketPlanProvider.class, method = "selectOne")
	public PaTicketPlan selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaTicketPlanProvider.class, method = "updatePaTicketPlan")
	public int updatePaTicketPlan(PaTicketPlan entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaTicketPlanProvider.class, method = "updatePaTicketPlanByNullChk")
	public int updatePaTicketPlanByNullChk(PaTicketPlan entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = PaTicketPlanProvider.class, method = "deletePaTicketPlan")
	public int deletePaTicketPlan(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaTicketPlanProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
