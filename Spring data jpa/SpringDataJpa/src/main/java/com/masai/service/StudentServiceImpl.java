package com.masai.service;


import java.util.List;
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
	@Override
	public List<Student> getAllStudentDetails() throws StudentException {
		// TODO Auto-generated method stub
         List<Student> students =dao.findAll();
         if(students.size() > 0) {
        	 return students;
         }else
        	 throw new StudentException("No student found");

	}
	@Override
	public Student deleteStudentByRoll(Integer roll) throws StudentException {
		// TODO Auto-generated method stub
	Student existingStudent =	dao.findById(roll).orElseThrow(()-> new StudentException("Student not found"));
		dao.delete(existingStudent);
	
	 return existingStudent;
	}

}
