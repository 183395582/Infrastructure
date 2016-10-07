package com.gmzj.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gmzj.entity.CemType;
import com.gmzj.entity.CemTypeExample;
import com.gmzj.entity.Page;


public interface CemTypeService {

	/**
	 * 分页查询
	 * @param page
	 * @return
	 * @throws Exception
	 */
	List<CemType> listPage(Page page) throws Exception;

	/**
	 * 查询信息
	 * @param example
	 * @return
	 * @throws Exception
	 */
	List<CemType> findCemTypes(CemTypeExample example) throws Exception;
	
	/**
	 * 通过主键查询信息
	 * @param key
	 * @return
	 * @throws Exception
	 */
	CemType findCemTypeByKey(int key) throws Exception;
	
	/**
	 * 新增信息
	 * @param cemtype
	 * @return
	 * @throws Exception
	 */
	@Transactional(rollbackFor=Exception.class)
	int insert(CemType cemtype) throws Exception;
	
	/**
	 * 更新信息
	 * @param cemtype
	 * @return
	 * @throws Exception
	 */
	@Transactional(rollbackFor=Exception.class)
	int update(CemType cemtype) throws Exception;
	
	/**
	 * 删除信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@Transactional(rollbackFor=Exception.class)
	int delete(int id) throws Exception;
	
}

