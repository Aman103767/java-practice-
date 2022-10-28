package com.masai.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.masai.bean.Employee;
import com.masai.utility.EMUtil;
@Repository
public class EmployeeRepoImpl implements EmployeeRepo {

	@Override
	public boolean insertEmployeeDetails(Employee emp) {
		// TODO Auto-generated method stub
		EntityManager em = EMUtil.provideEM();
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		
		em.close();
		return true;
	}

	@Override
	public List getAllEmployeeDetails() {
		// TODO Auto-generated method stub
		EntityManager em = EMUtil.provideEM();
		String jpql = "from Employee";
		Query q = em.createQuery(jpql);
		List<Employee> e = q.getResultList();
		
		
		return e;
	}

	@Override
	public Employee findEmployee(int empId) {
		// TODO Auto-generated method 
        EntityManager em = EMUtil.provideEM();
        Employee e = em.find(Employee.class,empId);
		return e;
	}

	@Override
	public String deleteEmployeeDetailsById(int empId) {
		// TODO Auto-generated method stub
		String str = "Delete successfully";
		EntityManager em = EMUtil.provideEM();
	    Employee e = em.find(Employee.class, empId);
	    em.getTransaction().begin();
	    em.remove(e);
	    em.getTransaction().commit();
	    if(e == null) {
	    	str = "null";
	    }
	    return str;
	
	}

}
