package cn.chinaflame.park.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.chinaflame.park.dao.PaSysRoleData;
import cn.chinaflame.park.model.PaSysRole;
import cn.chinaflame.park.service.PaSysRoleService;
import cn.chinaflame.park.vo.PaSysRoleVO;

public class PaSysRoleServiceImpl implements PaSysRoleService {

	
	@Autowired
	private PaSysRoleData pasysroledata;
	
	@Override
	public int insertPaSysRole(PaSysRole entity) {
		return pasysroledata.insertPaSysRole(entity);
	}

	@Override
	public int selectPaSysRoleByCount(PaSysRole entity) {
		return pasysroledata.selectPaSysRoleByCount(entity);
	}

	@Override
	public List<PaSysRoleVO> selectPaSysRoleByLimt(PaSysRole entity) {
		return pasysroledata.selectPaSysRoleByLimt(entity);
	}

	@Override
	public List<PaSysRoleVO> selectPaSysRole(PaSysRole entity) {
		return pasysroledata.selectPaSysRole(entity);
	}

	@Override
	public List<PaSysRoleVO> searchPaSysRole(PaSysRole entity) {
		return pasysroledata.searchPaSysRole(entity);
	}

	@Override
	public PaSysRole selectOne(int id) {
		return pasysroledata.selectOne(id);
	}

	@Override
	public int updatePaSysRole(PaSysRole entity) {
		return pasysroledata.updatePaSysRole(entity);
	}

	@Override
	public int updatePaSysRoleByNullChk(PaSysRole entity) {
		return pasysroledata.updatePaSysRoleByNullChk(entity);
	}

	@Override
	public int deletePaSysRole(int id) {
		return pasysroledata.deletePaSysRole(id);
	}

	@Override
	public int deleteByLogic(long id) {
		return pasysroledata.deleteByLogic(id);
	}

}
