package com.cqupt.rms.service;

import java.util.List;

import com.cqupt.rms.model.basic.Supplier;

/**
 * 供货商信息管理业务层
 * @author Cynthia
 *
 */
public interface SuppliersService {

	/**
	 * 查询所有的供货商信息
	 * @return
	 * @throws Exception
	 */
	public List<Supplier> querySuppliers()throws Exception;
	
	
	/**
	 * 通过供货商名称查询供货商信息
	 * @param keyWords 关键字：供货商名称
	 * @return
	 * @throws Exception
	 */
	public List<Supplier> searchSuppliersByName(String keyWords)throws Exception;
	
	
	/**
	 * 通过供货商地址查询供货商信息
	 * @param keyWords 关键字：供货商地址
	 * @return
	 * @throws Exception
	 */
	public List<Supplier> searchSuppliersByAddress(String keyWords)throws Exception;
	
	
	/**
	 * 根据供货商的供货信息查询供货商
	 * @param keyWords关键字：供应的商品
	 * @return
	 * @throws Exception
	 */
	public List<Supplier> searchSuppliersBySupply(String keyWords)throws Exception;
	
	
	/**
	 *查找货款未结清的供货商
	 * @return
	 * @throws Exception
	 */
	public List<Supplier> searchSuppliersByCompletedPayment()throws Exception;
	
	
	/**
	 * 查找货款已清的供货商
	 * @return
	 * @throws Exception
	 */
	
	public List<Supplier> searchSuppliersWithUnclearPayment()throws Exception;
	
	
	/**
	 * 添加供货商信息
	 * @param supplier 供货商信息
	 * @throws Exception
	 */
	public void insertSuppier(Supplier supplier)throws Exception;
	
	
	/**
	 * 根据供货商编号修改供货商信息
	 * @param supId 供货商编号
	 * @param supplier 修改后的供货商信息
	 * @throws Exception
	 */
	public void updateSuppierById(String supId,Supplier supplier)throws Exception;
	
	
	/**
	 * 根据供货商编号删除供货商信息
	 * @param supId 供货商编号
	 * @throws Exception
	 */
	public void deleteSuppliersByIds(String[] supId)throws Exception;
	
}
