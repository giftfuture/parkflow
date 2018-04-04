package cn.chinaflame.park.service;

import java.util.List;

import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.dao.PaSysRoleProvider;
import cn.chinaflame.park.model.PaSysRole;
import cn.chinaflame.park.vo.PaSysRoleVO;

public interface PaSysRoleService {

	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public int insertPaSysRole(PaSysRole entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public int selectPaSysRoleByCount(PaSysRole entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	public List<PaSysRoleVO> selectPaSysRoleByLimt(PaSysRole entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public List<PaSysRoleVO> selectPaSysRole(PaSysRole entity);
	
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public List<PaSysRoleVO> searchPaSysRole(PaSysRole entity);
	
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	public PaSysRole selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public int updatePaSysRole(PaSysRole entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public int updatePaSysRoleByNullChk(PaSysRole entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public int deletePaSysRole(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public int deleteByLogic(long id);

}
