package com.masai.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.masai.bean.Department;
import com.masai.bean.Employee;
import com.masai.exception.DepartmentException;
import com.masai.exception.EmployeeException;
import com.masai.utility.Util;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public void addDepartment(Department dept) {
		// TODO Auto-generated method stub
	  EntityManager em = Util.provideEntityManager();
	  
	  em.getTransaction().begin();;
	  em.persist(dept);
	  em.getTransaction().commit();
	  
	  em.close();
		
	}

	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		  EntityManager em = Util.provideEntityManager();
		  
		  em.getTransaction().begin();;
		  em.persist(emp);
		  em.getTransaction().commit();
		  
		  em.close();
		
	}

	@Override
	public void registerEmployeeTODepartment(int empId, int deptId) throws EmployeeException, DepartmentException {
		// TODO Auto-generated method stub
		EntityManager em= Util.provideEntityManager();
		Employee emp  = em.find(Employee.class, empId);
		Department dept = em.find(Department.class,deptId);
		
		if(emp == null) {
			throw new EmployeeException("employee not found");
		}
		if(dept == null) {
			throw new DepartmentException("department not found");
		}
		
		em.getTransaction().begin();
		emp.setDept(dept);
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public List<Employee> getAllEmployeeWithDeptName(String deptName) throws EmployeeException {
		// TODO Auto-generated method stub'
		List<Employee> emp = null;
		EntityManager em= Util.provideEntityManager();
		String jpql = "from Department where deptName = :dn";
		Query q = em.createQuery(jpql);
		q.setParameter("dn", deptName);
		List<Department> list = q.getResultList();
		//System.out.println(list);
		for(Department d : list) {
			emp =  d.getEmployees();
		}
		
	    if(list.size() ==  0) {
	    	throw new EmployeeException("employee not found");
	    }
		
		return emp;

	}

	@Override
	public Department getDepartmentDetailsByEmployeeId(int empId) throws DepartmentException {
		// TODO Auto-generated method stub
		Department d = null;
		EntityManager em= Util.provideEntityManager();
	      Employee emp =  em.find(Employee.class, empId);
	         
	  if(emp == null ) {
		  throw new DepartmentException("employee not find in this department");
	  }
	  d = emp.getDept();
		return d;
	}
	
	


}
