package com.gmzj.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gmzj.entity.Company;
import com.gmzj.entity.CompanyExample;
import com.gmzj.entity.Page;


/**
 * 公墓service
 * @author Edward
 *
 */
public interface CompanyService {

	/**
	 * 分页查询公司信息
	 * @param page
	 * @return
	 * @throws Exception
	 */
	List<Company> listPage(Page page) throws Exception;

	/**
	 * 查询公司信息
	 * @param example
	 * @return
	 * @throws Exception
	 */
	List<Company> findCompanys(CompanyExample example) throws Exception;
	
	/**
	 * 通过主键查询公司信息
	 * @param key
	 * @return
	 * @throws Exception
	 */
	Company findCompanyByKey(int key) throws Exception;
	
	/**
	 * 新增公司信息
	 * @param company
	 * @return
	 * @throws Exception
	 */
	@Transactional(rollbackFor=Exception.class)
	int insert(Company company) throws Exception;
	
	/**
	 * 更新公司信息
	 * @param company
	 * @return
	 * @throws Exception
	 */
	@Transactional(rollbackFor=Exception.class)
	int update(Company company) throws Exception;
	
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
	List<Company> findCompanys4Index(String type, int toIndex) throws Exception;
}
