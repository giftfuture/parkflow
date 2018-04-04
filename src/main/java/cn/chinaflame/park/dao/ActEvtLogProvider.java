package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.ActEvtLog;

/**
 * 
 * provider
 */
public class ActEvtLogProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertActEvtLog(ActEvtLog entity) {
		SQL sql = new SQL().INSERT_INTO("act_evt_log");
		sql.VALUES("TYPE_,PROC_DEF_ID_,PROC_INST_ID_,EXECUTION_ID_,TASK_ID_,TIME_STAMP_,USER_ID_,DATA_,LOCK_OWNER_,LOCK_TIME_,IS_PROCESSED_", "#{type},#{procDefId},#{procInstId},#{executionId},#{taskId},#{timeStamp},#{userId},#{data},#{lockOwner},#{lockTime},#{isProcessed}");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectActEvtLogByCount(ActEvtLog entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("act_evt_log");
					if(!Objects.isNull(entity.getLogNr())) {sql.WHERE("logNr = #{logNr}");}
			if(!Strings.isNullOrEmpty(entity.getType())) {sql.WHERE("type = #{type}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.WHERE("procDefId = #{procDefId}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.WHERE("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getExecutionId())) {sql.WHERE("executionId = #{executionId}");}
			if(!Strings.isNullOrEmpty(entity.getTaskId())) {sql.WHERE("taskId = #{taskId}");}
			if(!Strings.isNullOrEmpty(entity.getTimeStamp())) {sql.WHERE("timeStamp = #{timeStamp}");}
			if(!Strings.isNullOrEmpty(entity.getUserId())) {sql.WHERE("userId = #{userId}");}
			if(!Strings.isNullOrEmpty(entity.getData())) {sql.WHERE("data = #{data}");}
			if(!Strings.isNullOrEmpty(entity.getLockOwner())) {sql.WHERE("lockOwner = #{lockOwner}");}
			if(!Strings.isNullOrEmpty(entity.getLockTime())) {sql.WHERE("lockTime = #{lockTime}");}
			if(!Objects.isNull(entity.getIsProcessed())) {sql.WHERE("isProcessed = #{isProcessed}");}

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
	public String selectActEvtLogByLimt(ActEvtLog entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_evt_log");
					if(!Objects.isNull(entity.getLogNr())) {sql.WHERE("logNr = #{logNr}");}
			if(!Strings.isNullOrEmpty(entity.getType())) {sql.WHERE("type = #{type}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.WHERE("procDefId = #{procDefId}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.WHERE("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getExecutionId())) {sql.WHERE("executionId = #{executionId}");}
			if(!Strings.isNullOrEmpty(entity.getTaskId())) {sql.WHERE("taskId = #{taskId}");}
			if(!Strings.isNullOrEmpty(entity.getTimeStamp())) {sql.WHERE("timeStamp = #{timeStamp}");}
			if(!Strings.isNullOrEmpty(entity.getUserId())) {sql.WHERE("userId = #{userId}");}
			if(!Strings.isNullOrEmpty(entity.getData())) {sql.WHERE("data = #{data}");}
			if(!Strings.isNullOrEmpty(entity.getLockOwner())) {sql.WHERE("lockOwner = #{lockOwner}");}
			if(!Strings.isNullOrEmpty(entity.getLockTime())) {sql.WHERE("lockTime = #{lockTime}");}
			if(!Objects.isNull(entity.getIsProcessed())) {sql.WHERE("isProcessed = #{isProcessed}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectActEvtLog(ActEvtLog entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_evt_log");
			if(!Objects.isNull(entity.getLogNr())) {sql.WHERE("logNr = #{logNr}");}
			if(!Strings.isNullOrEmpty(entity.getType())) {sql.WHERE("type = #{type}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.WHERE("procDefId = #{procDefId}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.WHERE("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getExecutionId())) {sql.WHERE("executionId = #{executionId}");}
			if(!Strings.isNullOrEmpty(entity.getTaskId())) {sql.WHERE("taskId = #{taskId}");}
			if(!Strings.isNullOrEmpty(entity.getTimeStamp())) {sql.WHERE("timeStamp = #{timeStamp}");}
			if(!Strings.isNullOrEmpty(entity.getUserId())) {sql.WHERE("userId = #{userId}");}
			if(!Strings.isNullOrEmpty(entity.getData())) {sql.WHERE("data = #{data}");}
			if(!Strings.isNullOrEmpty(entity.getLockOwner())) {sql.WHERE("lockOwner = #{lockOwner}");}
			if(!Strings.isNullOrEmpty(entity.getLockTime())) {sql.WHERE("lockTime = #{lockTime}");}
			if(!Objects.isNull(entity.getIsProcessed())) {sql.WHERE("isProcessed = #{isProcessed}");}

		return sql.toString();
	}
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	public String selectOne(int id) {
		SQL sql = new SQL().SELECT("*").FROM("act_evt_log");
		sql.WHERE("LOG_NR_="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updateActEvtLog(ActEvtLog entity) {
		SQL sql = new SQL().UPDATE("act_evt_log");
				sql.SET("logNr = #{logNr}");
		sql.SET("type = #{type}");
		sql.SET("procDefId = #{procDefId}");
		sql.SET("procInstId = #{procInstId}");
		sql.SET("executionId = #{executionId}");
		sql.SET("taskId = #{taskId}");
		sql.SET("timeStamp = #{timeStamp}");
		sql.SET("userId = #{userId}");
		sql.SET("data = #{data}");
		sql.SET("lockOwner = #{lockOwner}");
		sql.SET("lockTime = #{lockTime}");
		sql.SET("isProcessed = #{isProcessed}");
		sql.SET("updatetime = now()");

		sql.WHERE("LOG_NR_ = #{LOG_NR_}");
		return sql.toString();
	}
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public String updateActEvtLogByNullChk(ActEvtLog entity) {
		SQL sql = new SQL().UPDATE("act_evt_log");
					if(!Objects.isNull(entity.getLogNr())) {sql.SET("logNr = #{logNr}");}
			if(!Strings.isNullOrEmpty(entity.getType())) {sql.SET("type = #{type}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.SET("procDefId = #{procDefId}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.SET("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getExecutionId())) {sql.SET("executionId = #{executionId}");}
			if(!Strings.isNullOrEmpty(entity.getTaskId())) {sql.SET("taskId = #{taskId}");}
			if(!Strings.isNullOrEmpty(entity.getTimeStamp())) {sql.SET("timeStamp = #{timeStamp}");}
			if(!Strings.isNullOrEmpty(entity.getUserId())) {sql.SET("userId = #{userId}");}
			if(!Strings.isNullOrEmpty(entity.getData())) {sql.SET("data = #{data}");}
			if(!Strings.isNullOrEmpty(entity.getLockOwner())) {sql.SET("lockOwner = #{lockOwner}");}
			if(!Strings.isNullOrEmpty(entity.getLockTime())) {sql.SET("lockTime = #{lockTime}");}
			if(!Objects.isNull(entity.getIsProcessed())) {sql.SET("isProcessed = #{isProcessed}");}
		sql.SET("updatetime = now()");

		sql.WHERE("LOG_NR_ = #{LOG_NR_}");
		return sql.toString();
	}
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public String deleteActEvtLog(int id) {
		SQL sql = new SQL().DELETE_FROM("act_evt_log");
		sql.WHERE("LOG_NR_ = #{LOG_NR_}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(int id) {
		SQL sql = new SQL().UPDATE("act_evt_log");
		sql.SET("state=2");
		sql.WHERE("LOG_NR_ = #{LOG_NR_}");
		return sql.toString();
	}
}
