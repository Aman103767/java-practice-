package com.masai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.Repository.EmployeeRepo;
import com.masai.Repository.EmployeeRepoImpl;
import com.masai.bean.Employee;
import com.masai.exception.EmployeeException;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public boolean saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		EmployeeRepo er = new EmployeeRepoImpl();
		er.insertEmployeeDetails(emp);
		return true;
	}

	@Override
	public List getAllEmployee() {
		// TODO Auto-generated method stub
		EmployeeRepo er = new EmployeeRepoImpl();
	      return er.getAllEmployeeDetails();
	    
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		EmployeeRepo er = new EmployeeRepoImpl();
		Employee e =  er.findEmployee(empId);
		if(e == null) {
			throw new EmployeeException("employee not found");
		}
		
		return e;
	}

	@Override
	public String deleteEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		EmployeeRepo er = new EmployeeRepoImpl();
		String str = er.deleteEmployeeDetailsById(empId);
		if(str.equals("null")) {
			throw new EmployeeException("employee not found");
		}
		return str ;
		
		
	}

}
