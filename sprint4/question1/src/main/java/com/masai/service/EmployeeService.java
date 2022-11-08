package com.masai.service;

import java.util.List;

import com.masai.Exception.EmployeeException;
import com.masai.model.Employee;

public interface EmployeeService {
	
	public Employee registerEmployee(Employee emp)throws EmployeeException;
	
	public Employee getEmployeeById(Integer empId)throws EmployeeException;
	
	public List<Employee> getAllEmployeeDetails()throws EmployeeException;
	
	public Employee deleteEmployeeById(Integer empId)throws EmployeeException;
	
	public List<Employee> getEmployeeDetailsByAddress(String address)throws EmployeeException;
	
	public Employee updateEmployee(Employee emp)throws EmployeeException;
	
	public String[] getNameAndAddressOfEmplyeeById(Integer empId)throws EmployeeException;
	
	public List<EmployeeDTO> getNameAddressSalaryOfAllEmployee()throws EmployeeException;

}
