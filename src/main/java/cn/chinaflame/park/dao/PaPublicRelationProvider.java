package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.PaPublicRelation;

/**
 * 公关增票记录表
 * provider
 */
public class PaPublicRelationProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertPaPublicRelation(PaPublicRelation entity) {
		SQL sql = new SQL().INSERT_INTO("pa_public_relation");
		sql.VALUES("object_id,order_id,department_id,staff_id,increase_time,memo,createtime,updatetime", "#{object_id},#{order_id},#{department_id},#{staff_id},#{increase_time},#{memo},now(),now()");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectPaPublicRelationByCount(PaPublicRelation entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("pa_public_relation");
					if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getObject_id())) {sql.WHERE("object_id = #{object_id}");}
			if(!Objects.isNull(entity.getOrder_id())) {sql.WHERE("order_id = #{order_id}");}
			if(!Objects.isNull(entity.getDepartment_id())) {sql.WHERE("department_id = #{department_id}");}
			if(!Objects.isNull(entity.getStaff_id())) {sql.WHERE("staff_id = #{staff_id}");}
			if(!Strings.isNullOrEmpty(entity.getIncrease_time())) {sql.WHERE("increase_time = #{increase_time}");}
			if(!Strings.isNullOrEmpty(entity.getMemo())) {sql.WHERE("memo = #{memo}");}
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
	public String selectPaPublicRelationByLimt(PaPublicRelation entity) {
		SQL sql = new SQL().SELECT("*").FROM("pa_public_relation");
					if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
					if(!Objects.isNull(entity.getObject_id())) {sql.WHERE("object_id = #{object_id}");}
			if(!Objects.isNull(entity.getOrder_id())) {sql.WHERE("order_id = #{order_id}");}
			if(!Objects.isNull(entity.getDepartment_id())) {sql.WHERE("department_id = #{department_id}");}
			if(!Objects.isNull(entity.getStaff_id())) {sql.WHERE("staff_id = #{staff_id}");}
			if(!Strings.isNullOrEmpty(entity.getIncrease_time())) {sql.WHERE("increase_time = #{increase_time}");}
			if(!Strings.isNullOrEmpty(entity.getMemo())) {sql.WHERE("memo = #{memo}");}
			if(!Strings.isNullOrEmpty(entity.getCreatetime())) {sql.WHERE("createtime = #{createtime}");}
			if(!Strings.isNullOrEmpty(entity.getUpdatetime())) {sql.WHERE("updatetime = #{updatetime}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectPaPublicRelation(PaPublicRelation entity) {
		SQL sql = new SQL().SELECT("*").FROM("pa_public_relation");
			if(!Objects.isNull(entity.getId())) {sql.WHERE("id = #{id}");}
			if(!Objects.isNull(entity.getObject_id())) {sql.WHERE("object_id = #{object_id}");}
			if(!Objects.isNull(entity.getOrder_id())) {sql.WHERE("order_id = #{order_id}");}
			if(!Objects.isNull(entity.getDepartment_id())) {sql.WHERE("department_id = #{department_id}");}
			if(!Objects.isNull(entity.getStaff_id())) {sql.WHERE("staff_id = #{staff_id}");}
			if(!Strings.isNullOrEmpty(entity.getIncrease_time())) {sql.WHERE("increase_time = #{increase_time}");}
			if(!Strings.isNullOrEmpty(entity.getMemo())) {sql.WHERE("memo = #{memo}");}
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
		SQL sql = new SQL().SELECT("*").FROM("pa_public_relation");
		sql.WHERE("id="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updatePaPublicRelation(PaPublicRelation entity) {
		SQL sql = new SQL().UPDATE("pa_public_relation");
		sql.SET("object_id = #{object_id}");
				sql.SET("order_id = #{order_id}");
		sql.SET("department_id = #{department_id}");
		sql.SET("staff_id = #{staff_id}");
		sql.SET("increase_time = #{increase_time}");
		sql.SET("memo = #{memo}");
		sql.SET("updatetime = now()");

		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public String updatePaPublicRelationByNullChk(PaPublicRelation entity) {
		SQL sql = new SQL().UPDATE("pa_public_relation");
					if(!Objects.isNull(entity.getObject_id())) {sql.SET("object_id = #{object_id}");}
					if(!Objects.isNull(entity.getOrder_id())) {sql.SET("order_id = #{order_id}");}
			if(!Objects.isNull(entity.getDepartment_id())) {sql.SET("department_id = #{department_id}");}
			if(!Objects.isNull(entity.getStaff_id())) {sql.SET("staff_id = #{staff_id}");}
			if(!Strings.isNullOrEmpty(entity.getIncrease_time())) {sql.SET("increase_time = #{increase_time}");}
			if(!Strings.isNullOrEmpty(entity.getMemo())) {sql.SET("memo = #{memo}");}
		sql.SET("updatetime = now()");

		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public String deletePaPublicRelation(int id) {
		SQL sql = new SQL().DELETE_FROM("pa_public_relation");
		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(int id) {
		SQL sql = new SQL().UPDATE("pa_public_relation");
		sql.SET("state=2");
		sql.WHERE("id = #{id}");
		return sql.toString();
	}
}
