package Utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Utility {
	static EntityManagerFactory emf;
	static {
		try {
			emf = Persistence.createEntityManagerFactory("studentUnit");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static EntityManager provideConnection() {
		return emf.createEntityManager();
	}

}
