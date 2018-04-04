package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.ActGeBytearray;

/**
 * 
 * provider
 */
public class ActGeBytearrayProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertActGeBytearray(ActGeBytearray entity) {
		SQL sql = new SQL().INSERT_INTO("act_ge_bytearray");
		sql.VALUES("REV_,NAME_,DEPLOYMENT_ID_,BYTES_,GENERATED_", "#{rev},#{name},#{deploymentId},#{bytes},#{generated}");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectActGeBytearrayByCount(ActGeBytearray entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("act_ge_bytearray");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getDeploymentId())) {sql.WHERE("deploymentId = #{deploymentId}");}
			if(!Strings.isNullOrEmpty(entity.getBytes())) {sql.WHERE("bytes = #{bytes}");}
			if(!Objects.isNull(entity.getGenerated())) {sql.WHERE("generated = #{generated}");}

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
	public String selectActGeBytearrayByLimt(ActGeBytearray entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_ge_bytearray");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getDeploymentId())) {sql.WHERE("deploymentId = #{deploymentId}");}
			if(!Strings.isNullOrEmpty(entity.getBytes())) {sql.WHERE("bytes = #{bytes}");}
			if(!Objects.isNull(entity.getGenerated())) {sql.WHERE("generated = #{generated}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectActGeBytearray(ActGeBytearray entity) {
		SQL sql = new SQL().SELECT("*").FROM("act_ge_bytearray");
			if(!Strings.isNullOrEmpty(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.WHERE("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getDeploymentId())) {sql.WHERE("deploymentId = #{deploymentId}");}
			if(!Strings.isNullOrEmpty(entity.getBytes())) {sql.WHERE("bytes = #{bytes}");}
			if(!Objects.isNull(entity.getGenerated())) {sql.WHERE("generated = #{generated}");}

		return sql.toString();
	}
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	public String selectOne(int id) {
		SQL sql = new SQL().SELECT("*").FROM("act_ge_bytearray");
		sql.WHERE("ID_="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updateActGeBytearray(ActGeBytearray entity) {
		SQL sql = new SQL().UPDATE("act_ge_bytearray");
				sql.SET("id = #{id}");
		sql.SET("rev = #{rev}");
		sql.SET("name = #{name}");
		sql.SET("deploymentId = #{deploymentId}");
		sql.SET("bytes = #{bytes}");
		sql.SET("generated = #{generated}");
		sql.SET("updatetime = now()");

		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public String updateActGeBytearrayByNullChk(ActGeBytearray entity) {
		SQL sql = new SQL().UPDATE("act_ge_bytearray");
					if(!Strings.isNullOrEmpty(entity.getId())) {sql.SET("id = #{id}");}
			if(!Objects.isNull(entity.getRev())) {sql.SET("rev = #{rev}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.SET("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getDeploymentId())) {sql.SET("deploymentId = #{deploymentId}");}
			if(!Strings.isNullOrEmpty(entity.getBytes())) {sql.SET("bytes = #{bytes}");}
			if(!Objects.isNull(entity.getGenerated())) {sql.SET("generated = #{generated}");}
		sql.SET("updatetime = now()");

		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public String deleteActGeBytearray(int id) {
		SQL sql = new SQL().DELETE_FROM("act_ge_bytearray");
		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(int id) {
		SQL sql = new SQL().UPDATE("act_ge_bytearray");
		sql.SET("state=2");
		sql.WHERE("ID_ = #{ID_}");
		return sql.toString();
	}
}
