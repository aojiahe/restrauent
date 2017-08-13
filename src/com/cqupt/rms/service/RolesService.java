package com.cqupt.rms.service;

import java.util.List;

import com.cqupt.rms.model.basic.Roles;

/**
 * 角色权限信息管理业务层
 * @author Cynthia
 *
 */
public interface RolesService {

	/**
	 * 获取所有的角色信息
	 * @return
	 * @throws Exception
	 */
	public List<Roles> queryRoles()throws Exception;
	
	
	//public 
}
