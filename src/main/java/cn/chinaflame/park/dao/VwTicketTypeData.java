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

import cn.chinaflame.park.model.VwTicketType;

public interface VwTicketTypeData {
	
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = VwTicketTypeProvider.class, method = "selectVwTicketTypeByCount")
	public int selectVwTicketTypeByCount(VwTicketType entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = VwTicketTypeProvider.class, method = "selectVwTicketTypeByLimt")
	public List<VwTicketType> selectVwTicketTypeByLimt(VwTicketType entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = VwTicketTypeProvider.class, method = "selectVwTicketType")
	public List<VwTicketType> selectVwTicketType(VwTicketType entity);
	
	/**
	 * 自定义按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = VwTicketTypeProvider.class, method = "selectVwTicketTypePrivateByCount")
	public int selectVwTicketTypePrivateByCount(VwTicketType entity);
	
	/**
	 * 自定义按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = VwTicketTypeProvider.class, method = "selectVwTicketTypePrivateByLimt")
	public List<VwTicketType> selectVwTicketTypePrivateByLimt(VwTicketType entity);
	
	/**
	 * 自定义按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = VwTicketTypeProvider.class, method = "selectVwTicketTypePrivate")
	public List<VwTicketType> selectVwTicketTypePrivate(VwTicketType entity);
	/**
	 * 将以，分割的场馆id对应的场馆名称以，分割返回
	 * @param venueIds
	 * @return
	 */
	@Select("select GROUP_CONCAT(venue_name) from pa_venue where FIND_IN_SET(venue_id,#{venueIds})>0;")
	public String selectVenueNames(@Param("venueIds") String venueIds);
	/**
	 * 根据票劵类型查询场馆id
	 */
	@Select("select venue_id from vw_ticket_type where type = #{type}")
	public List<Map<String,String>> selectVenueId(@Param("type") String venueIds);
	
}
