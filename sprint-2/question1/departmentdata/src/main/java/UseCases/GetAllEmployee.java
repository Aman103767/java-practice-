package UseCases;

import java.util.List;
import java.util.Scanner;

import com.masai.bean.Employee;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exception.EmployeeException;

public class GetAllEmployee {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the department name");
    String name = input.next();
    EmployeeDao ed = new EmployeeDaoImpl();
    try {
		List<Employee> list = ed.getAllEmployeeWithDeptName(name);
		list.forEach(s->System.out.println(s));
	} catch (EmployeeException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
}
}
