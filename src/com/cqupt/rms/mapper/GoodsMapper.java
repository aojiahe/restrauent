package com.cqupt.rms.mapper;

import java.util.List;

import com.cqupt.rms.model.basic.Goods;
import com.cqupt.rms.model.custom.GoodsQueryVo;

/**
 * 商品信息持久层
 * @author Cynthia
 *
 */
public interface GoodsMapper {


	/**
	 * 查询所有的商品信息
	 * @param type  1:菜品（分为普通菜品和特色菜）  2:酒水饮料 3：食材
	 * @param isSpecial 是否是特色菜。0：否 1：是
	 * @return 商品信息
	 * @throws Exception
	 */
	public List<GoodsQueryVo> queryGoods(GoodsQueryVo goodsQueryVo) throws Exception;
	
	
	/**
	 * 使用关键字通过对商品的名称模糊查询某一类商品信息
	 * @param keyWords 关键字
	 * @param type 1:菜品（分为普通菜品和特色菜）  2:酒水饮料 3：食材
	 * @param isSpecial  是否是特色菜。0：否 1：是
	 * @param typeId 商品类型ID
	 * @return 商品信息
	 * @throws Exception
	 */
	public List<GoodsQueryVo> searchGoodsByName(GoodsQueryVo goodsQueryVo)
			throws Exception;
	
	
	
    /**
     * 使用关键字通过对商品的编号模糊查询某一类商品信息
     * @param keyWords 关键字:商品 编号
	 * @param type 1:菜品（分为普通菜品和特色菜）  2:酒水饮料 3：食材
	 * @param isSpecial 是否是特色菜。0：否 1：是
     * @param typeId 商品类别编号
     * @return 商品信息
     * @throws Exception
     */
	public List<GoodsQueryVo> searchGoodsById(GoodsQueryVo goodsQueryVo)
			throws Exception;
	
	
	/**
	 * 在添加菜品信息(insertFood)前执行这一操作
	 * 获取菜品类商品中最大的商品编号
	 * @return 菜品编号（F+尾数（整数，递增））
	 * @throws Exception
	 */
	public String getLastFoodsId() throws Exception;
	
	
	/**
	 * 添加菜品
	 * @param goods 菜品信息
	 * @throws Exception
	 */
	public int insertFood(Goods goods) throws Exception;
	
	
	/**
	 * 添加商品信息
	 * @param goods 新添加的商品信息
	 * @param isSpecial 是否是特色菜。0：否 1：是
	 * @throws Exception
	 */
	public int insertGoods(Goods goods) throws Exception;
	
	
	/**
	 * 修改商品信息
	 * @param goods 修改后的商品信息
	 * @throws Exception
	 */
	public int updateGoodsById(Goods goods) throws Exception;
	
	
	/**
	 * 通过商品ID号删除多（单）个编号
	 * @param ids 多个商品编号
	 * @throws Exception
	 */
	public int deleteGoodsByIds(String[] ids) throws Exception; 
	/**
	 * 通过商品编号获取商品信息
	 * @param goodsId
	 * @return
	 * @throws Exception
	 */
	public Goods getGoodsById(String goodsId) throws Exception; 
}
