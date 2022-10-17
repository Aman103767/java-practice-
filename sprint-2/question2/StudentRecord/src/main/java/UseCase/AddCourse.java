package UseCase;

import java.util.Scanner;

import Dao.TrainingDao;
import Dao.TrainingDaoImpl;
import bean.Course;

public class AddCourse {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the courseName");
	String courseName  = input.next();
	System.out.println("Enter the duration");
	String duration = input.next();
	System.out.println("Enter the fee");
	int fee = input.nextInt();
	
	Course c = new Course();
	c.setCourseName(courseName);
	c.setDuration(duration);
	c.setFee(fee);
	
	TrainingDao td  = new TrainingDaoImpl();
	td.addCourse(c);
	System.out.println("done...");
}
}
