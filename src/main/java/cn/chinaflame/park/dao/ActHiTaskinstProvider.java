package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.ActHiTaskinst;

/**
 * 
 * provider
 */
public class ActHiTaskinstProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertActHiTaskinst(ActHiTaskinst entity) {
		SQL sql = new SQL().INSERT_INTO("act_hi_taskinst");
		sql.VALUES("PROC_DEF_ID_,TASK_DEF_KEY_,PROC_INST_ID_,EXECUTION_ID_,NAME_,PARENT_TASK_ID_,DESCRIPTION_,OWNER_,ASSIGNEE_,START_TIME_,CLAIM_TIME_,END_TIME_,DURATION_,DELETE_REASON_,PRIORITY_,DUE_DATE_,FORM_KEY_,CATEGORY_,TENANT_ID_", "#{procDefId},#{taskDefKey},#{procInstId},#{executionId},#{name},#{parentTaskId},#{description},#{owner},#{assignee},#{startTime},#{claimTime},#{endTime},#{duration},#{deleteReason},#{priority},#{dueDate},#{formKey},#{category},#{tenantId}");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectActHiTaskinstByCount(ActHiTaskinst entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("act_hi_taskinst");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.WHERE("procDefId = #{procDefId}");}
			if(!Strings.isNullOrEmpty(entity.getTaskDefKey())) {sql.WHERE("taskDefKey = #{taskDefKey}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.WHERE("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getExecutionId())) {sql.WHERE("executionId = #{executionId}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getParentTaskId())) {sql.WHERE("parentTaskId = #{parentTaskId}");}
			if(!Strings.isNullOrEmpty(entity.getDescription())) {sql.WHERE("description = #{description}");}
			if(!Strings.isNullOrEmpty(entity.getOwner())) {sql.WHERE("owner = #{owner}");}
			if(!Strings.isNullOrEmpty(entity.getAssignee())) {sql.WHERE("assignee = #{assignee}");}
			if(!Strings.isNullOrEmpty(entity.getStartTime())) {sql.WHERE("startTime = #{startTime}");}
			if(!Strings.isNullOrEmpty(entity.getClaimTime())) {sql.WHERE("claimTime = #{claimTime}");}
			if(!Strings.isNullOrEmpty(entity.getEndTime())) {sql.WHERE("endTime = #{endTime}");}
			if(!Objects.isNull(entity.getDuration())) {sql.WHERE("duration = #{duration}");}
			if(!Strings.isNullOrEmpty(entity.getDeleteReason())) {sql.WHERE("deleteReason = #{deleteReason}");}
			if(!Objects.isNull(entity.getPriority())) {sql.WHERE("priority = #{priority}");}
			if(!Strings.isNullOrEmpty(entity.getDueDate())) {sql.WHERE("dueDate = #{dueDate}");}
			if(!Strings.isNullOrEmpty(entity.getFormKey())) {sql.WHERE("formKey = #{formKey}");}
			if(!Strings.isNullOrEmpty(entity.getCategory())) {sql.WHERE("category = #{category}");}
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
	public String selectActHiTaskinstByLimt(ActHiTaskinst entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_hi_taskinst");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.WHERE("procDefId = #{procDefId}");}
			if(!Strings.isNullOrEmpty(entity.getTaskDefKey())) {sql.WHERE("taskDefKey = #{taskDefKey}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.WHERE("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getExecutionId())) {sql.WHERE("executionId = #{executionId}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getParentTaskId())) {sql.WHERE("parentTaskId = #{parentTaskId}");}
			if(!Strings.isNullOrEmpty(entity.getDescription())) {sql.WHERE("description = #{description}");}
			if(!Strings.isNullOrEmpty(entity.getOwner())) {sql.WHERE("owner = #{owner}");}
			if(!Strings.isNullOrEmpty(entity.getAssignee())) {sql.WHERE("assignee = #{assignee}");}
			if(!Strings.isNullOrEmpty(entity.getStartTime())) {sql.WHERE("startTime = #{startTime}");}
			if(!Strings.isNullOrEmpty(entity.getClaimTime())) {sql.WHERE("claimTime = #{claimTime}");}
			if(!Strings.isNullOrEmpty(entity.getEndTime())) {sql.WHERE("endTime = #{endTime}");}
			if(!Objects.isNull(entity.getDuration())) {sql.WHERE("duration = #{duration}");}
			if(!Strings.isNullOrEmpty(entity.getDeleteReason())) {sql.WHERE("deleteReason = #{deleteReason}");}
			if(!Objects.isNull(entity.getPriority())) {sql.WHERE("priority = #{priority}");}
			if(!Strings.isNullOrEmpty(entity.getDueDate())) {sql.WHERE("dueDate = #{dueDate}");}
			if(!Strings.isNullOrEmpty(entity.getFormKey())) {sql.WHERE("formKey = #{formKey}");}
			if(!Strings.isNullOrEmpty(entity.getCategory())) {sql.WHERE("category = #{category}");}
			if(!Strings.isNullOrEmpty(entity.getTenantId())) {sql.WHERE("tenantId = #{tenantId}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectActHiTaskinst(ActHiTaskinst entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_hi_taskinst");
			if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.WHERE("procDefId = #{procDefId}");}
			if(!Strings.isNullOrEmpty(entity.getTaskDefKey())) {sql.WHERE("taskDefKey = #{taskDefKey}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.WHERE("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getExecutionId())) {sql.WHERE("executionId = #{executionId}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getParentTaskId())) {sql.WHERE("parentTaskId = #{parentTaskId}");}
			if(!Strings.isNullOrEmpty(entity.getDescription())) {sql.WHERE("description = #{description}");}
			if(!Strings.isNullOrEmpty(entity.getOwner())) {sql.WHERE("owner = #{owner}");}
			if(!Strings.isNullOrEmpty(entity.getAssignee())) {sql.WHERE("assignee = #{assignee}");}
			if(!Strings.isNullOrEmpty(entity.getStartTime())) {sql.WHERE("startTime = #{startTime}");}
			if(!Strings.isNullOrEmpty(entity.getClaimTime())) {sql.WHERE("claimTime = #{claimTime}");}
			if(!Strings.isNullOrEmpty(entity.getEndTime())) {sql.WHERE("endTime = #{endTime}");}
			if(!Objects.isNull(entity.getDuration())) {sql.WHERE("duration = #{duration}");}
			if(!Strings.isNullOrEmpty(entity.getDeleteReason())) {sql.WHERE("deleteReason = #{deleteReason}");}
			if(!Objects.isNull(entity.getPriority())) {sql.WHERE("priority = #{priority}");}
			if(!Strings.isNullOrEmpty(entity.getDueDate())) {sql.WHERE("dueDate = #{dueDate}");}
			if(!Strings.isNullOrEmpty(entity.getFormKey())) {sql.WHERE("formKey = #{formKey}");}
			if(!Strings.isNullOrEmpty(entity.getCategory())) {sql.WHERE("category = #{category}");}
			if(!Strings.isNullOrEmpty(entity.getTenantId())) {sql.WHERE("tenantId = #{tenantId}");}

		return sql.toString();
	}
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	public String selectOne(int id) {
		SQL sql = new SQL().SELECT("*").FROM("act_hi_taskinst");
		sql.WHERE("ID_="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updateActHiTaskinst(ActHiTaskinst entity) {
		SQL sql = new SQL().UPDATE("act_hi_taskinst");
				sql.SET("id = #{id}");
		sql.SET("procDefId = #{procDefId}");
		sql.SET("taskDefKey = #{taskDefKey}");
		sql.SET("procInstId = #{procInstId}");
		sql.SET("executionId = #{executionId}");
		sql.SET("name = #{name}");
		sql.SET("parentTaskId = #{parentTaskId}");
		sql.SET("description = #{description}");
		sql.SET("owner = #{owner}");
		sql.SET("assignee = #{assignee}");
		sql.SET("startTime = #{startTime}");
		sql.SET("claimTime = #{claimTime}");
		sql.SET("endTime = #{endTime}");
		sql.SET("duration = #{duration}");
		sql.SET("deleteReason = #{deleteReason}");
		sql.SET("priority = #{priority}");
		sql.SET("dueDate = #{dueDate}");
		sql.SET("formKey = #{formKey}");
		sql.SET("category = #{category}");
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
	public String updateActHiTaskinstByNullChk(ActHiTaskinst entity) {
		SQL sql = new SQL().UPDATE("act_hi_taskinst");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.SET("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.SET("procDefId = #{procDefId}");}
			if(!Strings.isNullOrEmpty(entity.getTaskDefKey())) {sql.SET("taskDefKey = #{taskDefKey}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.SET("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getExecutionId())) {sql.SET("executionId = #{executionId}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.SET("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getParentTaskId())) {sql.SET("parentTaskId = #{parentTaskId}");}
			if(!Strings.isNullOrEmpty(entity.getDescription())) {sql.SET("description = #{description}");}
			if(!Strings.isNullOrEmpty(entity.getOwner())) {sql.SET("owner = #{owner}");}
			if(!Strings.isNullOrEmpty(entity.getAssignee())) {sql.SET("assignee = #{assignee}");}
			if(!Strings.isNullOrEmpty(entity.getStartTime())) {sql.SET("startTime = #{startTime}");}
			if(!Strings.isNullOrEmpty(entity.getClaimTime())) {sql.SET("claimTime = #{claimTime}");}
			if(!Strings.isNullOrEmpty(entity.getEndTime())) {sql.SET("endTime = #{endTime}");}
			if(!Objects.isNull(entity.getDuration())) {sql.SET("duration = #{duration}");}
			if(!Strings.isNullOrEmpty(entity.getDeleteReason())) {sql.SET("deleteReason = #{deleteReason}");}
			if(!Objects.isNull(entity.getPriority())) {sql.SET("priority = #{priority}");}
			if(!Strings.isNullOrEmpty(entity.getDueDate())) {sql.SET("dueDate = #{dueDate}");}
			if(!Strings.isNullOrEmpty(entity.getFormKey())) {sql.SET("formKey = #{formKey}");}
			if(!Strings.isNullOrEmpty(entity.getCategory())) {sql.SET("category = #{category}");}
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
	public String deleteActHiTaskinst(int id) {
		SQL sql = new SQL().DELETE_FROM("act_hi_taskinst");
		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(int id) {
		SQL sql = new SQL().UPDATE("act_hi_taskinst");
		sql.SET("state=2");
		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
}
