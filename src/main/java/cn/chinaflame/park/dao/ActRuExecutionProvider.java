package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.ActRuExecution;

/**
 * 
 * provider
 */
public class ActRuExecutionProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertActRuExecution(ActRuExecution entity) {
		SQL sql = new SQL().INSERT_INTO("act_ru_execution");
		sql.VALUES("REV_,PROC_INST_ID_,BUSINESS_KEY_,PARENT_ID_,PROC_DEF_ID_,SUPER_EXEC_,ACT_ID_,IS_ACTIVE_,IS_CONCURRENT_,IS_SCOPE_,IS_EVENT_SCOPE_,SUSPENSION_STATE_,CACHED_ENT_STATE_,TENANT_ID_,NAME_,LOCK_TIME_", "#{rev},#{procInstId},#{businessKey},#{parentId},#{procDefId},#{superExec},#{actId},#{isActive},#{isConcurrent},#{isScope},#{isEventScope},#{suspensionState},#{cachedEntState},#{tenantId},#{name},#{lockTime}");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectActRuExecutionByCount(ActRuExecution entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("act_ru_execution");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.WHERE("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getBusinessKey())) {sql.WHERE("businessKey = #{businessKey}");}
			if(!Strings.isNullOrEmpty(entity.getParentId())) {sql.WHERE("parentId = #{parentId}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.WHERE("procDefId = #{procDefId}");}
			if(!Strings.isNullOrEmpty(entity.getSuperExec())) {sql.WHERE("superExec = #{superExec}");}
			if(!Strings.isNullOrEmpty(entity.getActId())) {sql.WHERE("actId = #{actId}");}
			if(!Objects.isNull(entity.getIsActive())) {sql.WHERE("isActive = #{isActive}");}
			if(!Objects.isNull(entity.getIsConcurrent())) {sql.WHERE("isConcurrent = #{isConcurrent}");}
			if(!Objects.isNull(entity.getIsScope())) {sql.WHERE("isScope = #{isScope}");}
			if(!Objects.isNull(entity.getIsEventScope())) {sql.WHERE("isEventScope = #{isEventScope}");}
			if(!Objects.isNull(entity.getSuspensionState())) {sql.WHERE("suspensionState = #{suspensionState}");}
			if(!Objects.isNull(entity.getCachedEntState())) {sql.WHERE("cachedEntState = #{cachedEntState}");}
			if(!Strings.isNullOrEmpty(entity.getTenantId())) {sql.WHERE("tenantId = #{tenantId}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getLockTime())) {sql.WHERE("lockTime = #{lockTime}");}

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
	public String selectActRuExecutionByLimt(ActRuExecution entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_ru_execution");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.WHERE("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getBusinessKey())) {sql.WHERE("businessKey = #{businessKey}");}
			if(!Strings.isNullOrEmpty(entity.getParentId())) {sql.WHERE("parentId = #{parentId}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.WHERE("procDefId = #{procDefId}");}
			if(!Strings.isNullOrEmpty(entity.getSuperExec())) {sql.WHERE("superExec = #{superExec}");}
			if(!Strings.isNullOrEmpty(entity.getActId())) {sql.WHERE("actId = #{actId}");}
			if(!Objects.isNull(entity.getIsActive())) {sql.WHERE("isActive = #{isActive}");}
			if(!Objects.isNull(entity.getIsConcurrent())) {sql.WHERE("isConcurrent = #{isConcurrent}");}
			if(!Objects.isNull(entity.getIsScope())) {sql.WHERE("isScope = #{isScope}");}
			if(!Objects.isNull(entity.getIsEventScope())) {sql.WHERE("isEventScope = #{isEventScope}");}
			if(!Objects.isNull(entity.getSuspensionState())) {sql.WHERE("suspensionState = #{suspensionState}");}
			if(!Objects.isNull(entity.getCachedEntState())) {sql.WHERE("cachedEntState = #{cachedEntState}");}
			if(!Strings.isNullOrEmpty(entity.getTenantId())) {sql.WHERE("tenantId = #{tenantId}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getLockTime())) {sql.WHERE("lockTime = #{lockTime}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectActRuExecution(ActRuExecution entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_ru_execution");
			if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.WHERE("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getBusinessKey())) {sql.WHERE("businessKey = #{businessKey}");}
			if(!Strings.isNullOrEmpty(entity.getParentId())) {sql.WHERE("parentId = #{parentId}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.WHERE("procDefId = #{procDefId}");}
			if(!Strings.isNullOrEmpty(entity.getSuperExec())) {sql.WHERE("superExec = #{superExec}");}
			if(!Strings.isNullOrEmpty(entity.getActId())) {sql.WHERE("actId = #{actId}");}
			if(!Objects.isNull(entity.getIsActive())) {sql.WHERE("isActive = #{isActive}");}
			if(!Objects.isNull(entity.getIsConcurrent())) {sql.WHERE("isConcurrent = #{isConcurrent}");}
			if(!Objects.isNull(entity.getIsScope())) {sql.WHERE("isScope = #{isScope}");}
			if(!Objects.isNull(entity.getIsEventScope())) {sql.WHERE("isEventScope = #{isEventScope}");}
			if(!Objects.isNull(entity.getSuspensionState())) {sql.WHERE("suspensionState = #{suspensionState}");}
			if(!Objects.isNull(entity.getCachedEntState())) {sql.WHERE("cachedEntState = #{cachedEntState}");}
			if(!Strings.isNullOrEmpty(entity.getTenantId())) {sql.WHERE("tenantId = #{tenantId}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getLockTime())) {sql.WHERE("lockTime = #{lockTime}");}

		return sql.toString();
	}
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	public String selectOne(int id) {
		SQL sql = new SQL().SELECT("*").FROM("act_ru_execution");
		sql.WHERE("ID_="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updateActRuExecution(ActRuExecution entity) {
		SQL sql = new SQL().UPDATE("act_ru_execution");
				sql.SET("id = #{id}");
		sql.SET("rev = #{rev}");
		sql.SET("procInstId = #{procInstId}");
		sql.SET("businessKey = #{businessKey}");
		sql.SET("parentId = #{parentId}");
		sql.SET("procDefId = #{procDefId}");
		sql.SET("superExec = #{superExec}");
		sql.SET("actId = #{actId}");
		sql.SET("isActive = #{isActive}");
		sql.SET("isConcurrent = #{isConcurrent}");
		sql.SET("isScope = #{isScope}");
		sql.SET("isEventScope = #{isEventScope}");
		sql.SET("suspensionState = #{suspensionState}");
		sql.SET("cachedEntState = #{cachedEntState}");
		sql.SET("tenantId = #{tenantId}");
		sql.SET("name = #{name}");
		sql.SET("lockTime = #{lockTime}");
		sql.SET("updatetime = now()");

		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public String updateActRuExecutionByNullChk(ActRuExecution entity) {
		SQL sql = new SQL().UPDATE("act_ru_execution");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.SET("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.SET("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.SET("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getBusinessKey())) {sql.SET("businessKey = #{businessKey}");}
			if(!Strings.isNullOrEmpty(entity.getParentId())) {sql.SET("parentId = #{parentId}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.SET("procDefId = #{procDefId}");}
			if(!Strings.isNullOrEmpty(entity.getSuperExec())) {sql.SET("superExec = #{superExec}");}
			if(!Strings.isNullOrEmpty(entity.getActId())) {sql.SET("actId = #{actId}");}
			if(!Objects.isNull(entity.getIsActive())) {sql.SET("isActive = #{isActive}");}
			if(!Objects.isNull(entity.getIsConcurrent())) {sql.SET("isConcurrent = #{isConcurrent}");}
			if(!Objects.isNull(entity.getIsScope())) {sql.SET("isScope = #{isScope}");}
			if(!Objects.isNull(entity.getIsEventScope())) {sql.SET("isEventScope = #{isEventScope}");}
			if(!Objects.isNull(entity.getSuspensionState())) {sql.SET("suspensionState = #{suspensionState}");}
			if(!Objects.isNull(entity.getCachedEntState())) {sql.SET("cachedEntState = #{cachedEntState}");}
			if(!Strings.isNullOrEmpty(entity.getTenantId())) {sql.SET("tenantId = #{tenantId}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.SET("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getLockTime())) {sql.SET("lockTime = #{lockTime}");}
		sql.SET("updatetime = now()");

		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public String deleteActRuExecution(int id) {
		SQL sql = new SQL().DELETE_FROM("act_ru_execution");
		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(int id) {
		SQL sql = new SQL().UPDATE("act_ru_execution");
		sql.SET("state=2");
		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
}
