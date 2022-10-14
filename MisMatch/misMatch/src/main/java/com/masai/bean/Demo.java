package com.masai.bean;

import javax.persistence.EntityManager;


import com.masai.Utility.Utility;



public class Demo {
public static void main(String[] args) {
	EntityManager em = Utility.provideConnection();
	Department d =new Department();
	d.setDname("marketing");
	d.setLocation("delhi");
	 
	Employee em1 = new Employee();
	em1.setName("aman");
	em1.setSalary(2000);
	em1.setDept(d);
	
	
	Employee em2 = new Employee();
	em2.setName("avinash");
	em2.setSalary(3000);
	em2.setDept(d);
	
    d.getEmp().add(em1);
    d.getEmp().add(em2);
	
	
	em.getTransaction().begin();
	
	em.persist(em1);
	em.persist(em2);
	em.getTransaction().commit();
	em.close();
System.out.println("done...");
}
}