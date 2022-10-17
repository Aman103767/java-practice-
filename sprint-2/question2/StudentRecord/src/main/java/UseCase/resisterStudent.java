package UseCase;

import java.util.Scanner;

import Dao.TrainingDao;
import Dao.TrainingDaoImpl;
import Exception.CourseException;
import bean.Student;

public class resisterStudent {
 public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the student name");
	String name = input.next();
	System.out.println("Enter the student email");
	String email = input.next();
	System.out.println("Enter the student mobile");
	String mobile = input.next();
	System.out.println("Enter the courseId");
	int courseId = input.nextInt();
	Student s = new Student();
	s.setName(name);
	s.setEmail(email);
	s.setMobile(mobile); 
	
	TrainingDao td = new TrainingDaoImpl();
	try {
		td.registerStudent(s, courseId);
	} catch (CourseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
