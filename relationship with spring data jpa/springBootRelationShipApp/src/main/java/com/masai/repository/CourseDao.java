package com.masai.repository;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Course;

public interface CourseDao extends JpaRepository<Course, Integer>  {

}
