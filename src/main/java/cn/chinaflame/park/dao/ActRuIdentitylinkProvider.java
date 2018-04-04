package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.ActRuIdentitylink;

/**
 * 
 * provider
 */
public class ActRuIdentitylinkProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertActRuIdentitylink(ActRuIdentitylink entity) {
		SQL sql = new SQL().INSERT_INTO("act_ru_identitylink");
		sql.VALUES("REV_,GROUP_ID_,TYPE_,USER_ID_,TASK_ID_,PROC_INST_ID_,PROC_DEF_ID_", "#{rev},#{groupId},#{type},#{userId},#{taskId},#{procInstId},#{procDefId}");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectActRuIdentitylinkByCount(ActRuIdentitylink entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("act_ru_identitylink");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getGroupId())) {sql.WHERE("groupId = #{groupId}");}
			if(!Strings.isNullOrEmpty(entity.getType())) {sql.WHERE("type = #{type}");}
			if(!Strings.isNullOrEmpty(entity.getUserId())) {sql.WHERE("userId = #{userId}");}
			if(!Strings.isNullOrEmpty(entity.getTaskId())) {sql.WHERE("taskId = #{taskId}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.WHERE("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.WHERE("procDefId = #{procDefId}");}

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
	public String selectActRuIdentitylinkByLimt(ActRuIdentitylink entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_ru_identitylink");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getGroupId())) {sql.WHERE("groupId = #{groupId}");}
			if(!Strings.isNullOrEmpty(entity.getType())) {sql.WHERE("type = #{type}");}
			if(!Strings.isNullOrEmpty(entity.getUserId())) {sql.WHERE("userId = #{userId}");}
			if(!Strings.isNullOrEmpty(entity.getTaskId())) {sql.WHERE("taskId = #{taskId}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.WHERE("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.WHERE("procDefId = #{procDefId}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectActRuIdentitylink(ActRuIdentitylink entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_ru_identitylink");
			if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getGroupId())) {sql.WHERE("groupId = #{groupId}");}
			if(!Strings.isNullOrEmpty(entity.getType())) {sql.WHERE("type = #{type}");}
			if(!Strings.isNullOrEmpty(entity.getUserId())) {sql.WHERE("userId = #{userId}");}
			if(!Strings.isNullOrEmpty(entity.getTaskId())) {sql.WHERE("taskId = #{taskId}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.WHERE("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.WHERE("procDefId = #{procDefId}");}

		return sql.toString();
	}
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	public String selectOne(int id) {
		SQL sql = new SQL().SELECT("*").FROM("act_ru_identitylink");
		sql.WHERE("ID_="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updateActRuIdentitylink(ActRuIdentitylink entity) {
		SQL sql = new SQL().UPDATE("act_ru_identitylink");
				sql.SET("id = #{id}");
		sql.SET("rev = #{rev}");
		sql.SET("groupId = #{groupId}");
		sql.SET("type = #{type}");
		sql.SET("userId = #{userId}");
		sql.SET("taskId = #{taskId}");
		sql.SET("procInstId = #{procInstId}");
		sql.SET("procDefId = #{procDefId}");
		sql.SET("updatetime = now()");

		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public String updateActRuIdentitylinkByNullChk(ActRuIdentitylink entity) {
		SQL sql = new SQL().UPDATE("act_ru_identitylink");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.SET("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.SET("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getGroupId())) {sql.SET("groupId = #{groupId}");}
			if(!Strings.isNullOrEmpty(entity.getType())) {sql.SET("type = #{type}");}
			if(!Strings.isNullOrEmpty(entity.getUserId())) {sql.SET("userId = #{userId}");}
			if(!Strings.isNullOrEmpty(entity.getTaskId())) {sql.SET("taskId = #{taskId}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.SET("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getProcDefId())) {sql.SET("procDefId = #{procDefId}");}
		sql.SET("updatetime = now()");

		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public String deleteActRuIdentitylink(int id) {
		SQL sql = new SQL().DELETE_FROM("act_ru_identitylink");
		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(int id) {
		SQL sql = new SQL().UPDATE("act_ru_identitylink");
		sql.SET("state=2");
		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
}
