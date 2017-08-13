package com.cqupt.rms.mapper;

import com.cqupt.rms.model.basic.Employee;

public interface LoginMapper {

	//用户登录
	public Employee login(Employee employee) throws Exception;
}
