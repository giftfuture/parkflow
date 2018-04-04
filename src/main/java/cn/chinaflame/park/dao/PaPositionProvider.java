package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.PaPosition;

/**
 * 
 * provider
 */
public class PaPositionProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertPaPosition(PaPosition entity) {
		SQL sql = new SQL().INSERT_INTO("pa_position");
		sql.VALUES("name,memo,createby,createtime,updateby,updatetime,enalias,department,state", "#{name},#{memo},#{createby},now(),#{updateby},now(),#{enalias},#{department},#{state}");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectPaPositionByCount(PaPosition entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("pa_position");
					if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getMemo())) {sql.WHERE("memo = #{memo}");}
			if(!Objects.isNull(entity.getCreateby())) {sql.WHERE("createby = #{createby}");}
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("createtime = #{createtime}");}
			if(!Objects.isNull(entity.getUpdateby())) {sql.WHERE("updateby = #{updateby}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("updatetime = #{updatetime}");}
			if(!Strings.isNullOrEmpty(entity.getEnalias())) {sql.WHERE("enalias = #{enalias}");}
			//if(!Objects.isNull(entity.getState()) && entity.getState() != 0) {sql.WHERE("state = #{state}");}
			sql.WHERE("state = 1");
			if(!Objects.isNull(entity.getDepartment())) {sql.WHERE("department = #{department}");}
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
	public String selectPaPositionByLimt(PaPosition entity) {
		SQL sql = new SQL().SELECT("pa_position.id,pa_position.name,pa_position.memo,pa_position.createby,pa_position.createtime,pa_position.updateby,pa_position.updatetime,enalias,department,pa_position.state,pa_sys_department.name departmentname").FROM("pa_position").LEFT_OUTER_JOIN("pa_sys_department on pa_position.department=pa_sys_department.id");
					if(!Objects.isNull(entity.getId())) {sql.WHERE("pa_position.id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("pa_position.name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getMemo())) {sql.WHERE("pa_position.memo = #{memo}");}
			if(!Objects.isNull(entity.getCreateby())) {sql.WHERE("pa_position.createby = #{createby}");}
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("pa_position.createtime = #{createtime}");}
			if(!Objects.isNull(entity.getUpdateby())) {sql.WHERE("pa_position.updateby = #{updateby}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("pa_position.updatetime = #{updatetime}");}
			if(!Strings.isNullOrEmpty(entity.getEnalias())) {sql.WHERE("pa_position.enalias = #{enalias}");}
			if(!Objects.isNull(entity.getDepartment())) {sql.WHERE("pa_position.department = #{department}");}
			sql.WHERE("pa_position.state = 1");
		String combinedsql = sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
		return combinedsql;
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectPaPosition(PaPosition entity) {
		SQL sql = new SQL().SELECT("pa_position.id,pa_position.name,pa_position.memo,pa_position.createby,pa_position.createtime,pa_position.updateby,pa_position.updatetime,enalias,department,pa_position.state,pa_sys_department.name departmentname").FROM("pa_position").LEFT_OUTER_JOIN("pa_sys_department on pa_position.department=pa_sys_department.id");
		if(!Objects.isNull(entity.getId())) {sql.WHERE("pa_position.id = #{id}");}
		if(!Strings.isNullOrEmpty(entity.getName())) {sql.WHERE("pa_position.name = #{name}");}
		if(!Strings.isNullOrEmpty(entity.getMemo())) {sql.WHERE("pa_position.memo = #{memo}");}
		if(!Objects.isNull(entity.getCreateby())) {sql.WHERE("pa_position.createby = #{createby}");}
		if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("pa_position.createtime = #{createtime}");}
		if(!Objects.isNull(entity.getUpdateby())) {sql.WHERE("pa_position.updateby = #{updateby}");}
		if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("pa_position.updatetime = #{updatetime}");}
		if(!Strings.isNullOrEmpty(entity.getEnalias())) {sql.WHERE("pa_position.enalias = #{enalias}");}
		if(!Objects.isNull(entity.getDepartment())) {sql.WHERE("pa_position.department = #{department}");}
		sql.WHERE("pa_position.state = 1");
		return sql.toString();
	}
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	public String selectOne(int id) {
		SQL sql = new SQL().SELECT("pa_position.id,pa_position.name,pa_position.memo,pa_position.createby,pa_position.createtime,pa_position.updateby,pa_position.updatetime,enalias,department,pa_position.state,pa_sys_department.name departmentname").FROM("pa_position").LEFT_OUTER_JOIN("pa_sys_department on pa_position.department=pa_sys_department.id");
		sql.WHERE("pa_position.id="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updatePaPosition(PaPosition entity) {
		SQL sql = new SQL().UPDATE("pa_position");
				sql.SET("name = #{name}");
		sql.SET("memo = #{memo}");
		sql.SET("createby = #{createby}");
		sql.SET("updateby = #{updateby}");
		sql.SET("enalias = #{enalias}");
		sql.SET("department = #{department}");
		sql.SET("updatetime = now()");
		sql.SET("state=#{state}");
		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public String updatePaPositionByNullChk(PaPosition entity) {
		SQL sql = new SQL().UPDATE("pa_position");
					if(!Strings.isNullOrEmpty(entity.getName())) {sql.SET("name = #{name}");}
			if(!Strings.isNullOrEmpty(entity.getMemo())) {sql.SET("memo = #{memo}");}
			if(!Objects.isNull(entity.getCreateby())) {sql.SET("createby = #{createby}");}
			if(!Objects.isNull(entity.getUpdateby())) {sql.SET("updateby = #{updateby}");}
			if(!Strings.isNullOrEmpty(entity.getEnalias())) {sql.SET("enalias = #{enalias}");}
			if(!Objects.isNull(entity.getDepartment())) {sql.SET("department = #{department}");}
			if(!Objects.isNull(entity.getState()) && entity.getState() != 0) {sql.SET("state=#{state}");}
		sql.SET("updatetime = now()");
		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public String deletePaPosition(int id) {
		SQL sql = new SQL().DELETE_FROM("pa_position");
		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(int id) {
		SQL sql = new SQL().UPDATE("pa_position");
		sql.SET("state=2");
		sql.WHERE("id = #{id}");
		return sql.toString();
	}
}
