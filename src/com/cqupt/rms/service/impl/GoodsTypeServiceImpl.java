package com.cqupt.rms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cqupt.rms.mapper.GoodsTypeMapper;
import com.cqupt.rms.model.basic.Goodstype;
import com.cqupt.rms.service.GoodsTypeService;
/**
 * 商品类型信息业务层实现类
 * @author Cynthia
 *
 */
public class GoodsTypeServiceImpl implements GoodsTypeService{

	@Autowired
	private GoodsTypeMapper goodsTypeMapper;

	@Override
	public List<Goodstype> queryGoodsTypes(String type) throws Exception {
		return goodsTypeMapper.queryGoodsTypes(type);
	}

	@Override
	public int insertGoodsType(Goodstype goodstype, String type)
			throws Exception {
		goodstype.setType(type);
		return goodsTypeMapper.insertGoodsType(goodstype);
	}

	@Override
	public int updateGoodsTypeById(Integer typeId, Goodstype goodstype)
			throws Exception {
		goodstype.setTypeid(typeId);
		return goodsTypeMapper.updateGoodsTypeById(goodstype);		
	}

	@Override
	public int deleteGoodsTypeByIds(Integer[] typeIds) throws Exception {
		return 0;
	}

	@Override
	public List<Goodstype> searchGoodsTypeByName(Goodstype goodstype,String keyWords, String type)
			throws Exception {
		goodstype.setType(type);
		goodstype.setTypename(keyWords);
		return goodsTypeMapper.searchGoodsTypeByName(goodstype);
	}

	@Override
	public Goodstype selectGoodsTypeById(Integer typeId) throws Exception {
		
		return goodsTypeMapper.selectGoodsTypeById(typeId);
	}
	

}
