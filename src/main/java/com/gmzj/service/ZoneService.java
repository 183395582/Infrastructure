package com.gmzj.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gmzj.entity.Zone;
import com.gmzj.entity.ZoneExample;
import com.gmzj.entity.Page;


public interface ZoneService {

	/**
	 * 分页查询
	 * @param page
	 * @return
	 * @throws Exception
	 */
	List<Zone> listPage(Page page) throws Exception;

	/**
	 * 查询信息
	 * @param example
	 * @return
	 * @throws Exception
	 */
	List<Zone> findZones(ZoneExample example) throws Exception;
	
	/**
	 * 通过主键查询信息
	 * @param key
	 * @return
	 * @throws Exception
	 */
	Zone findZoneByKey(int key) throws Exception;
	
	/**
	 * 新增信息
	 * @param zone
	 * @return
	 * @throws Exception
	 */
	@Transactional(rollbackFor=Exception.class)
	int insert(Zone zone) throws Exception;
	
	/**
	 * 更新信息
	 * @param zone
	 * @return
	 * @throws Exception
	 */
	@Transactional(rollbackFor=Exception.class)
	int update(Zone zone) throws Exception;
	
	/**
	 * 删除信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@Transactional(rollbackFor=Exception.class)
	int delete(int id) throws Exception;
	
}

