package com.cqupt.rms.service;

import java.util.List;

import com.cqupt.rms.model.custom.OrdersCustom;

/**
 * 顾客消费信息（订单）管理业务层
 * @author Cynthia
 *
 */
public interface OrdersService {

	/**
	 * 查询所有(有记录的顾客的)消费信息
	 * @return
	 * @throws Exception
	 */
	public List<OrdersCustom> queryOrders() throws Exception;
	
	
	/**
	 * 根据订单编号查询消费详情
	 * @param orderId 订单编号
	 * @return
	 * @throws Exception
	 */
	public OrdersCustom selectOrderDetailsById(String orderId) throws Exception;
	
	/**
	 * 根据订单编号删除消费记录
	 * @param ids 订单编号
	 * @return
	 * @throws Exception
	 */
	public int deleteOrdersByIds(String[] ids) throws Exception;
	
	
	/**
	 * 根据员工编号查询消费信息
	 * @param empId 员工编号
	 * @return
	 * @throws Exception
	 */
	public List<OrdersCustom> queryOrdersByEmpId(String empId) throws Exception;
	
	
	/**
	 * 根据餐厅名称查询消费信息
	 * @param restaurantName 餐厅名称
	 * @return
	 * @throws Exception
	 */
	public List<OrdersCustom> queryOrdersByRestrName(String restaurantName) throws Exception;
	
	
	/**
	 * 根据订餐时间查询消费信息
	 * @param orderTime 用餐时间
	 * @return
	 * @throws Exception
	 */
	public List<OrdersCustom> queryOrdersByOrderTime(String orderTime) throws Exception;
	
	
	/**
	 * 根据客户姓名查询消费信息
	 * @param cusName 客户姓名
	 * @return
	 * @throws Exception
	 */
	public List<OrdersCustom> queryOrdersByCusName(String cusName) throws Exception;
	
	/**
	 * 根据订单编号查询订单信息
	 * @param orderId 订单编号
	 * @return
	 * @throws Exception
	 */
	public List<OrdersCustom> queryOrdersByOrderId(String orderId) throws Exception;
}
