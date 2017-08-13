package com.cqupt.rms.model.custom;

import java.util.List;

import com.cqupt.rms.model.basic.Customer;
import com.cqupt.rms.model.basic.Orderdesksdetails;
import com.cqupt.rms.model.basic.Ordergoodsdetails;
import com.cqupt.rms.model.basic.Orders;
import com.cqupt.rms.model.basic.Restaurant;

/**
 * 消费信息扩展类
 * 
 * @author Cynthia
 *
 */
public class OrdersCustom extends Orders {

	// 客户信息
	private Customer customer;

	// 餐厅信息
	private Restaurant restaurant;

	// 订餐包房、桌台信息
	private List<OrderdeskdetailsCustom> orderdeskdetailsCustom;

	
	// 找零
	private float charge;

	// 餐点总数
	private int count;
	
	//订单编号：批量删除消费记录
	private String[] ids;
	
	public String[] getIds() {
		return ids;
	}

	public void setIds(String[] ids) {
		this.ids = ids;
	}

	public float getCharge() {
		return charge;
	}

	public void setCharge(float charge) {
		this.charge = charge;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public List<OrderdeskdetailsCustom> getOrderdesksdetails() {
		return orderdeskdetailsCustom;
	}

	public void setOrderdesksdetails(List<OrderdeskdetailsCustom> orderdeskdetailsCustom) {
		this.orderdeskdetailsCustom = orderdeskdetailsCustom;
	}

}
