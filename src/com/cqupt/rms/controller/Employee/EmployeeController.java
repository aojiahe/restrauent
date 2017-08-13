package com.cqupt.rms.controller.Employee;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cqupt.rms.model.basic.Department;
import com.cqupt.rms.model.basic.Employee;
import com.cqupt.rms.model.custom.EmployeeCustom;
import com.cqupt.rms.service.DepartmentService;
import com.cqupt.rms.service.EmployeeService;
import com.cqupt.rms.util.ConvertToJson;
import com.google.gson.Gson;

/**
 * 员工信息管理控制层
 * @author Cynthia
 *
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private DepartmentService deptService;
	
	//员工信息管理
	@RequestMapping("/reqEmployeeManage")
	public String reqEmployeeManage(){
		return "backend/employee/employeeManage.html";
	}
	
	//获取员工信息
	@RequestMapping(value = "/employeeManage",produces="application/json;charset=utf-8")
	@ResponseBody
	public String employeeManage() throws Exception{
		List<EmployeeCustom> empList = employeeService.queryEmployee();
		Gson gson = new Gson();
		
		System.out.println("获取员工信息:" + ConvertToJson.strToJson(0, gson.toJson(empList), null));
		
		return ConvertToJson.strToJson(0, gson.toJson(empList), null);
	}
	
	//查询员工信息
	@RequestMapping(value = "/queryEmployee",produces="application/json;charset=utf-8")
	@ResponseBody
	public String queryEmployee(String keyWords,Integer queryMethod,String education) throws Exception{
		System.out.println("查询员工信息:");
		System.out.println("keyWords"+keyWords + "queryMethod"+queryMethod + "education"+education);
		
		EmployeeCustom empCustom = new EmployeeCustom();
		
		switch(queryMethod){
		case 0: //按学历查询
			if(education == null)
				return ConvertToJson.strToJson(1, null, "请选择正确的查询方式");
			empCustom.setEducation(education);
			break;
			
		case 1: //员工姓名
			empCustom.setEmpname(keyWords);
			break;
			
		case 2: //员工编号
			empCustom.setEmpid(keyWords);
			break;
			
		case 3: //部门
			empCustom.setDeptName(keyWords);
			break;
		}
		if(education != null)
			empCustom.setEducation(education);
		
		List<EmployeeCustom> empList = employeeService.searchEmployee(empCustom);
		Gson gson = new Gson();
		
		System.out.println("查询员工信息:" + ConvertToJson.strToJson(0, gson.toJson(empList), null));
		
		return ConvertToJson.strToJson(0, gson.toJson(empList), null);
	}
	
	// 添加员工信息
	@RequestMapping("/reqAddEmployee")
	public String reqAddEmployee() {
		return "backend/employee/addEmployee.html";
	}
	
	@RequestMapping(value = "/addEmployee", produces = "application/json;charset=utf-8")
	@ResponseBody
	public String addEmployee(Employee employee) throws Exception {
		System.out.println("添加员工信息:" + employee.getEmpname());
		
		String year = String.valueOf(new Date().getYear());
		
		String yearDeptId = year.concat(employee.getDeptid());
		System.out.println("yearDeptId:" + yearDeptId);
		
		//获取该部门当年入职的员工编号中最大的编号
		String lastEmpId = employeeService.getLastEmpId(yearDeptId);
		
		int result = employeeService.insertEmployee(lastEmpId,yearDeptId,employee);
		if(result > 0)
			return ConvertToJson.strToJson(0, "添加员工信息成功", null);
		return ConvertToJson.strToJson(1, null, "添加员工信息失败");
	}
	
	
	// 查询部门信息
	@RequestMapping(value = "/deptManage", produces = "application/json;charset=utf-8")
	@ResponseBody
	public String deptManage() throws Exception{
		List<Department> deptList = deptService.queryDepartments();
		
		Gson gson = new Gson();
		
		System.out.println("查询部门信息:" + ConvertToJson.strToJson(0, gson.toJson(deptList), null));
		
		return ConvertToJson.strToJson(0, gson.toJson(deptList), null);
	}
	
	//修改员工信息
	@RequestMapping("/reqUpdateEmployee")
	public String reqUpdateEmployee(HttpSession session,String empid){
		Employee user = (Employee) session.getAttribute("user");
		if(user == null)
			return "login/index.html";
		session.setAttribute("updateEmpid", empid);
		return "backend/employee/updateEmployee.html";
	}
	
	@RequestMapping(value = "/updateEmployee", produces = "application/json;charset=utf-8")
	@ResponseBody
	public String updateEmployee(HttpSession session,Employee employee) throws Exception {
		String empId = (String)session.getAttribute("updateEmpid");
		
		System.out.println("修改员工信息:" + employee.getEmpname() + " empId:" + empId);
		
		int result = employeeService.updateEmployeeById(empId, employee);
		if(result > 0)
			return ConvertToJson.strToJson(0, "添加员工信息成功", null);
		return ConvertToJson.strToJson(1, null, "添加员工信息失败");
	}
}
