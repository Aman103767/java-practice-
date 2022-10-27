package com.masai.service;

import java.util.List;

import com.masai.bean.Employee;
import com.masai.exception.EmployeeException;

public interface EmployeeService {
	
	public boolean saveEmployee(Employee emp);
	public List getAllEmployee();
	public Employee getEmployeeById(int empId)throws EmployeeException;
	public String deleteEmployeeById(int empId)throws EmployeeException;

}
