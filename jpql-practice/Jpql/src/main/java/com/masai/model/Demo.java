package com.masai.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.masai.Utility.Utility;
import com.masai.bean.Account;

public class Demo {
public static void main(String[] args) {
	EntityManager em = Utility.provideConnection();
   
    TypedQuery<Object[]> q  = em.createNamedQuery("find",Object[].class);
     Object [] obj =  q.getSingleResult();
    
    	System.out.println((String)obj[0]);
    	System.out.println((Integer)obj[1]);
    
    
    
    em.close();
   
}
}
