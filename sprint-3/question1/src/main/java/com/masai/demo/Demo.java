package com.masai.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.masai.presentation.PresentationBean;

import masaiAppConfig.AppConfig;

public class Demo {
public static void main(String[] args) {
	
	ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	PresentationBean pb = ctx.getBean("p1",PresentationBean.class);
	pb.insertEmployee();
	
}
}
