package com.gmzj.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gmzj.entity.CemArticle;
import com.gmzj.entity.CemArticleExample;
import com.gmzj.entity.Page;


public interface CemArticleService {

	/**
	 * 分页查询
	 * @param page
	 * @return
	 * @throws Exception
	 */
	List<CemArticle> listPage(Page page) throws Exception;

	/**
	 * 查询信息
	 * @param example
	 * @return
	 * @throws Exception
	 */
	List<CemArticle> findCemArticles(CemArticleExample example) throws Exception;
	
	/**
	 * 通过主键查询信息
	 * @param key
	 * @return
	 * @throws Exception
	 */
	CemArticle findCemArticleByKey(int key) throws Exception;
	
	/**
	 * 新增信息
	 * @param cemarticle
	 * @return
	 * @throws Exception
	 */
	@Transactional(rollbackFor=Exception.class)
	int insert(CemArticle cemarticle) throws Exception;
	
	/**
	 * 更新信息
	 * @param cemarticle
	 * @return
	 * @throws Exception
	 */
	@Transactional(rollbackFor=Exception.class)
	int update(CemArticle cemarticle) throws Exception;
	
	/**
	 * 删除信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@Transactional(rollbackFor=Exception.class)
	int delete(int id) throws Exception;
	
}

