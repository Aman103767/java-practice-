package com.masai.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Mycontroller {

	@GetMapping("/student/{roll}")	
	public Student sayHello(@PathVariable("roll") Integer roll,@RequestParam("name") String name) {
		Student st  = new Student(roll,name,"thatipur");
		return st;
	}
}
