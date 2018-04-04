package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.PaPublicRelation;

public interface PaPublicRelationData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = PaPublicRelationProvider.class, method = "insertPaPublicRelation")
	@SelectKey(before=false,keyProperty="id",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertPaPublicRelation(PaPublicRelation entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaPublicRelationProvider.class, method = "selectPaPublicRelationByCount")
	public int selectPaPublicRelationByCount(PaPublicRelation entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = PaPublicRelationProvider.class, method = "selectPaPublicRelationByLimt")
	public List<PaPublicRelation> selectPaPublicRelationByLimt(PaPublicRelation entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaPublicRelationProvider.class, method = "selectPaPublicRelation")
	public List<PaPublicRelation> selectPaPublicRelation(PaPublicRelation entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = PaPublicRelationProvider.class, method = "selectOne")
	public PaPublicRelation selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaPublicRelationProvider.class, method = "updatePaPublicRelation")
	public int updatePaPublicRelation(PaPublicRelation entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaPublicRelationProvider.class, method = "updatePaPublicRelationByNullChk")
	public int updatePaPublicRelationByNullChk(PaPublicRelation entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = PaPublicRelationProvider.class, method = "deletePaPublicRelation")
	public int deletePaPublicRelation(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaPublicRelationProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
