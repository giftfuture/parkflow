package cn.chinaflame.park.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.YwOrderitem;

public interface YwOrderitemData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = YwOrderitemProvider.class, method = "insertYwOrderitem")
	@SelectKey(before=false,keyProperty="id",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertYwOrderitem(YwOrderitem entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = YwOrderitemProvider.class, method = "selectYwOrderitemByCount")
	public int selectYwOrderitemByCount(YwOrderitem entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = YwOrderitemProvider.class, method = "selectYwOrderitemByLimt")
	public List<YwOrderitem> selectYwOrderitemByLimt(YwOrderitem entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = YwOrderitemProvider.class, method = "selectYwOrderitem")
	public List<YwOrderitem> selectYwOrderitem(YwOrderitem entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = YwOrderitemProvider.class, method = "selectOne")
	public YwOrderitem selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = YwOrderitemProvider.class, method = "updateYwOrderitem")
	public int updateYwOrderitem(YwOrderitem entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = YwOrderitemProvider.class, method = "updateYwOrderitemByNullChk")
	public int updateYwOrderitemByNullChk(YwOrderitem entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = YwOrderitemProvider.class, method = "deleteYwOrderitem")
	public int deleteYwOrderitem(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = YwOrderitemProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
	
	/**
	 * 单独查询票详情
	 * @param orderid
	 * @return
	 */
	@Select("select ticket_type.id as typeid,ticket_type.`name` as typename,ticket_type.object_id as typeobject," + 
			"min(orderitem.effiect_start_time) as start_time,count(orderitem.product_id) as Number,sum(orderitem.money) as Subtotal,ticket_type.price as money," + 
			"ticket_type.type as ticketType,GROUP_CONCAT(orderitem.id) as orderitemIds from yw_orderitem orderitem left join vw_ticket_type ticket_type on orderitem.product_id=ticket_type.id where orderitem.order_id=#{orderId} " + 
			"group by ticket_type.type,ticket_type.id,ticket_type.`name`,ticket_type.object_id,ticket_type.price;")
	public List<Map<String, Object>> selectByProductGroup(@Param("orderId")int orderid);
	
	/**
	 * 单独查询套票详情
	 * @param orderid
	 * @return
	 */
	@Select("select ticket_type.id as typeid,ticket_type.`name` as typename,GROUP_CONCAT(orderitem.memo) as typeobject," + 
			"min(orderitem.effiect_start_time) as start_time,count(orderitem.product_id) as Number,sum(orderitem.money) as Subtotal,ticket_type.price as money," + 
			"ticket_type.type as ticketType,GROUP_CONCAT(orderitem.id) as orderitemIds from yw_orderitem orderitem left join vw_ticket_type ticket_type on orderitem.product_id=ticket_type.id where orderitem.order_id=#{orderId} " + 
			"group by ticket_type.type,ticket_type.id,ticket_type.`name`,ticket_type.object_id,ticket_type.price;")
	public List<Map<String, Object>> selectByProductGroupPlan(@Param("orderId")int orderid);
}
