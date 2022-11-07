package com.masai.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.excepitons.StudentException;
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
	@Override
	public Student getStudentByRoll(Integer roll) throws StudentException {
		// TODO Auto-generated method stub
		Optional<Student> opt = dao.findById(roll);
//		if(opt.isPresent()) {
//			return opt.get();
//		}else {
//			throw new StudentException("Student does not exist with roll :"+ roll);
//		}
		return opt.orElseThrow(()-> new StudentException("Student does not exist with Roll :"+roll));	
	}

}
