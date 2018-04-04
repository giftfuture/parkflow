package cn.chinaflame.park.dao;

import java.util.List;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.mapping.StatementType;

import cn.chinaflame.park.model.PaDiscount;

public interface PaDiscountData {
	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	@InsertProvider(type = PaDiscountProvider.class, method = "insertPaDiscount")
	@SelectKey(before=false,keyProperty="id",resultType=Long.class,statementType=StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
	public int insertPaDiscount(PaDiscount entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaDiscountProvider.class, method = "selectPaDiscountByCount")
	public int selectPaDiscountByCount(PaDiscount entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	@SelectProvider(type = PaDiscountProvider.class, method = "selectPaDiscountByLimt")
	public List<PaDiscount> selectPaDiscountByLimt(PaDiscount entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	@SelectProvider(type = PaDiscountProvider.class, method = "selectPaDiscount")
	public List<PaDiscount> selectPaDiscount(PaDiscount entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	@SelectProvider(type = PaDiscountProvider.class, method = "selectOne")
	public PaDiscount selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaDiscountProvider.class, method = "updatePaDiscount")
	public int updatePaDiscount(PaDiscount entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaDiscountProvider.class, method = "updatePaDiscountByNullChk")
	public int updatePaDiscountByNullChk(PaDiscount entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	@DeleteProvider(type = PaDiscountProvider.class, method = "deletePaDiscount")
	public int deletePaDiscount(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	@UpdateProvider(type = PaDiscountProvider.class, method = "deleteByLogic")
	public int deleteByLogic(int id);
}
