package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.ActRuIdentitylink;

public interface ActRuIdentitylinkData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = ActRuIdentitylinkProvider.class, method = "insertActRuIdentitylink")
	@SelectKey(before=false,keyProperty="ID_",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertActRuIdentitylink(ActRuIdentitylink entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActRuIdentitylinkProvider.class, method = "selectActRuIdentitylinkByCount")
	public int selectActRuIdentitylinkByCount(ActRuIdentitylink entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = ActRuIdentitylinkProvider.class, method = "selectActRuIdentitylinkByLimt")
	public List<ActRuIdentitylink> selectActRuIdentitylinkByLimt(ActRuIdentitylink entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActRuIdentitylinkProvider.class, method = "selectActRuIdentitylink")
	public List<ActRuIdentitylink> selectActRuIdentitylink(ActRuIdentitylink entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = ActRuIdentitylinkProvider.class, method = "selectOne")
	public ActRuIdentitylink selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActRuIdentitylinkProvider.class, method = "updateActRuIdentitylink")
	public int updateActRuIdentitylink(ActRuIdentitylink entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActRuIdentitylinkProvider.class, method = "updateActRuIdentitylinkByNullChk")
	public int updateActRuIdentitylinkByNullChk(ActRuIdentitylink entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = ActRuIdentitylinkProvider.class, method = "deleteActRuIdentitylink")
	public int deleteActRuIdentitylink(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActRuIdentitylinkProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
