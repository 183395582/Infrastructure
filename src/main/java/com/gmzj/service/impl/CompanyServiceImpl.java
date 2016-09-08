package com.gmzj.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.gmzj.dao.impl.DaoSupport;
import com.gmzj.entity.Company;
import com.gmzj.entity.CompanyExample;
import com.gmzj.entity.Page;
import com.gmzj.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private DaoSupport<Company> dao;
	
	private static String mapperName = "mybatis.files.CompanyMapper";

	public List<Company> listPage(Page page) throws Exception{
		return dao.findForList(mapperName+".listPage", page);
	}
	
	public List<Company> findCompanys(CompanyExample example) throws Exception{
		return dao.findForList(mapperName+".selectByExample", example);
	}

	public Company findCompanyByKey(int key) throws Exception {
		// TODO Auto-generated method stub
		return dao.findForObject(mapperName+".selectByPrimaryKey", key);
	}

	public Company findCompany(CompanyExample example) throws Exception {
		// TODO Auto-generated method stub
		return dao.findForObject(mapperName+".selectByExample", example);
	}

	public int insert(Company company) throws Exception {
		// TODO Auto-generated method stub
		return dao.insert(mapperName+".insert", company);
	}

	public int update(Company company) throws Exception {
		// TODO Auto-generated method stub
		return dao.insert(mapperName+".updateByPrimaryKey", company);
	}

	public int delete(int id) throws Exception {
		// TODO Auto-generated method stub
		return dao.delete(mapperName+".deleteByPrimaryKey", id);
	}
	
	@Cacheable(value={"company", "index"})
	public List<Company> findCompanys4Index(String type, int toIndex) throws Exception{
		CompanyExample example = new CompanyExample();
		example.createCriteria().andTypeEqualTo(type);
		//根据评分排序
		example.setOrderByClause("score desc");
		List<Company> list = this.findCompanys(example);
		if (CollectionUtils.isNotEmpty(list) && list.size() > toIndex) {
			list = new ArrayList<Company>(list.subList(0, toIndex));
		}
		return list;
	}

}
