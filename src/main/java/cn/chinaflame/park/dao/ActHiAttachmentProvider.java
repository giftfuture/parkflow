package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.ActHiAttachment;

/**
 * 
 * provider
 */
public class ActHiAttachmentProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertActHiAttachment(ActHiAttachment entity) {
		SQL sql = new SQL().INSERT_INTO("act_hi_attachment");
		sql.VALUES("REV_,USER_ID_,NAME_,DESCRIPTION_,TYPE_,TASK_ID_,PROC_INST_ID_,URL_,CONTENT_ID_,TIME_", "#{rev},#{userId},#{name},#{description},#{type},#{taskId},#{procInstId},#{url},#{contentId},#{time}");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectActHiAttachmentByCount(ActHiAttachment entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("act_hi_attachment");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getUserId())) {sql.WHERE("userId = #{userId}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getDescription())) {sql.WHERE("description = #{description}");}
			if(!Strings.isNullOrEmpty(entity.getType())) {sql.WHERE("type = #{type}");}
			if(!Strings.isNullOrEmpty(entity.getTaskId())) {sql.WHERE("taskId = #{taskId}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.WHERE("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getUrl())) {sql.WHERE("url = #{url}");}
			if(!Strings.isNullOrEmpty(entity.getContentId())) {sql.WHERE("contentId = #{contentId}");}
			if(!Strings.isNullOrEmpty(entity.getTime())) {sql.WHERE("time = #{time}");}

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
	public String selectActHiAttachmentByLimt(ActHiAttachment entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_hi_attachment");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getUserId())) {sql.WHERE("userId = #{userId}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getDescription())) {sql.WHERE("description = #{description}");}
			if(!Strings.isNullOrEmpty(entity.getType())) {sql.WHERE("type = #{type}");}
			if(!Strings.isNullOrEmpty(entity.getTaskId())) {sql.WHERE("taskId = #{taskId}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.WHERE("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getUrl())) {sql.WHERE("url = #{url}");}
			if(!Strings.isNullOrEmpty(entity.getContentId())) {sql.WHERE("contentId = #{contentId}");}
			if(!Strings.isNullOrEmpty(entity.getTime())) {sql.WHERE("time = #{time}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectActHiAttachment(ActHiAttachment entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_hi_attachment");
			if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getUserId())) {sql.WHERE("userId = #{userId}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getDescription())) {sql.WHERE("description = #{description}");}
			if(!Strings.isNullOrEmpty(entity.getType())) {sql.WHERE("type = #{type}");}
			if(!Strings.isNullOrEmpty(entity.getTaskId())) {sql.WHERE("taskId = #{taskId}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.WHERE("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getUrl())) {sql.WHERE("url = #{url}");}
			if(!Strings.isNullOrEmpty(entity.getContentId())) {sql.WHERE("contentId = #{contentId}");}
			if(!Strings.isNullOrEmpty(entity.getTime())) {sql.WHERE("time = #{time}");}

		return sql.toString();
	}
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	public String selectOne(int id) {
		SQL sql = new SQL().SELECT("*").FROM("act_hi_attachment");
		sql.WHERE("ID_="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updateActHiAttachment(ActHiAttachment entity) {
		SQL sql = new SQL().UPDATE("act_hi_attachment");
				sql.SET("id = #{id}");
		sql.SET("rev = #{rev}");
		sql.SET("userId = #{userId}");
		sql.SET("name = #{name}");
		sql.SET("description = #{description}");
		sql.SET("type = #{type}");
		sql.SET("taskId = #{taskId}");
		sql.SET("procInstId = #{procInstId}");
		sql.SET("url = #{url}");
		sql.SET("contentId = #{contentId}");
		sql.SET("time = #{time}");
		sql.SET("updatetime = now()");

		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public String updateActHiAttachmentByNullChk(ActHiAttachment entity) {
		SQL sql = new SQL().UPDATE("act_hi_attachment");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.SET("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.SET("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getUserId())) {sql.SET("userId = #{userId}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.SET("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getDescription())) {sql.SET("description = #{description}");}
			if(!Strings.isNullOrEmpty(entity.getType())) {sql.SET("type = #{type}");}
			if(!Strings.isNullOrEmpty(entity.getTaskId())) {sql.SET("taskId = #{taskId}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.SET("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getUrl())) {sql.SET("url = #{url}");}
			if(!Strings.isNullOrEmpty(entity.getContentId())) {sql.SET("contentId = #{contentId}");}
			if(!Strings.isNullOrEmpty(entity.getTime())) {sql.SET("time = #{time}");}
		sql.SET("updatetime = now()");

		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public String deleteActHiAttachment(int id) {
		SQL sql = new SQL().DELETE_FROM("act_hi_attachment");
		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(int id) {
		SQL sql = new SQL().UPDATE("act_hi_attachment");
		sql.SET("state=2");
		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
}
