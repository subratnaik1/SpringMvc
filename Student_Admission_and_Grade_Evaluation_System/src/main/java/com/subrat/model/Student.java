package com.subrat.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
public class Student {
	private String name;
	private Integer rollno;
	private Integer mark1;
	private Integer mark2;
	private Integer mark3;
}
