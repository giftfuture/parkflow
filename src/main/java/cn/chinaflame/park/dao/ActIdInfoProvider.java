package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.ActIdInfo;

/**
 * 
 * provider
 */
public class ActIdInfoProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertActIdInfo(ActIdInfo entity) {
		SQL sql = new SQL().INSERT_INTO("act_id_info");
		sql.VALUES("REV_,USER_ID_,TYPE_,KEY_,VALUE_,PASSWORD_,PARENT_ID_", "#{rev},#{userId},#{type},#{key},#{value},#{password},#{parentId}");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectActIdInfoByCount(ActIdInfo entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("act_id_info");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getUserId())) {sql.WHERE("userId = #{userId}");}
			if(!Strings.isNullOrEmpty(entity.getType())) {sql.WHERE("type = #{type}");}
			if(!Strings.isNullOrEmpty(entity.getKey())) {sql.WHERE("key = #{key}");}
			if(!Strings.isNullOrEmpty(entity.getValue())) {sql.WHERE("value = #{value}");}
			if(!Strings.isNullOrEmpty(entity.getPassword())) {sql.WHERE("password = #{password}");}
			if(!Strings.isNullOrEmpty(entity.getParentId())) {sql.WHERE("parentId = #{parentId}");}

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
	public String selectActIdInfoByLimt(ActIdInfo entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_id_info");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getUserId())) {sql.WHERE("userId = #{userId}");}
			if(!Strings.isNullOrEmpty(entity.getType())) {sql.WHERE("type = #{type}");}
			if(!Strings.isNullOrEmpty(entity.getKey())) {sql.WHERE("key = #{key}");}
			if(!Strings.isNullOrEmpty(entity.getValue())) {sql.WHERE("value = #{value}");}
			if(!Strings.isNullOrEmpty(entity.getPassword())) {sql.WHERE("password = #{password}");}
			if(!Strings.isNullOrEmpty(entity.getParentId())) {sql.WHERE("parentId = #{parentId}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectActIdInfo(ActIdInfo entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_id_info");
			if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getUserId())) {sql.WHERE("userId = #{userId}");}
			if(!Strings.isNullOrEmpty(entity.getType())) {sql.WHERE("type = #{type}");}
			if(!Strings.isNullOrEmpty(entity.getKey())) {sql.WHERE("key = #{key}");}
			if(!Strings.isNullOrEmpty(entity.getValue())) {sql.WHERE("value = #{value}");}
			if(!Strings.isNullOrEmpty(entity.getPassword())) {sql.WHERE("password = #{password}");}
			if(!Strings.isNullOrEmpty(entity.getParentId())) {sql.WHERE("parentId = #{parentId}");}

		return sql.toString();
	}
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	public String selectOne(int id) {
		SQL sql = new SQL().SELECT("*").FROM("act_id_info");
		sql.WHERE("ID_="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updateActIdInfo(ActIdInfo entity) {
		SQL sql = new SQL().UPDATE("act_id_info");
				sql.SET("id = #{id}");
		sql.SET("rev = #{rev}");
		sql.SET("userId = #{userId}");
		sql.SET("type = #{type}");
		sql.SET("key = #{key}");
		sql.SET("value = #{value}");
		sql.SET("password = #{password}");
		sql.SET("parentId = #{parentId}");
		sql.SET("updatetime = now()");

		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public String updateActIdInfoByNullChk(ActIdInfo entity) {
		SQL sql = new SQL().UPDATE("act_id_info");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.SET("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.SET("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getUserId())) {sql.SET("userId = #{userId}");}
			if(!Strings.isNullOrEmpty(entity.getType())) {sql.SET("type = #{type}");}
			if(!Strings.isNullOrEmpty(entity.getKey())) {sql.SET("key = #{key}");}
			if(!Strings.isNullOrEmpty(entity.getValue())) {sql.SET("value = #{value}");}
			if(!Strings.isNullOrEmpty(entity.getPassword())) {sql.SET("password = #{password}");}
			if(!Strings.isNullOrEmpty(entity.getParentId())) {sql.SET("parentId = #{parentId}");}
		sql.SET("updatetime = now()");

		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public String deleteActIdInfo(int id) {
		SQL sql = new SQL().DELETE_FROM("act_id_info");
		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(int id) {
		SQL sql = new SQL().UPDATE("act_id_info");
		sql.SET("state=2");
		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
}
