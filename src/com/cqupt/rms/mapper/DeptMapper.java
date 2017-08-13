package com.cqupt.rms.mapper;

import java.util.List;

import com.cqupt.rms.model.basic.Department;
import com.cqupt.rms.model.basic.Employee;
import com.cqupt.rms.model.custom.EmployeeCustom;

public interface DeptMapper {

	/**
	 * 查询所有的部门信息
	 * @return
	 * @throws Exception
	 */
	public List<Department> queryDepartments() throws Exception;
}
