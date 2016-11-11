package com.gmzj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmzj.dao.impl.DaoSupport;
import com.gmzj.entity.CemArticle;
import com.gmzj.entity.CemArticleExample;
import com.gmzj.entity.Page;
import com.gmzj.service.CemArticleService;


@Service
public class CemArticleServiceImpl implements CemArticleService{

	@Autowired
	private DaoSupport<CemArticle> dao;
	
	private static String mapperName = "mybatis.files.CemArticleMapper";
	
	public List<CemArticle> listPage(Page page) throws Exception{
		return dao.findForList(mapperName+".listPage", page);
	}
	
	public List<CemArticle> findCemArticles(CemArticleExample example) throws Exception{
		return dao.findForList(mapperName+".selectByExample", example);
	}

	public CemArticle findCemArticleByKey(int key) throws Exception {
		// TODO Auto-generated method stub
		return dao.findForObject(mapperName+".selectByPrimaryKey", key);
	}

	public CemArticle findCemArticle(CemArticleExample example) throws Exception {
		// TODO Auto-generated method stub
		return dao.findForObject(mapperName+".selectByExample", example);
	}

	public int insert(CemArticle cemarticle) throws Exception {
		// TODO Auto-generated method stub
		return dao.insert(mapperName+".insert", cemarticle);
	}

	public int update(CemArticle cemarticle) throws Exception {
		// TODO Auto-generated method stub
		return dao.update(mapperName+".updateByPrimaryKey", cemarticle);
	}

	public int delete(int id) throws Exception {
		// TODO Auto-generated method stub
		return dao.delete(mapperName+".deleteByPrimaryKey", id);
	}
	
}

