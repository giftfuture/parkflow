package cn.chinaflame.park.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.chinaflame.park.model.PaUserTask;

@Service("paUserTaskService")
public interface PaUserTaskService {

	
	/**
	 * 插入操作
	 * @param entity
	 * @return
	 */
	public int insertPaUserTask(PaUserTask entity);
	/**
	 * 按条件查询总记录数
	 * @param entity
	 * @return
	 */
	public int selectPaUserTaskByCount(PaUserTask entity);
	/**
	 * 按条件分页查询
	 * @param entity
	 * @param orderBy
	 * @param limit
	 * @param limitLen
	 * @return
	 */
	public List<PaUserTask> selectPaUserTaskByLimt(PaUserTask entity);
	/**
	 * 按条件查询记录
	 * @param entity
	 * @return
	 */
	public List<PaUserTask> selectPaUserTask(PaUserTask entity);
	/**
	 * 根据主键id查询实体
	 * @param id
	 * @return
	 */
	public PaUserTask selectOne(int id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public int updatePaUserTask(PaUserTask entity);
	/**
	 * 更新实体，过滤空值
	 * @param entity
	 * @return
	 */
	public int updatePaUserTaskByNullChk(PaUserTask entity);
	/**
	 * 物理删除实体
	 * @param id
	 * @return
	 */
	public int deletePaUserTask(int id);
	/**
	 * 逻辑删除实体
	 * @param entity
	 * @return
	 */
	public int deleteByLogic(int id);

}
