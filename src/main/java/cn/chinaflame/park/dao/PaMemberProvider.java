package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.PaMember;

/**
 * 会员表
 * provider
 */
public class PaMemberProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertPaMember(PaMember entity) {
		SQL sql = new SQL().INSERT_INTO("pa_member");
		sql.VALUES("mobile,id_card,name,password,openid,createtime,updatetime,sex", "#{mobile},#{id_card},#{name},#{password},#{openid},now(),now(),#{sex}");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectPaMemberByCount(PaMember entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("pa_member");
					if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getMobile())) {sql.WHERE("mobile = #{mobile}");}
			if(!Strings.isNullOrEmpty(entity.getId_card())) {sql.WHERE("id_card = #{id_card}");}
			if(!Strings.isNullOrEmpty(entity.getOpenid())) {sql.WHERE("openid = #{openid}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getSex())) {sql.WHERE("sex = #{sex}");}
			if(!Strings.isNullOrEmpty(entity.getPassword())) {sql.WHERE("password = #{password}");}
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
	public String selectPaMemberByLimt(PaMember entity) {
		SQL sql = new SQL().SELECT("*").FROM("pa_member");
					if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getMobile())) {sql.WHERE("mobile = #{mobile}");}
			if(!Strings.isNullOrEmpty(entity.getId_card())) {sql.WHERE("id_card = #{id_card}");}
			if(!Strings.isNullOrEmpty(entity.getOpenid())) {sql.WHERE("openid = #{openid}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getSex())) {sql.WHERE("sex = #{sex}");}
			if(!Strings.isNullOrEmpty(entity.getPassword())) {sql.WHERE("password = #{password}");}
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("createtime = #{createtime}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("updatetime = #{updatetime}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectPaMember(PaMember entity) {
		SQL sql = new SQL().SELECT("*").FROM("pa_member");
			if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getMobile())) {sql.WHERE("mobile = #{mobile}");}
			if(!Strings.isNullOrEmpty(entity.getId_card())) {sql.WHERE("id_card = #{id_card}");}
			if(!Strings.isNullOrEmpty(entity.getOpenid())) {sql.WHERE("openid = #{openid}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getSex())) {sql.WHERE("sex = #{sex}");}
			if(!Strings.isNullOrEmpty(entity.getPassword())) {sql.WHERE("password = #{password}");}
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("createtime = #{createtime}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("updatetime = #{updatetime}");}

		return sql.toString();
	}
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	public String selectOne(int id) {
		SQL sql = new SQL().SELECT("*").FROM("pa_member");
		sql.WHERE("id="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updatePaMember(PaMember entity) {
		SQL sql = new SQL().UPDATE("pa_member");
				sql.SET("mobile = #{mobile}");
				sql.SET("id_card = #{id_card}");
				sql.SET("openid = #{openid}");
		sql.SET("name = #{name}");
		sql.SET("sex = #{sex}");
		sql.SET("password = #{password}");
		sql.SET("updatetime = now()");

		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public String updatePaMemberByNullChk(PaMember entity) {
		SQL sql = new SQL().UPDATE("pa_member");
			if(!Strings.isNullOrEmpty(entity.getMobile())) {sql.SET("mobile = #{mobile}");}
			if(!Strings.isNullOrEmpty(entity.getId_card())) {sql.SET("id_card = #{id_card}");}
			if(!Strings.isNullOrEmpty(entity.getOpenid())) {sql.SET("openid = #{openid}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.SET("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getSex())) {sql.SET("sex = #{sex}");}
			if(!Strings.isNullOrEmpty(entity.getPassword())) {sql.SET("password = #{password}");}
		sql.SET("updatetime = now()");

		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public String deletePaMember(int id) {
		SQL sql = new SQL().DELETE_FROM("pa_member");
		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(int id) {
		SQL sql = new SQL().UPDATE("pa_member");
		sql.SET("state=2");
		sql.WHERE("id = #{id}");
		return sql.toString();
	}
}
