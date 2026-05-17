package com.subrat.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.subrat.entity.FoodOrder;
import com.subrat.service.Iserv;

@Controller
public class FoodOrderController {
	@Autowired
	private Iserv service;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	@GetMapping("/report")
	public String reportPage(Map<String,Object>map) {
		List<FoodOrder> selectEmp = service.viewOrders();
		map.put("result", selectEmp);	
		return "report";
	}
	
	@GetMapping("/add")
	public String addOrder(@ModelAttribute("food") FoodOrder e) {
		return "addOrder";
	}
	
	@PostMapping("/submit")
	public String OrderSubmit(@ModelAttribute("food") FoodOrder fo , RedirectAttributes attr) {
		String msg = service.addOrder(fo);
		attr.addFlashAttribute("resultMsg",msg);
		return "redirect:report";
	}
	@GetMapping("/emp_edit")
	public String editEmp(@RequestParam(name="no",required=false)Long no,@ModelAttribute("food")FoodOrder e1) {
		FoodOrder e = service.getOrderById(no);
		BeanUtils.copyProperties(e, e1);
		return "editfood";
	}
	
	@PostMapping("/edit")
	public String editEmpData(@ModelAttribute("food")FoodOrder e,RedirectAttributes attr) {
		String update = service.updateOrder(e);
		attr.addFlashAttribute("updateMsg",update);
		return "redirect:report";
	}
	
	@GetMapping("/emp_delete")
	public String deleteEmp(@RequestParam(name="no",required=false)Long no,Map<String,Object>map) {
		String msg = service.deleteOrder(no);
		map.put("deleteMsg",msg);
		return "forward:report";
	}

}
