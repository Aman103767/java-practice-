package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.excepitons.StudentException;
import com.masai.model.Student;
import com.masai.service.StudentService;

@RestController
public class StudentController {
    
	@Autowired
	private StudentService studentService;
	
	
	@PostMapping("/students")
	public ResponseEntity<Student> registerStudentHandler(@RequestBody Student Student) {
		
		Student savedStudent = studentService.saveStudent(Student);
		
		return new ResponseEntity<Student>(savedStudent,HttpStatus.CREATED);
		
	}
	@GetMapping("/students/{roll}")
	public ResponseEntity<Student> getStudentByRollHandler(@PathVariable("roll") Integer roll) throws StudentException{
		Student st = studentService.getStudentByRoll(roll);
		
		return new ResponseEntity<Student>(st,HttpStatus.OK);
	}
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudentDetailsHandler() throws StudentException{
		List<Student> students = studentService.getAllStudentDetails();
		return new ResponseEntity<List<Student>>(students,HttpStatus.OK);
	}
	
}
