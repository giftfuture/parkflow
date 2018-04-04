package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.PaSysVars;

/**
 * 系统变量表
 * provider
 */
public class PaSysVarsProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertPaSysVars(PaSysVars entity) {
		SQL sql = new SQL().INSERT_INTO("pa_sys_vars");
		sql.VALUES("varname,oldvalue,originvalue,newvalue,varhost,varhostip,remark,varproject,valid", "#{varname},#{oldvalue},#{originvalue},#{newvalue},#{varhost},#{varhostip},#{remark},#{varproject},#{valid}");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectPaSysVarsByCount(PaSysVars entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("pa_sys_vars");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getVarname())) {sql.WHERE("varname = #{varname}");}
			if(!Strings.isNullOrEmpty(entity.getOldvalue())) {sql.WHERE("oldvalue = #{oldvalue}");}
			if(!Strings.isNullOrEmpty(entity.getOriginvalue())) {sql.WHERE("originvalue = #{originvalue}");}
			if(!Strings.isNullOrEmpty(entity.getNewvalue())) {sql.WHERE("newvalue = #{newvalue}");}
			if(!Strings.isNullOrEmpty(entity.getVarhost())) {sql.WHERE("varhost = #{varhost}");}
			if(!Strings.isNullOrEmpty(entity.getVarhostip())) {sql.WHERE("varhostip = #{varhostip}");}
			if(!Strings.isNullOrEmpty(entity.getRemark())) {sql.WHERE("remark = #{remark}");}
			if(!Strings.isNullOrEmpty(entity.getVarproject())) {sql.WHERE("varproject = #{varproject}");}
			if(!Objects.isNull(entity.getValid())) {sql.WHERE("valid = #{valid}");}
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
	public String selectPaSysVarsByLimt(PaSysVars entity) {
		SQL sql = new SQL().SELECT("*").FROM("pa_sys_vars");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getVarname())) {sql.WHERE("varname = #{varname}");}
			if(!Strings.isNullOrEmpty(entity.getOldvalue())) {sql.WHERE("oldvalue = #{oldvalue}");}
			if(!Strings.isNullOrEmpty(entity.getOriginvalue())) {sql.WHERE("originvalue = #{originvalue}");}
			if(!Strings.isNullOrEmpty(entity.getNewvalue())) {sql.WHERE("newvalue = #{newvalue}");}
			if(!Strings.isNullOrEmpty(entity.getVarhost())) {sql.WHERE("varhost = #{varhost}");}
			if(!Strings.isNullOrEmpty(entity.getVarhostip())) {sql.WHERE("varhostip = #{varhostip}");}
			if(!Strings.isNullOrEmpty(entity.getRemark())) {sql.WHERE("remark = #{remark}");}
			if(!Strings.isNullOrEmpty(entity.getVarproject())) {sql.WHERE("varproject = #{varproject}");}
			if(!Objects.isNull(entity.getValid())) {sql.WHERE("valid = #{valid}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectPaSysVars(PaSysVars entity) {
		SQL sql = new SQL().SELECT("*").FROM("pa_sys_vars");
			if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getVarname())) {sql.WHERE("varname = #{varname}");}
			if(!Strings.isNullOrEmpty(entity.getOldvalue())) {sql.WHERE("oldvalue = #{oldvalue}");}
			if(!Strings.isNullOrEmpty(entity.getOriginvalue())) {sql.WHERE("originvalue = #{originvalue}");}
			if(!Strings.isNullOrEmpty(entity.getNewvalue())) {sql.WHERE("newvalue = #{newvalue}");}
			if(!Strings.isNullOrEmpty(entity.getVarhost())) {sql.WHERE("varhost = #{varhost}");}
			if(!Strings.isNullOrEmpty(entity.getVarhostip())) {sql.WHERE("varhostip = #{varhostip}");}
			if(!Strings.isNullOrEmpty(entity.getRemark())) {sql.WHERE("remark = #{remark}");}
			if(!Strings.isNullOrEmpty(entity.getVarproject())) {sql.WHERE("varproject = #{varproject}");}
			if(!Objects.isNull(entity.getValid())) {sql.WHERE("valid = #{valid}");}

		return sql.toString();
	}
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	public String selectOne(int id) {
		SQL sql = new SQL().SELECT("*").FROM("pa_sys_vars");
		sql.WHERE("varname="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updatePaSysVars(PaSysVars entity) {
		SQL sql = new SQL().UPDATE("pa_sys_vars");
				sql.SET("id = #{id}");
		sql.SET("oldvalue = #{oldvalue}");
		sql.SET("originvalue = #{originvalue}");
		sql.SET("newvalue = #{newvalue}");
		sql.SET("varhost = #{varhost}");
		sql.SET("varhostip = #{varhostip}");
		sql.SET("remark = #{remark}");
		sql.SET("varproject = #{varproject}");
		sql.SET("valid = #{valid}");
		sql.SET("updatetime = now()");

		sql.WHERE("varname = #{varname}");
		return sql.toString();
	}
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public String updatePaSysVarsByNullChk(PaSysVars entity) {
		SQL sql = new SQL().UPDATE("pa_sys_vars");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.SET("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getOldvalue())) {sql.SET("oldvalue = #{oldvalue}");}
			if(!Strings.isNullOrEmpty(entity.getOriginvalue())) {sql.SET("originvalue = #{originvalue}");}
			if(!Strings.isNullOrEmpty(entity.getNewvalue())) {sql.SET("newvalue = #{newvalue}");}
			if(!Strings.isNullOrEmpty(entity.getVarhost())) {sql.SET("varhost = #{varhost}");}
			if(!Strings.isNullOrEmpty(entity.getVarhostip())) {sql.SET("varhostip = #{varhostip}");}
			if(!Strings.isNullOrEmpty(entity.getRemark())) {sql.SET("remark = #{remark}");}
			if(!Strings.isNullOrEmpty(entity.getVarproject())) {sql.SET("varproject = #{varproject}");}
			if(!Objects.isNull(entity.getValid())) {sql.SET("valid = #{valid}");}
		sql.SET("updatetime = now()");

		sql.WHERE("varname = #{varname}");
		return sql.toString();
	}
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public String deletePaSysVars(int id) {
		SQL sql = new SQL().DELETE_FROM("pa_sys_vars");
		sql.WHERE("varname = #{varname}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(int id) {
		SQL sql = new SQL().UPDATE("pa_sys_vars");
		sql.SET("state=2");
		sql.WHERE("varname = #{varname}");
		return sql.toString();
	}
}
