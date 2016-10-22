package com.gmzj.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gmzj.entity.RegionMap;
import com.gmzj.entity.RegionMapExample;
import com.gmzj.entity.Page;


public interface RegionMapService {

	/**
	 * 分页查询
	 * @param page
	 * @return
	 * @throws Exception
	 */
	List<RegionMap> listPage(Page page) throws Exception;

	/**
	 * 查询信息
	 * @param example
	 * @return
	 * @throws Exception
	 */
	List<RegionMap> findRegionMaps(RegionMapExample example) throws Exception;
	
	/**
	 * 通过主键查询信息
	 * @param key
	 * @return
	 * @throws Exception
	 */
	RegionMap findRegionMapByKey(String key) throws Exception;
	
	/**
	 * 新增信息
	 * @param regionmap
	 * @return
	 * @throws Exception
	 */
	@Transactional(rollbackFor=Exception.class)
	int insert(RegionMap regionmap) throws Exception;
	
	/**
	 * 更新信息
	 * @param regionmap
	 * @return
	 * @throws Exception
	 */
	@Transactional(rollbackFor=Exception.class)
	int update(RegionMap regionmap) throws Exception;
	
	/**
	 * 删除信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@Transactional(rollbackFor=Exception.class)
	int delete(int id) throws Exception;
	
	/**
	 * 通过地区编码获取省市区名称
	 * @param no
	 * @return
	 * @throws NumberFormatException
	 * @throws Exception
	 */
	String findRegionFullName(String no) throws Exception;
}

