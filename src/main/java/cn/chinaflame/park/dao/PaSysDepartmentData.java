package cn.chinaflame.park.dao;

import java.util.List;

import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.PaSysDepartment;
import cn.chinaflame.park.vo.PaSysDepartmentVO;

public interface PaSysDepartmentData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = PaSysDepartmentProvider.class, method = "insertPaSysDepartment")
	@SelectKey(before=false,keyProperty="id",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertPaSysDepartment(PaSysDepartment entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaSysDepartmentProvider.class, method = "selectPaSysDepartmentByCount")
	public int selectPaSysDepartmentByCount(PaSysDepartment entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = PaSysDepartmentProvider.class, method = "selectPaSysDepartmentByLimt")
	public List<PaSysDepartment> selectPaSysDepartmentByLimt(PaSysDepartment entity);
	
	
	/**
	 * 按父级查询所有子节点
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaSysDepartmentProvider.class, method = "selectPaSysDepartmentBySuper")
	public List<PaSysDepartmentVO> selectPaSysDepartmentBySuper(long pid);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaSysDepartmentProvider.class, method = "selectPaSysDepartment")
	public List<PaSysDepartment> selectPaSysDepartment(PaSysDepartment entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = PaSysDepartmentProvider.class, method = "selectOne")
	public PaSysDepartmentVO selectOne(long id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaSysDepartmentProvider.class, method = "updatePaSysDepartment")
	public int updatePaSysDepartment(PaSysDepartment entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaSysDepartmentProvider.class, method = "updatePaSysDepartmentByNullChk")
	public int updatePaSysDepartmentByNullChk(PaSysDepartment entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = PaSysDepartmentProvider.class, method = "deletePaSysDepartment")
	public int deletePaSysDepartment(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaSysDepartmentProvider.class, method = "deleteByLogic")
	public int deleteByLogic(long id);
}
