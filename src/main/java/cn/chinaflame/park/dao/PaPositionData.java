package cn.chinaflame.park.dao;

import java.util.List;

import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.PaPosition;
import cn.chinaflame.park.vo.PaPositionVO;

public interface PaPositionData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = PaPositionProvider.class, method = "insertPaPosition")
	@SelectKey(before=false,keyProperty="id",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertPaPosition(PaPosition entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaPositionProvider.class, method = "selectPaPositionByCount")
	public int selectPaPositionByCount(PaPosition entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = PaPositionProvider.class, method = "selectPaPositionByLimt")
	public List<PaPositionVO> selectPaPositionByLimt(PaPosition entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaPositionProvider.class, method = "selectPaPosition")
	public List<PaPositionVO> selectPaPosition(PaPosition entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = PaPositionProvider.class, method = "selectOne")
	public PaPositionVO selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaPositionProvider.class, method = "updatePaPosition")
	public int updatePaPosition(PaPosition entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaPositionProvider.class, method = "updatePaPositionByNullChk")
	public int updatePaPositionByNullChk(PaPosition entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = PaPositionProvider.class, method = "deletePaPosition")
	public int deletePaPosition(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaPositionProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
