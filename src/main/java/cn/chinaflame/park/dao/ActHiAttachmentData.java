package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.ActHiAttachment;

public interface ActHiAttachmentData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = ActHiAttachmentProvider.class, method = "insertActHiAttachment")
	@SelectKey(before=false,keyProperty="ID_",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertActHiAttachment(ActHiAttachment entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActHiAttachmentProvider.class, method = "selectActHiAttachmentByCount")
	public int selectActHiAttachmentByCount(ActHiAttachment entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = ActHiAttachmentProvider.class, method = "selectActHiAttachmentByLimt")
	public List<ActHiAttachment> selectActHiAttachmentByLimt(ActHiAttachment entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = ActHiAttachmentProvider.class, method = "selectActHiAttachment")
	public List<ActHiAttachment> selectActHiAttachment(ActHiAttachment entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = ActHiAttachmentProvider.class, method = "selectOne")
	public ActHiAttachment selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActHiAttachmentProvider.class, method = "updateActHiAttachment")
	public int updateActHiAttachment(ActHiAttachment entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActHiAttachmentProvider.class, method = "updateActHiAttachmentByNullChk")
	public int updateActHiAttachmentByNullChk(ActHiAttachment entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = ActHiAttachmentProvider.class, method = "deleteActHiAttachment")
	public int deleteActHiAttachment(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = ActHiAttachmentProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
