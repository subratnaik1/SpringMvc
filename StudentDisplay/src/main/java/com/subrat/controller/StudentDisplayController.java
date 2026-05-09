package com.subrat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentDisplayController {
	@GetMapping("/")
	public String viewStudent() {
		return "hom";
	}
}
