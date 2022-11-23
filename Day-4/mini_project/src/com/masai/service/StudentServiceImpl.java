package com.masai.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.masai.model.SortByNameComp;
import com.masai.model.Student;

public class StudentServiceImpl implements StudentService {
	
	List<Student> list = new ArrayList<>();
	
	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		list.add(student);
		return list.get(list.size()-1);
	}

	

	@Override
	public String deleteStudent(int studentId) {
		// TODO Auto-generated method stub
		String mess = "Student not found with id "+studentId;
		for(int i =0;i<list.size();i++) {
			if(studentId == list.get(i).getId()) {
                 list.remove(i);
				mess = "Student deleted successfully";
				break;
			}
		}
		return mess;
	}

	@Override
	public Student findStudent(int studentId) {
		// TODO Auto-generated method stub
	//System.out.println(list);
		for(int i =0;i<list.size();i++) {
			if(studentId == list.get(i).getId()) {
				return list.get(i);
			}
		}
		
		
		return null;
	}

	@Override
	public List<Student> findStudentWithPincode(String pincode) {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<>();
		for(int i =0;i<list.size();i++) {
			if(pincode.equals(list.get(i).getAddress().getPinCode())) {
			 students.add(list.get(i));
			}
		}
		return students;
	}

	@Override
	public List<Student> sortWithName() {
		// TODO Auto-generated method stub
		//List<Student> students = new ArrayList<>();
		Collections.sort(list,new SortByNameComp());
		return list;
	}

	@Override
	public Set<Integer> setOfMarks() {
		// TODO Auto-generated method stub
		Set<Integer> marks = new HashSet<>();
		for(Student s : list) {
			marks.add(s.getMarks())	;
			}
		return marks;
	}

	@Override
	public String addAllStudent(List<Student> students) {
		// TODO Auto-generated method stub
		for(Student s: students) {
			list.add(s);
		}
		return "All Student Added successfully";
	}
	

	
}
