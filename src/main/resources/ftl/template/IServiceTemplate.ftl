package com.gmzj.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gmzj.entity.${className};
import com.gmzj.entity.${className}Example;
import com.gmzj.entity.Page;


public interface ${className}Service {

	/**
	 * 分页查询
	 * @param page
	 * @return
	 * @throws Exception
	 */
	List<${className}> listPage(Page page) throws Exception;

	/**
	 * 查询信息
	 * @param example
	 * @return
	 * @throws Exception
	 */
	List<${className}> find${className}s(${className}Example example) throws Exception;
	
	/**
	 * 通过主键查询信息
	 * @param key
	 * @return
	 * @throws Exception
	 */
	${className} find${className}ByKey(int key) throws Exception;
	
	/**
	 * 新增信息
	 * @param ${classNameLower}
	 * @return
	 * @throws Exception
	 */
	@Transactional(rollbackFor=Exception.class)
	int insert(${className} ${classNameLower}) throws Exception;
	
	/**
	 * 更新信息
	 * @param ${classNameLower}
	 * @return
	 * @throws Exception
	 */
	@Transactional(rollbackFor=Exception.class)
	int update(${className} ${classNameLower}) throws Exception;
	
	/**
	 * 删除信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@Transactional(rollbackFor=Exception.class)
	int delete(int id) throws Exception;
	
}

