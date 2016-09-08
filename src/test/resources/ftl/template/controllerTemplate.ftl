package com.gmzj.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
@RequestMapping("/${classNameLower}")
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
	public String list(Model model, Page page, ${className} ${classNameLower}) throws Exception {
		page.setParm(${classNameLower});
		List<${className}> list = service.listPage(page);
		model.addAttribute("contentModel", list);
		model.addAttribute("page", page);
		model.addAttribute("searchModel", ${classNameLower});
		return "${classNameLower}/list";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String showCreateForm(Model model) {
		setCommonData(model);
		model.addAttribute("${classNameLower}", new ${className}());
		model.addAttribute("op", "公司信息新增");
		return "${classNameLower}/edit";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String create(${className} ${classNameLower}, RedirectAttributes redirectAttributes) throws Exception {
		service.insert(${classNameLower});
		redirectAttributes.addFlashAttribute("msg", "新增成功");
		return "redirect:/${classNameLower}/";
	}

	@RequestMapping(value = "/{id}/update", method = RequestMethod.GET)
	public String showUpdateForm(@PathVariable("id") int id, Model model) throws Exception {
		setCommonData(model);
		model.addAttribute("${classNameLower}", service.find${className}ByKey(id));
		model.addAttribute("op", "公司信息修改");
		return "${classNameLower}/edit";
	}

	@RequestMapping(value = "/{id}/update", method = RequestMethod.POST)
	public String update(${className} ${classNameLower}, Model model) throws Exception {
		int num = service.update(${classNameLower});
		if (num != 1) throw new BusinessException("修改失败");
		model.addAttribute("msg", "修改成功");
		return "${classNameLower}/edit";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(int id, Model model) throws Exception {
//		int num = service.delete(id);
		int num = 0;
		if (num != 1) throw new BusinessException("删除失败");
		model.addAttribute("msg", "删除成功");
		return "redirect:/${classNameLower}/";
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
