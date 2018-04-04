package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.PaCoupon;

public interface PaCouponData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = PaCouponProvider.class, method = "insertPaCoupon")
	@SelectKey(before=false,keyProperty="id",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertPaCoupon(PaCoupon entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaCouponProvider.class, method = "selectPaCouponByCount")
	public int selectPaCouponByCount(PaCoupon entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = PaCouponProvider.class, method = "selectPaCouponByLimt")
	public List<PaCoupon> selectPaCouponByLimt(PaCoupon entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaCouponProvider.class, method = "selectPaCoupon")
	public List<PaCoupon> selectPaCoupon(PaCoupon entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = PaCouponProvider.class, method = "selectOne")
	public PaCoupon selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaCouponProvider.class, method = "updatePaCoupon")
	public int updatePaCoupon(PaCoupon entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaCouponProvider.class, method = "updatePaCouponByNullChk")
	public int updatePaCouponByNullChk(PaCoupon entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = PaCouponProvider.class, method = "deletePaCoupon")
	public int deletePaCoupon(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaCouponProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
