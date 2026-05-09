package com.subrat.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.subrat.model.Student;

@Controller
public class StudentController {
@GetMapping("/")
	public String studentData(Model model) {
		Student s=new Student(101,"subrat naik","cse","bput",95,93,82,85,90);
		int total=s.getSub1()+s.getSub2()+s.getSub3()+s.getSub4()+s.getSub5();
		double avg=total/5.0;
		String grade;
		if(avg>=90) {
			grade="A";
		}
		else if(avg>=75) {
			grade="B";
		}
		else if(avg>=60) {
			grade="C";
		}
		else {
			grade="D";
		}
		model.addAttribute("student", s);
		model.addAttribute("total", total);
		model.addAttribute("avgrage", avg);
		model.addAttribute("grade", grade);
		return "student";
	}
}
