package com.cqupt.rms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cqupt.rms.mapper.EmployeeMapper;
import com.cqupt.rms.model.basic.Employee;
import com.cqupt.rms.model.custom.EmployeeCustom;
import com.cqupt.rms.service.EmployeeService;

/**
 * 员工信息管理业务层实现类
 * @author Cynthia
 *
 */
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeMapper employeeMapper;
	
	@Override
	public List<EmployeeCustom> queryEmployee() throws Exception {
		// TODO Auto-generated method stub
		return employeeMapper.queryEmployee();
	}


	@Override
	public String getLastEmpId(String yearDeptId) throws Exception {
		
		return employeeMapper.getLastEmpId(yearDeptId);
	}

	@Override
	public int insertEmployee(String lastEmpId,String yearDeptId,Employee employee)
			throws Exception {
		String empidStr = lastEmpId.substring(lastEmpId.length() - 3);
		int empidNum = 0;
		String empId = null;
		System.out.println("empidStr:" + empidStr);
		
		//构造新员工的编号
		char[] empidArr = empidStr.toCharArray();
		if(empidArr[0] > '0' && empidArr[0] < '9'){  //第一个数字大于0
			
			empidNum = Integer.parseInt(empidStr);
			empId = yearDeptId.concat(String.valueOf(empidNum));
			
		}else if(empidArr[1] > '0' && empidArr[1] < '9'){ //第一个数字=0,第二个数字大于0
			
			empidNum = Integer.parseInt(empidStr.substring(1));
			empId = yearDeptId.concat("0").concat(String.valueOf(empidNum));
			
		}else{    //前两个数字都为0
			
			empidNum = Integer.parseInt(empidStr.substring(2));
			empId = yearDeptId.concat("00").concat(String.valueOf(empidNum));
		}
		
		 
		System.out.println("empId:" + empId);
		employee.setEmpid(empId);
		
		return employeeMapper.insertEmployee(employee);
	}

	@Override
	public int updateEmployeeById(String empId, Employee employee)
			throws Exception {
		employee.setEmpid(empId);
		return employeeMapper.updateEmployeeById(employee);
	}

	@Override
	public int deleteEmployeeByIds(String[] ids) throws Exception {
		return 0;
	}

	@Override
	public List<EmployeeCustom> searchEmployee(EmployeeCustom empCustom)
			throws Exception {
		
		return employeeMapper.searchEmployee(empCustom);
	}

}
