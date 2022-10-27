package com.masai.Repository;

import java.util.List;

import com.masai.bean.Employee;

public interface EmployeeRepo {

	

	public boolean insertEmployeeDetails(Employee emp);
	public List getAllEmployeeDetails();
	public Employee findEmployee(int empId);
	public String deleteEmployeeDetailsById(int empId);

}
