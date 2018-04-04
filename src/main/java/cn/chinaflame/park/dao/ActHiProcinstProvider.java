package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.ActHiProcinst;

/**
 * 
 * provider
 */
public class ActHiProcinstProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertActHiProcinst(ActHiProcinst entity) {
		SQL sql = new SQL().INSERT_INTO("act_hi_procinst");
		sql.VALUES("PROC_INST_ID_,BUSINESS_KEY_,PROC_DEF_ID_,START_TIME_,END_TIME_,DURATION_,START_USER_ID_,START_ACT_ID_,END_ACT_ID_,SUPER_PROCESS_INSTANCE_ID_,DELETE_REASON_,TENANT_ID_,NAME_", "#{procInstId},#{businessKey},#{procDefId},#{startTime},#{endTime},#{duration},#{startUserId},#{startActId},#{endActId},#{superProcessInstanceId},#{deleteReason},#{tenantId},#{name}");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectActHiProcinstByCount(ActHiProcinst entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("act_hi_procinst");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.WHERE("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getBusinessKey())) {sql.WHERE("businessKey = #{businessKey}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.WHERE("procDefId = #{procDefId}");}
			if(!Strings.isNullOrEmpty(entity.getStartTime())) {sql.WHERE("startTime = #{startTime}");}
			if(!Strings.isNullOrEmpty(entity.getEndTime())) {sql.WHERE("endTime = #{endTime}");}
			if(!Objects.isNull(entity.getDuration())) {sql.WHERE("duration = #{duration}");}
			if(!Strings.isNullOrEmpty(entity.getStartUserId())) {sql.WHERE("startUserId = #{startUserId}");}
			if(!Strings.isNullOrEmpty(entity.getStartActId())) {sql.WHERE("startActId = #{startActId}");}
			if(!Strings.isNullOrEmpty(entity.getEndActId())) {sql.WHERE("endActId = #{endActId}");}
			if(!Strings.isNullOrEmpty(entity.getSuperProcessInstanceId())) {sql.WHERE("superProcessInstanceId = #{superProcessInstanceId}");}
			if(!Strings.isNullOrEmpty(entity.getDeleteReason())) {sql.WHERE("deleteReason = #{deleteReason}");}
			if(!Strings.isNullOrEmpty(entity.getTenantId())) {sql.WHERE("tenantId = #{tenantId}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}

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
	public String selectActHiProcinstByLimt(ActHiProcinst entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_hi_procinst");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.WHERE("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getBusinessKey())) {sql.WHERE("businessKey = #{businessKey}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.WHERE("procDefId = #{procDefId}");}
			if(!Strings.isNullOrEmpty(entity.getStartTime())) {sql.WHERE("startTime = #{startTime}");}
			if(!Strings.isNullOrEmpty(entity.getEndTime())) {sql.WHERE("endTime = #{endTime}");}
			if(!Objects.isNull(entity.getDuration())) {sql.WHERE("duration = #{duration}");}
			if(!Strings.isNullOrEmpty(entity.getStartUserId())) {sql.WHERE("startUserId = #{startUserId}");}
			if(!Strings.isNullOrEmpty(entity.getStartActId())) {sql.WHERE("startActId = #{startActId}");}
			if(!Strings.isNullOrEmpty(entity.getEndActId())) {sql.WHERE("endActId = #{endActId}");}
			if(!Strings.isNullOrEmpty(entity.getSuperProcessInstanceId())) {sql.WHERE("superProcessInstanceId = #{superProcessInstanceId}");}
			if(!Strings.isNullOrEmpty(entity.getDeleteReason())) {sql.WHERE("deleteReason = #{deleteReason}");}
			if(!Strings.isNullOrEmpty(entity.getTenantId())) {sql.WHERE("tenantId = #{tenantId}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectActHiProcinst(ActHiProcinst entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_hi_procinst");
			if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.WHERE("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getBusinessKey())) {sql.WHERE("businessKey = #{businessKey}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.WHERE("procDefId = #{procDefId}");}
			if(!Strings.isNullOrEmpty(entity.getStartTime())) {sql.WHERE("startTime = #{startTime}");}
			if(!Strings.isNullOrEmpty(entity.getEndTime())) {sql.WHERE("endTime = #{endTime}");}
			if(!Objects.isNull(entity.getDuration())) {sql.WHERE("duration = #{duration}");}
			if(!Strings.isNullOrEmpty(entity.getStartUserId())) {sql.WHERE("startUserId = #{startUserId}");}
			if(!Strings.isNullOrEmpty(entity.getStartActId())) {sql.WHERE("startActId = #{startActId}");}
			if(!Strings.isNullOrEmpty(entity.getEndActId())) {sql.WHERE("endActId = #{endActId}");}
			if(!Strings.isNullOrEmpty(entity.getSuperProcessInstanceId())) {sql.WHERE("superProcessInstanceId = #{superProcessInstanceId}");}
			if(!Strings.isNullOrEmpty(entity.getDeleteReason())) {sql.WHERE("deleteReason = #{deleteReason}");}
			if(!Strings.isNullOrEmpty(entity.getTenantId())) {sql.WHERE("tenantId = #{tenantId}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}

		return sql.toString();
	}
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	public String selectOne(int id) {
		SQL sql = new SQL().SELECT("*").FROM("act_hi_procinst");
		sql.WHERE("ID_="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updateActHiProcinst(ActHiProcinst entity) {
		SQL sql = new SQL().UPDATE("act_hi_procinst");
				sql.SET("id = #{id}");
		sql.SET("procInstId = #{procInstId}");
		sql.SET("businessKey = #{businessKey}");
		sql.SET("procDefId = #{procDefId}");
		sql.SET("startTime = #{startTime}");
		sql.SET("endTime = #{endTime}");
		sql.SET("duration = #{duration}");
		sql.SET("startUserId = #{startUserId}");
		sql.SET("startActId = #{startActId}");
		sql.SET("endActId = #{endActId}");
		sql.SET("superProcessInstanceId = #{superProcessInstanceId}");
		sql.SET("deleteReason = #{deleteReason}");
		sql.SET("tenantId = #{tenantId}");
		sql.SET("name = #{name}");
		sql.SET("updatetime = now()");

		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public String updateActHiProcinstByNullChk(ActHiProcinst entity) {
		SQL sql = new SQL().UPDATE("act_hi_procinst");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.SET("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.SET("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getBusinessKey())) {sql.SET("businessKey = #{businessKey}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.SET("procDefId = #{procDefId}");}
			if(!Strings.isNullOrEmpty(entity.getStartTime())) {sql.SET("startTime = #{startTime}");}
			if(!Strings.isNullOrEmpty(entity.getEndTime())) {sql.SET("endTime = #{endTime}");}
			if(!Objects.isNull(entity.getDuration())) {sql.SET("duration = #{duration}");}
			if(!Strings.isNullOrEmpty(entity.getStartUserId())) {sql.SET("startUserId = #{startUserId}");}
			if(!Strings.isNullOrEmpty(entity.getStartActId())) {sql.SET("startActId = #{startActId}");}
			if(!Strings.isNullOrEmpty(entity.getEndActId())) {sql.SET("endActId = #{endActId}");}
			if(!Strings.isNullOrEmpty(entity.getSuperProcessInstanceId())) {sql.SET("superProcessInstanceId = #{superProcessInstanceId}");}
			if(!Strings.isNullOrEmpty(entity.getDeleteReason())) {sql.SET("deleteReason = #{deleteReason}");}
			if(!Strings.isNullOrEmpty(entity.getTenantId())) {sql.SET("tenantId = #{tenantId}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.SET("name = #{name}");}
		sql.SET("updatetime = now()");

		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public String deleteActHiProcinst(int id) {
		SQL sql = new SQL().DELETE_FROM("act_hi_procinst");
		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(int id) {
		SQL sql = new SQL().UPDATE("act_hi_procinst");
		sql.SET("state=2");
		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
}
