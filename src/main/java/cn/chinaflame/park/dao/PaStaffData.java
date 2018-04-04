package cn.chinaflame.park.dao;

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

import cn.chinaflame.park.model.PaStaff;
import cn.chinaflame.park.vo.PaStaffVO;

public interface PaStaffData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = PaStaffProvider.class, method = "insertPaStaff")
	@SelectKey(before=false,keyProperty="id",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertPaStaff(PaStaff entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaStaffProvider.class, method = "selectPaStaffByCount")
	public int selectPaStaffByCount(PaStaff entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = PaStaffProvider.class, method = "selectPaStaffByLimt")
	public List<PaStaffVO> selectPaStaffByLimt(PaStaff entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaStaffProvider.class, method = "searchPaStaffByCount")
	public int searchPaStaffByCount(PaStaff entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = PaStaffProvider.class, method = "searchPaStaffByLimt")
	public List<PaStaffVO> searchPaStaffByLimt(PaStaff entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaStaffProvider.class, method = "selectPaStaff")
	public List<PaStaffVO> selectPaStaff(PaStaff entity);
	/**
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaStaffProvider.class, method = "searchPaStaff")
	public List<PaStaffVO> searchPaStaff(PaStaff entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = PaStaffProvider.class, method = "selectOne")
	public PaStaff selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaStaffProvider.class, method = "updatePaStaff")
	public int updatePaStaff(PaStaff entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaStaffProvider.class, method = "updatePaStaffByNullChk")
	public int updatePaStaffByNullChk(PaStaff entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = PaStaffProvider.class, method = "deletePaStaff")
	public int deletePaStaff(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaStaffProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
	
	/**
	 * 根据角色逻辑删除
	 * @param roleId
	 * @return
	 */
	@UpdateProvider(type = PaStaffProvider.class, method = "deleteByRole")
	public int deleteByRole(long roleId);
	
	/**
	 * 登录接口
	 * @param map
	 * @return
	 */
	@Select(value= "{ CALL pro_staff_login_check(#{p_username, mode=IN, jdbcType=VARCHAR},"
			+ "#{p_pwd, mode=IN, jdbcType=VARCHAR},"
			+ "#{code, mode=OUT, jdbcType=VARCHAR},#{msg, mode=OUT, jdbcType=VARCHAR},#{result, mode=OUT, jdbcType=VARCHAR})}")
	@Options(statementType = StatementType.CALLABLE)
	public List<PaStaffVO> staffLogin(Map<String, Object> map);
	
	/**
	 * 修改密码
	 * @param map
	 * @return
	 */
	@Select(value= "{CALL modify_pwd(#{staff_id, mode=IN, jdbcType=VARCHAR},"//#{updatebyid, mode=IN, jdbcType=INTEGER},
			+ "#{p_oldpwd, mode=IN, jdbcType=VARCHAR},#{p_newpwd, mode=IN, jdbcType=VARCHAR},#{p_rpwd, mode=IN, jdbcType=VARCHAR},"
			+ "#{code, mode=OUT, jdbcType=VARCHAR},#{msg, mode=OUT, jdbcType=VARCHAR})}")
	@Options(statementType = StatementType.CALLABLE)
	public String modifyPwd(Map<String, Object> map);
}
