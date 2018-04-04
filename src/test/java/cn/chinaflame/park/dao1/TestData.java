package cn.chinaflame.park.dao1;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model1.Test;

public interface TestData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = TestProvider.class, method = "insertTest")
	@SelectKey(before=false,keyProperty="id",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertTest(Test entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = TestProvider.class, method = "selectTestByCount")
	public int selectTestByCount(Test entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = TestProvider.class, method = "selectTestByLimt")
	public List<Test> selectTestByLimt(Test entity, String orderBy, int limit, int limitLen);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = TestProvider.class, method = "selectTest")
	public List<Test> selectTest(Test entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = TestProvider.class, method = "selectOne")
	public Test selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = TestProvider.class, method = "updateTest")
	public int updateTest(Test entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = TestProvider.class, method = "updateTestByNullChk")
	public int updateTestByNullChk(Test entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = TestProvider.class, method = "deleteTest")
	public int deleteTest(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = TestProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
