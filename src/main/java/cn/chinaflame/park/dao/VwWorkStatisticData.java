package cn.chinaflame.park.dao;

import java.util.List;

import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.PaWorkStatistic;
import cn.chinaflame.park.model.VwWorkStatistic;
import cn.chinaflame.park.vo.WorkStatisticAddVO;

public interface VwWorkStatisticData {
	
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = VwWorkStatisticProvider.class, method = "selectVwWorkStatisticByCount")
	public int selectVwWorkStatisticByCount(VwWorkStatistic entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = VwWorkStatisticProvider.class, method = "selectVwWorkStatisticByLimt")
	public List<VwWorkStatistic> selectVwWorkStatisticByLimt(VwWorkStatistic entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = VwWorkStatisticProvider.class, method = "selectVwWorkStatistic")
	public List<VwWorkStatistic> selectVwWorkStatistic(VwWorkStatistic entity);
	
	@Select(value= "{ CALL pro_shift(#{type, mode=IN, jdbcType=INTEGER},"
		      + "#{operatorId, mode=IN, jdbcType=INTEGER},#{terminalIp, mode=IN, jdbcType=VARCHAR},#{statisticDate, mode=IN, jdbcType=VARCHAR},"
		      + "#{code, mode=OUT, jdbcType=VARCHAR},#{msg, mode=OUT, jdbcType=VARCHAR})}")
	@Options(statementType = StatementType.CALLABLE)
	public List<PaWorkStatistic> shiftOrFinish(WorkStatisticAddVO entity);
}
