package UseCases;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.question1.DepartmentException;
import com.masai.question1.EmployeeException;

public class RegisterEmployee {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the empid");
	int empid = input.nextInt();
	System.out.println("Enter the deptid");
	int deptid = input.nextInt();
	
	EmployeeDao em = new EmployeeDaoImpl();
	try {
		em.registerEmployeeTODepartment(empid, deptid);
	} catch (EmployeeException e) {
		// TODO Auto-generated catch block
	    System.out.println(e.getMessage());
	} catch (DepartmentException e) {
		// TODO Auto-generated catch block
	 System.out.println(e.getMessage());
	}
}
}
