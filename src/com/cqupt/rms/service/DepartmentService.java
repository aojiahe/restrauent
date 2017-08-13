package com.cqupt.rms.service;

import java.util.List;

import com.cqupt.rms.model.basic.Department;

/**
 * 部门信息管理业务层
 * @author Cynthia
 *
 */
public interface DepartmentService {

	/**
	 * 查询所有的部门信息
	 * @return
	 * @throws Exception
	 */
	public List<Department> queryDepartments() throws Exception;
	
	
	/**
	 * 添加部门信息
	 * @param lastDeptId 部门表中部门标号最大者，新添加的部门编号=(Integer)deptId + 1
	 * @param department
	 * @throws Exception
	 */
	public void insertDepartment(String lastDeptId,Department department) throws Exception;
	
	
	/**
	 * 在添加部门信息(insertDepartment)之前执行该方法
	 * 获取部门编号中最大者
	 * @return 部门编号
	 * @throws Exception
	 */
	public String getLastDeptId() throws Exception;
	
	
	/**
	 * 根据部门编号删除部门信息
	 * @param ids 部门编号
	 * @throws Exception
	 */
	public void deleteDepartmentByIds(String[] ids) throws Exception;
	
	
	/**
	 * 根据部门编号修改部门名称
	 * @param id 部门编号
	 * @throws Exception
	 */
	public void updateDepartmentById(String id) throws Exception;
	
	
	/**
	 * 根据关键字查询部门信息
	 * @param keyWords 关键字：部门名称
	 * @return
	 * @throws Exception
	 */
	public List<Department> searchDepartmentByName(String keyWords) throws Exception;
}
