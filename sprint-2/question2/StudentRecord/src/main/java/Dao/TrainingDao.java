package Dao;

import java.util.List;

import Exception.CourseException;

import Exception.TeacherException;
import bean.Course;
import bean.Student;
import bean.Teacher;

public interface TrainingDao {

	 public void addCourse(Course course);

	 public void registerStudent(Student student, int courseId)throws CourseException;
	 
	 public void registerTeacher(Teacher teacher);
	 
	 public void assignTeacherWithCourse(int teacherId, int courseId) throws TeacherException, CourseException;
	 
	public  List<Student> getAlltheStudentsByCourseName(String courseName)throws CourseException;


}
