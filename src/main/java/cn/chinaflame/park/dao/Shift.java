package cn.chinaflame.park.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.chinaflame.park.model.PaStaff;
import cn.chinaflame.park.model.PaTerminal;

/**
* @author    created by lbq
* @date	     2018年3月23日 下午4:20:43
**/
public interface Shift {
	@Select("SELECT a.staffname,a.staffno from pa_staff a where a.id=#{staffId}")
	public PaStaff getStaff(@Param("staffId") Integer staffId);
	
	@Select("select a.terminal_name as terminalName from pa_terminal a where a.terminal_ip=#{ip}")
	public String getTerminal(@Param("ip") String ip);
}
