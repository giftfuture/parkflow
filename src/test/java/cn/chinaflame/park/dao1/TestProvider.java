package cn.chinaflame.park.dao1;

import org.apache.ibatis.jdbc.SQL;
import com.google.common.base.Strings;
import java.util.Objects;
import cn.chinaflame.park.model1.Test;

/**
 * 
 * provider
 */
public class TestProvider {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public String insertTest(Test entity) {
		SQL sql = new SQL().INSERT_INTO("test");
		sql.VALUES("id,var1,num1,date1", "#{id},#{var1},#{num1},#{date1}");
		return sql.toString();
	}
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public String selectTestByCount(Test entity) {
		SQL sql = new SQL().SELECT("count(*)").FROM("test");
		
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
	public String selectTestByLimt(Test entity, String orderBy, int limit, int limitLen) {
		SQL sql = new SQL().SELECT("*").FROM("test");
		
		return sql.toString() + "order by " + orderBy + " limit " + limit + "," + limitLen;
	}
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public String selectTest(Test entity) {
		SQL sql = new SQL().SELECT("*").FROM("test");

		return sql.toString();
	}
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	public String selectOne(int id) {
		SQL sql = new SQL().SELECT("*").FROM("test");
		sql.WHERE("id="+id);
		return sql.toString();
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public String updateTest(Test entity) {
		SQL sql = new SQL().UPDATE("test");
				sql.SET("id = #{id}");
		sql.SET("var1 = #{var1}");
		sql.SET("num1 = #{num1}");
		sql.SET("date1 = #{date1}");

		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public String updateTestByNullChk(Test entity) {
		SQL sql = new SQL().UPDATE("test");
					if(!Objects.isNull(entity.getId())) {sql.SET("id = #{id}");}
			if(!Strings.isNullOrEmpty(entity.getVar1())) {sql.SET("var1 = #{var1}");}
			if(!Objects.isNull(entity.getNum1())) {sql.SET("num1 = #{num1}");}
			if(!Strings.isNullOrEmpty(entity.getDate1())) {sql.SET("date1 = #{date1}");}

		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public String deleteTest(int id) {
		SQL sql = new SQL().DELETE_FROM("test");
		sql.WHERE("id = #{id}");
		return sql.toString();
	}
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public String deleteByLogic(int id) {
		SQL sql = new SQL().UPDATE("test");
		sql.SET("state=1");
		sql.WHERE("id = #{id}");
		return sql.toString();
	}
}
