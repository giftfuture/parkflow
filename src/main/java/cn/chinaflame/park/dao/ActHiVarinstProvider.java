package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.ActHiVarinst;

/**
 * 
 * provider
 */
public class ActHiVarinstProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertActHiVarinst(ActHiVarinst entity) {
		SQL sql = new SQL().INSERT_INTO("act_hi_varinst");
		sql.VALUES("PROC_INST_ID_,EXECUTION_ID_,TASK_ID_,NAME_,VAR_TYPE_,REV_,BYTEARRAY_ID_,DOUBLE_,LONG_,TEXT_,TEXT2_,CREATE_TIME_,LAST_UPDATED_TIME_", "#{procInstId},#{executionId},#{taskId},#{name},#{varType},#{rev},#{bytearrayId},#{double},#{long},#{text},#{text2},#{createTime},#{lastUpdatedTime}");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectActHiVarinstByCount(ActHiVarinst entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("act_hi_varinst");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.WHERE("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getExecutionId())) {sql.WHERE("executionId = #{executionId}");}
			if(!Strings.isNullOrEmpty(entity.getTaskId())) {sql.WHERE("taskId = #{taskId}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getVarType())) {sql.WHERE("varType = #{varType}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getBytearrayId())) {sql.WHERE("bytearrayId = #{bytearrayId}");}
			if(!Objects.isNull(entity.getDouble_())) {sql.SET("double_ = #{double_}");}
			if(!Objects.isNull(entity.getLong_())) {sql.SET("long_= #{long_}");}
			if(!Strings.isNullOrEmpty(entity.getText())) {sql.WHERE("text = #{text}");}
			if(!Strings.isNullOrEmpty(entity.getText2())) {sql.WHERE("text2 = #{text2}");}
			if(!Strings.isNullOrEmpty(entity.getCreateTime())) {sql.WHERE("createTime = #{createTime}");}
			if(!Strings.isNullOrEmpty(entity.getLastUpdatedTime())) {sql.WHERE("lastUpdatedTime = #{lastUpdatedTime}");}

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
	public String selectActHiVarinstByLimt(ActHiVarinst entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_hi_varinst");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.WHERE("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getExecutionId())) {sql.WHERE("executionId = #{executionId}");}
			if(!Strings.isNullOrEmpty(entity.getTaskId())) {sql.WHERE("taskId = #{taskId}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getVarType())) {sql.WHERE("varType = #{varType}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getBytearrayId())) {sql.WHERE("bytearrayId = #{bytearrayId}");}
			if(!Objects.isNull(entity.getDouble_())) {sql.SET("double_ = #{double_}");}
			if(!Objects.isNull(entity.getLong_())) {sql.SET("long_= #{long_}");}
			if(!Strings.isNullOrEmpty(entity.getText())) {sql.WHERE("text = #{text}");}
			if(!Strings.isNullOrEmpty(entity.getText2())) {sql.WHERE("text2 = #{text2}");}
			if(!Strings.isNullOrEmpty(entity.getCreateTime())) {sql.WHERE("createTime = #{createTime}");}
			if(!Strings.isNullOrEmpty(entity.getLastUpdatedTime())) {sql.WHERE("lastUpdatedTime = #{lastUpdatedTime}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectActHiVarinst(ActHiVarinst entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_hi_varinst");
			if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.WHERE("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getExecutionId())) {sql.WHERE("executionId = #{executionId}");}
			if(!Strings.isNullOrEmpty(entity.getTaskId())) {sql.WHERE("taskId = #{taskId}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getVarType())) {sql.WHERE("varType = #{varType}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getBytearrayId())) {sql.WHERE("bytearrayId = #{bytearrayId}");}
			if(!Objects.isNull(entity.getDouble_())) {sql.SET("double_ = #{double_}");}
			if(!Objects.isNull(entity.getLong_())) {sql.SET("long_= #{long_}");}
			if(!Strings.isNullOrEmpty(entity.getText())) {sql.WHERE("text = #{text}");}
			if(!Strings.isNullOrEmpty(entity.getText2())) {sql.WHERE("text2 = #{text2}");}
			if(!Strings.isNullOrEmpty(entity.getCreateTime())) {sql.WHERE("createTime = #{createTime}");}
			if(!Strings.isNullOrEmpty(entity.getLastUpdatedTime())) {sql.WHERE("lastUpdatedTime = #{lastUpdatedTime}");}

		return sql.toString();
	}
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	public String selectOne(int id) {
		SQL sql = new SQL().SELECT("*").FROM("act_hi_varinst");
		sql.WHERE("ID_="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updateActHiVarinst(ActHiVarinst entity) {
		SQL sql = new SQL().UPDATE("act_hi_varinst");
				sql.SET("id = #{id}");
		sql.SET("procInstId = #{procInstId}");
		sql.SET("executionId = #{executionId}");
		sql.SET("taskId = #{taskId}");
		sql.SET("name = #{name}");
		sql.SET("varType = #{varType}");
		sql.SET("rev = #{rev}");
		sql.SET("bytearrayId = #{bytearrayId}");
		sql.SET("double = #{double}");
		sql.SET("long = #{long}");
		sql.SET("text = #{text}");
		sql.SET("text2 = #{text2}");
		sql.SET("createTime = #{createTime}");
		sql.SET("lastUpdatedTime = #{lastUpdatedTime}");
		sql.SET("updatetime = now()");

		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public String updateActHiVarinstByNullChk(ActHiVarinst entity) {
		SQL sql = new SQL().UPDATE("act_hi_varinst");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.SET("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getProcInstId())) {sql.SET("procInstId = #{procInstId}");}
			if(!Strings.isNullOrEmpty(entity.getExecutionId())) {sql.SET("executionId = #{executionId}");}
			if(!Strings.isNullOrEmpty(entity.getTaskId())) {sql.SET("taskId = #{taskId}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.SET("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getVarType())) {sql.SET("varType = #{varType}");}
			if(!Objects.isNull(entity.getRev())) {sql.SET("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getBytearrayId())) {sql.SET("bytearrayId = #{bytearrayId}");}
			if(!Objects.isNull(entity.getDouble_())) {sql.SET("double_ = #{double_}");}
			if(!Objects.isNull(entity.getLong_())) {sql.SET("long_= #{long_}");}
			if(!Strings.isNullOrEmpty(entity.getText())) {sql.SET("text = #{text}");}
			if(!Strings.isNullOrEmpty(entity.getText2())) {sql.SET("text2 = #{text2}");}
			if(!Strings.isNullOrEmpty(entity.getCreateTime())) {sql.SET("createTime = #{createTime}");}
			if(!Strings.isNullOrEmpty(entity.getLastUpdatedTime())) {sql.SET("lastUpdatedTime = #{lastUpdatedTime}");}
		sql.SET("updatetime = now()");

		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public String deleteActHiVarinst(int id) {
		SQL sql = new SQL().DELETE_FROM("act_hi_varinst");
		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(int id) {
		SQL sql = new SQL().UPDATE("act_hi_varinst");
		sql.SET("state=2");
		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
}
