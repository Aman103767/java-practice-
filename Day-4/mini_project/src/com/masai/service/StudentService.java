package com.masai.service;

import java.util.List;
import java.util.Set;

import com.masai.model.Student;

public interface StudentService {
	
	public Student addStudent(Student student);
	
	public String deleteStudent(int studentId);
	
	public Student findStudent(int studentId);
	
	public List<Student> findStudentWithPincode(String pincode);
	
	public List<Student> sortWithName();
	
	public Set<Integer> setOfMarks();
	
	public String addAllStudent(List<Student> list);
}
