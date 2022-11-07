package com.masai.service;

import com.masai.excepitons.StudentException;
import com.masai.model.Student;

public interface StudentService {

	public Student saveStudent(Student student);
	
	public Student getStudentByRoll(Integer roll) throws StudentException;
}
