package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.PaSysRole;
import cn.chinaflame.park.vo.PaSysRoleVO;
public interface PaSysRoleData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = PaSysRoleProvider.class, method = "insertPaSysRole")
	@SelectKey(before=false,keyProperty="id",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertPaSysRole(PaSysRole entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaSysRoleProvider.class, method = "selectPaSysRoleByCount")
	public int selectPaSysRoleByCount(PaSysRole entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = PaSysRoleProvider.class, method = "selectPaSysRoleByLimt")
	public List<PaSysRoleVO> selectPaSysRoleByLimt(PaSysRole entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaSysRoleProvider.class, method = "selectPaSysRole")
	public List<PaSysRoleVO> selectPaSysRole(PaSysRole entity);
	
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaSysRoleProvider.class, method = "searchPaSysRole")
	public List<PaSysRoleVO> searchPaSysRole(PaSysRole entity);
	
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = PaSysRoleProvider.class, method = "selectOne")
	public PaSysRole selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaSysRoleProvider.class, method = "updatePaSysRole")
	public int updatePaSysRole(PaSysRole entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaSysRoleProvider.class, method = "updatePaSysRoleByNullChk")
	public int updatePaSysRoleByNullChk(PaSysRole entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = PaSysRoleProvider.class, method = "deletePaSysRole")
	public int deletePaSysRole(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaSysRoleProvider.class, method = "deleteByLogic")
	public int deleteByLogic(long id);
}
