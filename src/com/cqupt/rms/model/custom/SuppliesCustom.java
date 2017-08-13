package com.cqupt.rms.model.custom;

import java.util.List;

import com.cqupt.rms.model.basic.Supplies;
import com.cqupt.rms.model.basic.Supplydetails;

/**
 * 供货记录扩展类
 * @author Cynthia
 *
 */
public class SuppliesCustom extends Supplies{

	//供货商名称
	private String supplierName;
	
	//经办人的姓名
	private String empName;
	
	//查询的起始时间
	private String startTime;
	
	//查询的截止时间
	private String endTime;
	
	//进货详情
	private List<Supplydetails> supplyDetails;

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public List<Supplydetails> getSupplyDetails() {
		return supplyDetails;
	}

	public void setSupplyDetails(List<Supplydetails> supplyDetails) {
		this.supplyDetails = supplyDetails;
	}
	
}
