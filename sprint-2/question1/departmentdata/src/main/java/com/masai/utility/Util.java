package com.masai.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Util {
 static EntityManagerFactory emf;
 static {
	 emf = Persistence.createEntityManagerFactory("empDB");
 }
 public static EntityManager provideEntityManager() {
	return emf.createEntityManager();
	 
 }
}
