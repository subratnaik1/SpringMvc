package com.subrat.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.subrat.model.Student;

@Controller
@RequestMapping
public class StudentController {
	@GetMapping
	public String viewadmissionForm() {
		return "admission-form";
	}

	@PostMapping("/submit")
	public String viewSuccess(@RequestParam(required = true) String name,
			@RequestParam(required = false) Integer rollNo, @RequestParam(required = false) Integer marks1,
			@RequestParam(required = false) Integer marks2, @RequestParam(required = false) Integer marks3,
			Map<String, Object> st) {
		Student s = new Student();

		s.setName(name);
		s.setRollno(rollNo);
		s.setMark1(marks1);
		s.setMark2(marks2);
		s.setMark3(marks3);
		st.put("msg", s);

		Integer total = marks1 + marks2 + marks3;
		Double persentage = total / 3.0;
		String grade = "";
		if (persentage >= 50.0) {
			grade = "C";
		} else if (persentage >= 70.0) {
			grade = "B";
		} else {
			grade = "A";
		}
		st.put("t", total);
		st.put("p", persentage);
		st.put("g", grade);
		return "admission-success";
	}
}
