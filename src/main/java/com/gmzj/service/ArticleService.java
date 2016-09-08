package com.gmzj.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gmzj.entity.Article;
import com.gmzj.entity.ArticleExample;
import com.gmzj.entity.Page;


public interface ArticleService {

	/**
	 * 分页查询
	 * @param page
	 * @return
	 * @throws Exception
	 */
	List<Article> listPage(Page page) throws Exception;

	/**
	 * 查询信息
	 * @param example
	 * @return
	 * @throws Exception
	 */
	List<Article> findArticles(ArticleExample example) throws Exception;
	
	/**
	 * 通过主键查询信息
	 * @param key
	 * @return
	 * @throws Exception
	 */
	Article findArticleByKey(int key) throws Exception;
	
	/**
	 * 新增信息
	 * @param article
	 * @return
	 * @throws Exception
	 */
	@Transactional(rollbackFor=Exception.class)
	int insert(Article article) throws Exception;
	
	/**
	 * 更新信息
	 * @param article
	 * @return
	 * @throws Exception
	 */
	@Transactional(rollbackFor=Exception.class)
	int update(Article article) throws Exception;
	
	/**
	 * 删除信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@Transactional(rollbackFor=Exception.class)
	int delete(int id) throws Exception;
	
	/**
	 * 查询首页文章百科信息
	 * @param toIndex
	 * @return
	 * @throws Exception
	 */
	List<Article> findArticle4Index(int toIndex) throws Exception;
}

