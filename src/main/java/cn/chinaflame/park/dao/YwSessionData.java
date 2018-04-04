package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.YwSession;

public interface YwSessionData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = YwSessionProvider.class, method = "insertYwSession")
	@SelectKey(before=false,keyProperty="id",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertYwSession(YwSession entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = YwSessionProvider.class, method = "selectYwSessionByCount")
	public int selectYwSessionByCount(YwSession entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = YwSessionProvider.class, method = "selectYwSessionByLimt")
	public List<YwSession> selectYwSessionByLimt(YwSession entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = YwSessionProvider.class, method = "selectYwSession")
	public List<YwSession> selectYwSession(YwSession entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = YwSessionProvider.class, method = "selectOne")
	public YwSession selectOne(long id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = YwSessionProvider.class, method = "updateYwSession")
	public int updateYwSession(YwSession entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = YwSessionProvider.class, method = "updateYwSessionByNullChk")
	public int updateYwSessionByNullChk(YwSession entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = YwSessionProvider.class, method = "deleteYwSession")
	public int deleteYwSession(long id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = YwSessionProvider.class, method = "deleteByLogic")
	public int deleteByLogic(long id);
	
	/**
	 * 根据sessionid物理删除
	 * @param sessionId
	 * @return
	 */
	@Update("delete from yw_session where sessionid=#{sessionId}")
	public int deleteBySessionId(String sessionId);
}
