package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.ActHiComment;

/**
 * 
 * provider
 */
public class ActHiCommentProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertActHiComment(ActHiComment entity) {
		SQL sql = new SQL().INSERT_INTO("act_hi_comment");
		sql.VALUES("TYPE_,TIME_,USER_ID_,TASK_ID_,PROC_INST_ID_,ACTION_,MESSAGE_,FULL_MSG_", "#{type},#{time},#{userId},#{taskId},#{procInstId},#{action},#{message},#{fullMsg}");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectActHiCommentByCount(ActHiComment entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("act_hi_comment");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getType())) {sql.WHERE("type = #{type}");}
			if(!Strings.isNullOrEmpty(entity.getTime())) {sql.WHERE("time = #{time}");}
			if(!Strings.isNullOrEmpty(entity.getUserId())) {sql.WHERE("userId = #{userId}");}
			if(!Strings.isNullOrEmpty(entity.getTaskId())) {sql.WHERE("taskId = #{taskId}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.WHERE("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getAction())) {sql.WHERE("action = #{action}");}
			if(!Strings.isNullOrEmpty(entity.getMessage())) {sql.WHERE("message = #{message}");}
			if(!Strings.isNullOrEmpty(entity.getFullMsg())) {sql.WHERE("fullMsg = #{fullMsg}");}

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
	public String selectActHiCommentByLimt(ActHiComment entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_hi_comment");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getType())) {sql.WHERE("type = #{type}");}
			if(!Strings.isNullOrEmpty(entity.getTime())) {sql.WHERE("time = #{time}");}
			if(!Strings.isNullOrEmpty(entity.getUserId())) {sql.WHERE("userId = #{userId}");}
			if(!Strings.isNullOrEmpty(entity.getTaskId())) {sql.WHERE("taskId = #{taskId}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.WHERE("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getAction())) {sql.WHERE("action = #{action}");}
			if(!Strings.isNullOrEmpty(entity.getMessage())) {sql.WHERE("message = #{message}");}
			if(!Strings.isNullOrEmpty(entity.getFullMsg())) {sql.WHERE("fullMsg = #{fullMsg}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectActHiComment(ActHiComment entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_hi_comment");
			if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getType())) {sql.WHERE("type = #{type}");}
			if(!Strings.isNullOrEmpty(entity.getTime())) {sql.WHERE("time = #{time}");}
			if(!Strings.isNullOrEmpty(entity.getUserId())) {sql.WHERE("userId = #{userId}");}
			if(!Strings.isNullOrEmpty(entity.getTaskId())) {sql.WHERE("taskId = #{taskId}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.WHERE("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getAction())) {sql.WHERE("action = #{action}");}
			if(!Strings.isNullOrEmpty(entity.getMessage())) {sql.WHERE("message = #{message}");}
			if(!Strings.isNullOrEmpty(entity.getFullMsg())) {sql.WHERE("fullMsg = #{fullMsg}");}

		return sql.toString();
	}
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	public String selectOne(int id) {
		SQL sql = new SQL().SELECT("*").FROM("act_hi_comment");
		sql.WHERE("ID_="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updateActHiComment(ActHiComment entity) {
		SQL sql = new SQL().UPDATE("act_hi_comment");
				sql.SET("id = #{id}");
		sql.SET("type = #{type}");
		sql.SET("time = #{time}");
		sql.SET("userId = #{userId}");
		sql.SET("taskId = #{taskId}");
		sql.SET("procInstId = #{procInstId}");
		sql.SET("action = #{action}");
		sql.SET("message = #{message}");
		sql.SET("fullMsg = #{fullMsg}");
		sql.SET("updatetime = now()");

		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public String updateActHiCommentByNullChk(ActHiComment entity) {
		SQL sql = new SQL().UPDATE("act_hi_comment");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.SET("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getType())) {sql.SET("type = #{type}");}
			if(!Strings.isNullOrEmpty(entity.getTime())) {sql.SET("time = #{time}");}
			if(!Strings.isNullOrEmpty(entity.getUserId())) {sql.SET("userId = #{userId}");}
			if(!Strings.isNullOrEmpty(entity.getTaskId())) {sql.SET("taskId = #{taskId}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.SET("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getAction())) {sql.SET("action = #{action}");}
			if(!Strings.isNullOrEmpty(entity.getMessage())) {sql.SET("message = #{message}");}
			if(!Strings.isNullOrEmpty(entity.getFullMsg())) {sql.SET("fullMsg = #{fullMsg}");}
		sql.SET("updatetime = now()");

		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public String deleteActHiComment(int id) {
		SQL sql = new SQL().DELETE_FROM("act_hi_comment");
		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(int id) {
		SQL sql = new SQL().UPDATE("act_hi_comment");
		sql.SET("state=2");
		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
}
