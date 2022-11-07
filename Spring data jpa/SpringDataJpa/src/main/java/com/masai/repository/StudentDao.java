package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.model.Student;
import com.masai.model.StudentDTO;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {
  
	public List<Student> findByName(String name);
	
	@Query("select new com.masai.model.StudentDTO(s.name,s.marks) from Student s")
	public List<StudentDTO> getStudentNameAndMarks();


}
