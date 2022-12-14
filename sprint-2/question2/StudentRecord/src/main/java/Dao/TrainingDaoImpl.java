package Dao;

import java.util.List;

import javax.persistence.EntityManager;

import Exception.CourseException;
import Exception.TeacherException;
import bean.Course;
import bean.Student;
import bean.Teacher;

public class TrainingDaoImpl implements TrainingDao{

	@Override
	public void addCourse(Course course) {
		// TODO Auto-generated method stub
		EntityManager em =  Utility.Utility.provideConnection();
		em.getTransaction().begin();
	    em.persist(course);
	    em.getTransaction().commit();
	    
	    em.close();
		
		
	}

	@Override
	public void registerStudent(Student student, int courseId) throws CourseException {
		// TODO Auto-generated method stub
	 EntityManager em = Utility.Utility.provideConnection();
	 Course c = em.find(Course.class, courseId);	
	
	 if(c == null) {
		 throw new CourseException("Course not found");
	 }else {
		 c.getStudents().add(student);
		 student.getCourses().add(c);
		
		 
	     em.getTransaction().begin();
	     em.persist(student);
		 
		 em.getTransaction().commit();
		 em.close();
			
	 }
	// System.out.println(c);
	
	}

	@Override
	public void registerTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assignTeacherWithCourse(int teacherId, int courseId) throws TeacherException, CourseException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> getAlltheStudentsByCourseName(String courseName) throws CourseException {
		// TODO Auto-generated method stub
		return null;
	}

}
