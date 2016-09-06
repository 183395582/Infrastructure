package com.gmzj.web.controller;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gmzj.service.PubService;

import freemarker.template.Template;
import freemarker.template.TemplateException;

@Controller
@Scope("prototype")
@RequestMapping("pub/")
public class PubController{
	
private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private PubService<?> pubService;
	
	/**
	 * 查询省市县
	 * @param req
	 * @return
	 */
	@RequestMapping(value="findcity.htm", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> ajaxfindCity(String key)
    {  
		logger.debug("当前查询的key {}",key);
//		List<RegionMap> list = pubService.findRegionByManageNo(key);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("succflag", 0);
		map.put("msg", null);
		map.put("data", null);
		return map;
    }
	
	/**
	 * 查询省市县名称
	 * @param req
	 * @return
	 */
	@RequestMapping(value="findcityname.htm", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> ajaxfindCityName(String no)
    {  
		logger.debug("当前查询的no {}",no);
//		String name = pubService.findRegionFullName(no);
//		Map<String, Object> map = (Map<String, Object>) JsonResult.jsonOk();
//		map.put("name", name);
		return null;
    }
	
    public static void main(String[] args) throws IOException, TemplateException {
    	//创建一个模版对象 
        Template t = new Template(null, new StringReader("<#list fieldList as var><#if var_index%2 == 1>${fieldList[0]}</#if></#list>"), null); 
        //创建插值的Map 
        Map map = new HashMap();
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        map.put("fieldList", list);
        //执行插值，并输出到指定的输出流中 
        t.process(map, new OutputStreamWriter(System.out)); 
	}
	
	
}
