package com.gmzj.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gmzj.entity.RegionMap;

public interface PubService<T> {

	/**
	 * 根据地区编码查询地区名称
	 * @param no
	 * @return
	 * @throws Exception 
	 */
	@Transactional(readOnly = true) 
	public String findRegionName(String no) throws Exception;
	
	/**
	 * 根据3级城市编码生成全称
	 * @param no
	 * @return
	 * @throws Exception 
	 */
	@Transactional(readOnly = true) 
	public String findRegionFullName(String no) throws Exception;
	
	/**
	 * 
	 * @param key
	 * @return
	 * @throws Exception 
	 */
	@Transactional(readOnly = true) 
	public List<RegionMap> findRegionByManageNo(String key) throws Exception;
	
}
