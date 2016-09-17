package com.gmzj.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gmzj.entity.Cemetery;
import com.gmzj.entity.CemeteryExample;
import com.gmzj.entity.Page;


/**
 * 公墓service
 * @author Edward
 *
 */
public interface CemeteryService {

	/**
	 * 分页查询公司信息
	 * @param page
	 * @return
	 * @throws Exception
	 */
	List<Cemetery> listPage(Page page) throws Exception;

	/**
	 * 查询公司信息
	 * @param example
	 * @return
	 * @throws Exception
	 */
	List<Cemetery> findCompanys(CemeteryExample example) throws Exception;
	
	/**
	 * 通过主键查询公司信息
	 * @param key
	 * @return
	 * @throws Exception
	 */
	Cemetery findCompanyByKey(int key) throws Exception;
	
	/**
	 * 新增公司信息
	 * @param company
	 * @return
	 * @throws Exception
	 */
	@Transactional(rollbackFor=Exception.class)
	int insert(Cemetery company) throws Exception;
	
	/**
	 * 更新公司信息
	 * @param company
	 * @return
	 * @throws Exception
	 */
	@Transactional(rollbackFor=Exception.class)
	int update(Cemetery company) throws Exception;
	
	/**
	 * 删除公司信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@Transactional(rollbackFor=Exception.class)
	int delete(int id) throws Exception;

	/**
	 * 
	 * @param type
	 * @param toIndex 
	 * @return
	 * @throws Exception
	 */
	List<Cemetery> findCompanys4Index(String type, int toIndex) throws Exception;
}
