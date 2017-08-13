package com.cqupt.rms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cqupt.rms.mapper.PackagesMapper;
import com.cqupt.rms.model.basic.Packagedetail;
import com.cqupt.rms.model.basic.Packages;
import com.cqupt.rms.model.custom.PackagesCustom;
import com.cqupt.rms.service.PackagesService;
/**
 * 套餐信息业务层实现类
 * @author Cynthia
 *
 */
public class PackagesServiceImpl implements PackagesService{
	
	@Autowired
	private PackagesMapper packagesMapper;

	@Override
	public List<Packages> queryPackages() throws Exception {
		
		return packagesMapper.queryPackages();
	}

	@Override
	public Packages insertPackage(Packages packages) throws Exception {
		
		return packagesMapper.insertPackage(packages);
	}

	@Override
	public int insertPackageDetails(Integer packageId,
			PackagesCustom packagesCustom) throws Exception {
		packagesCustom.setPackageid(packageId);
		return packagesMapper.insertPackageDetails(packagesCustom);
	}

	@Override
	public int deletePackagesDetailsByIds(Integer[] ids) throws Exception {
		return 0;
	}

	@Override
	public int deletePackagesByIds(Integer[] ids) throws Exception {
		return 0;
	}

	@Override
	public PackagesCustom queryPackageById(Integer id) throws Exception {
		
		return packagesMapper.queryPackageById(id);
	}

	@Override
	public int updatePackageById(Integer id, Packages packages)
			throws Exception {
		return 0;
	}

	@Override
	public int updatePackageDetailById(Integer id, Packagedetail packagedetail)
			throws Exception {
		return 0;
	}

	@Override
	public List<Packages> searchPackagesByName(String keyWords) throws Exception {

		return packagesMapper.searchPackagesByName(keyWords);
	}

}
