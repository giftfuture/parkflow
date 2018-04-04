package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.PaTicketOrdinary;

public interface PaTicketOrdinaryData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = PaTicketOrdinaryProvider.class, method = "insertPaTicketOrdinary")
	@SelectKey(before=false,keyProperty="id",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertPaTicketOrdinary(PaTicketOrdinary entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaTicketOrdinaryProvider.class, method = "selectPaTicketOrdinaryByCount")
	public int selectPaTicketOrdinaryByCount(PaTicketOrdinary entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = PaTicketOrdinaryProvider.class, method = "selectPaTicketOrdinaryByLimt")
	public List<PaTicketOrdinary> selectPaTicketOrdinaryByLimt(PaTicketOrdinary entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaTicketOrdinaryProvider.class, method = "selectPaTicketOrdinary")
	public List<PaTicketOrdinary> selectPaTicketOrdinary(PaTicketOrdinary entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = PaTicketOrdinaryProvider.class, method = "selectOne")
	public PaTicketOrdinary selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaTicketOrdinaryProvider.class, method = "updatePaTicketOrdinary")
	public int updatePaTicketOrdinary(PaTicketOrdinary entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaTicketOrdinaryProvider.class, method = "updatePaTicketOrdinaryByNullChk")
	public int updatePaTicketOrdinaryByNullChk(PaTicketOrdinary entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = PaTicketOrdinaryProvider.class, method = "deletePaTicketOrdinary")
	public int deletePaTicketOrdinary(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaTicketOrdinaryProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
