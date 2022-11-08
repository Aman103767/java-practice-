package com.masai.repository;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.masai.model.Course;

public interface CourseDao extends JpaRepository<Course, Integer>  {

 	
   public Course findByCourseName(String cname);
 
   @Query("from Course where courseName = ?1")
   public Course getCourseByCname(String cname);
 
 
}
