package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.PaTicketTeam;

public interface PaTicketTeamData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = PaTicketTeamProvider.class, method = "insertPaTicketTeam")
	@SelectKey(before=false,keyProperty="id",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertPaTicketTeam(PaTicketTeam entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaTicketTeamProvider.class, method = "selectPaTicketTeamByCount")
	public int selectPaTicketTeamByCount(PaTicketTeam entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = PaTicketTeamProvider.class, method = "selectPaTicketTeamByLimt")
	public List<PaTicketTeam> selectPaTicketTeamByLimt(PaTicketTeam entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaTicketTeamProvider.class, method = "selectPaTicketTeam")
	public List<PaTicketTeam> selectPaTicketTeam(PaTicketTeam entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = PaTicketTeamProvider.class, method = "selectOne")
	public PaTicketTeam selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaTicketTeamProvider.class, method = "updatePaTicketTeam")
	public int updatePaTicketTeam(PaTicketTeam entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaTicketTeamProvider.class, method = "updatePaTicketTeamByNullChk")
	public int updatePaTicketTeamByNullChk(PaTicketTeam entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = PaTicketTeamProvider.class, method = "deletePaTicketTeam")
	public int deletePaTicketTeam(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaTicketTeamProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
