package cn.chinaflame.park.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.chinaflame.park.model.PaUserTask;
import cn.chinaflame.park.service.PaUserTaskService;

public class PaUserTaskServiceImpl implements PaUserTaskService{
	
	@Autowired
	private PaUserTaskService paUserTaskService;
	
	@Override
	public int insertPaUserTask(PaUserTask entity) {
		return paUserTaskService.insertPaUserTask(entity);
	}

	@Override
	public int selectPaUserTaskByCount(PaUserTask entity) {
		return paUserTaskService.selectPaUserTaskByCount(entity);
	}

	@Override
	public List<PaUserTask> selectPaUserTaskByLimt(PaUserTask entity) {
		return paUserTaskService.selectPaUserTaskByLimt(entity);
	}

	@Override
	public List<PaUserTask> selectPaUserTask(PaUserTask entity) {
		return paUserTaskService.selectPaUserTask(entity);
	}

	@Override
	public PaUserTask selectOne(int id) {
		return paUserTaskService.selectOne(id);
	}

	@Override
	public int updatePaUserTask(PaUserTask entity) {
		return paUserTaskService.updatePaUserTask(entity);
	}

	@Override
	public int updatePaUserTaskByNullChk(PaUserTask entity) {
		return paUserTaskService.updatePaUserTaskByNullChk(entity);
	}

	@Override
	public int deletePaUserTask(int id) {
		return paUserTaskService.deletePaUserTask(id);
	}

	@Override
	public int deleteByLogic(int id) {
		return paUserTaskService.deleteByLogic(id);
	}

}
