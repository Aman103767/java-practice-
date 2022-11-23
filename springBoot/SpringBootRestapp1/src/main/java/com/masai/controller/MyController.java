package com.masai.controller;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Student;

@Controller
public class MyController {
	
	@RequestMapping("/welcome")
	@ResponseBody
	 public String myWelcomeService() {
		 return "Welcome to Spring Boot";
	 }
	@RequestMapping("/hello")

	 public String myhelloService() {
		 return "Hello";
	 }
	@RequestMapping("/getStudent")
	public Student getStudentHandler() {
		Student student = new Student(10,"aman","thatipur",600);
		return student;
	}
	

}
//http://localhost:8080/welcome
