package com.cqupt.rms.model.custom;

import com.cqupt.rms.model.basic.Goods;
import com.cqupt.rms.model.basic.Goodstype;

/**
 * 商品（菜品）信息包装类
 * @author Cynthia
 *
 */
public class GoodsQueryVo {

	//商品基本信息
	private Goods goods;
	
	//商品类别信息
	private Goodstype goodstype;

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public Goodstype getGoodstype() {
		return goodstype;
	}

	public void setGoodstype(Goodstype goodstype) {
		this.goodstype = goodstype;
	}
	
}
