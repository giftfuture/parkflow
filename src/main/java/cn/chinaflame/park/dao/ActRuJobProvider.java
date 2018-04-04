package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.ActRuJob;

/**
 * 
 * provider
 */
public class ActRuJobProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertActRuJob(ActRuJob entity) {
		SQL sql = new SQL().INSERT_INTO("act_ru_job");
		sql.VALUES("REV_,TYPE_,LOCK_EXP_TIME_,LOCK_OWNER_,EXCLUSIVE_,EXECUTION_ID_,PROCESS_INSTANCE_ID_,PROC_DEF_ID_,RETRIES_,EXCEPTION_STACK_ID_,EXCEPTION_MSG_,DUEDATE_,REPEAT_,HANDLER_TYPE_,HANDLER_CFG_,TENANT_ID_", "#{rev},#{type},#{lockExpTime},#{lockOwner},#{exclusive},#{executionId},#{processInstanceId},#{procDefId},#{retries},#{exceptionStackId},#{exceptionMsg},#{duedate},#{repeat},#{handlerType},#{handlerCfg},#{tenantId}");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectActRuJobByCount(ActRuJob entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("act_ru_job");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getType())) {sql.WHERE("type = #{type}");}
			if(!Strings.isNullOrEmpty(entity.getLockExpTime())) {sql.WHERE("lockExpTime = #{lockExpTime}");}
			if(!Strings.isNullOrEmpty(entity.getLockOwner())) {sql.WHERE("lockOwner = #{lockOwner}");}
			if(!Objects.isNull(entity.getExclusive())) {sql.WHERE("exclusive = #{exclusive}");}
			if(!Strings.isNullOrEmpty(entity.getExecutionId())) {sql.WHERE("executionId = #{executionId}");}
			if(!Strings.isNullOrEmpty(entity.getProcessInstanceId())) {sql.WHERE("processInstanceId = #{processInstanceId}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.WHERE("procDefId = #{procDefId}");}
			if(!Objects.isNull(entity.getRetries())) {sql.WHERE("retries = #{retries}");}
			if(!Strings.isNullOrEmpty(entity.getExceptionStackId())) {sql.WHERE("exceptionStackId = #{exceptionStackId}");}
			if(!Strings.isNullOrEmpty(entity.getExceptionMsg())) {sql.WHERE("exceptionMsg = #{exceptionMsg}");}
			if(!Strings.isNullOrEmpty(entity.getDuedate())) {sql.WHERE("duedate = #{duedate}");}
			if(!Strings.isNullOrEmpty(entity.getRepeat())) {sql.WHERE("repeat = #{repeat}");}
			if(!Strings.isNullOrEmpty(entity.getHandlerType())) {sql.WHERE("handlerType = #{handlerType}");}
			if(!Strings.isNullOrEmpty(entity.getHandlerCfg())) {sql.WHERE("handlerCfg = #{handlerCfg}");}
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
	public String selectActRuJobByLimt(ActRuJob entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_ru_job");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getType())) {sql.WHERE("type = #{type}");}
			if(!Strings.isNullOrEmpty(entity.getLockExpTime())) {sql.WHERE("lockExpTime = #{lockExpTime}");}
			if(!Strings.isNullOrEmpty(entity.getLockOwner())) {sql.WHERE("lockOwner = #{lockOwner}");}
			if(!Objects.isNull(entity.getExclusive())) {sql.WHERE("exclusive = #{exclusive}");}
			if(!Strings.isNullOrEmpty(entity.getExecutionId())) {sql.WHERE("executionId = #{executionId}");}
			if(!Strings.isNullOrEmpty(entity.getProcessInstanceId())) {sql.WHERE("processInstanceId = #{processInstanceId}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.WHERE("procDefId = #{procDefId}");}
			if(!Objects.isNull(entity.getRetries())) {sql.WHERE("retries = #{retries}");}
			if(!Strings.isNullOrEmpty(entity.getExceptionStackId())) {sql.WHERE("exceptionStackId = #{exceptionStackId}");}
			if(!Strings.isNullOrEmpty(entity.getExceptionMsg())) {sql.WHERE("exceptionMsg = #{exceptionMsg}");}
			if(!Strings.isNullOrEmpty(entity.getDuedate())) {sql.WHERE("duedate = #{duedate}");}
			if(!Strings.isNullOrEmpty(entity.getRepeat())) {sql.WHERE("repeat = #{repeat}");}
			if(!Strings.isNullOrEmpty(entity.getHandlerType())) {sql.WHERE("handlerType = #{handlerType}");}
			if(!Strings.isNullOrEmpty(entity.getHandlerCfg())) {sql.WHERE("handlerCfg = #{handlerCfg}");}
			if(!Strings.isNullOrEmpty(entity.getTenantId())) {sql.WHERE("tenantId = #{tenantId}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectActRuJob(ActRuJob entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_ru_job");
			if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getType())) {sql.WHERE("type = #{type}");}
			if(!Strings.isNullOrEmpty(entity.getLockExpTime())) {sql.WHERE("lockExpTime = #{lockExpTime}");}
			if(!Strings.isNullOrEmpty(entity.getLockOwner())) {sql.WHERE("lockOwner = #{lockOwner}");}
			if(!Objects.isNull(entity.getExclusive())) {sql.WHERE("exclusive = #{exclusive}");}
			if(!Strings.isNullOrEmpty(entity.getExecutionId())) {sql.WHERE("executionId = #{executionId}");}
			if(!Strings.isNullOrEmpty(entity.getProcessInstanceId())) {sql.WHERE("processInstanceId = #{processInstanceId}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.WHERE("procDefId = #{procDefId}");}
			if(!Objects.isNull(entity.getRetries())) {sql.WHERE("retries = #{retries}");}
			if(!Strings.isNullOrEmpty(entity.getExceptionStackId())) {sql.WHERE("exceptionStackId = #{exceptionStackId}");}
			if(!Strings.isNullOrEmpty(entity.getExceptionMsg())) {sql.WHERE("exceptionMsg = #{exceptionMsg}");}
			if(!Strings.isNullOrEmpty(entity.getDuedate())) {sql.WHERE("duedate = #{duedate}");}
			if(!Strings.isNullOrEmpty(entity.getRepeat())) {sql.WHERE("repeat = #{repeat}");}
			if(!Strings.isNullOrEmpty(entity.getHandlerType())) {sql.WHERE("handlerType = #{handlerType}");}
			if(!Strings.isNullOrEmpty(entity.getHandlerCfg())) {sql.WHERE("handlerCfg = #{handlerCfg}");}
			if(!Strings.isNullOrEmpty(entity.getTenantId())) {sql.WHERE("tenantId = #{tenantId}");}

		return sql.toString();
	}
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	public String selectOne(int id) {
		SQL sql = new SQL().SELECT("*").FROM("act_ru_job");
		sql.WHERE("ID_="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updateActRuJob(ActRuJob entity) {
		SQL sql = new SQL().UPDATE("act_ru_job");
				sql.SET("id = #{id}");
		sql.SET("rev = #{rev}");
		sql.SET("type = #{type}");
		sql.SET("lockExpTime = #{lockExpTime}");
		sql.SET("lockOwner = #{lockOwner}");
		sql.SET("exclusive = #{exclusive}");
		sql.SET("executionId = #{executionId}");
		sql.SET("processInstanceId = #{processInstanceId}");
		sql.SET("procDefId = #{procDefId}");
		sql.SET("retries = #{retries}");
		sql.SET("exceptionStackId = #{exceptionStackId}");
		sql.SET("exceptionMsg = #{exceptionMsg}");
		sql.SET("duedate = #{duedate}");
		sql.SET("repeat = #{repeat}");
		sql.SET("handlerType = #{handlerType}");
		sql.SET("handlerCfg = #{handlerCfg}");
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
	public String updateActRuJobByNullChk(ActRuJob entity) {
		SQL sql = new SQL().UPDATE("act_ru_job");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.SET("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.SET("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getType())) {sql.SET("type = #{type}");}
			if(!Strings.isNullOrEmpty(entity.getLockExpTime())) {sql.SET("lockExpTime = #{lockExpTime}");}
			if(!Strings.isNullOrEmpty(entity.getLockOwner())) {sql.SET("lockOwner = #{lockOwner}");}
			if(!Objects.isNull(entity.getExclusive())) {sql.SET("exclusive = #{exclusive}");}
			if(!Strings.isNullOrEmpty(entity.getExecutionId())) {sql.SET("executionId = #{executionId}");}
			if(!Strings.isNullOrEmpty(entity.getProcessInstanceId())) {sql.SET("processInstanceId = #{processInstanceId}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.SET("procDefId = #{procDefId}");}
			if(!Objects.isNull(entity.getRetries())) {sql.SET("retries = #{retries}");}
			if(!Strings.isNullOrEmpty(entity.getExceptionStackId())) {sql.SET("exceptionStackId = #{exceptionStackId}");}
			if(!Strings.isNullOrEmpty(entity.getExceptionMsg())) {sql.SET("exceptionMsg = #{exceptionMsg}");}
			if(!Strings.isNullOrEmpty(entity.getDuedate())) {sql.SET("duedate = #{duedate}");}
			if(!Strings.isNullOrEmpty(entity.getRepeat())) {sql.SET("repeat = #{repeat}");}
			if(!Strings.isNullOrEmpty(entity.getHandlerType())) {sql.SET("handlerType = #{handlerType}");}
			if(!Strings.isNullOrEmpty(entity.getHandlerCfg())) {sql.SET("handlerCfg = #{handlerCfg}");}
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
	public String deleteActRuJob(int id) {
		SQL sql = new SQL().DELETE_FROM("act_ru_job");
		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(int id) {
		SQL sql = new SQL().UPDATE("act_ru_job");
		sql.SET("state=2");
		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
}
