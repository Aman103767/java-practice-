package com.masai.bean;

import javax.persistence.EntityManager;


import com.masai.Utility.Utility;



public class Demo {
public static void main(String[] args) {
	EntityManager em = Utility.provideConnection();
	 
	Employee em1 = new Employee();
	em1.setName("aman");
	em1.setSalary(2000);
	
	Employee em2 = new Employee();
	em2.setName("avinash");
	em2.setSalary(3000);
	
	Department dm= new Department();
	dm.setDname("Marketing");
	dm.setLocation("Banglore");
	dm.getEmp().add(em1);
	dm.getEmp().add(em2);
	
	em.getTransaction().begin();
	em.persist(em1);
	em.persist(em2);
	em.persist(dm);
	em.getTransaction().commit();
	em.close();
System.out.println("done...");
}
}