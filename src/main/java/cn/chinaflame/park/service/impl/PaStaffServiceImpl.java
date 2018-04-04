package cn.chinaflame.park.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import cn.chinaflame.park.dao.PaStaffData;
import cn.chinaflame.park.model.PaStaff;
import cn.chinaflame.park.service.PaStaffService;
import cn.chinaflame.park.vo.PaStaffVO;

public class PaStaffServiceImpl implements PaStaffService{

	
	@Autowired
	private PaStaffData pastaffdata;
	
	@Override
	public int insertPaStaff(PaStaff entity) {
		return pastaffdata.insertPaStaff(entity);
	}

	@Override
	public int selectPaStaffByCount(PaStaff entity) {
		return pastaffdata.selectPaStaffByCount(entity);
	}

	@Override
	public List<PaStaffVO> selectPaStaffByLimt(PaStaff entity) {
		return pastaffdata.searchPaStaffByLimt(entity);
	}

	@Override
	public int searchPaStaffByCount(PaStaff entity) {
		return pastaffdata.searchPaStaffByCount(entity);
	}

	@Override
	public List<PaStaffVO> searchPaStaffByLimt(PaStaff entity) {
		return pastaffdata.searchPaStaffByLimt(entity);
	}

	@Override
	public List<PaStaffVO> selectPaStaff(PaStaff entity) {
		return pastaffdata.selectPaStaff(entity);
	}

	@Override
	public List<PaStaffVO> searchPaStaff(PaStaff entity) {
		return pastaffdata.searchPaStaff(entity);
	}

	@Override
	public PaStaff selectOne(int id) {
		return pastaffdata.selectOne(id);
	}

	@Override
	public int updatePaStaff(PaStaff entity) {
		return pastaffdata.updatePaStaff(entity);
	}

	@Override
	public int updatePaStaffByNullChk(PaStaff entity) {
		return pastaffdata.updatePaStaffByNullChk(entity);
	}

	@Override
	public int deletePaStaff(int id) {
		return pastaffdata.deletePaStaff(id);
	}

	@Override
	public int deleteByLogic(int id) {
		return pastaffdata.deleteByLogic(id);
	}

	@Override
	public int deleteByRole(long roleId) {
		return pastaffdata.deleteByRole(roleId);
	}

	@Override
	public List<PaStaffVO> staffLogin(Map<String, Object> map) {
		return pastaffdata.staffLogin(map);
	}

}
