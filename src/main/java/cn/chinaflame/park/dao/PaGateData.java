package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.PaGate;

public interface PaGateData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = PaGateProvider.class, method = "insertPaGate")
	@SelectKey(before=false,keyProperty="gate_id",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertPaGate(PaGate entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaGateProvider.class, method = "selectPaGateByCount")
	public int selectPaGateByCount(PaGate entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = PaGateProvider.class, method = "selectPaGateByLimt")
	public List<PaGate> selectPaGateByLimt(PaGate entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaGateProvider.class, method = "selectPaGate")
	public List<PaGate> selectPaGate(PaGate entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = PaGateProvider.class, method = "selectOne")
	public PaGate selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaGateProvider.class, method = "updatePaGate")
	public int updatePaGate(PaGate entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaGateProvider.class, method = "updatePaGateByNullChk")
	public int updatePaGateByNullChk(PaGate entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = PaGateProvider.class, method = "deletePaGate")
	public int deletePaGate(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaGateProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
	
	@Select("select func_check_gate(#{id},#{gate_ip},#{type}) from DUAL")
	@Options(statementType = StatementType.CALLABLE)
	public String check_gate(@Param("id") String id, @Param("gate_ip") String gate_ip, @Param("type") String type);
}
