package com.masai.model;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.masai.Utility.Utility;
import com.masai.bean.Account;

public class Demo {
public static void main(String[] args) {
	EntityManager em = Utility.provideConnection();
    String jpql = "from Account where name = 'aman'";
    TypedQuery<Account> q = em.createQuery(jpql,Account.class);
    Account p  = q.getSingleResult();
    System.out.println(p);
    
    
    em.close();
   
}
}
