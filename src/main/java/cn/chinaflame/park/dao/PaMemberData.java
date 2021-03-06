package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.PaMember;

public interface PaMemberData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = PaMemberProvider.class, method = "insertPaMember")
	@SelectKey(before=false,keyProperty="id",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertPaMember(PaMember entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaMemberProvider.class, method = "selectPaMemberByCount")
	public int selectPaMemberByCount(PaMember entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = PaMemberProvider.class, method = "selectPaMemberByLimt")
	public List<PaMember> selectPaMemberByLimt(PaMember entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaMemberProvider.class, method = "selectPaMember")
	public List<PaMember> selectPaMember(PaMember entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = PaMemberProvider.class, method = "selectOne")
	public PaMember selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaMemberProvider.class, method = "updatePaMember")
	public int updatePaMember(PaMember entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaMemberProvider.class, method = "updatePaMemberByNullChk")
	public int updatePaMemberByNullChk(PaMember entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = PaMemberProvider.class, method = "deletePaMember")
	public int deletePaMember(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaMemberProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
