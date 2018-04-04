package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.ActReModel;

/**
 * 
 * provider
 */
public class ActReModelProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertActReModel(ActReModel entity) {
		SQL sql = new SQL().INSERT_INTO("act_re_model");
		sql.VALUES("REV_,NAME_,KEY_,CATEGORY_,CREATE_TIME_,LAST_UPDATE_TIME_,VERSION_,META_INFO_,DEPLOYMENT_ID_,EDITOR_SOURCE_VALUE_ID_,EDITOR_SOURCE_EXTRA_VALUE_ID_,TENANT_ID_", "#{rev},#{name},#{key},#{category},#{createTime},#{lastUpdateTime},#{version},#{metaInfo},#{deploymentId},#{editorSourceValueId},#{editorSourceExtraValueId},#{tenantId}");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectActReModelByCount(ActReModel entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("act_re_model");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getKey())) {sql.WHERE("key = #{key}");}
			if(!Strings.isNullOrEmpty(entity.getCategory())) {sql.WHERE("category = #{category}");}
			if(!Strings.isNullOrEmpty(entity.getCreateTime())) {sql.WHERE("createTime = #{createTime}");}
			if(!Strings.isNullOrEmpty(entity.getLastUpdateTime())) {sql.WHERE("lastUpdateTime = #{lastUpdateTime}");}
			if(!Objects.isNull(entity.getVersion())) {sql.WHERE("version = #{version}");}
			if(!Strings.isNullOrEmpty(entity.getMetaInfo())) {sql.WHERE("metaInfo = #{metaInfo}");}
			if(!Strings.isNullOrEmpty(entity.getDeploymentId())) {sql.WHERE("deploymentId = #{deploymentId}");}
			if(!Strings.isNullOrEmpty(entity.getEditorSourceValueId())) {sql.WHERE("editorSourceValueId = #{editorSourceValueId}");}
			if(!Strings.isNullOrEmpty(entity.getEditorSourceExtraValueId())) {sql.WHERE("editorSourceExtraValueId = #{editorSourceExtraValueId}");}
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
	public String selectActReModelByLimt(ActReModel entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_re_model");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getKey())) {sql.WHERE("key = #{key}");}
			if(!Strings.isNullOrEmpty(entity.getCategory())) {sql.WHERE("category = #{category}");}
			if(!Strings.isNullOrEmpty(entity.getCreateTime())) {sql.WHERE("createTime = #{createTime}");}
			if(!Strings.isNullOrEmpty(entity.getLastUpdateTime())) {sql.WHERE("lastUpdateTime = #{lastUpdateTime}");}
			if(!Objects.isNull(entity.getVersion())) {sql.WHERE("version = #{version}");}
			if(!Strings.isNullOrEmpty(entity.getMetaInfo())) {sql.WHERE("metaInfo = #{metaInfo}");}
			if(!Strings.isNullOrEmpty(entity.getDeploymentId())) {sql.WHERE("deploymentId = #{deploymentId}");}
			if(!Strings.isNullOrEmpty(entity.getEditorSourceValueId())) {sql.WHERE("editorSourceValueId = #{editorSourceValueId}");}
			if(!Strings.isNullOrEmpty(entity.getEditorSourceExtraValueId())) {sql.WHERE("editorSourceExtraValueId = #{editorSourceExtraValueId}");}
			if(!Strings.isNullOrEmpty(entity.getTenantId())) {sql.WHERE("tenantId = #{tenantId}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectActReModel(ActReModel entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_re_model");
			if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getKey())) {sql.WHERE("key = #{key}");}
			if(!Strings.isNullOrEmpty(entity.getCategory())) {sql.WHERE("category = #{category}");}
			if(!Strings.isNullOrEmpty(entity.getCreateTime())) {sql.WHERE("createTime = #{createTime}");}
			if(!Strings.isNullOrEmpty(entity.getLastUpdateTime())) {sql.WHERE("lastUpdateTime = #{lastUpdateTime}");}
			if(!Objects.isNull(entity.getVersion())) {sql.WHERE("version = #{version}");}
			if(!Strings.isNullOrEmpty(entity.getMetaInfo())) {sql.WHERE("metaInfo = #{metaInfo}");}
			if(!Strings.isNullOrEmpty(entity.getDeploymentId())) {sql.WHERE("deploymentId = #{deploymentId}");}
			if(!Strings.isNullOrEmpty(entity.getEditorSourceValueId())) {sql.WHERE("editorSourceValueId = #{editorSourceValueId}");}
			if(!Strings.isNullOrEmpty(entity.getEditorSourceExtraValueId())) {sql.WHERE("editorSourceExtraValueId = #{editorSourceExtraValueId}");}
			if(!Strings.isNullOrEmpty(entity.getTenantId())) {sql.WHERE("tenantId = #{tenantId}");}

		return sql.toString();
	}
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	public String selectOne(int id) {
		SQL sql = new SQL().SELECT("*").FROM("act_re_model");
		sql.WHERE("ID_="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updateActReModel(ActReModel entity) {
		SQL sql = new SQL().UPDATE("act_re_model");
				sql.SET("id = #{id}");
		sql.SET("rev = #{rev}");
		sql.SET("name = #{name}");
		sql.SET("key = #{key}");
		sql.SET("category = #{category}");
		sql.SET("createTime = #{createTime}");
		sql.SET("lastUpdateTime = #{lastUpdateTime}");
		sql.SET("version = #{version}");
		sql.SET("metaInfo = #{metaInfo}");
		sql.SET("deploymentId = #{deploymentId}");
		sql.SET("editorSourceValueId = #{editorSourceValueId}");
		sql.SET("editorSourceExtraValueId = #{editorSourceExtraValueId}");
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
	public String updateActReModelByNullChk(ActReModel entity) {
		SQL sql = new SQL().UPDATE("act_re_model");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.SET("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.SET("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.SET("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getKey())) {sql.SET("key = #{key}");}
			if(!Strings.isNullOrEmpty(entity.getCategory())) {sql.SET("category = #{category}");}
			if(!Strings.isNullOrEmpty(entity.getCreateTime())) {sql.SET("createTime = #{createTime}");}
			if(!Strings.isNullOrEmpty(entity.getLastUpdateTime())) {sql.SET("lastUpdateTime = #{lastUpdateTime}");}
			if(!Objects.isNull(entity.getVersion())) {sql.SET("version = #{version}");}
			if(!Strings.isNullOrEmpty(entity.getMetaInfo())) {sql.SET("metaInfo = #{metaInfo}");}
			if(!Strings.isNullOrEmpty(entity.getDeploymentId())) {sql.SET("deploymentId = #{deploymentId}");}
			if(!Strings.isNullOrEmpty(entity.getEditorSourceValueId())) {sql.SET("editorSourceValueId = #{editorSourceValueId}");}
			if(!Strings.isNullOrEmpty(entity.getEditorSourceExtraValueId())) {sql.SET("editorSourceExtraValueId = #{editorSourceExtraValueId}");}
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
	public String deleteActReModel(int id) {
		SQL sql = new SQL().DELETE_FROM("act_re_model");
		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(int id) {
		SQL sql = new SQL().UPDATE("act_re_model");
		sql.SET("state=2");
		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
}
