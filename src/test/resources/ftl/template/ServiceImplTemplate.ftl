package com.gmzj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmzj.dao.impl.DaoSupport;
import com.gmzj.entity.${className};
import com.gmzj.entity.${className}Example;
import com.gmzj.entity.Page;
import com.gmzj.service.${className}Service;


@Service
public class ${className}ServiceImpl implements ${className}Service{

	@Autowired
	@SuppressWarnings("rawtypes")
	private DaoSupport dao;
	
	private static String mapperName = "mybatis.files.${className}Mapper";
	
	@SuppressWarnings("unchecked")
	public List<${className}> listPage(Page page) throws Exception{
		return (List<${className}>)dao.findForList(mapperName+".listPage", page);
	}
	
	@SuppressWarnings("unchecked")
	public List<${className}> find${className}s(${className}Example example) throws Exception{
		return dao.findForList(mapperName+".selectByExample", example);
	}

	public ${className} find${className}ByKey(int key) throws Exception {
		// TODO Auto-generated method stub
		return (${className}) dao.findForObject(mapperName+".selectByPrimaryKey", key);
	}

	public Company find${className}(${className}Example example) throws Exception {
		// TODO Auto-generated method stub
		return (${className}) dao.findForObject(mapperName+".selectByExample", example);
	}

	public int insert(${className} ${classNameLower}) throws Exception {
		// TODO Auto-generated method stub
		return dao.insert(mapperName+".insert", ${classNameLower});
	}

	public int update(${className} ${classNameLower}) throws Exception {
		// TODO Auto-generated method stub
		return dao.insert(mapperName+".updateByPrimaryKey", ${classNameLower});
	}

	public int delete(int id) throws Exception {
		// TODO Auto-generated method stub
		return dao.delete(mapperName+".deleteByPrimaryKey", id);
	}
	
}

