package cn.chinaflame.park.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.mapping.StatementType;
import org.springframework.stereotype.Service;

import cn.chinaflame.park.dao.PaStaffProvider;
import cn.chinaflame.park.model.PaStaff;
import cn.chinaflame.park.vo.PaStaffVO;

@Service("paStaffService")
public interface PaStaffService {

	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public int insertPaStaff(PaStaff entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public int selectPaStaffByCount(PaStaff entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	public List<PaStaffVO> selectPaStaffByLimt(PaStaff entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public int searchPaStaffByCount(PaStaff entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	public List<PaStaffVO> searchPaStaffByLimt(PaStaff entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public List<PaStaffVO> selectPaStaff(PaStaff entity);
	/**
	 * @param entity
	 * @return
	 */
	public List<PaStaffVO> searchPaStaff(PaStaff entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	public PaStaff selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public int updatePaStaff(PaStaff entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public int updatePaStaffByNullChk(PaStaff entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public int deletePaStaff(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public int deleteByLogic(int id);
	
	/**
	 * 根据角色逻辑删除
	 * @param roleId
	 * @return
	 */
	public int deleteByRole(long roleId);
	
	/**
	 * 
	 * @param map
	 * @return
	 */
	public List<PaStaffVO> staffLogin(Map<String, Object> map);
	
}
