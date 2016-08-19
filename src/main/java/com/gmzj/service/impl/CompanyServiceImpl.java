package com.gmzj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmzj.dao.impl.DaoSupport;
import com.gmzj.entity.Company;
import com.gmzj.entity.CompanyExample;
import com.gmzj.entity.Page;
import com.gmzj.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	@SuppressWarnings("rawtypes")
	private DaoSupport dao;
	
	private static String mapperName = "mybatis.files.CompanyMapper";

	@SuppressWarnings("unchecked")
	public List<Company> listPage(Page page) throws Exception{
		return (List<Company>)dao.findForList(mapperName+".listPage", page);
	}
	
	@SuppressWarnings("unchecked")
	public List<Company> findCompanys(CompanyExample example) throws Exception{
		return dao.findForList(mapperName+".selectByExample", example);
	}

	public Company findCompanyByKey(int key) throws Exception {
		// TODO Auto-generated method stub
		return (Company) dao.findForObject(mapperName+".selectByPrimaryKey", key);
	}

	public Company findCompany(CompanyExample example) throws Exception {
		// TODO Auto-generated method stub
		return (Company) dao.findForObject(mapperName+".selectByExample", example);
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

}
