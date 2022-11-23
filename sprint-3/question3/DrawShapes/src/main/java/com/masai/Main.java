package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	Runner r = ac.getBean(Runner.class,"r");
	//r.setShape(new Circle());
	r.shape();
}
}
