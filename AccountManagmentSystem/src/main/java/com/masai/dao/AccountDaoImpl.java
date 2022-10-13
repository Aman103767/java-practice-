package com.masai.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.masai.Bean.Account;


public class AccountDaoImpl implements AccountDao{

	@Override
	public Account findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String save(Account account) {
		// TODO Auto-generated method stub
		String mess = "Not inserted";
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("accountUnit");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(account);
		em.getTransaction().commit();
		
		em.close();
		mess  = "inserted";
		
		
		return mess;
		
		

	}

	@Override
	public String update(Account account) {
		// TODO Auto-generated method stub
		String mess = "not updated";

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("accountUnit");
		EntityManager em = emf.createEntityManager();
		Account acc = em.find(Account.class , account.getId());
		
		if(acc != null) {
			

			em.getTransaction().begin();
			  acc.setEmail(account.getEmail());
		        acc.setBalance(account.getBalance());
		        acc.setAddress(account.getAddress());
		      mess = "updated"; 
		      em.getTransaction().commit();
			
		}
      
		em.close();
		
		
		return mess;
	}

	@Override
	public String remove(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String withdraw(double amount, int accountId) {
		// TODO Auto-generated method stub
		
		
		String mess = "your amount is not withdraw";

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("accountUnit");
		EntityManager em = emf.createEntityManager();
		Account acc = em.find(Account.class , accountId);
		
		if(acc != null) {
			

			em.getTransaction().begin();
			  if(acc.getBalance() >= amount) {
				  acc.setBalance(acc.getBalance()-amount);
				  mess = "your amount is successfully withdraw"; 
			  }else {
				  mess = "Insufficent balance";
			  }
		    
		      em.getTransaction().commit();
			
		}
      
		em.close();
		
		
		return mess;
	
	}

	@Override
	public String deposit(double amount, int accountId) {
		// TODO Auto-generated method stub
		
		String mess = "your amount is not deposit";

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("accountUnit");
		EntityManager em = emf.createEntityManager();
		Account acc = em.find(Account.class , accountId);
		
		if(acc != null) {
			

			em.getTransaction().begin();
			 
				  acc.setBalance(acc.getBalance()+amount);
				  mess = "your amount is successfully deposit"; 
			  
		      em.getTransaction().commit();
			
		}
      
		em.close();
		
		
		return mess;
	}

}
