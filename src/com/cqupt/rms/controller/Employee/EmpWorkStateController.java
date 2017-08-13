package com.cqupt.rms.controller.Employee;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cqupt.rms.model.basic.Employee;
import com.cqupt.rms.model.custom.EmpworkstateCustom;
import com.cqupt.rms.service.EmpworkstateService;
import com.cqupt.rms.util.ConvertToJson;
import com.google.gson.Gson;

/**
 * 员工工作情况信息管理控制层
 * @author Cynthia
 *
 */
@Controller
@RequestMapping("/empWorkState")
public class EmpWorkStateController {

	@Autowired
	private EmpworkstateService empwoService;
	
	//员工工作情况管理
	@RequestMapping("/reqEmpworkstateManage")
	public String reqEmpworkstateManage(){
		return "backend/employee/empworkstateManage.html";
	}
	@RequestMapping(value="/empworkstateManage",produces="applicaiton/json;charset=utf-8")
	@ResponseBody
	public String empworkstateManage() throws Exception{
		List<EmpworkstateCustom> empworkstateList = empwoService.queryEmpWorkState(new EmpworkstateCustom());
		Gson gson = new Gson();
		
		System.out.println("员工工作情况管理:" + ConvertToJson.strToJson(0, gson.toJson(empworkstateList), null));
		
		return ConvertToJson.strToJson(0, gson.toJson(empworkstateList), null);
	}
	
	//查询员工工作情况
	@RequestMapping(value="/queryEmpworkstate",produces="applicaiton/json;charset=utf-8")
	@ResponseBody
	public String queryEmpworkstate(String startTime,String endTime,Integer queryMethod,String keyWords)
			throws Exception{
		System.out.println("查询员工工作情况:" + startTime + " : " + endTime + " : " + queryMethod + " : " + keyWords);
		EmpworkstateCustom empworkCustom = new EmpworkstateCustom();
		
		if(startTime != null)
			empworkCustom.setStartTime(startTime);
		if(endTime != null)
			empworkCustom.setStartTime(endTime);
		switch(queryMethod){
		case 0:  //所有信息
			if(startTime == null && endTime == null)
				return ConvertToJson.strToJson(1, null, "请选择正确的查询方式");
			break;
			
		case 1: //员工姓名
			empworkCustom.setEmpName(keyWords);
			break;
			
		case 2: //员工编号
			empworkCustom.setEmpid(keyWords);
			break;
			
		case 3: //部门名称
			empworkCustom.setDeptName(keyWords);
			break;
		}
		
		List<EmpworkstateCustom> empworkstateList = empwoService.queryEmpWorkState(empworkCustom);
		Gson gson = new Gson();
		
		System.out.println("员工工作情况管理:" + ConvertToJson.strToJson(0, gson.toJson(empworkstateList), null));
		
		return ConvertToJson.strToJson(0, gson.toJson(empworkstateList), null);
	}
	
	//添加员工工作情况
	@RequestMapping("/reqAddWorkstate")
	public String reqAddWorkstate() {
		return "backend/employee/addWorkstate.html";
	}
	
	@RequestMapping(value = "/addWorkstate", produces = "application/json;charset=utf-8")
	@ResponseBody
	public String addWorkstate(Employee employee) throws Exception {
		int result = 0;
		if(result > 0)
			return ConvertToJson.strToJson(0, "添加员工工作情况成功", null);
		return ConvertToJson.strToJson(1, null, "添加员工工作情况失败");
	}
}
