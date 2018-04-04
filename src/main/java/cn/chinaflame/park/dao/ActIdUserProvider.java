package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.ActIdUser;

/**
 * 
 * provider
 */
public class ActIdUserProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertActIdUser(ActIdUser entity) {
		SQL sql = new SQL().INSERT_INTO("act_id_user");
		sql.VALUES("REV_,FIRST_,LAST_,EMAIL_,PWD_,PICTURE_ID_", "#{rev},#{first},#{last},#{email},#{pwd},#{pictureId}");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectActIdUserByCount(ActIdUser entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("act_id_user");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getFirst())) {sql.WHERE("first = #{first}");}
			if(!Strings.isNullOrEmpty(entity.getLast())) {sql.WHERE("last = #{last}");}
			if(!Strings.isNullOrEmpty(entity.getEmail())) {sql.WHERE("email = #{email}");}
			if(!Strings.isNullOrEmpty(entity.getPwd())) {sql.WHERE("pwd = #{pwd}");}
			if(!Strings.isNullOrEmpty(entity.getPictureId())) {sql.WHERE("pictureId = #{pictureId}");}

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
	public String selectActIdUserByLimt(ActIdUser entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_id_user");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getFirst())) {sql.WHERE("first = #{first}");}
			if(!Strings.isNullOrEmpty(entity.getLast())) {sql.WHERE("last = #{last}");}
			if(!Strings.isNullOrEmpty(entity.getEmail())) {sql.WHERE("email = #{email}");}
			if(!Strings.isNullOrEmpty(entity.getPwd())) {sql.WHERE("pwd = #{pwd}");}
			if(!Strings.isNullOrEmpty(entity.getPictureId())) {sql.WHERE("pictureId = #{pictureId}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectActIdUser(ActIdUser entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_id_user");
			if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getFirst())) {sql.WHERE("first = #{first}");}
			if(!Strings.isNullOrEmpty(entity.getLast())) {sql.WHERE("last = #{last}");}
			if(!Strings.isNullOrEmpty(entity.getEmail())) {sql.WHERE("email = #{email}");}
			if(!Strings.isNullOrEmpty(entity.getPwd())) {sql.WHERE("pwd = #{pwd}");}
			if(!Strings.isNullOrEmpty(entity.getPictureId())) {sql.WHERE("pictureId = #{pictureId}");}

		return sql.toString();
	}
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	public String selectOne(int id) {
		SQL sql = new SQL().SELECT("*").FROM("act_id_user");
		sql.WHERE("ID_="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updateActIdUser(ActIdUser entity) {
		SQL sql = new SQL().UPDATE("act_id_user");
				sql.SET("id = #{id}");
		sql.SET("rev = #{rev}");
		sql.SET("first = #{first}");
		sql.SET("last = #{last}");
		sql.SET("email = #{email}");
		sql.SET("pwd = #{pwd}");
		sql.SET("pictureId = #{pictureId}");
		sql.SET("updatetime = now()");

		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public String updateActIdUserByNullChk(ActIdUser entity) {
		SQL sql = new SQL().UPDATE("act_id_user");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.SET("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.SET("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getFirst())) {sql.SET("first = #{first}");}
			if(!Strings.isNullOrEmpty(entity.getLast())) {sql.SET("last = #{last}");}
			if(!Strings.isNullOrEmpty(entity.getEmail())) {sql.SET("email = #{email}");}
			if(!Strings.isNullOrEmpty(entity.getPwd())) {sql.SET("pwd = #{pwd}");}
			if(!Strings.isNullOrEmpty(entity.getPictureId())) {sql.SET("pictureId = #{pictureId}");}
		sql.SET("updatetime = now()");

		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public String deleteActIdUser(int id) {
		SQL sql = new SQL().DELETE_FROM("act_id_user");
		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(int id) {
		SQL sql = new SQL().UPDATE("act_id_user");
		sql.SET("state=2");
		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
}
