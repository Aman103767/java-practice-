package com.masai.model;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.Utility.Utility;

public class Demo {
public static void main(String[] args) {
	EntityManager em = Utility.provideConnection();
    String jpql = "update Account set balance = balance+?1 where name = ?2";
    Query q = em.createQuery(jpql);
    q.setParameter(1,1000);
    q.setParameter(2,"aman");
    em.getTransaction().begin();
    int x = q.executeUpdate();
    em.getTransaction().commit();
    System.out.println(x + " rows updated");
}
}
