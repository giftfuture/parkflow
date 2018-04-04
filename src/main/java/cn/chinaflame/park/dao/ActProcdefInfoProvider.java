package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.ActProcdefInfo;

/**
 * 
 * provider
 */
public class ActProcdefInfoProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertActProcdefInfo(ActProcdefInfo entity) {
		SQL sql = new SQL().INSERT_INTO("act_procdef_info");
		sql.VALUES("PROC_DEF_ID_,REV_,INFO_JSON_ID_", "#{procDefId},#{rev},#{infoJsonId}");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectActProcdefInfoByCount(ActProcdefInfo entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("act_procdef_info");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.WHERE("procDefId = #{procDefId}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getInfoJsonId())) {sql.WHERE("infoJsonId = #{infoJsonId}");}

		return sql.toString();
	}
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	public String selectActProcdefInfoByLimt(ActProcdefInfo entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_procdef_info");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.WHERE("procDefId = #{procDefId}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getInfoJsonId())) {sql.WHERE("infoJsonId = #{infoJsonId}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectActProcdefInfo(ActProcdefInfo entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_procdef_info");
			if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.WHERE("procDefId = #{procDefId}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getInfoJsonId())) {sql.WHERE("infoJsonId = #{infoJsonId}");}

		return sql.toString();
	}
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	public String selectOne(int id) {
		SQL sql = new SQL().SELECT("*").FROM("act_procdef_info");
		sql.WHERE("ID_="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updateActProcdefInfo(ActProcdefInfo entity) {
		SQL sql = new SQL().UPDATE("act_procdef_info");
				sql.SET("id = #{id}");
		sql.SET("procDefId = #{procDefId}");
		sql.SET("rev = #{rev}");
		sql.SET("infoJsonId = #{infoJsonId}");
		sql.SET("updatetime = now()");

		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public String updateActProcdefInfoByNullChk(ActProcdefInfo entity) {
		SQL sql = new SQL().UPDATE("act_procdef_info");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.SET("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.SET("procDefId = #{procDefId}");}
			if(!Objects.isNull(entity.getRev())) {sql.SET("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getInfoJsonId())) {sql.SET("infoJsonId = #{infoJsonId}");}
		sql.SET("updatetime = now()");

		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public String deleteActProcdefInfo(int id) {
		SQL sql = new SQL().DELETE_FROM("act_procdef_info");
		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(int id) {
		SQL sql = new SQL().UPDATE("act_procdef_info");
		sql.SET("state=2");
		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
}
