package com.cqupt.rms.model.custom;

import java.util.List;

import com.cqupt.rms.model.basic.Employee;

/**
 * 员工实体类的包装类
 * @author Cynthia
 *
 */
public class EmployeeCustom extends Employee{

	//出生日期
	private String birthday;
	
	//部门名称
	private String deptName;
	
	//角色名称
	private String roleName;
	
	//员工工作记录
	private List<EmpworkstateCustom> empworkstateList;

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<EmpworkstateCustom> getEmpworkstateList() {
		return empworkstateList;
	}

	public void setEmpworkstateList(List<EmpworkstateCustom> empworkstateList) {
		this.empworkstateList = empworkstateList;
	}
	
}
