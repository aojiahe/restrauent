package com.cqupt.rms.model.custom;

import java.util.List;

import com.cqupt.rms.model.basic.Packagedetail;
import com.cqupt.rms.model.basic.Packages;

/**
 * 套餐信息扩展类
 * @author Cynthia
 *
 */
public class PackagesCustom extends Packages{

	private List<Packagedetail> packagesDetails;
	
	//套餐中的餐点编号
	private String[] goodsIds;

	public List<Packagedetail> getPackagesDetails() {
		return packagesDetails;
	}

	public void setPackagesDetails(List<Packagedetail> packagesDetails) {
		this.packagesDetails = packagesDetails;
	}

	public String[] getGoodsIds() {
		return goodsIds;
	}

	public void setGoodsIds(String[] goodsIds) {
		this.goodsIds = goodsIds;
	}
	
}
