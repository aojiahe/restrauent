package com.cqupt.rms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cqupt.rms.mapper.DeptMapper;
import com.cqupt.rms.model.basic.Department;
import com.cqupt.rms.service.DepartmentService;

/**
 * 部门信息管理业务层实现类
 * @author Cynthia
 *
 */
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DeptMapper deptMapper;
	
	@Override
	public List<Department> queryDepartments() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertDepartment(String lastDeptId, Department department)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getLastDeptId() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDepartmentByIds(String[] ids) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateDepartmentById(String id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Department> searchDepartmentByName(String keyWords)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
