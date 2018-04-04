package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.PaContact;

public interface PaContactData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = PaContactProvider.class, method = "insertPaContact")
	@SelectKey(before=false,keyProperty="id",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertPaContact(PaContact entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaContactProvider.class, method = "selectPaContactByCount")
	public int selectPaContactByCount(PaContact entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = PaContactProvider.class, method = "selectPaContactByLimt")
	public List<PaContact> selectPaContactByLimt(PaContact entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaContactProvider.class, method = "selectPaContact")
	public List<PaContact> selectPaContact(PaContact entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = PaContactProvider.class, method = "selectOne")
	public PaContact selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaContactProvider.class, method = "updatePaContact")
	public int updatePaContact(PaContact entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaContactProvider.class, method = "updatePaContactByNullChk")
	public int updatePaContactByNullChk(PaContact entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = PaContactProvider.class, method = "deletePaContact")
	public int deletePaContact(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaContactProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
