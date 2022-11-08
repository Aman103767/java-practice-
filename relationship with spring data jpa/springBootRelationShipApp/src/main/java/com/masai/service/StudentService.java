package com.masai.service;

import com.masai.exception.StudentException;
import com.masai.model.Student;

public interface StudentService {

	
public Student registerStudentInCourse(String cname, Student student) throws StudentException;
		
	
}
