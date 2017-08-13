package com.cqupt.rms.service;

import com.cqupt.rms.model.basic.Employee;

/**
 * 用户登录、退出系统业务层
 * @author Cynthia
 *
 */
public interface LoginService {

	/**
	 * 用户登录验证
	 * @param employee 登录用户（empId,password,roleId)
	 * @return
	 * @throws Exception
	 */
	public Employee login(Employee employee) throws Exception;
	
}
