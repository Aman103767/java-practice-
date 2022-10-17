package UseCases;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.question1.DepartmentException;

public class GetDepartment {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the employee id ");
	int empid = input.nextInt();
	EmployeeDao ed = new EmployeeDaoImpl();
	try {
		System.out.println(ed.getDepartmentDetailsByEmployeeId(empid));
		
	} catch (DepartmentException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
}
}
