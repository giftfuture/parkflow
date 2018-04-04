package cn.chinaflame.park.dao;

import java.util.List;

import javax.persistence.Entity;

import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.StatementType;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import cn.chinaflame.park.model.VwQudao;

public interface VwQudaoData {
	
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = VwQudaoProvider.class, method = "selectVwQudaoByCount")
	public int selectVwQudaoByCount(VwQudao entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = VwQudaoProvider.class, method = "selectVwQudaoByLimt")
	public List<VwQudao> selectVwQudaoByLimt(VwQudao entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = VwQudaoProvider.class, method = "selectVwQudao")
	public List<VwQudao> selectVwQudao(VwQudao entity);
	
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = VwQudaoProvider.class, method = "selectVwQudaoByLimt2")
	public List<VwQudao> selectVwQudaoByLimt2(VwQudao entity);
	
	
	
}
