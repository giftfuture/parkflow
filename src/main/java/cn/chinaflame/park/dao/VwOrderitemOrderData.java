package cn.chinaflame.park.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.VwOrderitemOrder;
import cn.chinaflame.park.vo.VwWebsiteOrderQryVO;
import cn.chinaflame.park.vo.WebchatOrderQryVO;

public interface VwOrderitemOrderData {
	
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = VwOrderitemOrderProvider.class, method = "selectVwOrderitemOrderByCount")
	public int selectVwOrderitemOrderByCount(VwOrderitemOrder entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = VwOrderitemOrderProvider.class, method = "selectVwOrderitemOrderByLimt")
	public List<VwOrderitemOrder> selectVwOrderitemOrderByLimt(VwOrderitemOrder entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = VwOrderitemOrderProvider.class, method = "selectVwOrderitemOrder")
	public List<VwOrderitemOrder> selectVwOrderitemOrder(VwOrderitemOrder entity);
	
	/**
	 * 微信公众号订单列表查询
	 * @param req
	 * @return
	 */
	@Select(value= "{ CALL pro_order_orderitem_wechat(#{orderState, mode=IN, jdbcType=VARCHAR},#{mobile, mode=IN, jdbcType=VARCHAR},"
			+"#{limit, mode=IN, jdbcType=INTEGER},#{limitLen, mode=IN, jdbcType=INTEGER},"
			+ "#{code, mode=OUT, jdbcType=VARCHAR},#{msg, mode=OUT, jdbcType=VARCHAR})}")
	@Options(statementType = StatementType.CALLABLE)
	public List<Map<String, Object>> selectProOrderOrderitem(WebchatOrderQryVO req);
	
	/**
	 * 微信公众号订单列表查询
	 * @param req
	 * @return
	 */
	@Select(value= "{ CALL pro_order_orderitem_detail(#{orderId, mode=IN, jdbcType=VARCHAR},"
			+ "#{productId, mode=IN, jdbcType=VARCHAR},"
			+ "#{code, mode=OUT, jdbcType=VARCHAR},#{msg, mode=OUT, jdbcType=VARCHAR})}")
	@Options(statementType = StatementType.CALLABLE)
	public List<Map<String, Object>> selectProOrderOrderitemDetail(Map<String, String> map);
	@SelectProvider(type = VwOrderitemOrderProvider.class, method = "selectOrderitemListByWebsite")
	public List<Map<String, Object>> selectOrderitemListByWebsite(VwWebsiteOrderQryVO req);
	@SelectProvider(type = VwOrderitemOrderProvider.class, method = "selectOrderitemListByWebsiteCount")
	public long selectOrderitemListByWebsiteCount(VwWebsiteOrderQryVO req);
}
