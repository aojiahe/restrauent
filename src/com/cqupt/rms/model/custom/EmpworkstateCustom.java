package com.cqupt.rms.model.custom;

import com.cqupt.rms.model.basic.Empworkstate;

public class EmpworkstateCustom extends Empworkstate{
	
	//部门名称
	private String deptName;
	
	//员工名称
	private String empName;
	
	//员工工作起始时间
	private String startTime;
	
	//员工工作结束时间
	private String endTime;

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
}
