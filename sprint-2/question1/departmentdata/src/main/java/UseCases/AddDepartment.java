package UseCases;

import java.util.Scanner;

import com.masai.bean.Department;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class AddDepartment {
 public static void main(String[] args) {
	Scanner input  = new Scanner(System.in);
	System.out.println("Enter the department Name");
	String name  = input.next();
	System.out.println("Enter the department Location");
	String loc  = input.next();
	
	Department d = new Department();
    d.setDeptName(name);
    d.setLocaiton(loc);
    
    EmployeeDao ed = new EmployeeDaoImpl();
    ed.addDepartment(d);
    
	
}
}
