package com.subrat.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	private int id;
	private String name;
	private String course;
	private String college;
	private int sub1;
	private int sub2;
	private int sub3;
	private int sub4;
	private int sub5;
}
