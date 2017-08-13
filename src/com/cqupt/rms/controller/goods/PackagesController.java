package com.cqupt.rms.controller.goods;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cqupt.rms.model.basic.Employee;
import com.cqupt.rms.model.basic.Packagedetail;
import com.cqupt.rms.model.basic.Packages;
import com.cqupt.rms.model.custom.PackagesCustom;
import com.cqupt.rms.service.PackagesService;
import com.cqupt.rms.util.ConvertToJson;
import com.google.gson.Gson;
/**
 * 套餐信息控制层
 * @author Cynthia
 *
 */
@Controller
@RequestMapping("/packages")
public class PackagesController {

	@Autowired
	private PackagesService packagesService;
	
	//套餐信息管理
	@RequestMapping("/reqPackagesManage")
	public String reqPackagesManage(){
		return "backend/menu/packagesManage.html";
	}
	
	//获取套餐信息
	@RequestMapping(value="/packagesManage",produces="application/json;charset=utf-8")
	@ResponseBody
	public String packagesManage() throws Exception{
		List<Packages> paList = packagesService.queryPackages();
		Gson gson = new Gson();
		
		System.out.println("获取套餐信息:" + ConvertToJson.strToJson(0, gson.toJson(paList), null));
		return ConvertToJson.strToJson(0, gson.toJson(paList), null);
	}
	
	/**
	 * 使用关键字通过套餐名查找套餐信息
	 * @param keyWords
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value="/queryPackages",produces="application/json;charset=utf-8")
	@ResponseBody
	public String queryPackages(String keyWords) throws Exception{
		System.out.println("keyWords:" + keyWords);
		List<Packages> paList = packagesService.searchPackagesByName(keyWords);
		
		Gson gson = new Gson();
		
		System.out.println("通过套餐名查找套餐信息:" + ConvertToJson.strToJson(0, gson.toJson(paList), null));
		return ConvertToJson.strToJson(0, gson.toJson(paList), null);
	}
	
	//添加套餐信息
	@RequestMapping("/reqAddPackages")
	public String reqAddPackages(){
		return "backend/menu/addPackages.html";
	}
	@RequestMapping(value="/addPackages",produces="application/json;charset=utf-8")
	@ResponseBody
	public String addPackages(Packages packages,String[] selectMenus) throws Exception{
		System.out.println("添加套餐信息:" + packages.getPackagename() + 
				" : " + selectMenus.length + " : " + " : " + selectMenus[0]);
		int result = 0;
		
		Packages p = packagesService.insertPackage(packages);
		
		PackagesCustom paCustom = new PackagesCustom();
		paCustom.setGoodsIds(selectMenus);
		paCustom.setPackageid(p.getPackageid());
		
		System.out.println("添加套餐结果：" + p.getPackageid());
		
		if(p.getPackageid() > 0){
			result = packagesService.insertPackageDetails(p.getPackageid(), paCustom);
			if(result > 0)
				return ConvertToJson.strToJson(0, "添加套餐信息成功", null);
			return ConvertToJson.strToJson(1,null,"添加套餐信息失败");
		}
		return ConvertToJson.strToJson(1,null,"添加套餐信息失败");
	}
	
	// 修改套餐信息
	@RequestMapping("/reqUpdatePackages")
	public String reqUpdatePackages(HttpSession session,Integer packagesId) {
		Employee user = (Employee) session.getAttribute("user");
		if(user == null)
			return "login/index.html";
		session.setAttribute("updatePackagesId", packagesId);
		return "backend/menu/updatePackages.html";
	}
	//获取要修改的套餐信息
	@RequestMapping(value = "/updatePackages", produces = "application/json;charset=utf-8")
	@ResponseBody
	public String updatePackages(HttpSession session)
			throws Exception {
		Integer packagesId = (Integer)session.getAttribute("updatePackagesId");
		PackagesCustom paCustom = packagesService.queryPackageById(packagesId);
		
		Gson gson = new Gson();
		if(paCustom != null)
			return ConvertToJson.strToJson(1, null, "未找到该套餐信息");
		
		return ConvertToJson.strToJson(0, gson.toJson(paCustom), null);
	}
	
	// 提交修改后的套餐信息
	@RequestMapping(value = "/subUpdatePackages", produces = "application/json;charset=utf-8")
	@ResponseBody
	public String subUpdatePackages(Packages packages,String[] selectMenus) throws Exception {
		
		
		return null;
	}
	
	//查看套餐详情
	@RequestMapping("/reqPackagesDetail")
	public String reqPackagesDetail(HttpSession session,Integer packagesId){
		Employee user = (Employee) session.getAttribute("user");
		if(user == null)
			return "login/index.html";
		session.setAttribute("selectPackagesId", packagesId);
		return "backend/menu/packagesDetail.html";
	}
	
	@RequestMapping(value = "/packagesDetail", produces = "application/json;charset=utf-8")
	@ResponseBody
	public String packagesDetail(HttpSession session)
			throws Exception {
		Integer packagesId = (Integer)session.getAttribute("selectPackagesId");
		PackagesCustom paCustom = packagesService.queryPackageById(packagesId);
		
		Gson gson = new Gson();
		if(paCustom != null)
			return ConvertToJson.strToJson(1, null, "未找到该套餐信息");
		
		return ConvertToJson.strToJson(0, gson.toJson(paCustom), null);
	}
}
