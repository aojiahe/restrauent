package com.cqupt.rms.controller.login;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cqupt.rms.model.basic.Employee;
import com.cqupt.rms.service.LoginService;
import com.cqupt.rms.util.ConvertToJson;
import com.google.gson.Gson;

/**
 * 用户登录、退出系统
 * @author Cynthia Liao
 *
 */
@Controller
@RequestMapping("/userLogin")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	//跳转到登录页面
	@RequestMapping("/reqLogin")
	public String reqLogin(){
		return "login/index.html";
	}
	
	//用户登录    ,headers="Accept=*/*",produces="application/json"
	@ResponseBody
	@RequestMapping(value = "/login",produces="application/json;charset=utf-8")
	public String login(HttpSession session,
			String empId,String password,Integer roleId) 
			throws Exception{
		//request.setCharacterEncoding("utf-8");
		
		/*System.out.println(request.getParameter("empId") + ":" + request.getParameter("password"));
		System.out.println(empId + ":" + password);*/
		
		if(empId == null || empId.trim().equals("") || password == null || password.trim().equals(""))
			return ConvertToJson.strToJson(1, null, "用户名或密码不能为空!");
		
		Employee employee = new Employee();
		employee.setEmpid(empId);
		employee.setPassword(password);
		employee.setRoleid(roleId);
		
	    Employee user = loginService.login(employee);
	    
	    if(user != null){
	    	Gson gson = new Gson();
	    	
	 	    System.out.println("login:" + ConvertToJson.strToJson(0, gson.toJson(user), null));
	 	    
	 	    session.setAttribute("user", user);
	 	    
	 		return ConvertToJson.strToJson(0, gson.toJson(user), null);
	    }else
	    	return ConvertToJson.strToJson(1, null, "用户名或密码错误!");
	}
	//进入管理员后台主页
	@RequestMapping("/reqBackendMain")
	public String reqBackendMain(){
		return "backend/main.html";
	}
	//返回顶部页面
	@RequestMapping("/reqBackendTop")
	public String reqBackendTop(){
		return "backend/top.html";
	}
	//返回左侧页面
	@RequestMapping("/reqBackendLeft")
	public String reqBackendLeft(){
		return "backend/left.html";
	}
	//返回右侧页面
	@RequestMapping("/reqBackendRight")
	public String reqBackendRight(){
		return "backend/right.html";
	}
	
	//获取登录员工信息
	@ResponseBody
	@RequestMapping(value = "/getEmpInfo",produces="application/json;charset=utf-8")
	public String getEmpInfo(HttpSession session){
		Employee user = (Employee)session.getAttribute("user");
		Gson gson = new Gson();
		return ConvertToJson.strToJson(0, gson.toJson(user), null);
	}
}
