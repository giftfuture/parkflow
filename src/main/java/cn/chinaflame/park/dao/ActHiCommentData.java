package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.ActHiComment;

public interface ActHiCommentData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = ActHiCommentProvider.class, method = "insertActHiComment")
	@SelectKey(before=false,keyProperty="ID_",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertActHiComment(ActHiComment entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActHiCommentProvider.class, method = "selectActHiCommentByCount")
	public int selectActHiCommentByCount(ActHiComment entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = ActHiCommentProvider.class, method = "selectActHiCommentByLimt")
	public List<ActHiComment> selectActHiCommentByLimt(ActHiComment entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActHiCommentProvider.class, method = "selectActHiComment")
	public List<ActHiComment> selectActHiComment(ActHiComment entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = ActHiCommentProvider.class, method = "selectOne")
	public ActHiComment selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActHiCommentProvider.class, method = "updateActHiComment")
	public int updateActHiComment(ActHiComment entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActHiCommentProvider.class, method = "updateActHiCommentByNullChk")
	public int updateActHiCommentByNullChk(ActHiComment entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = ActHiCommentProvider.class, method = "deleteActHiComment")
	public int deleteActHiComment(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActHiCommentProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
