package com.masai.model;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.Utility.Utility;

public class Demo {
public static void main(String[] args) {
	EntityManager em = Utility.provideConnection();
    String jpql = "update Account set balance = balance+100";
    Query q = em.createQuery(jpql);
    em.getTransaction().begin();
    int x = q.executeUpdate();
    em.getTransaction().commit();
    System.out.println(x + "rows updated");
}
}
