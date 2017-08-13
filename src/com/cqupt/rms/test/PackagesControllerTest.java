package com.cqupt.rms.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cqupt.rms.controller.goods.PackagesController;
import com.cqupt.rms.model.basic.Packages;
import com.cqupt.rms.service.PackagesService;

public class PackagesControllerTest {

	PackagesController controller;
	@Autowired
	private PackagesService packagesService;
	@Before
	public void setUp() throws Exception {
		controller = new PackagesController();
	}

	@Test
	public void testQueryPackages() throws Exception {
		String paList = controller.queryPackages("套餐");
		System.out.println("查询套餐信息单元测试：" + paList);
	}

}
