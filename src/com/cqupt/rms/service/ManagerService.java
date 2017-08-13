package com.cqupt.rms.service;

import java.util.List;

import com.cqupt.rms.model.basic.Employee;
import com.cqupt.rms.model.custom.EmployeeCustom;

/**
 * 系统操作人员个人信息管理业务层
 * @author Cynthia
 *
 */
public interface ManagerService {

	/**
	 * 获取所有的系统操作员信息
	 * @return
	 * @throws Exception
	 */
	public List<EmployeeCustom> queryManager()throws Exception;
	
	
	/**
	 * 根据员工编号查询系统操作员
	 * @param keyWords关键字：员工编号
	 * @return
	 * @throws Exception
	 */
	public EmployeeCustom searchManagerById(String keyWords)throws Exception;
	
	
	/**
	 * 根据员工姓名查询系统操作员
	 * @param keyWords关键字：员工姓名
	 * @return
	 * @throws Exception
	 */
	public List<EmployeeCustom> searchManagerByEmpName(String keyWords)throws Exception;
	
	
	/**
	 * 根据部门名称查询系统操作员
	 * @param keyWords关键字：部门名称
	 * @return
	 * @throws Exception
	 */
	public List<EmployeeCustom> searchManagerByDeptName(String keyWords)throws Exception;
	
	
	/**
	 * 根据角色名称查询系统操作员
	 * @param keyWords关键字：角色名称
	 * @return
	 * @throws Exception
	 */
	public List<EmployeeCustom> searchManagerByRoleName(String keyWords)throws Exception;
	
	
	/**
	 * 添加系统操作员
	 * @param employee 新添加的系统操作员信息，包括：员工编号、角色编号、初始密码
	 * @throws Exception
	 */
	public void insertManager(Employee employee)throws Exception;
	
	
	/**
	 *根据员工编号删除操作员
	 * @param ids 员工编号
	 * @throws Exception
	 */
	public void deleteManagerByIds(String[] ids)throws Exception;
	
	
	/**
	 * 根据员工编号修改操作员信息
	 * @param id 员工编号
	 * @param employee 修改后的系统操作员信息，包括：员工编号、角色编号、密码
	 * @throws Exception
	 */
	public void updateManagerById(String id,Employee employee)throws Exception;
}
