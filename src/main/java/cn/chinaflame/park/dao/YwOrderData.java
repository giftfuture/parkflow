package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.YwOrder;

public interface YwOrderData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = YwOrderProvider.class, method = "insertYwOrder")
	@SelectKey(before=false,keyProperty="id",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertYwOrder(YwOrder entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = YwOrderProvider.class, method = "selectYwOrderByCount")
	public int selectYwOrderByCount(YwOrder entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = YwOrderProvider.class, method = "selectYwOrderByLimt")
	public List<YwOrder> selectYwOrderByLimt(YwOrder entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = YwOrderProvider.class, method = "selectYwOrder")
	public List<YwOrder> selectYwOrder(YwOrder entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = YwOrderProvider.class, method = "selectOne")
	public YwOrder selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = YwOrderProvider.class, method = "updateYwOrder")
	public int updateYwOrder(YwOrder entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = YwOrderProvider.class, method = "updateYwOrderByNullChk")
	public int updateYwOrderByNullChk(YwOrder entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = YwOrderProvider.class, method = "deleteYwOrder")
	public int deleteYwOrder(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = YwOrderProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
