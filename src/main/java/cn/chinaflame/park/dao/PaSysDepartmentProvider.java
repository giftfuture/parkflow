package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.PaSysDepartment;

/**
 * 部门信息表 
 * provider
 */
public class PaSysDepartmentProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertPaSysDepartment(PaSysDepartment entity) {
		SQL sql = new SQL().INSERT_INTO("pa_sys_department");
		sql.VALUES("name,pid,deptremark,level,createby,createtime,updateby,updatetime,state,open", "#{name},#{pid},#{deptremark},#{level},#{createby},now(),#{updateby},now(),#{state},#{open}");
		return sql.toString();
	}
	/**
	 * 按父级查询
	 * @param superdept
	 * @return
	 */
	public String selectPaSysDepartmentBySuper(long  pid) {
		SQL sql = new SQL().SELECT("pa_sys_department.id,pa_sys_department.name,pa_sys_department.pid,pa_sys_department.deptremark,pa_sys_department.level,pa_sys_department.createby,"
				+ "pa_sys_department.createtime,pa_sys_department.updateby,pa_sys_department.updatetime,pa_sys_department.state,pa_sys_department.open, case when psd.name is null then '' else psd.name end supername").FROM("pa_sys_department")
			.LEFT_OUTER_JOIN("pa_sys_department psd on psd.id=pa_sys_department.pid");
			if(!Objects.isNull(pid)) {sql.WHERE("pa_sys_department.pid = #{pid}");}
			sql.WHERE("pa_sys_department.state = 1");
			//if(!Objects.isNull(entity.getLevel())) {sql.WHERE("level = #{level}");}
			//if(!Objects.isNull(entity.getState())) {sql.WHERE("state =1");}
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectPaSysDepartmentByCount(PaSysDepartment entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("pa_sys_department");
					if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Objects.isNull(entity.getPid())) {sql.WHERE("pid = #{pid}");}
			if(!Strings.isNullOrEmpty(entity.getDeptremark())) {sql.WHERE("deptremark = #{deptremark}");}
			if(!Objects.isNull(entity.getLevel())) {sql.WHERE("level = #{level}");}
			if(!Objects.isNull(entity.getCreateby())) {sql.WHERE("createby = #{createby}");}
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("createtime = #{createtime}");}
			if(!Objects.isNull(entity.getUpdateby())) {sql.WHERE("updateby = #{updateby}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("updatetime = #{updatetime}");}
			if(!Objects.isNull(entity.getState())) {sql.WHERE("state = #{state}");}
			if(!Objects.isNull(entity.getOpen())) {sql.WHERE("open = #{open}");}

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
	public String selectPaSysDepartmentByLimt(PaSysDepartment entity) {
		SQL sql = new SQL().SELECT("*").FROM("pa_sys_department");
					if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Objects.isNull(entity.getPid())) {sql.WHERE("pid = #{pid}");}
			if(!Strings.isNullOrEmpty(entity.getDeptremark())) {sql.WHERE("deptremark = #{deptremark}");}
			if(!Objects.isNull(entity.getLevel())) {sql.WHERE("level = #{level}");}
			if(!Objects.isNull(entity.getCreateby())) {sql.WHERE("createby = #{createby}");}
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("createtime = #{createtime}");}
			if(!Objects.isNull(entity.getUpdateby())) {sql.WHERE("updateby = #{updateby}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("updatetime = #{updatetime}");}
			if(!Objects.isNull(entity.getState())) {sql.WHERE("state = #{state}");}
			if(!Objects.isNull(entity.getOpen())) {sql.WHERE("open = #{open}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectPaSysDepartment(PaSysDepartment entity) {
		SQL sql = new SQL().SELECT("*").FROM("pa_sys_department");
			if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Objects.isNull(entity.getPid())) {sql.WHERE("pid = #{pid}");}
			if(!Strings.isNullOrEmpty(entity.getDeptremark())) {sql.WHERE("deptremark = #{deptremark}");}
			if(!Objects.isNull(entity.getLevel())) {sql.WHERE("level = #{level}");}
			if(!Objects.isNull(entity.getCreateby())) {sql.WHERE("createby = #{createby}");}
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("createtime = #{createtime}");}
			if(!Objects.isNull(entity.getUpdateby())) {sql.WHERE("updateby = #{updateby}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("updatetime = #{updatetime}");}
			if(!Objects.isNull(entity.getState())) {sql.WHERE("state = #{state}");}
			if(!Objects.isNull(entity.getOpen())) {sql.WHERE("open = #{open}");}

		return sql.toString();
	}
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	public String selectOne(Long id) {
		SQL sql = new SQL().SELECT("pa_sys_department.id,pa_sys_department.name,pa_sys_department.pid,pa_sys_department.deptremark,pa_sys_department.level,pa_sys_department.createby,"
		+ "pa_sys_department.createtime,pa_sys_department.updateby,pa_sys_department.updatetime,pa_sys_department.state,pa_sys_department.open,case when psd.name is null then '' else psd.name end supername").FROM("pa_sys_department")
		.LEFT_OUTER_JOIN("pa_sys_department psd on psd.id=pa_sys_department.pid");
		if(!Objects.isNull(id)) {sql.WHERE("pa_sys_department.id = #{id}");}
		sql.WHERE("pa_sys_department.state = 1");
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updatePaSysDepartment(PaSysDepartment entity) {
		SQL sql = new SQL().UPDATE("pa_sys_department");
				sql.SET("name = #{name}");
		sql.SET("pid = #{pid}");
		sql.SET("deptremark = #{deptremark}");
		sql.SET("level = #{level}");
		sql.SET("createby = #{createby}");
		sql.SET("updateby = #{updateby}");
		sql.SET("state = #{state}");
		sql.SET("open = #{open}");
		sql.SET("updatetime = now()");

		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public String updatePaSysDepartmentByNullChk(PaSysDepartment entity) {
		SQL sql = new SQL().UPDATE("pa_sys_department");
					if(!Strings.isNullOrEmpty(entity.getName())) {sql.SET("name = #{name}");}
			if(!Objects.isNull(entity.getPid())) {sql.SET("pid = #{pid}");}
			if(!Strings.isNullOrEmpty(entity.getDeptremark())) {sql.SET("deptremark = #{deptremark}");}
			if(!Objects.isNull(entity.getLevel())) {sql.SET("level = #{level}");}
			if(!Objects.isNull(entity.getCreateby())) {sql.SET("createby = #{createby}");}
			if(!Objects.isNull(entity.getUpdateby())) {sql.SET("updateby = #{updateby}");}
			if(!Objects.isNull(entity.getState())) {sql.SET("state = #{state}");}
			if(!Objects.isNull(entity.getOpen())) {sql.SET("open = #{open}");}
		sql.SET("updatetime = now()");

		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public String deletePaSysDepartment(long id) {
		SQL sql = new SQL().DELETE_FROM("pa_sys_department");
		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(long id) {
		SQL sql = new SQL().UPDATE("pa_sys_department");
		sql.SET("state=2");
		sql.WHERE("id = #{id}");
		return sql.toString();
	}
}
