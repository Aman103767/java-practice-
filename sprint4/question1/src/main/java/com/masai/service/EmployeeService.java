package com.masai.service;

public interface EmployeeService {
	
	public Employee registerEmployee(Employee emp)throws EmployeeException;
	public Employee getEmployeeById(Integer empId)throws EmployeeException;
	public List<Employee> getAllEmployeeDetails()throws EmployeeException;
	public Employee deleteEmployeeById(Integer empId)throws EmployeeException;

}
