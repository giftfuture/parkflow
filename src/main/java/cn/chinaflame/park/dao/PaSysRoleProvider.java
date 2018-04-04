package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.PaSysRole;

/**
 * 角色信息表 
 * provider
 */
public class PaSysRoleProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertPaSysRole(PaSysRole entity) {
		SQL sql = new SQL().INSERT_INTO("pa_sys_role");
		sql.VALUES("roleid,rolename,enalias,state,remark,createby,createtime,updateby,updatetime,permissions,admin", "#{roleid},#{rolename},#{enalias},#{state},#{remark},#{createby},now(),#{updateby},now(),#{permissions},#{admin}");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectPaSysRoleByCount(PaSysRole entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("pa_sys_role");
					if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getRoleid())) {sql.WHERE("roleid = #{roleid}");}
			if(!Strings.isNullOrEmpty(entity.getRolename())) {sql.WHERE("rolename = #{rolename}");}
			sql.WHERE("state = 1");
			if(!Strings.isNullOrEmpty(entity.getRemark())) {sql.WHERE("remark = #{remark}");}
			if(!Objects.isNull(entity.getCreateby())) {sql.WHERE("createby = #{createby}");}
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("createtime = #{createtime}");}
			if(!Objects.isNull(entity.getUpdateby())) {sql.WHERE("updateby = #{updateby}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("updatetime = #{updatetime}");}
			if(!Strings.isNullOrEmpty(entity.getPermissions())) {sql.WHERE("permissions = #{permissions}");}
			if(!Objects.isNull(entity.getAdmin())) {sql.WHERE("admin = #{admin}");}
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
	public String selectPaSysRoleByLimt(PaSysRole entity) {
			SQL sql = new SQL().SELECT("id,rolename,enalias,case state when 1 then '启用' when 2 then '禁用' else '' end state,remark,createby,createtime,updateby,updatetime,permissions,case admin when 1 then '超级管理员' when 2 then '用户' else '' end admin").FROM("pa_sys_role");
			if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getRoleid())) {sql.WHERE("roleid = #{roleid}");}
			if(!Strings.isNullOrEmpty(entity.getRolename())) {sql.WHERE("rolename = #{rolename}");}
			sql.WHERE("state = 1");
			if(!Strings.isNullOrEmpty(entity.getRemark())) {sql.WHERE("remark = #{remark}");}
	  		if(!Objects.isNull(entity.getCreateby())) {sql.WHERE("createby = #{createby}");}
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("createtime = #{createtime}");}
			if(!Objects.isNull(entity.getUpdateby())) {sql.WHERE("updateby = #{updateby}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("updatetime = #{updatetime}");}
			if(!Strings.isNullOrEmpty(entity.getPermissions())) {sql.WHERE("permissions = #{permissions}");}
			if(!Objects.isNull(entity.getAdmin())) {sql.WHERE("admin = #{admin}");}

		return sql.toString() + " order by id desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectPaSysRole(PaSysRole entity) {
		SQL sql = new SQL().SELECT("id,rolename,enalias,case state when 1 then '启用' when 2 then '禁用' else '' end state,remark,createby,createtime,updateby,updatetime,permissions,case admin when 1 then '超级管理员' when 2 then '用户' else '' end admin").FROM("pa_sys_role");
			if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getRoleid())) {sql.WHERE("roleid = #{roleid}");}
			if(!Strings.isNullOrEmpty(entity.getRolename())) {sql.WHERE("rolename = #{rolename}");}
			sql.WHERE("state = 1");
			if(!Strings.isNullOrEmpty(entity.getRemark())) {sql.WHERE("remark = #{remark}");}
			if(!Objects.isNull(entity.getCreateby())) {sql.WHERE("createby = #{createby}");}
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("createtime = #{createtime}");}
			if(!Objects.isNull(entity.getUpdateby())) {sql.WHERE("updateby = #{updateby}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("updatetime = #{updatetime}");}
			if(!Strings.isNullOrEmpty(entity.getPermissions())) {sql.WHERE("permissions = #{permissions}");}
			if(!Objects.isNull(entity.getAdmin())) {sql.WHERE("admin = #{admin}");}
			return sql.toString() + " order by id desc ";
	}
	
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String searchPaSysRole(PaSysRole entity) {
		SQL sql = new SQL().SELECT("id,rolename,enalias,case state when 1 then '启用' when 2 then '禁用' else '' end state,remark,createby,createtime,updateby,updatetime,permissions,case admin when 1 then '超级管理员' when 2 then '用户' else '' end admin").FROM("pa_sys_role");
			if(!Objects.isNull(entity.getRoleid())) {sql.WHERE("roleid like concat(concat('%', #{roleid}),'%')");}
			if(!Strings.isNullOrEmpty(entity.getRolename())) {sql.WHERE("rolename  like concat(concat('%', #{rolename}),'%')");}
			if(!Strings.isNullOrEmpty(entity.getRemark())) {sql.WHERE("remark  like concat(concat('%', #{remark}),'%')");}
			sql.WHERE("state = 1");
		return sql.toString();
	}
	
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	public String selectOne(int id) {
		SQL sql = new SQL().SELECT("*").FROM("pa_sys_role");
		sql.WHERE("state = 1");
		sql.WHERE("id="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updatePaSysRole(PaSysRole entity) {
		SQL sql = new SQL().UPDATE("pa_sys_role");
				sql.SET("roleid = #{roleid}");
		sql.SET("rolename = #{rolename}");
		sql.SET("state = #{state}");
		sql.SET("remark = #{remark}");
		sql.SET("createby = #{createby}");
		sql.SET("updateby = #{updateby}");
		sql.SET("permissions = #{permissions}");
		sql.SET("admin = #{admin}");
		sql.SET("updatetime = now()");
		sql.SET("enalias=#{enalias}");
		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public String updatePaSysRoleByNullChk(PaSysRole entity) {
		SQL sql = new SQL().UPDATE("pa_sys_role");
			if(!Objects.isNull(entity.getRoleid())) {sql.SET("roleid = #{roleid}");}
			if(!Strings.isNullOrEmpty(entity.getRolename())) {sql.SET("rolename = #{rolename}");}
			if(!Objects.isNull(entity.getState())) {sql.SET("state = #{state}");}
			if(!Strings.isNullOrEmpty(entity.getRemark())) {sql.SET("remark = #{remark}");}
			if(!Objects.isNull(entity.getCreateby())) {sql.SET("createby = #{createby}");}
			if(!Objects.isNull(entity.getUpdateby())) {sql.SET("updateby = #{updateby}");}
			if(!Strings.isNullOrEmpty(entity.getPermissions())) {sql.SET("permissions = #{permissions}");}
			if(!Objects.isNull(entity.getAdmin())) {sql.SET("admin = #{admin}");}
			if(!Objects.isNull(entity.getEnalias())) {sql.SET("enalias = #{enalias}");}
		sql.SET("updatetime = now()");

		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public String deletePaSysRole(long id) {
		SQL sql = new SQL().DELETE_FROM("pa_sys_role");
		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(long id) {
		SQL sql = new SQL().UPDATE("pa_sys_role");
		sql.SET("state=2");
		sql.WHERE("id = #{id}");
		return sql.toString();
	}
}
