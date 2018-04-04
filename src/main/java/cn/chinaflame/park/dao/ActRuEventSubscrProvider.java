package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.ActRuEventSubscr;

/**
 * 
 * provider
 */
public class ActRuEventSubscrProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertActRuEventSubscr(ActRuEventSubscr entity) {
		SQL sql = new SQL().INSERT_INTO("act_ru_event_subscr");
		sql.VALUES("REV_,EVENT_TYPE_,EVENT_NAME_,EXECUTION_ID_,PROC_INST_ID_,ACTIVITY_ID_,CONFIGURATION_,CREATED_,PROC_DEF_ID_,TENANT_ID_", "#{rev},#{eventType},#{eventName},#{executionId},#{procInstId},#{activityId},#{configuration},#{created},#{procDefId},#{tenantId}");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectActRuEventSubscrByCount(ActRuEventSubscr entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("act_ru_event_subscr");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getEventType())) {sql.WHERE("eventType = #{eventType}");}
			if(!Strings.isNullOrEmpty(entity.getEventName())) {sql.WHERE("eventName = #{eventName}");}
			if(!Strings.isNullOrEmpty(entity.getExecutionId())) {sql.WHERE("executionId = #{executionId}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.WHERE("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getActivityId())) {sql.WHERE("activityId = #{activityId}");}
			if(!Strings.isNullOrEmpty(entity.getConfiguration())) {sql.WHERE("configuration = #{configuration}");}
			if(!Strings.isNullOrEmpty(entity.getCreated())) {sql.WHERE("created = #{created}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.WHERE("procDefId = #{procDefId}");}
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
	public String selectActRuEventSubscrByLimt(ActRuEventSubscr entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_ru_event_subscr");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getEventType())) {sql.WHERE("eventType = #{eventType}");}
			if(!Strings.isNullOrEmpty(entity.getEventName())) {sql.WHERE("eventName = #{eventName}");}
			if(!Strings.isNullOrEmpty(entity.getExecutionId())) {sql.WHERE("executionId = #{executionId}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.WHERE("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getActivityId())) {sql.WHERE("activityId = #{activityId}");}
			if(!Strings.isNullOrEmpty(entity.getConfiguration())) {sql.WHERE("configuration = #{configuration}");}
			if(!Strings.isNullOrEmpty(entity.getCreated())) {sql.WHERE("created = #{created}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.WHERE("procDefId = #{procDefId}");}
			if(!Strings.isNullOrEmpty(entity.getTenantId())) {sql.WHERE("tenantId = #{tenantId}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectActRuEventSubscr(ActRuEventSubscr entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_ru_event_subscr");
			if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getEventType())) {sql.WHERE("eventType = #{eventType}");}
			if(!Strings.isNullOrEmpty(entity.getEventName())) {sql.WHERE("eventName = #{eventName}");}
			if(!Strings.isNullOrEmpty(entity.getExecutionId())) {sql.WHERE("executionId = #{executionId}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.WHERE("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getActivityId())) {sql.WHERE("activityId = #{activityId}");}
			if(!Strings.isNullOrEmpty(entity.getConfiguration())) {sql.WHERE("configuration = #{configuration}");}
			if(!Strings.isNullOrEmpty(entity.getCreated())) {sql.WHERE("created = #{created}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.WHERE("procDefId = #{procDefId}");}
			if(!Strings.isNullOrEmpty(entity.getTenantId())) {sql.WHERE("tenantId = #{tenantId}");}

		return sql.toString();
	}
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	public String selectOne(int id) {
		SQL sql = new SQL().SELECT("*").FROM("act_ru_event_subscr");
		sql.WHERE("ID_="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updateActRuEventSubscr(ActRuEventSubscr entity) {
		SQL sql = new SQL().UPDATE("act_ru_event_subscr");
				sql.SET("id = #{id}");
		sql.SET("rev = #{rev}");
		sql.SET("eventType = #{eventType}");
		sql.SET("eventName = #{eventName}");
		sql.SET("executionId = #{executionId}");
		sql.SET("procInstId = #{procInstId}");
		sql.SET("activityId = #{activityId}");
		sql.SET("configuration = #{configuration}");
		sql.SET("created = #{created}");
		sql.SET("procDefId = #{procDefId}");
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
	public String updateActRuEventSubscrByNullChk(ActRuEventSubscr entity) {
		SQL sql = new SQL().UPDATE("act_ru_event_subscr");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.SET("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.SET("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getEventType())) {sql.SET("eventType = #{eventType}");}
			if(!Strings.isNullOrEmpty(entity.getEventName())) {sql.SET("eventName = #{eventName}");}
			if(!Strings.isNullOrEmpty(entity.getExecutionId())) {sql.SET("executionId = #{executionId}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.SET("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getActivityId())) {sql.SET("activityId = #{activityId}");}
			if(!Strings.isNullOrEmpty(entity.getConfiguration())) {sql.SET("configuration = #{configuration}");}
			if(!Strings.isNullOrEmpty(entity.getCreated())) {sql.SET("created = #{created}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.SET("procDefId = #{procDefId}");}
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
	public String deleteActRuEventSubscr(int id) {
		SQL sql = new SQL().DELETE_FROM("act_ru_event_subscr");
		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(int id) {
		SQL sql = new SQL().UPDATE("act_ru_event_subscr");
		sql.SET("state=2");
		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
}
