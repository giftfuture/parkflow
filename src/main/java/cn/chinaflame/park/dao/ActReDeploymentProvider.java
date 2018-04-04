package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.ActReDeployment;

/**
 * 
 * provider
 */
public class ActReDeploymentProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertActReDeployment(ActReDeployment entity) {
		SQL sql = new SQL().INSERT_INTO("act_re_deployment");
		sql.VALUES("NAME_,CATEGORY_,TENANT_ID_,DEPLOY_TIME_", "#{name},#{category},#{tenantId},#{deployTime}");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectActReDeploymentByCount(ActReDeployment entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("act_re_deployment");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getCategory())) {sql.WHERE("category = #{category}");}
			if(!Strings.isNullOrEmpty(entity.getTenantId())) {sql.WHERE("tenantId = #{tenantId}");}
			if(!Strings.isNullOrEmpty(entity.getDeployTime())) {sql.WHERE("deployTime = #{deployTime}");}

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
	public String selectActReDeploymentByLimt(ActReDeployment entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_re_deployment");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getCategory())) {sql.WHERE("category = #{category}");}
			if(!Strings.isNullOrEmpty(entity.getTenantId())) {sql.WHERE("tenantId = #{tenantId}");}
			if(!Strings.isNullOrEmpty(entity.getDeployTime())) {sql.WHERE("deployTime = #{deployTime}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectActReDeployment(ActReDeployment entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_re_deployment");
			if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getCategory())) {sql.WHERE("category = #{category}");}
			if(!Strings.isNullOrEmpty(entity.getTenantId())) {sql.WHERE("tenantId = #{tenantId}");}
			if(!Strings.isNullOrEmpty(entity.getDeployTime())) {sql.WHERE("deployTime = #{deployTime}");}

		return sql.toString();
	}
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	public String selectOne(int id) {
		SQL sql = new SQL().SELECT("*").FROM("act_re_deployment");
		sql.WHERE("ID_="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updateActReDeployment(ActReDeployment entity) {
		SQL sql = new SQL().UPDATE("act_re_deployment");
				sql.SET("id = #{id}");
		sql.SET("name = #{name}");
		sql.SET("category = #{category}");
		sql.SET("tenantId = #{tenantId}");
		sql.SET("deployTime = #{deployTime}");
		sql.SET("updatetime = now()");

		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public String updateActReDeploymentByNullChk(ActReDeployment entity) {
		SQL sql = new SQL().UPDATE("act_re_deployment");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.SET("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.SET("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getCategory())) {sql.SET("category = #{category}");}
			if(!Strings.isNullOrEmpty(entity.getTenantId())) {sql.SET("tenantId = #{tenantId}");}
			if(!Strings.isNullOrEmpty(entity.getDeployTime())) {sql.SET("deployTime = #{deployTime}");}
		sql.SET("updatetime = now()");

		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public String deleteActReDeployment(int id) {
		SQL sql = new SQL().DELETE_FROM("act_re_deployment");
		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(int id) {
		SQL sql = new SQL().UPDATE("act_re_deployment");
		sql.SET("state=2");
		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
}
