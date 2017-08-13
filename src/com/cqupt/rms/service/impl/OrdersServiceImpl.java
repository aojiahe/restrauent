package com.cqupt.rms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cqupt.rms.mapper.OrdersMapper;
import com.cqupt.rms.model.custom.OrdersCustom;
import com.cqupt.rms.service.OrdersService;

/**
 * 消费信息业务信息实现类
 * @author Cynthia
 *
 */
public class OrdersServiceImpl implements OrdersService{

	@Autowired
	private OrdersMapper ordersMapper;
	
	@Override
	public List<OrdersCustom> queryOrders() throws Exception {
		
		return ordersMapper.queryOrders();
	}

	@Override
	public OrdersCustom selectOrderDetailsById(String orderId)
			throws Exception {
		return ordersMapper.selectOrderDetailsById(orderId);
	}

	@Override
	public List<OrdersCustom> queryOrdersByEmpId(String empId)
			throws Exception {
		return ordersMapper.queryOrdersByEmpId(empId);
	}

	@Override
	public List<OrdersCustom> queryOrdersByRestrName(String restaurantName)
			throws Exception {
		return ordersMapper.queryOrdersByRestrName(restaurantName);
	}

	@Override
	public List<OrdersCustom> queryOrdersByOrderTime(String orderTime)
			throws Exception {
		return ordersMapper.queryOrdersByOrderTime(orderTime);
	}

	@Override
	public List<OrdersCustom> queryOrdersByCusName(String cusName)
			throws Exception {
		return ordersMapper.queryOrdersByCusName(cusName);
	}

	@Override
	public List<OrdersCustom> queryOrdersByOrderId(String orderId)
			throws Exception {
		return ordersMapper.queryOrdersByOrderId(orderId);
	}

	@Override
	public int deleteOrdersByIds(String[] ids) throws Exception {
		
		return ordersMapper.deleteOrdersByIds(ids);
	}

}
