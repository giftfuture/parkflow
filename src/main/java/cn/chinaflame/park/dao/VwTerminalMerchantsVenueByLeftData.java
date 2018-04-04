package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.VwTerminalMerchantsVenueByLeft;

public interface VwTerminalMerchantsVenueByLeftData {
	
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = VwTerminalMerchantsVenueByLeftProvider.class, method = "selectVwTerminalMerchantsVenueByLeftByCount")
	public int selectVwTerminalMerchantsVenueByLeftByCount(VwTerminalMerchantsVenueByLeft entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = VwTerminalMerchantsVenueByLeftProvider.class, method = "selectVwTerminalMerchantsVenueByLeftByLimt")
	public List<VwTerminalMerchantsVenueByLeft> selectVwTerminalMerchantsVenueByLeftByLimt(VwTerminalMerchantsVenueByLeft entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = VwTerminalMerchantsVenueByLeftProvider.class, method = "selectVwTerminalMerchantsVenueByLeft")
	public List<VwTerminalMerchantsVenueByLeft> selectVwTerminalMerchantsVenueByLeft(VwTerminalMerchantsVenueByLeft entity);
}
