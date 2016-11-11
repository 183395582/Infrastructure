package com.gmzj.web.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gmzj.util.DateEditor;
import com.gmzj.entity.${className};
import com.gmzj.entity.Page;
import com.gmzj.service.${className}Service;
import com.gmzj.web.exception.BusinessException;

@Controller
@RequestMapping("/${className?uncap_first}")
public class ${className}Controller {
	protected final Logger logger = LoggerFactory.getLogger(this.getClass()); 

	@Autowired
	private ${className}Service service;

	/**
	 * 初始化jsp中select选项
	 * @param model
	 */
	@ModelAttribute
	public void init(Model model) {
		//model.addAttribute("stats", ${className}.ComStat.values());
	}

	@RequestMapping(method = RequestMethod.GET)
	public String list(Model model, Page page, ${className} ${className?uncap_first}) throws Exception {
		page.setParm(${className?uncap_first});
		List<${className}> list = service.listPage(page);
		model.addAttribute("contentModel", list);
		model.addAttribute("page", page);
		model.addAttribute("searchModel", ${className?uncap_first});
		return "${className?uncap_first}/list";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String showCreateForm(Model model) {
		setCommonData(model);
		model.addAttribute("${className?uncap_first}", new ${className}());
		model.addAttribute("op", "${name}信息新增");
		return "${className?uncap_first}/edit";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String create(${className} ${className?uncap_first}, RedirectAttributes redirectAttributes) throws Exception {
		service.insert(${className?uncap_first});
		redirectAttributes.addFlashAttribute("msg", "新增成功");
		return "redirect:/${className?uncap_first}/";
	}

	@RequestMapping(value = "/{id}/update", method = RequestMethod.GET)
	public String showUpdateForm(@PathVariable("id") int id, Model model) throws Exception {
		setCommonData(model);
		model.addAttribute("${className?uncap_first}", service.find${className}ByKey(id));
		model.addAttribute("op", "${name}信息修改");
		return "${className?uncap_first}/edit";
	}

	@RequestMapping(value = "/{id}/update", method = RequestMethod.POST)
	public String update(${className} ${className?uncap_first}, Model model) throws Exception {
		int num = service.update(${className?uncap_first});
		if (num != 1) throw new BusinessException("修改失败");
		model.addAttribute("msg", "修改成功");
		return "${className?uncap_first}/edit";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(int id, Model model) throws Exception {
		int num = service.delete(id);
		if (num != 1) throw new BusinessException("删除失败");
		model.addAttribute("msg", "删除成功");
		return "redirect:/${className?uncap_first}/";
	}

	private void setCommonData(Model model) {
	}
	
	/**
	 * 视图数据类型转换
	 */
	@InitBinder
	protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
	    binder.registerCustomEditor(Date.class, new DateEditor()); //对于需要转换为Date类型的属性，使用DateEditor进行处理  
	}
}
