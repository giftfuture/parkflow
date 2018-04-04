package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.ActHiIdentitylink;

public interface ActHiIdentitylinkData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = ActHiIdentitylinkProvider.class, method = "insertActHiIdentitylink")
	@SelectKey(before=false,keyProperty="ID_",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertActHiIdentitylink(ActHiIdentitylink entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActHiIdentitylinkProvider.class, method = "selectActHiIdentitylinkByCount")
	public int selectActHiIdentitylinkByCount(ActHiIdentitylink entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = ActHiIdentitylinkProvider.class, method = "selectActHiIdentitylinkByLimt")
	public List<ActHiIdentitylink> selectActHiIdentitylinkByLimt(ActHiIdentitylink entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActHiIdentitylinkProvider.class, method = "selectActHiIdentitylink")
	public List<ActHiIdentitylink> selectActHiIdentitylink(ActHiIdentitylink entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = ActHiIdentitylinkProvider.class, method = "selectOne")
	public ActHiIdentitylink selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActHiIdentitylinkProvider.class, method = "updateActHiIdentitylink")
	public int updateActHiIdentitylink(ActHiIdentitylink entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActHiIdentitylinkProvider.class, method = "updateActHiIdentitylinkByNullChk")
	public int updateActHiIdentitylinkByNullChk(ActHiIdentitylink entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = ActHiIdentitylinkProvider.class, method = "deleteActHiIdentitylink")
	public int deleteActHiIdentitylink(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActHiIdentitylinkProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
