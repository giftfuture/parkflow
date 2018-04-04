package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.PaUserTask;

/**
 * 用户任务表
 * provider
 */
public class PaUserTaskProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertPaUserTask(PaUserTask entity) {
		SQL sql = new SQL().INSERT_INTO("pa_user_task");
		sql.VALUES("proc_def_key,proc_def_name,task_def_key,task_name,task_type,candidate_name,candidate_ids", "#{procDefKey},#{procDefName},#{taskDefKey},#{taskName},#{taskType},#{candidateName},#{candidateIds}");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectPaUserTaskByCount(PaUserTask entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("pa_user_task");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefKey())) {sql.WHERE("procDefKey = #{procDefKey}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefName())) {sql.WHERE("procDefName = #{procDefName}");}
			if(!Strings.isNullOrEmpty(entity.getTaskDefKey())) {sql.WHERE("taskDefKey = #{taskDefKey}");}
			if(!Strings.isNullOrEmpty(entity.getTaskName())) {sql.WHERE("taskName = #{taskName}");}
			if(!Strings.isNullOrEmpty(entity.getTaskType())) {sql.WHERE("taskType = #{taskType}");}
			if(!Strings.isNullOrEmpty(entity.getCandidateName())) {sql.WHERE("candidateName = #{candidateName}");}
			if(!Strings.isNullOrEmpty(entity.getCandidateIds())) {sql.WHERE("candidateIds = #{candidateIds}");}

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
	public String selectPaUserTaskByLimt(PaUserTask entity) {
		SQL sql = new SQL().SELECT("*").FROM("pa_user_task");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefKey())) {sql.WHERE("procDefKey = #{procDefKey}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefName())) {sql.WHERE("procDefName = #{procDefName}");}
			if(!Strings.isNullOrEmpty(entity.getTaskDefKey())) {sql.WHERE("taskDefKey = #{taskDefKey}");}
			if(!Strings.isNullOrEmpty(entity.getTaskName())) {sql.WHERE("taskName = #{taskName}");}
			if(!Strings.isNullOrEmpty(entity.getTaskType())) {sql.WHERE("taskType = #{taskType}");}
			if(!Strings.isNullOrEmpty(entity.getCandidateName())) {sql.WHERE("candidateName = #{candidateName}");}
			if(!Strings.isNullOrEmpty(entity.getCandidateIds())) {sql.WHERE("candidateIds = #{candidateIds}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectPaUserTask(PaUserTask entity) {
		SQL sql = new SQL().SELECT("*").FROM("pa_user_task");
			if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefKey())) {sql.WHERE("procDefKey = #{procDefKey}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefName())) {sql.WHERE("procDefName = #{procDefName}");}
			if(!Strings.isNullOrEmpty(entity.getTaskDefKey())) {sql.WHERE("taskDefKey = #{taskDefKey}");}
			if(!Strings.isNullOrEmpty(entity.getTaskName())) {sql.WHERE("taskName = #{taskName}");}
			if(!Strings.isNullOrEmpty(entity.getTaskType())) {sql.WHERE("taskType = #{taskType}");}
			if(!Strings.isNullOrEmpty(entity.getCandidateName())) {sql.WHERE("candidateName = #{candidateName}");}
			if(!Strings.isNullOrEmpty(entity.getCandidateIds())) {sql.WHERE("candidateIds = #{candidateIds}");}

		return sql.toString();
	}
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	public String selectOne(int id) {
		SQL sql = new SQL().SELECT("*").FROM("pa_user_task");
		sql.WHERE("id="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updatePaUserTask(PaUserTask entity) {
		SQL sql = new SQL().UPDATE("pa_user_task");
				sql.SET("procDefKey = #{procDefKey}");
		sql.SET("procDefName = #{procDefName}");
		sql.SET("taskDefKey = #{taskDefKey}");
		sql.SET("taskName = #{taskName}");
		sql.SET("taskType = #{taskType}");
		sql.SET("candidateName = #{candidateName}");
		sql.SET("candidateIds = #{candidateIds}");
		sql.SET("updatetime = now()");

		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public String updatePaUserTaskByNullChk(PaUserTask entity) {
		SQL sql = new SQL().UPDATE("pa_user_task");
					if(!Strings.isNullOrEmpty(entity.getProcDefKey())) {sql.SET("procDefKey = #{procDefKey}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefName())) {sql.SET("procDefName = #{procDefName}");}
			if(!Strings.isNullOrEmpty(entity.getTaskDefKey())) {sql.SET("taskDefKey = #{taskDefKey}");}
			if(!Strings.isNullOrEmpty(entity.getTaskName())) {sql.SET("taskName = #{taskName}");}
			if(!Strings.isNullOrEmpty(entity.getTaskType())) {sql.SET("taskType = #{taskType}");}
			if(!Strings.isNullOrEmpty(entity.getCandidateName())) {sql.SET("candidateName = #{candidateName}");}
			if(!Strings.isNullOrEmpty(entity.getCandidateIds())) {sql.SET("candidateIds = #{candidateIds}");}
		sql.SET("updatetime = now()");

		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public String deletePaUserTask(int id) {
		SQL sql = new SQL().DELETE_FROM("pa_user_task");
		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(int id) {
		SQL sql = new SQL().UPDATE("pa_user_task");
		sql.SET("state=2");
		sql.WHERE("id = #{id}");
		return sql.toString();
	}
}
