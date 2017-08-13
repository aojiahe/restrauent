package com.cqupt.rms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cqupt.rms.mapper.EmpWorkStateMapper;
import com.cqupt.rms.model.basic.Empworkstate;
import com.cqupt.rms.model.custom.EmpworkstateCustom;
import com.cqupt.rms.service.EmpworkstateService;

/**
 * 员工工作情况信息管理业务层实现类
 * @author Cynthia
 *
 */
public class EmpworkstateServiceImpl implements EmpworkstateService{

	@Autowired
	private EmpWorkStateMapper empWorkStateMapper;
	
	//根据部门名称/员工名称/员工编号查询员工工作情况,时间作为可选筛选条件
	@Override
	public List<EmpworkstateCustom> queryEmpWorkState(EmpworkstateCustom empworkstateCustom) throws Exception {
		
		return empWorkStateMapper.queryEmpWorkState(empworkstateCustom);
	}

	@Override
	public void insertEmpWorkStateById(String empId, Empworkstate empworkstate)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Empworkstate selectEmpworkstateDetail(String empId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmpworkstateByIds(String[] ids) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
