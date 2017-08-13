package com.cqupt.rms.service;

import java.util.List;

import com.cqupt.rms.model.basic.Packagedetail;
import com.cqupt.rms.model.basic.Packages;
import com.cqupt.rms.model.custom.PackagesCustom;

/**
 * 套餐信息管理业务层
 * @author Cynthia
 *
 */
public interface PackagesService {

	/**
	 * 查询所有的套餐信息
	 * @return
	 * @throws Exception
	 */
	public List<Packages> queryPackages() throws Exception;
	
	
	/**
	 * 添加套餐信息
	 * @param packages
	 * @return 新添加的套餐记录的编号
	 * @throws Exception
	 */
	public Packages insertPackage(Packages packages) throws Exception;
	
	
	/**
	 *根据套餐编号插入套餐详细信息
	 * @param packageId 套餐编号
	 * @param packagedetail 套餐菜品信息
	 * @throws Exception
	 */
	public int insertPackageDetails(Integer packageId,PackagesCustom packagesCustom) throws Exception;
	
	
	/**
	 * 根据套餐编号删除套餐详情
	 * @param ids 套餐编号
	 * @throws Exception
	 */
	public int deletePackagesDetailsByIds(Integer[] ids) throws Exception;
	
	
	/**
	 * 根据套餐编号删除套餐信息
	 * @param ids 套餐编号
	 * @throws Exception
	 */
	public int deletePackagesByIds(Integer[] ids) throws Exception;
	
	
	/**
	 * 根据套餐编号查询套餐信息及其详情
	 * @param id 套餐编号
	 * @return
	 * @throws Exception
	 */
	public PackagesCustom queryPackageById(Integer id) throws Exception;
	
	
	/**
	 * 根据套餐编号修改套餐信息
	 * @param id 套餐编号
	 * @param packages 套餐信息
	 * @throws Exception
	 */
	public int updatePackageById(Integer id,Packages packages) throws Exception;
	
	
	/**
	 * 根据套餐编号修改套餐详情
	 * @param id 套餐编号
	 * @param packagedetail 修改后的套餐详情
	 * @throws Exception
	 */
	public int updatePackageDetailById(Integer id,Packagedetail packagedetail) throws Exception;
	
	
	/**
	 * 使用关键字通过套餐名查找套餐信息
	 * @param keyWords 关键字：套餐名
	 * @return
	 * @throws Exception
	 */
	public List<Packages> searchPackagesByName(String keyWords) throws Exception;
	
}
