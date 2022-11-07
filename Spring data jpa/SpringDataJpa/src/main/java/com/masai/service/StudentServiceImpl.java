package com.masai.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Student;
import com.masai.repository.StudentDao;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
    private StudentDao dao;
	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		Student savedStudent = dao.save(student);
		return savedStudent;
	}

}
