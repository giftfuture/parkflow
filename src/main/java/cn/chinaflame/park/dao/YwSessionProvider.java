package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.YwSession;

/**
 * 
 * provider
 */
public class YwSessionProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertYwSession(YwSession entity) {
		SQL sql = new SQL().INSERT_INTO("yw_session");
		sql.VALUES("sessionid,project_id,userid,create_timestamp,update_timestamp,period,object,ip,createtime,updatetime", "#{sessionid},#{project_id},#{userid},#{create_timestamp},#{update_timestamp},#{period},#{object},#{ip},now(),now()");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectYwSessionByCount(YwSession entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("yw_session");
					if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getSessionid())) {sql.WHERE("sessionid = #{sessionid}");}
			if(!Strings.isNullOrEmpty(entity.getProject_id())) {sql.WHERE("project_id = #{project_id}");}
			if(!Strings.isNullOrEmpty(entity.getUserid())) {sql.WHERE("userid = #{userid}");}
			if(!Objects.isNull(entity.getCreate_timestamp())) {sql.WHERE("create_timestamp = #{create_timestamp}");}
			if(!Objects.isNull(entity.getUpdate_timestamp())) {sql.WHERE("update_timestamp = #{update_timestamp}");}
			if(!Objects.isNull(entity.getPeriod())) {sql.WHERE("period = #{period}");}
			if(!Strings.isNullOrEmpty(entity.getObject())) {sql.WHERE("object = #{object}");}
			if(!Strings.isNullOrEmpty(entity.getIp())) {sql.WHERE("ip = #{ip}");}
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("createtime = #{createtime}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("updatetime = #{updatetime}");}

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
	public String selectYwSessionByLimt(YwSession entity) {
		SQL sql = new SQL().SELECT("*").FROM("yw_session");
					if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getSessionid())) {sql.WHERE("sessionid = #{sessionid}");}
			if(!Strings.isNullOrEmpty(entity.getProject_id())) {sql.WHERE("project_id = #{project_id}");}
			if(!Strings.isNullOrEmpty(entity.getUserid())) {sql.WHERE("userid = #{userid}");}
			if(!Objects.isNull(entity.getCreate_timestamp())) {sql.WHERE("create_timestamp = #{create_timestamp}");}
			if(!Objects.isNull(entity.getUpdate_timestamp())) {sql.WHERE("update_timestamp = #{update_timestamp}");}
			if(!Objects.isNull(entity.getPeriod())) {sql.WHERE("period = #{period}");}
			if(!Strings.isNullOrEmpty(entity.getObject())) {sql.WHERE("object = #{object}");}
			if(!Strings.isNullOrEmpty(entity.getIp())) {sql.WHERE("ip = #{ip}");}
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("createtime = #{createtime}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("updatetime = #{updatetime}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectYwSession(YwSession entity) {
		SQL sql = new SQL().SELECT("*").FROM("yw_session");
			if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getSessionid())) {sql.WHERE("sessionid = #{sessionid}");}
			if(!Strings.isNullOrEmpty(entity.getProject_id())) {sql.WHERE("project_id = #{project_id}");}
			if(!Strings.isNullOrEmpty(entity.getUserid())) {sql.WHERE("userid = #{userid}");}
			if(!Objects.isNull(entity.getCreate_timestamp())) {sql.WHERE("create_timestamp = #{create_timestamp}");}
			if(!Objects.isNull(entity.getUpdate_timestamp())) {sql.WHERE("update_timestamp = #{update_timestamp}");}
			if(!Objects.isNull(entity.getPeriod())) {sql.WHERE("period = #{period}");}
			if(!Strings.isNullOrEmpty(entity.getObject())) {sql.WHERE("object = #{object}");}
			if(!Strings.isNullOrEmpty(entity.getIp())) {sql.WHERE("ip = #{ip}");}
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("createtime = #{createtime}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("updatetime = #{updatetime}");}
			System.out.println(entity.toString()+"#######"+sql.toString());
		return sql.toString();
	}
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	public String selectOne(int id) {
		SQL sql = new SQL().SELECT("*").FROM("yw_session");
		sql.WHERE("id="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updateYwSession(YwSession entity) {
		SQL sql = new SQL().UPDATE("yw_session");
				sql.SET("sessionid = #{sessionid}");
		sql.SET("project_id = #{project_id}");
		sql.SET("userid = #{userid}");
		sql.SET("create_timestamp = #{create_timestamp}");
		sql.SET("update_timestamp = #{update_timestamp}");
		sql.SET("period = #{period}");
		sql.SET("object = #{object}");
		sql.SET("ip = #{ip}");
		sql.SET("updatetime = now()");

		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public String updateYwSessionByNullChk(YwSession entity) {
		SQL sql = new SQL().UPDATE("yw_session");
					if(!Strings.isNullOrEmpty(entity.getSessionid())) {sql.SET("sessionid = #{sessionid}");}
			if(!Strings.isNullOrEmpty(entity.getProject_id())) {sql.SET("project_id = #{project_id}");}
			if(!Strings.isNullOrEmpty(entity.getUserid())) {sql.SET("userid = #{userid}");}
			if(!Objects.isNull(entity.getCreate_timestamp())) {sql.SET("create_timestamp = #{create_timestamp}");}
			if(!Objects.isNull(entity.getUpdate_timestamp())) {sql.SET("update_timestamp = #{update_timestamp}");}
			if(!Objects.isNull(entity.getPeriod())) {sql.SET("period = #{period}");}
			if(!Strings.isNullOrEmpty(entity.getObject())) {sql.SET("object = #{object}");}
			if(!Strings.isNullOrEmpty(entity.getIp())) {sql.SET("ip = #{ip}");}
		sql.SET("updatetime = now()");

		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public String deleteYwSession(long id) {
		SQL sql = new SQL().DELETE_FROM("yw_session");
		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(long id) {
		SQL sql = new SQL().UPDATE("yw_session");
		sql.SET("state=2");
		sql.WHERE("id = #{id}");
		return sql.toString();
	}
}
