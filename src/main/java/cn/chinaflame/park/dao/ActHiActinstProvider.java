package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.ActHiActinst;

/**
 * 
 * provider
 */
public class ActHiActinstProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertActHiActinst(ActHiActinst entity) {
		SQL sql = new SQL().INSERT_INTO("act_hi_actinst");
		sql.VALUES("PROC_DEF_ID_,PROC_INST_ID_,EXECUTION_ID_,ACT_ID_,TASK_ID_,CALL_PROC_INST_ID_,ACT_NAME_,ACT_TYPE_,ASSIGNEE_,START_TIME_,END_TIME_,DURATION_,TENANT_ID_", "#{procDefId},#{procInstId},#{executionId},#{actId},#{taskId},#{callProcInstId},#{actName},#{actType},#{assignee},#{startTime},#{endTime},#{duration},#{tenantId}");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectActHiActinstByCount(ActHiActinst entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("act_hi_actinst");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.WHERE("procDefId = #{procDefId}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.WHERE("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getExecutionId())) {sql.WHERE("executionId = #{executionId}");}
			if(!Strings.isNullOrEmpty(entity.getActId())) {sql.WHERE("actId = #{actId}");}
			if(!Strings.isNullOrEmpty(entity.getTaskId())) {sql.WHERE("taskId = #{taskId}");}
			if(!Strings.isNullOrEmpty(entity.getCallProcInstId())) {sql.WHERE("callProcInstId = #{callProcInstId}");}
			if(!Strings.isNullOrEmpty(entity.getActName())) {sql.WHERE("actName = #{actName}");}
			if(!Strings.isNullOrEmpty(entity.getActType())) {sql.WHERE("actType = #{actType}");}
			if(!Strings.isNullOrEmpty(entity.getAssignee())) {sql.WHERE("assignee = #{assignee}");}
			if(!Strings.isNullOrEmpty(entity.getStartTime())) {sql.WHERE("startTime = #{startTime}");}
			if(!Strings.isNullOrEmpty(entity.getEndTime())) {sql.WHERE("endTime = #{endTime}");}
			if(!Objects.isNull(entity.getDuration())) {sql.WHERE("duration = #{duration}");}
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
	public String selectActHiActinstByLimt(ActHiActinst entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_hi_actinst");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.WHERE("procDefId = #{procDefId}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.WHERE("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getExecutionId())) {sql.WHERE("executionId = #{executionId}");}
			if(!Strings.isNullOrEmpty(entity.getActId())) {sql.WHERE("actId = #{actId}");}
			if(!Strings.isNullOrEmpty(entity.getTaskId())) {sql.WHERE("taskId = #{taskId}");}
			if(!Strings.isNullOrEmpty(entity.getCallProcInstId())) {sql.WHERE("callProcInstId = #{callProcInstId}");}
			if(!Strings.isNullOrEmpty(entity.getActName())) {sql.WHERE("actName = #{actName}");}
			if(!Strings.isNullOrEmpty(entity.getActType())) {sql.WHERE("actType = #{actType}");}
			if(!Strings.isNullOrEmpty(entity.getAssignee())) {sql.WHERE("assignee = #{assignee}");}
			if(!Strings.isNullOrEmpty(entity.getStartTime())) {sql.WHERE("startTime = #{startTime}");}
			if(!Strings.isNullOrEmpty(entity.getEndTime())) {sql.WHERE("endTime = #{endTime}");}
			if(!Objects.isNull(entity.getDuration())) {sql.WHERE("duration = #{duration}");}
			if(!Strings.isNullOrEmpty(entity.getTenantId())) {sql.WHERE("tenantId = #{tenantId}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectActHiActinst(ActHiActinst entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_hi_actinst");
			if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.WHERE("procDefId = #{procDefId}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.WHERE("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getExecutionId())) {sql.WHERE("executionId = #{executionId}");}
			if(!Strings.isNullOrEmpty(entity.getActId())) {sql.WHERE("actId = #{actId}");}
			if(!Strings.isNullOrEmpty(entity.getTaskId())) {sql.WHERE("taskId = #{taskId}");}
			if(!Strings.isNullOrEmpty(entity.getCallProcInstId())) {sql.WHERE("callProcInstId = #{callProcInstId}");}
			if(!Strings.isNullOrEmpty(entity.getActName())) {sql.WHERE("actName = #{actName}");}
			if(!Strings.isNullOrEmpty(entity.getActType())) {sql.WHERE("actType = #{actType}");}
			if(!Strings.isNullOrEmpty(entity.getAssignee())) {sql.WHERE("assignee = #{assignee}");}
			if(!Strings.isNullOrEmpty(entity.getStartTime())) {sql.WHERE("startTime = #{startTime}");}
			if(!Strings.isNullOrEmpty(entity.getEndTime())) {sql.WHERE("endTime = #{endTime}");}
			if(!Objects.isNull(entity.getDuration())) {sql.WHERE("duration = #{duration}");}
			if(!Strings.isNullOrEmpty(entity.getTenantId())) {sql.WHERE("tenantId = #{tenantId}");}

		return sql.toString();
	}
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	public String selectOne(int id) {
		SQL sql = new SQL().SELECT("*").FROM("act_hi_actinst");
		sql.WHERE("ID_="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updateActHiActinst(ActHiActinst entity) {
		SQL sql = new SQL().UPDATE("act_hi_actinst");
				sql.SET("id = #{id}");
		sql.SET("procDefId = #{procDefId}");
		sql.SET("procInstId = #{procInstId}");
		sql.SET("executionId = #{executionId}");
		sql.SET("actId = #{actId}");
		sql.SET("taskId = #{taskId}");
		sql.SET("callProcInstId = #{callProcInstId}");
		sql.SET("actName = #{actName}");
		sql.SET("actType = #{actType}");
		sql.SET("assignee = #{assignee}");
		sql.SET("startTime = #{startTime}");
		sql.SET("endTime = #{endTime}");
		sql.SET("duration = #{duration}");
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
	public String updateActHiActinstByNullChk(ActHiActinst entity) {
		SQL sql = new SQL().UPDATE("act_hi_actinst");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.SET("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.SET("procDefId = #{procDefId}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.SET("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getExecutionId())) {sql.SET("executionId = #{executionId}");}
			if(!Strings.isNullOrEmpty(entity.getActId())) {sql.SET("actId = #{actId}");}
			if(!Strings.isNullOrEmpty(entity.getTaskId())) {sql.SET("taskId = #{taskId}");}
			if(!Strings.isNullOrEmpty(entity.getCallProcInstId())) {sql.SET("callProcInstId = #{callProcInstId}");}
			if(!Strings.isNullOrEmpty(entity.getActName())) {sql.SET("actName = #{actName}");}
			if(!Strings.isNullOrEmpty(entity.getActType())) {sql.SET("actType = #{actType}");}
			if(!Strings.isNullOrEmpty(entity.getAssignee())) {sql.SET("assignee = #{assignee}");}
			if(!Strings.isNullOrEmpty(entity.getStartTime())) {sql.SET("startTime = #{startTime}");}
			if(!Strings.isNullOrEmpty(entity.getEndTime())) {sql.SET("endTime = #{endTime}");}
			if(!Objects.isNull(entity.getDuration())) {sql.SET("duration = #{duration}");}
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
	public String deleteActHiActinst(int id) {
		SQL sql = new SQL().DELETE_FROM("act_hi_actinst");
		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(int id) {
		SQL sql = new SQL().UPDATE("act_hi_actinst");
		sql.SET("state=2");
		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
}
