package com.cqupt.rms.service;

import java.util.List;

import com.cqupt.rms.model.basic.Employee;
import com.cqupt.rms.model.custom.EmployeeCustom;

/**
 * 员工信息管理业务层
 * @author Cynthia
 *
 */
public interface EmployeeService {

	/**
	 * 查询所有员工信息
	 * @return
	 * @throws Exception
	 */
	public List<EmployeeCustom> queryEmployee() throws Exception;
	
	
	
	/**
	 * 根据员工编号或员工姓名或部门名称 查询员工信息,如果学历编号不为空，则将其作为一个筛选条件
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
	 * @param lastEmpId 新添加员工编号= （Integer）lastEmpId + 1
	 * @param yearDeptId 新员工入职年份及部门编号组成的字符串
	 * @param employee 新添加员工信息
	 * @throws Exception
	 */
	public int insertEmployee(String lastEmpId,String yearDeptId,Employee employee) throws Exception;
	
	
	/**
	 * 根据员工编号修改员工信息
	 * @param empId 员工编号
	 * @param employee 修改后的员工信息
	 * @throws Exception
	 */
	public int updateEmployeeById(String empId,Employee employee) throws Exception;
	
	
	/**
	 * 根据员工编号删除员工信息
	 * @param ids 员工编号
	 * @throws Exception
	 */
	public int deleteEmployeeByIds(String[] ids) throws Exception;
	
}
