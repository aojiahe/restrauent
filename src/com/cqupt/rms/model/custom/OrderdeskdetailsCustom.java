package com.cqupt.rms.model.custom;

import java.util.List;

import com.cqupt.rms.model.basic.Orderdesksdetails;
import com.cqupt.rms.model.basic.Ordergoodsdetails;
/**
 * 订单对应的房间的扩展类：包含每个房间的订餐详情
 * @author lenovo
 *
 */
public class OrderdeskdetailsCustom extends Orderdesksdetails{

	// 订餐的餐点信息
	private List<OrdergoodsdetailsCustom> ordergoodsdetailsCustom;

	public List<OrdergoodsdetailsCustom> getOrdergoodsdetails() {
		return ordergoodsdetailsCustom;
	}

	public void setOrdergoodsdetails(List<OrdergoodsdetailsCustom> ordergoodsdetailsCustom) {
		this.ordergoodsdetailsCustom = ordergoodsdetailsCustom;
	}
}
