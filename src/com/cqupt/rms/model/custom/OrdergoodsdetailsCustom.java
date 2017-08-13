package com.cqupt.rms.model.custom;

import com.cqupt.rms.model.basic.Ordergoodsdetails;

/**
 * 订餐餐点详情扩展类
 * @author Cynthia
 *
 */
public class OrdergoodsdetailsCustom extends Ordergoodsdetails{

	//餐点名称
	private String goodsName;
	
	//餐点规格
	private String goodsUnit;
	
	//餐点类型
	private String typeName;

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsUnit() {
		return goodsUnit;
	}

	public void setGoodsUnit(String goodsUnit) {
		this.goodsUnit = goodsUnit;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	
}
