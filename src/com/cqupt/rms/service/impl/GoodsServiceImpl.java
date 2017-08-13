package com.cqupt.rms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cqupt.rms.mapper.GoodsMapper;
import com.cqupt.rms.model.basic.Goods;
import com.cqupt.rms.model.basic.Goodstype;
import com.cqupt.rms.model.custom.GoodsQueryVo;
import com.cqupt.rms.service.GoodsService;

/**
 * 商品信息业务层实现类
 * @author Cynthia
 *
 */
public class GoodsServiceImpl implements GoodsService{

	@Autowired
	private GoodsMapper goodsMapper;
	
	// * @param type  1:菜品（分为普通菜品和特色菜）  2:酒水饮料 3：食材
	//* @param isSpecial 是否是特色菜。0：否 1：是
	@Override
	public List<GoodsQueryVo> queryGoods(String type, String isSpecial)
			throws Exception {
		GoodsQueryVo goodsQueryVo = new GoodsQueryVo();
		
		if(isSpecial != null && !isSpecial.trim().equals("")){
			Goods goods = new Goods();
			goods.setIsspecial(isSpecial);
			goodsQueryVo.setGoods(goods);
		}
		
		Goodstype goodstype = new Goodstype();
		goodstype.setType(type);
		
		goodsQueryVo.setGoodstype(goodstype);
		
		return goodsMapper.queryGoods(goodsQueryVo);
	}


	@Override
	public List<GoodsQueryVo> searchGoodsByName(String keyWords, String type,
			String isSpecial, Integer typeId) throws Exception {
		GoodsQueryVo goodsQueryVo = new GoodsQueryVo();
		
		Goods goods = new Goods();
		goods.setGoodsname(keyWords);
		if(isSpecial != null && !isSpecial.trim().equals(""))
			goods.setIsspecial(isSpecial);
		
		goodsQueryVo.setGoods(goods);
		
		Goodstype goodstype = new Goodstype();
		goodstype.setType(type);
		if(typeId > 0)
			goodstype.setTypeid(typeId);
		
		goodsQueryVo.setGoodstype(goodstype);
		return goodsMapper.searchGoodsByName(goodsQueryVo);
	}

	@Override
	public List<GoodsQueryVo> searchGoodsById(String keyWords, Integer typeId,
			String type, String isSpecial) throws Exception {
		GoodsQueryVo goodsQueryVo = new GoodsQueryVo();
		
		Goods goods = new Goods();
		goods.setGoodsid(keyWords);
		if(isSpecial != null && !isSpecial.trim().equals(""))
			goods.setIsspecial(isSpecial);
		
		goodsQueryVo.setGoods(goods);
		
		Goodstype goodstype = new Goodstype();
		goodstype.setType(type);
		if(typeId > 0)
			goodstype.setTypeid(typeId);
		
		goodsQueryVo.setGoodstype(goodstype);
		return goodsMapper.searchGoodsById(goodsQueryVo);
	}

	@Override
	public String getLastFoodsId() throws Exception {
		
		return goodsMapper.getLastFoodsId();
	}

	@Override
	public int insertFood(Goods goods, String isSpecial, String lastFoodsId)
			throws Exception {
		String str = lastFoodsId.substring(1);
		String numStr = str.substring(str.lastIndexOf('0') + 1);
		
		System.out.println("numStr:" + numStr);
		
		int num = Integer.parseInt(numStr);
		String goodsId = "F" + (++num);
		
		System.out.println("goodsId:" + goodsId);
		
		goods.setIsspecial(isSpecial);
		goods.setGoodsid(goodsId);
		
		return goodsMapper.insertFood(goods);
	}

	@Override
	public int insertGoods(Goods goods, Integer type) throws Exception {
		return 0;
	}

	@Override
	public int updateGoodsById(String goodsId, Goods goods) throws Exception {
		return 0;
	}

	@Override
	public int deleteGoodsByIds(String[] ids) throws Exception {
		return 0;
	}


	@Override
	public Goods getGoodsById(String goodsId) throws Exception {
		
		return goodsMapper.getGoodsById(goodsId);
	}

}
