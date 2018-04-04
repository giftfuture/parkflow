package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.PaTuiPiao;
import cn.chinaflame.park.model.VwTicketRefund;

public interface VwTicketRefundData {
	
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = VwTicketRefundProvider.class, method = "selectVwTicketRefundByCount")
	public int selectVwTicketRefundByCount(PaTuiPiao entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = VwTicketRefundProvider.class, method = "selectVwTicketRefundByLimt")
	public List<VwTicketRefund> selectVwTicketRefundByLimt(VwTicketRefund entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = VwTicketRefundProvider.class, method = "selectVwTicketRefund")
	public List<VwTicketRefund> selectVwTicketRefund(VwTicketRefund entity);
	
	
	
	
	
	
	
	/**
	 * 强哥
	 */
	@SelectProvider(type = VwTicketRefundProvider.class, method = "selectTuiPiao")
	public List<PaTuiPiao> selectTuiPiao(PaTuiPiao entity);
	
	
	
	
	
}
