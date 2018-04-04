package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.ActGeProperty;

public interface ActGePropertyData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = ActGePropertyProvider.class, method = "insertActGeProperty")
	@SelectKey(before=false,keyProperty="NAME_",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertActGeProperty(ActGeProperty entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActGePropertyProvider.class, method = "selectActGePropertyByCount")
	public int selectActGePropertyByCount(ActGeProperty entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = ActGePropertyProvider.class, method = "selectActGePropertyByLimt")
	public List<ActGeProperty> selectActGePropertyByLimt(ActGeProperty entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActGePropertyProvider.class, method = "selectActGeProperty")
	public List<ActGeProperty> selectActGeProperty(ActGeProperty entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = ActGePropertyProvider.class, method = "selectOne")
	public ActGeProperty selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActGePropertyProvider.class, method = "updateActGeProperty")
	public int updateActGeProperty(ActGeProperty entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActGePropertyProvider.class, method = "updateActGePropertyByNullChk")
	public int updateActGePropertyByNullChk(ActGeProperty entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = ActGePropertyProvider.class, method = "deleteActGeProperty")
	public int deleteActGeProperty(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActGePropertyProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
