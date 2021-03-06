package com.cqupt.rms.mapper;

import java.util.List;

import com.cqupt.rms.model.basic.Goodstype;

public interface GoodsTypeMapper {


	/**
	 * 查询商品所有的类别信息
	 * @param type 商品大的类别  1:菜品(普通菜品和特色菜)  2:酒水饮料 3：食材
	 * @return
	 * @throws Exception
	 */
	public List<Goodstype> queryGoodsTypes(String type) throws Exception;
	
	
	/**
	 * 添加商品类别
	 * @param goodstype 新添加的商品类别信息
	 * @throws Exception
	 */
	public int insertGoodsType(Goodstype goodstype) throws Exception;
	
	
	/**
	 * 根据商品类型ID修改商品类型
	 * @param goodstype 修改后的商品类型信息
	 * @throws Exception
	 */
	public int updateGoodsTypeById(Goodstype goodstype)throws Exception;
	
	
	/**
	 * 根据商品类型ID删除商品类别
	 * @param typeIds 商品类型ID
	 * @throws Exception
	 */
	public int deleteGoodsTypeByIds(Integer[] typeIds) throws Exception;
	
	
	/**
	 * 使用关键字通过对商品类型名进行商品类型信息的模糊查询
	 * @return
	 * @throws Exception
	 */
	public List<Goodstype> searchGoodsTypeByName(Goodstype goodstype) throws Exception;
	
	/**
	 * 根据商品类型编号查询商品类型信息
	 * @param typeId
	 * @return
	 * @throws Exception
	 */
	public Goodstype selectGoodsTypeById(Integer typeId)throws Exception;
	

}
