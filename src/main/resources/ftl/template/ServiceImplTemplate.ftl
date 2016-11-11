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
	private DaoSupport<${className}> dao;
	
	private static String mapperName = "mybatis.files.${className}Mapper";
	
	public List<${className}> listPage(Page page) throws Exception{
		return dao.findForList(mapperName+".listPage", page);
	}
	
	public List<${className}> find${className}s(${className}Example example) throws Exception{
		return dao.findForList(mapperName+".selectByExample", example);
	}

	public ${className} find${className}ByKey(int key) throws Exception {
		// TODO Auto-generated method stub
		return dao.findForObject(mapperName+".selectByPrimaryKey", key);
	}

	public ${className} find${className}(${className}Example example) throws Exception {
		// TODO Auto-generated method stub
		return dao.findForObject(mapperName+".selectByExample", example);
	}

	public int insert(${className} ${className?uncap_first}) throws Exception {
		// TODO Auto-generated method stub
		return dao.insert(mapperName+".insert", ${classNameLower});
	}

	public int update(${className} ${className?uncap_first}) throws Exception {
		// TODO Auto-generated method stub
		return dao.update(mapperName+".updateByPrimaryKey", ${classNameLower});
	}

	public int delete(int id) throws Exception {
		// TODO Auto-generated method stub
		return dao.delete(mapperName+".deleteByPrimaryKey", id);
	}
	
}

