package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.ActIdMembership;

/**
 * 
 * provider
 */
public class ActIdMembershipProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertActIdMembership(ActIdMembership entity) {
		SQL sql = new SQL().INSERT_INTO("act_id_membership");
		sql.VALUES("GROUP_ID_", "#{groupId}");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectActIdMembershipByCount(ActIdMembership entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("act_id_membership");
					if(!Strings.isNullOrEmpty(entity.getUserId())) {sql.WHERE("userId = #{userId}");}
			if(!Strings.isNullOrEmpty(entity.getGroupId())) {sql.WHERE("groupId = #{groupId}");}

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
	public String selectActIdMembershipByLimt(ActIdMembership entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_id_membership");
					if(!Strings.isNullOrEmpty(entity.getUserId())) {sql.WHERE("userId = #{userId}");}
			if(!Strings.isNullOrEmpty(entity.getGroupId())) {sql.WHERE("groupId = #{groupId}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectActIdMembership(ActIdMembership entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_id_membership");
			if(!Strings.isNullOrEmpty(entity.getUserId())) {sql.WHERE("userId = #{userId}");}
			if(!Strings.isNullOrEmpty(entity.getGroupId())) {sql.WHERE("groupId = #{groupId}");}

		return sql.toString();
	}
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	public String selectOne(int id) {
		SQL sql = new SQL().SELECT("*").FROM("act_id_membership");
		sql.WHERE("GROUP_ID_="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updateActIdMembership(ActIdMembership entity) {
		SQL sql = new SQL().UPDATE("act_id_membership");
				sql.SET("userId = #{userId}");
		sql.SET("groupId = #{groupId}");
		sql.SET("updatetime = now()");

		sql.WHERE("GROUP_ID_ = #{GROUP_ID_}");
		return sql.toString();
	}
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public String updateActIdMembershipByNullChk(ActIdMembership entity) {
		SQL sql = new SQL().UPDATE("act_id_membership");
					if(!Strings.isNullOrEmpty(entity.getUserId())) {sql.SET("userId = #{userId}");}
			if(!Strings.isNullOrEmpty(entity.getGroupId())) {sql.SET("groupId = #{groupId}");}
		sql.SET("updatetime = now()");

		sql.WHERE("GROUP_ID_ = #{GROUP_ID_}");
		return sql.toString();
	}
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public String deleteActIdMembership(int id) {
		SQL sql = new SQL().DELETE_FROM("act_id_membership");
		sql.WHERE("GROUP_ID_ = #{GROUP_ID_}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(int id) {
		SQL sql = new SQL().UPDATE("act_id_membership");
		sql.SET("state=2");
		sql.WHERE("GROUP_ID_ = #{GROUP_ID_}");
		return sql.toString();
	}
}
