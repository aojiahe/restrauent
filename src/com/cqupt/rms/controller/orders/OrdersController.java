package com.cqupt.rms.controller.orders;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cqupt.rms.model.custom.OrdersCustom;
import com.cqupt.rms.service.OrdersService;
import com.cqupt.rms.util.ConvertToJson;
import com.google.gson.Gson;
/**
 * 消费信息管理控制层
 * @author Cynthia
 *
 */
@Controller
@RequestMapping("/orders")
public class OrdersController {

	@Autowired
	private OrdersService ordersService;
	
	//消费信息管理页面
	@RequestMapping("/reqOrdersManage")
	public String reqOrdersManage(){
		return "backend/orders/ordersManage.html";
	}
	//查询所有(有记录的顾客的)消费信息
	@RequestMapping(value="/ordersManage",produces="application/json;charset=utf-8")
	@ResponseBody
	public String ordersManage(){
		List<OrdersCustom> ordersList = null;
		Gson gson = new Gson();
		try {
			ordersList = ordersService.queryOrders();
			
			System.out.println("查询所有(有记录的顾客的)消费信息:\r\n" + gson.toJson(ordersList));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ConvertToJson.strToJson(0, gson.toJson(ordersList), null);
	}
	
	/**
	 * 根据关键字查询消费记录
	 * @param keyWords 关键字
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value="/queryOrders",produces="application/json;charset=utf-8")
	@ResponseBody
	public String queryOrders(String keyWords,Integer queryMethod) throws Exception{
		List<OrdersCustom> ordersList = null;
		System.out.println("keyWords:" + keyWords + "+queryMethod:" + queryMethod);
		
		switch(queryMethod){
		case 1: //订单编号
			ordersList = ordersService.queryOrdersByOrderId(keyWords);
			break;
		case 2: //员工编号
			ordersList = ordersService.queryOrdersByEmpId(keyWords);
			break;
		case 3: //餐厅名称
			ordersList = ordersService.queryOrdersByRestrName(keyWords);
			break;
		case 4: //订餐时间
			ordersList = ordersService.queryOrdersByOrderTime(keyWords);
			break;
		case 5: //客户姓名
			ordersList = ordersService.queryOrdersByRestrName(keyWords);
			break;
		default:
			return ConvertToJson.strToJson(1, null, "请选择正确的查询方式!");	
		}
		Gson gson = new Gson();
		
		System.out.println("根据关键字查询消费记录:\r\n" + gson.toJson(ordersList));
		
		return ConvertToJson.strToJson(0, gson.toJson(ordersList), null);
	}
	
	/**
	 * 根据订单编号删除消费记录
	 * @param ids 订单编号
	 * @return
	 */
	@RequestMapping(value="/deleteOrdersByIds",produces="application/json;charset=utf-8")
	@ResponseBody
	public String deleteOrdersByIds(String[] ids){
		Gson gson = new Gson();
		for(String id : ids){
			System.out.print("删除订单：");
			System.out.print(id + ",");
		}
		
		return ConvertToJson.strToJson(0, "success", null);
	}
	
	/**
	 * 根据订单编号查看消费记录详情
	 * @param orderId 订单编号
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value="/selectOrderDetailById",produces="application/json;charset=utf-8")
	@ResponseBody
	public String selectOrderDetailById(String orderId) throws Exception{
		System.out.println("查看订单详情，编号：" + orderId);
		OrdersCustom orderCustom = ordersService.selectOrderDetailsById(orderId);
		Gson gson = new Gson();
		System.out.println("查看订单详情:" + gson.toJson(orderCustom));
		return ConvertToJson.strToJson(0, gson.toJson(orderCustom), null);
	}
}
