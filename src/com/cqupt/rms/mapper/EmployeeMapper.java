package com.cqupt.rms.mapper;

import java.util.List;

import com.cqupt.rms.model.basic.Employee;
import com.cqupt.rms.model.custom.EmployeeCustom;

public interface EmployeeMapper {

	//用户登录
	public Employee login(Employee employee) throws Exception;
	
	/**
	 * 查询所有员工信息
	 * @return
	 * @throws Exception
	 */
	public List<EmployeeCustom> queryEmployee() throws Exception;
	
	
	/**
	 * 根据员工编号/员工姓名/部门名称 查询员工信息,如果学历编号不为空，则将其作为一个筛选条件
	 * @param empCustom 员工信息
	 * @return
	 * @throws Exception
	 */
	public List<EmployeeCustom> searchEmployee(EmployeeCustom empCustom) throws Exception;
	
	/**
	 * 按入职年份及部门编号查询该部门在当年入职的最新的员工编号
	 * @param yearDeptId 入职年份
	 * @throws Exception
	 */
	public String getLastEmpId(String yearDeptId) throws Exception;
	
	
	/**
	 * 添加员工信息
	 * @param employee 新添加员工信息
	 * @throws Exception
	 */
	public int insertEmployee(Employee employee) throws Exception;
	
	
	/**
	 * 根据员工编号修改员工信息
	 * @param employee 修改后的员工信息
	 * @throws Exception
	 */
	public int updateEmployeeById(Employee employee) throws Exception;
	
	
	/**
	 * 根据员工编号删除员工信息
	 * @param ids 员工编号
	 * @throws Exception
	 */
	public int deleteEmployeeByIds(String[] ids) throws Exception;
}
