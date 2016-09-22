package com.gmzj.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmzj.dao.impl.DaoSupport;
import com.gmzj.entity.Article;
import com.gmzj.entity.ArticleExample;
import com.gmzj.entity.Page;
import com.gmzj.service.ArticleService;


@Service
public class ArticleServiceImpl implements ArticleService{

	@Autowired
	private DaoSupport<Article> dao;
	
	private static String mapperName = "mybatis.files.ArticleMapper";
	
	public List<Article> listPage(Page page) throws Exception{
		return dao.findForList(mapperName+".listPage", page);
	}
	
	public List<Article> findArticles(ArticleExample example) throws Exception{
		return dao.findForList(mapperName+".selectByExample", example);
	}

	public Article findArticleByKey(int key) throws Exception {
		// TODO Auto-generated method stub
		return dao.findForObject(mapperName+".selectByPrimaryKey", key);
	}

	public Article findArticle(ArticleExample example) throws Exception {
		// TODO Auto-generated method stub
		return dao.findForObject(mapperName+".selectByExample", example);
	}

	public int insert(Article article) throws Exception {
		// TODO Auto-generated method stub
		return dao.insert(mapperName+".insert", article);
	}

	public int update(Article article) throws Exception {
		// TODO Auto-generated method stub
		return dao.update(mapperName+".updateByPrimaryKey", article);
	}

	public int delete(int id) throws Exception {
		// TODO Auto-generated method stub
		return dao.delete(mapperName+".deleteByPrimaryKey", id);
	}
	
	public List<Article> findArticle4Index(int toIndex) throws Exception {
		// TODO Auto-generated method stub
		ArticleExample example = new ArticleExample();
		List<Article> list = this.findArticles(example);
		if (CollectionUtils.isNotEmpty(list) && list.size() > toIndex) {
			list = new ArrayList<Article>(list.subList(0, toIndex));
		}
		return list;
	}
	
}

