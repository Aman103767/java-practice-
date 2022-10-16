package UseCases;

import java.util.Scanner;

import com.masai.bean.Address;
import com.masai.bean.Department;
import com.masai.bean.Employee;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class AddEmployee {
public static void main(String[] args) {
	Scanner input  = new Scanner(System.in);
	System.out.println("Enter the Employee Name");
	String name  = input.next();
	System.out.println("Enter the Employee Salary");
	int sal  = input.nextInt();
	System.out.println("Enter the city");
	String city = input.next();
	input.nextLine();
	System.out.println("Enter the state");
	String state = input.nextLine();
	System.out.println("Enter the pincode");
	String pincode = input.next();
	
	Employee d = new Employee();
    d.setEmpName(name);
    d.setSalary(sal);
    d.setAddress(new Address(city,state,pincode));
    
    EmployeeDao ed = new EmployeeDaoImpl();
    ed.addEmployee(d);;
}
}
