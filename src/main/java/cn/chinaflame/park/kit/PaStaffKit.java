package cn.chinaflame.park.kit;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.google.common.collect.Maps;

import cn.chinaflame.park.model.PaStaff;
import cn.chinaflame.park.util.DateUtil;
import cn.chinaflame.park.vo.PaStaffVO;

public class PaStaffKit {
	/**
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	public static PaStaff toEntity(PaStaffVO vo)throws Exception{
		PaStaff pastaff = new PaStaff();
		pastaff.setId(vo.getId());
		/*if(StringUtils.isNotEmpty(vo.getCreatetime())){
			pastaff.setCreatetime(DateUtil.fromStringToDate(DateUtil.y_m_dhms, vo.getCreatetime()));
		}
		if(StringUtils.isNotEmpty(vo.getUpdatetime())){
			pastaff.setUpdatetime(DateUtil.fromStringToDate(DateUtil.y_m_dhms, vo.getUpdatetime()));
		}*/
		return pastaff;
	}
	
	/***
	 * 
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	public static PaStaffVO toVo(PaStaff vo)throws Exception{
		PaStaffVO pastaff = new PaStaffVO();
		pastaff.setId(vo.getId());
		return pastaff;
	}
	
	/**
	 * 
	 * @param vo
	 * @return
	 */
	public static Map<String,String> toRecord(PaStaff vo){
		Map<String,String> map = Maps.newHashMap();
		map.put("id", vo.getId()+"");
		return map;
	}
}
