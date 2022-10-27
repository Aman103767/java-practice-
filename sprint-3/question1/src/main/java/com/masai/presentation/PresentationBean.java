package com.masai.presentation;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.masai.Repository.EmployeeRepo;
import com.masai.Repository.EmployeeRepoImpl;
import com.masai.bean.Employee;
import com.masai.service.EmployeeService;
@Controller(value = "p1")
public class PresentationBean {
    @Autowired
	private EmployeeService empService;
	public void insertEmployee(){
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter the employee Name");
	    String name = input.next();
	    System.out.println("Enter the employee Address");
	    String address = input.next();
	    System.out.println("Enter the salary");
	    int salary = input.nextInt();
	    
	    Employee e = new Employee();
	    e.setEmpName(name);
	    e.setEmpAddress(address);
	    e.setSalary(20000);
	    
	    empService.saveEmployee(e);
	}
}
