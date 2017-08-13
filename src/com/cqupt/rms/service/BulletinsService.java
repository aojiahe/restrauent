package com.cqupt.rms.service;

import java.util.List;

import com.cqupt.rms.model.basic.Bulletins;
import com.cqupt.rms.model.custom.BulletinsCustom;

/**
 * 站点信息管理业务层
 * @author Cynthia
 *
 */
public interface BulletinsService {

	/**
	 * 获取所有的站点信息
	 * @return
	 * @throws Exception
	 */
	public List<BulletinsCustom> queryBulletins()throws Exception; 
	
	
	/**
	 * 根据站点标题或者发布者姓名查询站点信息
	 * @param keyWords 关键字：站点标题或者发布者姓名
	 * @return
	 * @throws Exception
	 */
	public List<BulletinsCustom> searchBulletinsByTitleOrAuthor(String keyWords)throws Exception; 
	
	
	/**
	 * 添加站点信息
	 * @param bulletin 新的站点信息
	 * @throws Exception
	 */
	public void insertBulletin(Bulletins bulletin)throws Exception; 
	
	
	/**
	 * 根据站点编号删除站点信息
	 * @param ids 站点编号
	 * @throws Exception
	 */
	public void deleteBulletinsByIds(String[] ids)throws Exception;
	
	
	/**
	 * 根据站点编号修改站点信息
	 * @param id 站点编号
	 * @throws Exception
	 */
	public void updateBulletinById(String id)throws Exception;
	
	
	/**
	 * 通过站点编号查看站点详情
	 * @param id 站点编号
	 * @return
	 * @throws Exception
	 */
	public BulletinsCustom selectBulletinById(String id)throws Exception;
}
