package com.cqupt.rms.mapper;

import java.util.List;

import com.cqupt.rms.model.basic.Empworkstate;
import com.cqupt.rms.model.custom.EmpworkstateCustom;

/**
 * 员工工作情况信息管理持久化层
 * @author Cynthia
 *
 */
public interface EmpWorkStateMapper {

	/**
	 * 根据部门名称/员工名称/员工编号查询员工工作情况,时间作为可选筛选条件 
	 * @param startTime 员工工作起始时间
	 * @param endTime 员工工作结束时间
	 * @param keyWords 查询条件
	 * @return
	 * @throws Exception
	 */
	public List<EmpworkstateCustom> queryEmpWorkState(EmpworkstateCustom empworkstateCustom)
			throws Exception;
	
	/**
	 * 根据员工编号添加员工工作情况
	 * @param empId 员工编号
	 * @param empworkstate 员工工作情况详情
	 * @throws Exception
	 */
	public void insertEmpWorkStateById(Empworkstate empworkstate) 
			throws Exception;
	
	
	/**
	 * 根据员工编号查询员工工作情况详情
	 * @param empId 员工编号
	 * @return
	 * @throws Exception
	 */
	public Empworkstate selectEmpworkstateDetail(String empId) throws Exception;
	
	
	/**
	 * 根据员工编号删除员工工作情况信息
	 * @param ids 员工编号
	 * @throws Exception
	 */
	public void deleteEmpworkstateByIds(String[] ids) throws Exception;
}
