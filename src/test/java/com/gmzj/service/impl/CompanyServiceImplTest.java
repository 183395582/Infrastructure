package com.gmzj.service.impl;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gmzj.entity.Cemetery;
import com.gmzj.entity.Page;
import com.gmzj.service.CemeteryService;
import com.gmzj.util.PageData;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-config.xml"})
public class CompanyServiceImplTest {

	@Autowired
	ApplicationContext ctx;
	
	private CemeteryService companyService;
	
	@Before
	public void setUp() throws Exception {
		companyService = ctx.getBean(CemeteryServiceImpl.class);
	}

	@Test
	public void testListPage() throws Exception {
		Page page = new Page();
		page.setParm(new PageData());
		List<Cemetery> list = companyService.listPage(page);
		System.out.println(list.size());
	}

	@Test
	public void testFindCompanys() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindCompanyByKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindCompany() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsert() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

}
