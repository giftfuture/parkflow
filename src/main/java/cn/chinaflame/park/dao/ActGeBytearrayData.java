package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.ActGeBytearray;

public interface ActGeBytearrayData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = ActGeBytearrayProvider.class, method = "insertActGeBytearray")
	@SelectKey(before=false,keyProperty="ID_",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertActGeBytearray(ActGeBytearray entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActGeBytearrayProvider.class, method = "selectActGeBytearrayByCount")
	public int selectActGeBytearrayByCount(ActGeBytearray entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = ActGeBytearrayProvider.class, method = "selectActGeBytearrayByLimt")
	public List<ActGeBytearray> selectActGeBytearrayByLimt(ActGeBytearray entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActGeBytearrayProvider.class, method = "selectActGeBytearray")
	public List<ActGeBytearray> selectActGeBytearray(ActGeBytearray entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = ActGeBytearrayProvider.class, method = "selectOne")
	public ActGeBytearray selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActGeBytearrayProvider.class, method = "updateActGeBytearray")
	public int updateActGeBytearray(ActGeBytearray entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActGeBytearrayProvider.class, method = "updateActGeBytearrayByNullChk")
	public int updateActGeBytearrayByNullChk(ActGeBytearray entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = ActGeBytearrayProvider.class, method = "deleteActGeBytearray")
	public int deleteActGeBytearray(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActGeBytearrayProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
