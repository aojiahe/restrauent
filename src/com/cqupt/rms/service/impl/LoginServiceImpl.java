package com.cqupt.rms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.cqupt.rms.mapper.LoginMapper;
import com.cqupt.rms.model.basic.Employee;
import com.cqupt.rms.service.LoginService;

public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginMapper loginMapper;
	
	@Override
	public Employee login(Employee employee) throws Exception {
		
		return loginMapper.login(employee);
	}

}
