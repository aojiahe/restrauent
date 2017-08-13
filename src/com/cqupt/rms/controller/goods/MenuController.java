package com.cqupt.rms.controller.goods;

import java.util.List;

import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cqupt.rms.model.basic.Employee;
import com.cqupt.rms.model.basic.Goods;
import com.cqupt.rms.model.basic.Goodstype;
import com.cqupt.rms.model.custom.GoodsQueryVo;
import com.cqupt.rms.service.GoodsService;
import com.cqupt.rms.service.GoodsTypeService;
import com.cqupt.rms.util.ConvertToJson;
import com.google.gson.Gson;

/**
 * 菜谱信息管理控制层
 * @author Cynthia
 *
 */
@Controller
@RequestMapping("/menu")
public class MenuController {
	
	@Autowired
	private GoodsTypeService goodsTypeService;
	
	@Autowired
	private GoodsService goodsService;

	//菜品类别管理
	@RequestMapping("/reqMenuTypesManage")
	public String reqGoodsTypesManage(){
		return "backend/menu/menuTypeManage.html";
	}
	//获取菜品类别信息
	@RequestMapping(value="/goodsTypesManage",produces="application/json;charset=utf-8")
	@ResponseBody
	public String goodsTypesManage(String type) throws Exception{
		
		//商品大的类别  1:菜品(普通菜品和特色菜)  2:酒水饮料 3：食材
		List<Goodstype> goodstypes = goodsTypeService.queryGoodsTypes(type);
		Gson gson = new Gson();
		
		System.out.println("菜品类别信息:" + gson.toJson(goodstypes));
		return ConvertToJson.strToJson(0, gson.toJson(goodstypes), null);
	}
	
	
	/**
	 * 添加商品类型信息
	 * @param session
	 * @param type 1:菜品(普通菜品和特色菜)  2:酒水饮料 3：食材
	 * @return
	 */
	@RequestMapping("/reqAddGoodsType")
	public String reqAddGoodsType(HttpSession session,String type){
		Employee user = (Employee) session.getAttribute("user");
		if(user == null)
			return "login/index.html";
		session.setAttribute("type", type);
		return "backend/goods/addGoodsType.html";
	}
	
	@RequestMapping(value="/addGoodsType",produces="application/json;charset=utf-8")
	@ResponseBody
	public String addGoodsType(HttpSession session,String typeName) throws Exception{
		
		String type = (String)session.getAttribute("type");
		System.out.println("添加商品类型信息 ：type=" + type + " typeName=" + typeName);
		
		Goodstype goodstype = new Goodstype();
		goodstype.setType(type);
		goodstype.setTypename(typeName);
		
		int result = goodsTypeService.insertGoodsType(goodstype, type);
		
		if(result > 0)
			return ConvertToJson.strToJson(0, "添加商品类型信息成功", null);
		return ConvertToJson.strToJson(1, null, "添加商品类型信息失败");
	}
	
	
	//根据关键字查询菜品类型信息
	@RequestMapping(value="/queryMenuType",produces="application/json;charset=utf-8")
	@ResponseBody
	public String queryGoodsType(String keyWords,String type) throws Exception{
		System.out.println("keywords:" + keyWords + "+type:" + type);
		
		Goodstype goodstype = new Goodstype();
		goodstype.setType(type);
		goodstype.setTypename(keyWords);
		List<Goodstype> goodstypes = goodsTypeService.searchGoodsTypeByName(goodstype,keyWords, type);

		Gson gson = new Gson();
		
		System.out.println("查询菜品类别信息:" + gson.toJson(goodstypes));
		return ConvertToJson.strToJson(0, gson.toJson(goodstypes), null);
	}
	
	
	/**
	 * 修改商品类型信息
	 * @param typeId 商品类型编号
	 * @return
	 */
	@RequestMapping("/reqUpdateGoodsType")
	public String reqUpdateGoodsType(HttpSession session,Integer typeId){
		Employee user = (Employee) session.getAttribute("user");
		if(user == null)
			return "login/index.html";
		session.setAttribute("typeId", typeId);
		return "backend/goods/updateGoodsType.html";
	}
	
	@RequestMapping(value="/updateGoodsType",produces="application/json;charset=utf-8")
	@ResponseBody
	public String updateGoodsType(HttpSession session) throws Exception{
		Integer typeId = (Integer)session.getAttribute("typeId");
		
		//查询出要修改的商品类型信息
		Goodstype goodstype = goodsTypeService.selectGoodsTypeById(typeId);
		
		Gson gson = new Gson();
		
		System.out.println("要修改的商品类型信息：" + ConvertToJson.strToJson(0, gson.toJson(goodstype), null));
		return ConvertToJson.strToJson(0, gson.toJson(goodstype), null);
	}
	//提交修改后的商品类型信息
	@RequestMapping(value="/updateGoodsTypeSub",produces="application/json;charset=utf-8")
	@ResponseBody
	public String updateGoodsTypeSub(HttpSession session,String newTypeName) throws Exception{
		Integer typeId = (Integer)session.getAttribute("typeId");
		
		Goodstype goodstype = new Goodstype();
		goodstype.setTypeid(typeId);
		goodstype.setTypename(newTypeName);
		
		int result = goodsTypeService.updateGoodsTypeById(typeId, goodstype);
		
		if(result > 0)
			return ConvertToJson.strToJson(0, "修改商品类型信息成功", null);
		return ConvertToJson.strToJson(1, null, "修改商品类型信息失败");
	}
	
	
	//特色菜维护
	/**
	 * 进入特色菜维护页面
	 * @return
	 */
	@RequestMapping("/reqSpecialMenuManage")
	public String reqSpecialMenuManage(){
		
		return "backend/menu/specialMenusManage.html";
	}
	/**
	 * 获取商品信息
	 * @param type 1:菜品类   2：酒水饮料类   3：食材类
	 * @param isSpecial 0:非特色菜  1：特色菜
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value="/goodsManage",produces="application/json;charset=utf-8")
	@ResponseBody
	public String goodsManage(String type,String isSpecial) throws Exception{
		System.out.println("获取商品信息:type=" + type + "+isSpecial=" + isSpecial);
		List<GoodsQueryVo> goodsList = goodsService.queryGoods(type, isSpecial);
		List<Goodstype> goodstypes = goodsTypeService.queryGoodsTypes(type);
		
		/*JSONArray jsonArray = JSONArray.fromObject(goodsList);
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("goodsArray", jsonArray);*/
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("goodsList", goodsList);
		jsonObject.put("goodstypes", goodstypes);
		
		System.out.println("获取商品信息:" + ConvertToJson.strToJson(0, jsonObject, null));
		
		return ConvertToJson.strToJson(0, jsonObject, null);
	}
	/**
	 * 根据关键字查询商品信息
	 * @param queryMethod 1：商品编号  2：商品名称
	 * @param keyWords 关键字
	 * @param type 1:菜品类   2：酒水饮料类   3：食材类
	 * @param isSpecial 0:非特色菜  1：特色菜
	 * @param typeId 商品的类型编号  0:所有类型
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value="/queryGoods",produces="application/json;charset=utf-8")
	@ResponseBody
	public String queryGoods(Integer queryMethod,String keyWords,String type,String isSpecial,Integer typeId) throws Exception{
		Gson gson = new Gson();
		List<GoodsQueryVo> goodsList = null;
		
		switch(queryMethod){
		case 1:  //通过商品编号查询
				goodsList = goodsService.searchGoodsById(keyWords, typeId, type, isSpecial);
				
			System.out.println("根据关键字查询商品信息:\r\n" + ConvertToJson.strToJson(0, gson.toJson(goodsList), null));
			
			return ConvertToJson.strToJson(0, gson.toJson(goodsList), null);
		case 2: //通过商品名称查询
				goodsList = goodsService.searchGoodsByName(keyWords, type, isSpecial, typeId);
			
			System.out.println("根据关键字查询商品信息:\r\n" + ConvertToJson.strToJson(0, gson.toJson(goodsList), null));
			
			return ConvertToJson.strToJson(0, gson.toJson(goodsList), null);
		}
		
		return ConvertToJson.strToJson(1, null, "请选择正确的查询方式");
	}
	
	
	/**
	 * 添加菜品信息
	 * @param session
	 * @param isSpecial 0:非特色菜  1：特色菜
	 * @return
	 */
	@RequestMapping("/reqAddMenu")
	public String reqAddMenu(HttpSession session,String isSpecial){
		Employee user = (Employee) session.getAttribute("user");
		if(user == null)
			return "login/index.html";
		session.setAttribute("addMenuIsSpecial", isSpecial);
		return "backend/menu/addMenu.html";
	}
	@RequestMapping(value="/addMenu",produces="application/json;charset=utf-8")
	@ResponseBody
	public String addMenu(HttpSession session,Goods goods) throws Exception{
		String isSpecial = (String) session.getAttribute("addMenuIsSpecial");
		
		System.out.println("添加菜品信息：" + goods.getGoodsname() + " : " + isSpecial);
		
		//获取最新添加的菜品的编号
		String lastFoodsId = goodsService.getLastFoodsId();
		
		int result = goodsService.insertFood(goods, isSpecial, lastFoodsId);
		if(result > 0)
			return ConvertToJson.strToJson(0, "添加菜品成功", null);
		return ConvertToJson.strToJson(1, null, "添加菜品失败");
	}
	
	
	/**
	 * 修改菜品信息
	 * @param session
	 * @param goodsid 菜品编号
	 * @return
	 */
	@RequestMapping("/reqUpdateMenu")
	public String reqUpdateMenu(HttpSession session,String goodsid){
		Employee user = (Employee) session.getAttribute("user");
		if(user == null)
			return "login/index.html";
		session.setAttribute("updateMenuGoodsid", goodsid);
		return "backend/menu/updateMenu.html";
	}
	
	@RequestMapping(value="/updateMenu",produces="application/json;charset=utf-8")
	@ResponseBody
	public String updateMenu(HttpSession session) throws Exception{
		String goodsid = (String)session.getAttribute("updateMenuGoodsid");
		JSONObject jsonObject = new JSONObject();
		
		//获取要修改的菜品的信息
		Goods goods = goodsService.getGoodsById(goodsid);
		List<Goodstype> goodstypes = goodsTypeService.queryGoodsTypes("1");
		jsonObject.put("goods", goods);
		jsonObject.put("goodstypes", goodstypes);
		
		System.out.println("修改菜品信息：" + ConvertToJson.strToJson(0, jsonObject, null));
		
		if(goods != null)
			return ConvertToJson.strToJson(0, jsonObject, null);
		return ConvertToJson.strToJson(1, null, "没有找到该种菜品信息");
	}
	/**
	 * 提交修改后的菜品信息
	 * @param goods
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/subUpdateMenu",produces="application/json;charset=utf-8")
	@ResponseBody
	public String subUpdateMenu(Goods goods,HttpSession session) throws Exception{
		System.out.println("提交修改后的菜品信息:" + goods.getGoodsname());
		
		String goodsId = (String)session.getAttribute("updateMenuGoodsid");
		int result = goodsService.updateGoodsById(goodsId, goods);
		
		if(result > 0)
			return ConvertToJson.strToJson(0, "修改成功", null);
		return ConvertToJson.strToJson(1, null, "修改失败");
	}
}
