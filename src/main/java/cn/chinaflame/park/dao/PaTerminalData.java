package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.PaTerminal;

public interface PaTerminalData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = PaTerminalProvider.class, method = "insertPaTerminal")
	@SelectKey(before=false,keyProperty="terminal_id",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertPaTerminal(PaTerminal entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaTerminalProvider.class, method = "selectPaTerminalByCount")
	public int selectPaTerminalByCount(PaTerminal entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = PaTerminalProvider.class, method = "selectPaTerminalByLimt")
	public List<PaTerminal> selectPaTerminalByLimt(PaTerminal entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaTerminalProvider.class, method = "selectPaTerminal")
	public List<PaTerminal> selectPaTerminal(PaTerminal entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = PaTerminalProvider.class, method = "selectOne")
	public PaTerminal selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaTerminalProvider.class, method = "updatePaTerminal")
	public int updatePaTerminal(PaTerminal entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaTerminalProvider.class, method = "updatePaTerminalByNullChk")
	public int updatePaTerminalByNullChk(PaTerminal entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = PaTerminalProvider.class, method = "deletePaTerminal")
	public int deletePaTerminal(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaTerminalProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
