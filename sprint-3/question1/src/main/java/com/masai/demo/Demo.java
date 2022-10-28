package com.masai.demo;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.masai.presentation.PresentationBean;

import masaiAppConfig.AppConfig;

public class Demo {
public static void main(String[] args) {
	
	ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	PresentationBean pb = ctx.getBean("p1",PresentationBean.class);
	Scanner input = new Scanner(System.in);
	System.out.println("1. insert Employee");
	System.out.println("2. print All Employee");
	System.out.println("3. Search Employee by id");
	System.out.println("4. delete Employee by id");
	
	System.out.println("Enter the choice");
	int choice = input.nextInt();
	
	
	if(choice ==1) {
		pb.insertEmployee();	
	}else if (choice == 2) {
		pb.printAllEmployee();
	}else if (choice == 3) {
		pb.searchEmployee();
	}else if (choice == 4) {
		pb.deleteEmployee();
	}
	
	
	
}
}
