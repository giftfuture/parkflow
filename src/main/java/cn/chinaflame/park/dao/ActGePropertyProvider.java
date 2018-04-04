package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.ActGeProperty;

/**
 * 
 * provider
 */
public class ActGePropertyProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertActGeProperty(ActGeProperty entity) {
		SQL sql = new SQL().INSERT_INTO("act_ge_property");
		sql.VALUES("VALUE_,REV_", "#{value},#{rev}");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectActGePropertyByCount(ActGeProperty entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("act_ge_property");
					if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getValue())) {sql.WHERE("value = #{value}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}

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
	public String selectActGePropertyByLimt(ActGeProperty entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_ge_property");
					if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getValue())) {sql.WHERE("value = #{value}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectActGeProperty(ActGeProperty entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_ge_property");
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getValue())) {sql.WHERE("value = #{value}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}

		return sql.toString();
	}
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	public String selectOne(int id) {
		SQL sql = new SQL().SELECT("*").FROM("act_ge_property");
		sql.WHERE("NAME_="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updateActGeProperty(ActGeProperty entity) {
		SQL sql = new SQL().UPDATE("act_ge_property");
				sql.SET("name = #{name}");
		sql.SET("value = #{value}");
		sql.SET("rev = #{rev}");
		sql.SET("updatetime = now()");

		sql.WHERE("NAME_ = #{NAME_}");
		return sql.toString();
	}
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public String updateActGePropertyByNullChk(ActGeProperty entity) {
		SQL sql = new SQL().UPDATE("act_ge_property");
					if(!Strings.isNullOrEmpty(entity.getName())) {sql.SET("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getValue())) {sql.SET("value = #{value}");}
			if(!Objects.isNull(entity.getRev())) {sql.SET("rev = #{rev}");}
		sql.SET("updatetime = now()");

		sql.WHERE("NAME_ = #{NAME_}");
		return sql.toString();
	}
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public String deleteActGeProperty(int id) {
		SQL sql = new SQL().DELETE_FROM("act_ge_property");
		sql.WHERE("NAME_ = #{NAME_}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(int id) {
		SQL sql = new SQL().UPDATE("act_ge_property");
		sql.SET("state=2");
		sql.WHERE("NAME_ = #{NAME_}");
		return sql.toString();
	}
}
