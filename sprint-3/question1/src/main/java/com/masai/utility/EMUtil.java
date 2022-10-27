package com.masai.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {
static EntityManagerFactory emf;
static {
	emf =Persistence.createEntityManagerFactory("employeeUnit");
}
public static EntityManager provideEM() {
	return emf.createEntityManager();
}
}
