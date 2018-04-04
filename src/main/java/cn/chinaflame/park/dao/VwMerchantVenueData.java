package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.VwMerchantVenue;

public interface VwMerchantVenueData {
	
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = VwMerchantVenueProvider.class, method = "selectVwMerchantVenueByCount")
	public int selectVwMerchantVenueByCount(VwMerchantVenue entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = VwMerchantVenueProvider.class, method = "selectVwMerchantVenueByLimt")
	public List<VwMerchantVenue> selectVwMerchantVenueByLimt(VwMerchantVenue entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = VwMerchantVenueProvider.class, method = "selectVwMerchantVenue")
	public List<VwMerchantVenue> selectVwMerchantVenue(VwMerchantVenue entity);
}
