package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.ActRuTask;

/**
 * 
 * provider
 */
public class ActRuTaskProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertActRuTask(ActRuTask entity) {
		SQL sql = new SQL().INSERT_INTO("act_ru_task");
		sql.VALUES("REV_,EXECUTION_ID_,PROC_INST_ID_,PROC_DEF_ID_,NAME_,PARENT_TASK_ID_,DESCRIPTION_,TASK_DEF_KEY_,OWNER_,ASSIGNEE_,DELEGATION_,PRIORITY_,CREATE_TIME_,DUE_DATE_,CATEGORY_,SUSPENSION_STATE_,TENANT_ID_,FORM_KEY_", "#{rev},#{executionId},#{procInstId},#{procDefId},#{name},#{parentTaskId},#{description},#{taskDefKey},#{owner},#{assignee},#{delegation},#{priority},#{createTime},#{dueDate},#{category},#{suspensionState},#{tenantId},#{formKey}");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectActRuTaskByCount(ActRuTask entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("act_ru_task");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getExecutionId())) {sql.WHERE("executionId = #{executionId}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.WHERE("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.WHERE("procDefId = #{procDefId}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getParentTaskId())) {sql.WHERE("parentTaskId = #{parentTaskId}");}
			if(!Strings.isNullOrEmpty(entity.getDescription())) {sql.WHERE("description = #{description}");}
			if(!Strings.isNullOrEmpty(entity.getTaskDefKey())) {sql.WHERE("taskDefKey = #{taskDefKey}");}
			if(!Strings.isNullOrEmpty(entity.getOwner())) {sql.WHERE("owner = #{owner}");}
			if(!Strings.isNullOrEmpty(entity.getAssignee())) {sql.WHERE("assignee = #{assignee}");}
			if(!Strings.isNullOrEmpty(entity.getDelegation())) {sql.WHERE("delegation = #{delegation}");}
			if(!Objects.isNull(entity.getPriority())) {sql.WHERE("priority = #{priority}");}
			if(!Strings.isNullOrEmpty(entity.getCreateTime())) {sql.WHERE("createTime = #{createTime}");}
			if(!Strings.isNullOrEmpty(entity.getDueDate())) {sql.WHERE("dueDate = #{dueDate}");}
			if(!Strings.isNullOrEmpty(entity.getCategory())) {sql.WHERE("category = #{category}");}
			if(!Objects.isNull(entity.getSuspensionState())) {sql.WHERE("suspensionState = #{suspensionState}");}
			if(!Strings.isNullOrEmpty(entity.getTenantId())) {sql.WHERE("tenantId = #{tenantId}");}
			if(!Strings.isNullOrEmpty(entity.getFormKey())) {sql.WHERE("formKey = #{formKey}");}

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
	public String selectActRuTaskByLimt(ActRuTask entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_ru_task");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getExecutionId())) {sql.WHERE("executionId = #{executionId}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.WHERE("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.WHERE("procDefId = #{procDefId}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getParentTaskId())) {sql.WHERE("parentTaskId = #{parentTaskId}");}
			if(!Strings.isNullOrEmpty(entity.getDescription())) {sql.WHERE("description = #{description}");}
			if(!Strings.isNullOrEmpty(entity.getTaskDefKey())) {sql.WHERE("taskDefKey = #{taskDefKey}");}
			if(!Strings.isNullOrEmpty(entity.getOwner())) {sql.WHERE("owner = #{owner}");}
			if(!Strings.isNullOrEmpty(entity.getAssignee())) {sql.WHERE("assignee = #{assignee}");}
			if(!Strings.isNullOrEmpty(entity.getDelegation())) {sql.WHERE("delegation = #{delegation}");}
			if(!Objects.isNull(entity.getPriority())) {sql.WHERE("priority = #{priority}");}
			if(!Strings.isNullOrEmpty(entity.getCreateTime())) {sql.WHERE("createTime = #{createTime}");}
			if(!Strings.isNullOrEmpty(entity.getDueDate())) {sql.WHERE("dueDate = #{dueDate}");}
			if(!Strings.isNullOrEmpty(entity.getCategory())) {sql.WHERE("category = #{category}");}
			if(!Objects.isNull(entity.getSuspensionState())) {sql.WHERE("suspensionState = #{suspensionState}");}
			if(!Strings.isNullOrEmpty(entity.getTenantId())) {sql.WHERE("tenantId = #{tenantId}");}
			if(!Strings.isNullOrEmpty(entity.getFormKey())) {sql.WHERE("formKey = #{formKey}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectActRuTask(ActRuTask entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_ru_task");
			if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getExecutionId())) {sql.WHERE("executionId = #{executionId}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.WHERE("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.WHERE("procDefId = #{procDefId}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getParentTaskId())) {sql.WHERE("parentTaskId = #{parentTaskId}");}
			if(!Strings.isNullOrEmpty(entity.getDescription())) {sql.WHERE("description = #{description}");}
			if(!Strings.isNullOrEmpty(entity.getTaskDefKey())) {sql.WHERE("taskDefKey = #{taskDefKey}");}
			if(!Strings.isNullOrEmpty(entity.getOwner())) {sql.WHERE("owner = #{owner}");}
			if(!Strings.isNullOrEmpty(entity.getAssignee())) {sql.WHERE("assignee = #{assignee}");}
			if(!Strings.isNullOrEmpty(entity.getDelegation())) {sql.WHERE("delegation = #{delegation}");}
			if(!Objects.isNull(entity.getPriority())) {sql.WHERE("priority = #{priority}");}
			if(!Strings.isNullOrEmpty(entity.getCreateTime())) {sql.WHERE("createTime = #{createTime}");}
			if(!Strings.isNullOrEmpty(entity.getDueDate())) {sql.WHERE("dueDate = #{dueDate}");}
			if(!Strings.isNullOrEmpty(entity.getCategory())) {sql.WHERE("category = #{category}");}
			if(!Objects.isNull(entity.getSuspensionState())) {sql.WHERE("suspensionState = #{suspensionState}");}
			if(!Strings.isNullOrEmpty(entity.getTenantId())) {sql.WHERE("tenantId = #{tenantId}");}
			if(!Strings.isNullOrEmpty(entity.getFormKey())) {sql.WHERE("formKey = #{formKey}");}

		return sql.toString();
	}
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	public String selectOne(int id) {
		SQL sql = new SQL().SELECT("*").FROM("act_ru_task");
		sql.WHERE("ID_="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updateActRuTask(ActRuTask entity) {
		SQL sql = new SQL().UPDATE("act_ru_task");
				sql.SET("id = #{id}");
		sql.SET("rev = #{rev}");
		sql.SET("executionId = #{executionId}");
		sql.SET("procInstId = #{procInstId}");
		sql.SET("procDefId = #{procDefId}");
		sql.SET("name = #{name}");
		sql.SET("parentTaskId = #{parentTaskId}");
		sql.SET("description = #{description}");
		sql.SET("taskDefKey = #{taskDefKey}");
		sql.SET("owner = #{owner}");
		sql.SET("assignee = #{assignee}");
		sql.SET("delegation = #{delegation}");
		sql.SET("priority = #{priority}");
		sql.SET("createTime = #{createTime}");
		sql.SET("dueDate = #{dueDate}");
		sql.SET("category = #{category}");
		sql.SET("suspensionState = #{suspensionState}");
		sql.SET("tenantId = #{tenantId}");
		sql.SET("formKey = #{formKey}");
		sql.SET("updatetime = now()");

		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public String updateActRuTaskByNullChk(ActRuTask entity) {
		SQL sql = new SQL().UPDATE("act_ru_task");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.SET("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.SET("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getExecutionId())) {sql.SET("executionId = #{executionId}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.SET("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.SET("procDefId = #{procDefId}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.SET("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getParentTaskId())) {sql.SET("parentTaskId = #{parentTaskId}");}
			if(!Strings.isNullOrEmpty(entity.getDescription())) {sql.SET("description = #{description}");}
			if(!Strings.isNullOrEmpty(entity.getTaskDefKey())) {sql.SET("taskDefKey = #{taskDefKey}");}
			if(!Strings.isNullOrEmpty(entity.getOwner())) {sql.SET("owner = #{owner}");}
			if(!Strings.isNullOrEmpty(entity.getAssignee())) {sql.SET("assignee = #{assignee}");}
			if(!Strings.isNullOrEmpty(entity.getDelegation())) {sql.SET("delegation = #{delegation}");}
			if(!Objects.isNull(entity.getPriority())) {sql.SET("priority = #{priority}");}
			if(!Strings.isNullOrEmpty(entity.getCreateTime())) {sql.SET("createTime = #{createTime}");}
			if(!Strings.isNullOrEmpty(entity.getDueDate())) {sql.SET("dueDate = #{dueDate}");}
			if(!Strings.isNullOrEmpty(entity.getCategory())) {sql.SET("category = #{category}");}
			if(!Objects.isNull(entity.getSuspensionState())) {sql.SET("suspensionState = #{suspensionState}");}
			if(!Strings.isNullOrEmpty(entity.getTenantId())) {sql.SET("tenantId = #{tenantId}");}
			if(!Strings.isNullOrEmpty(entity.getFormKey())) {sql.SET("formKey = #{formKey}");}
		sql.SET("updatetime = now()");

		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public String deleteActRuTask(int id) {
		SQL sql = new SQL().DELETE_FROM("act_ru_task");
		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(int id) {
		SQL sql = new SQL().UPDATE("act_ru_task");
		sql.SET("state=2");
		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
}
