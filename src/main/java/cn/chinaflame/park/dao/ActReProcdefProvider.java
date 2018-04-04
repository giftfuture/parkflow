package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.ActReProcdef;

/**
 * 
 * provider
 */
public class ActReProcdefProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertActReProcdef(ActReProcdef entity) {
		SQL sql = new SQL().INSERT_INTO("act_re_procdef");
		sql.VALUES("REV_,CATEGORY_,NAME_,KEY_,VERSION_,DEPLOYMENT_ID_,RESOURCE_NAME_,DGRM_RESOURCE_NAME_,DESCRIPTION_,HAS_START_FORM_KEY_,HAS_GRAPHICAL_NOTATION_,SUSPENSION_STATE_,TENANT_ID_", "#{rev},#{category},#{name},#{key},#{version},#{deploymentId},#{resourceName},#{dgrmResourceName},#{description},#{hasStartFormKey},#{hasGraphicalNotation},#{suspensionState},#{tenantId}");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectActReProcdefByCount(ActReProcdef entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("act_re_procdef");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getCategory())) {sql.WHERE("category = #{category}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getKey())) {sql.WHERE("key = #{key}");}
			if(!Objects.isNull(entity.getVersion())) {sql.WHERE("version = #{version}");}
			if(!Strings.isNullOrEmpty(entity.getDeploymentId())) {sql.WHERE("deploymentId = #{deploymentId}");}
			if(!Strings.isNullOrEmpty(entity.getResourceName())) {sql.WHERE("resourceName = #{resourceName}");}
			if(!Strings.isNullOrEmpty(entity.getDgrmResourceName())) {sql.WHERE("dgrmResourceName = #{dgrmResourceName}");}
			if(!Strings.isNullOrEmpty(entity.getDescription())) {sql.WHERE("description = #{description}");}
			if(!Objects.isNull(entity.getHasStartFormKey())) {sql.WHERE("hasStartFormKey = #{hasStartFormKey}");}
			if(!Objects.isNull(entity.getHasGraphicalNotation())) {sql.WHERE("hasGraphicalNotation = #{hasGraphicalNotation}");}
			if(!Objects.isNull(entity.getSuspensionState())) {sql.WHERE("suspensionState = #{suspensionState}");}
			if(!Strings.isNullOrEmpty(entity.getTenantId())) {sql.WHERE("tenantId = #{tenantId}");}

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
	public String selectActReProcdefByLimt(ActReProcdef entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_re_procdef");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getCategory())) {sql.WHERE("category = #{category}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getKey())) {sql.WHERE("key = #{key}");}
			if(!Objects.isNull(entity.getVersion())) {sql.WHERE("version = #{version}");}
			if(!Strings.isNullOrEmpty(entity.getDeploymentId())) {sql.WHERE("deploymentId = #{deploymentId}");}
			if(!Strings.isNullOrEmpty(entity.getResourceName())) {sql.WHERE("resourceName = #{resourceName}");}
			if(!Strings.isNullOrEmpty(entity.getDgrmResourceName())) {sql.WHERE("dgrmResourceName = #{dgrmResourceName}");}
			if(!Strings.isNullOrEmpty(entity.getDescription())) {sql.WHERE("description = #{description}");}
			if(!Objects.isNull(entity.getHasStartFormKey())) {sql.WHERE("hasStartFormKey = #{hasStartFormKey}");}
			if(!Objects.isNull(entity.getHasGraphicalNotation())) {sql.WHERE("hasGraphicalNotation = #{hasGraphicalNotation}");}
			if(!Objects.isNull(entity.getSuspensionState())) {sql.WHERE("suspensionState = #{suspensionState}");}
			if(!Strings.isNullOrEmpty(entity.getTenantId())) {sql.WHERE("tenantId = #{tenantId}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectActReProcdef(ActReProcdef entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_re_procdef");
			if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getCategory())) {sql.WHERE("category = #{category}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getKey())) {sql.WHERE("key = #{key}");}
			if(!Objects.isNull(entity.getVersion())) {sql.WHERE("version = #{version}");}
			if(!Strings.isNullOrEmpty(entity.getDeploymentId())) {sql.WHERE("deploymentId = #{deploymentId}");}
			if(!Strings.isNullOrEmpty(entity.getResourceName())) {sql.WHERE("resourceName = #{resourceName}");}
			if(!Strings.isNullOrEmpty(entity.getDgrmResourceName())) {sql.WHERE("dgrmResourceName = #{dgrmResourceName}");}
			if(!Strings.isNullOrEmpty(entity.getDescription())) {sql.WHERE("description = #{description}");}
			if(!Objects.isNull(entity.getHasStartFormKey())) {sql.WHERE("hasStartFormKey = #{hasStartFormKey}");}
			if(!Objects.isNull(entity.getHasGraphicalNotation())) {sql.WHERE("hasGraphicalNotation = #{hasGraphicalNotation}");}
			if(!Objects.isNull(entity.getSuspensionState())) {sql.WHERE("suspensionState = #{suspensionState}");}
			if(!Strings.isNullOrEmpty(entity.getTenantId())) {sql.WHERE("tenantId = #{tenantId}");}

		return sql.toString();
	}
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	public String selectOne(int id) {
		SQL sql = new SQL().SELECT("*").FROM("act_re_procdef");
		sql.WHERE("ID_="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updateActReProcdef(ActReProcdef entity) {
		SQL sql = new SQL().UPDATE("act_re_procdef");
				sql.SET("id = #{id}");
		sql.SET("rev = #{rev}");
		sql.SET("category = #{category}");
		sql.SET("name = #{name}");
		sql.SET("key = #{key}");
		sql.SET("version = #{version}");
		sql.SET("deploymentId = #{deploymentId}");
		sql.SET("resourceName = #{resourceName}");
		sql.SET("dgrmResourceName = #{dgrmResourceName}");
		sql.SET("description = #{description}");
		sql.SET("hasStartFormKey = #{hasStartFormKey}");
		sql.SET("hasGraphicalNotation = #{hasGraphicalNotation}");
		sql.SET("suspensionState = #{suspensionState}");
		sql.SET("tenantId = #{tenantId}");
		sql.SET("updatetime = now()");

		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public String updateActReProcdefByNullChk(ActReProcdef entity) {
		SQL sql = new SQL().UPDATE("act_re_procdef");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.SET("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.SET("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getCategory())) {sql.SET("category = #{category}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.SET("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getKey())) {sql.SET("key = #{key}");}
			if(!Objects.isNull(entity.getVersion())) {sql.SET("version = #{version}");}
			if(!Strings.isNullOrEmpty(entity.getDeploymentId())) {sql.SET("deploymentId = #{deploymentId}");}
			if(!Strings.isNullOrEmpty(entity.getResourceName())) {sql.SET("resourceName = #{resourceName}");}
			if(!Strings.isNullOrEmpty(entity.getDgrmResourceName())) {sql.SET("dgrmResourceName = #{dgrmResourceName}");}
			if(!Strings.isNullOrEmpty(entity.getDescription())) {sql.SET("description = #{description}");}
			if(!Objects.isNull(entity.getHasStartFormKey())) {sql.SET("hasStartFormKey = #{hasStartFormKey}");}
			if(!Objects.isNull(entity.getHasGraphicalNotation())) {sql.SET("hasGraphicalNotation = #{hasGraphicalNotation}");}
			if(!Objects.isNull(entity.getSuspensionState())) {sql.SET("suspensionState = #{suspensionState}");}
			if(!Strings.isNullOrEmpty(entity.getTenantId())) {sql.SET("tenantId = #{tenantId}");}
		sql.SET("updatetime = now()");

		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public String deleteActReProcdef(int id) {
		SQL sql = new SQL().DELETE_FROM("act_re_procdef");
		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(int id) {
		SQL sql = new SQL().UPDATE("act_re_procdef");
		sql.SET("state=2");
		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
}
