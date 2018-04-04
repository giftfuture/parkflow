package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.ActIdMembership;

public interface ActIdMembershipData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = ActIdMembershipProvider.class, method = "insertActIdMembership")
	@SelectKey(before=false,keyProperty="GROUP_ID_",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertActIdMembership(ActIdMembership entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActIdMembershipProvider.class, method = "selectActIdMembershipByCount")
	public int selectActIdMembershipByCount(ActIdMembership entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = ActIdMembershipProvider.class, method = "selectActIdMembershipByLimt")
	public List<ActIdMembership> selectActIdMembershipByLimt(ActIdMembership entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActIdMembershipProvider.class, method = "selectActIdMembership")
	public List<ActIdMembership> selectActIdMembership(ActIdMembership entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = ActIdMembershipProvider.class, method = "selectOne")
	public ActIdMembership selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActIdMembershipProvider.class, method = "updateActIdMembership")
	public int updateActIdMembership(ActIdMembership entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActIdMembershipProvider.class, method = "updateActIdMembershipByNullChk")
	public int updateActIdMembershipByNullChk(ActIdMembership entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = ActIdMembershipProvider.class, method = "deleteActIdMembership")
	public int deleteActIdMembership(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActIdMembershipProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
