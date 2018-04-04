package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.PaTicketThrough;

public interface PaTicketThroughData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = PaTicketThroughProvider.class, method = "insertPaTicketThrough")
	@SelectKey(before=false,keyProperty="id",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertPaTicketThrough(PaTicketThrough entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaTicketThroughProvider.class, method = "selectPaTicketThroughByCount")
	public int selectPaTicketThroughByCount(PaTicketThrough entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = PaTicketThroughProvider.class, method = "selectPaTicketThroughByLimt")
	public List<PaTicketThrough> selectPaTicketThroughByLimt(PaTicketThrough entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaTicketThroughProvider.class, method = "selectPaTicketThrough")
	public List<PaTicketThrough> selectPaTicketThrough(PaTicketThrough entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = PaTicketThroughProvider.class, method = "selectOne")
	public PaTicketThrough selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaTicketThroughProvider.class, method = "updatePaTicketThrough")
	public int updatePaTicketThrough(PaTicketThrough entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaTicketThroughProvider.class, method = "updatePaTicketThroughByNullChk")
	public int updatePaTicketThroughByNullChk(PaTicketThrough entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = PaTicketThroughProvider.class, method = "deletePaTicketThrough")
	public int deletePaTicketThrough(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaTicketThroughProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
