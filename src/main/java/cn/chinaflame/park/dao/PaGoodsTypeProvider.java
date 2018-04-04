package cn.chinaflame.park.dao;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model.PaGoodsType;

/**
 * 
 * provider
 */
public class PaGoodsTypeProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertPaGoodsType(PaGoodsType entity) {
		SQL sql = new SQL().INSERT_INTO("pa_goods_type");
		sql.VALUES("type_name,status", "#{type_name},'1'");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectPaGoodsTypeByCount(PaGoodsType entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("pa_goods_type");
					if(!Objects.isNull(entity.getType_id())) {sql.WHERE("type_id = #{type_id}");}
			if(!Strings.isNullOrEmpty(entity.getType_name())) {sql.WHERE("type_name = #{type_name}");}
			if(!Objects.isNull(entity.getStatus())) {sql.WHERE("status = #{status}");}

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
	public String selectPaGoodsTypeByLimt(PaGoodsType entity) {
		SQL sql = new SQL().SELECT("*").FROM("pa_goods_type");
					if(!Objects.isNull(entity.getType_id())) {sql.WHERE("type_id = #{type_id}");}
			if(!Strings.isNullOrEmpty(entity.getType_name())) {sql.WHERE("type_name = #{type_name}");}
			if(!Objects.isNull(entity.getStatus())) {sql.WHERE("status = #{status}");}

		return sql.toString() + " order by " + entity.getOrderBy() + " desc limit " + entity.getLimit() + "," + entity.getLimitLen();
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectPaGoodsType(PaGoodsType entity) {
		SQL sql = new SQL().SELECT("*").FROM("pa_goods_type");
			if(!Objects.isNull(entity.getType_id())) {sql.WHERE("type_id = #{type_id}");}
			if(!Strings.isNullOrEmpty(entity.getType_name())) {sql.WHERE("type_name = #{type_name}");}
			if(!Objects.isNull(entity.getStatus())) {sql.WHERE("status = #{status}");}

		return sql.toString();
	}
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	public String selectOne(int id) {
		SQL sql = new SQL().SELECT("*").FROM("pa_goods_type");
		sql.WHERE("type_id="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updatePaGoodsType(PaGoodsType entity) {
		SQL sql = new SQL().UPDATE("pa_goods_type");
				sql.SET("type_name = #{type_name}");
		sql.SET("status = #{status}");

		sql.WHERE("type_id = #{type_id}");
		return sql.toString();
	}
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public String updatePaGoodsTypeByNullChk(PaGoodsType entity) {
		SQL sql = new SQL().UPDATE("pa_goods_type");
					if(!Strings.isNullOrEmpty(entity.getType_name())) {sql.SET("type_name = #{type_name}");}
			if(!Objects.isNull(entity.getStatus())) {sql.SET("status = #{status}");}

		sql.WHERE("type_id = #{type_id}");
		return sql.toString();
	}
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public String deletePaGoodsType(int id) {
		SQL sql = new SQL().DELETE_FROM("pa_goods_type");
		sql.WHERE("type_id = #{type_id}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(int id) {
		SQL sql = new SQL().UPDATE("pa_goods_type");
		sql.SET("state=1");
		sql.WHERE("type_id = #{type_id}");
		return sql.toString();
	}
}
