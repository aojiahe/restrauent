package com.cqupt.rms.service;

import java.util.List;

import com.cqupt.rms.model.basic.Supplies;
import com.cqupt.rms.model.basic.Supplydetails;
import com.cqupt.rms.model.custom.SuppliesCustom;

/**
 * 进货记录管理业务层
 * @author Cynthia
 *
 */
public interface SuppliesService {


	/**
	 * 根据供货商编号查询供货记录
	 * @param supId 供货商编号
	 * @return
	 * @throws Exception
	 */
	public List<SuppliesCustom> querySuppliesById(String supId)throws Exception;
	
	
	/**
	 * 根据供货商编号查询该供货商所有的供货记录
	 * @param supId 供货商编号
	 * @param startTime 查询供货的开始时间
	 * @param endTime 查询供货的截止时间
	 * @return 
	 * @throws Exception
	 */
	public List<SuppliesCustom> searchAllSupplies(String supId,String startTime,String endTime)
			throws Exception;
	
	/**
	 * 查询已结清货款的供货记录
	 * @param supId 供货商编号
	 * @param startTime 查询供货的开始时间
	 * @param endTime 查询供货的截止时间
	 * @return
	 * @throws Exception
	 */
	public List<SuppliesCustom> searchSuppliesCompletedPayment(String supId,String startTime,String endTime)
			throws Exception;
	
	
	/**
	 * 查询未结清货款的供货记录
	 * @param supId 供货商编号
	 * @param startTime 查询供货的开始时间
	 * @param endTime 查询供货的截止时间
	 * @return
	 * @throws Exception
	 */
	public List<SuppliesCustom> searchSuppliesWithUnclearPayment(String supId,String startTime,String endTime)
			throws Exception;
	
	
	/**
	 * 根据 进货货单号 查询进货详情
	 * @param supOrderId 进货货单号
	 * @return
	 * @throws Exception
	 */
	public SuppliesCustom selectSuppliesDetailById(String supOrderId)throws Exception;
	
	
	/**
	 * 添加进货记录
	 * @param supplies 进货记录
	 * @throws Exception
	 */
	public void insertSupplies(Supplies supplies)throws Exception;
	
	
	/**
	 * 获取新添加的进货记录的货单号，以供添加进货详情使用
	 * @return 货单号
	 * @throws Exception 
	 */
	public String getSupOrderId()throws Exception;
	
	/**
	 * 根据进货单号添加货品信息
	 * @param supOrderId 进货单号
	 * @param supplydetails 货品信息
	 * @throws Exception
	 */
	public void insertSuppliesDetailById(String supOrderId,Supplydetails supplydetails)throws Exception;
	
	
	/**
	 * 根据商品编号、货单编号删除一件商品
	 * @param supOrderId
	 * @param goodsId
	 * @throws Exception
	 */
	public void deleteSuppliesDetailById(String supOrderId,String goodsId)throws Exception;
}
