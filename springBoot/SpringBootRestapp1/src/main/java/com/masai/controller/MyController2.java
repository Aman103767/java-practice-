package com.masai.controller;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Student;

@Controller
public class MyController2 {
	
	@RequestMapping("/wel")
	@ResponseBody
	 public String myWelcomeService() {
		 return "Welcome to Spring Boot";
	 }
	@RequestMapping("/he")
	@ResponseBody
	 public String myhelloService() {
		 return "Hello";
	 }
	@RequestMapping("/getSt")
	public Student getStudentHandler() {
		Student student = new Student(10,"avinash","thatipur",600);
		return student;
	}
	

}