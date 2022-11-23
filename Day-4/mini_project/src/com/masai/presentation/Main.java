package com.masai.presentation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.masai.model.Address;
import com.masai.model.Student;
import com.masai.service.StudentService;
import com.masai.service.StudentServiceImpl;

public class Main {
	public static void main(String[] args) {
		 StudentService sservice = new StudentServiceImpl();
		while(true) {
	System.out.println("press 1 to add Student \npress 2 to delete student "
			+ "\npress 3 to find Student \npress 4 to find student with pinode "
			+ "\npress 5 to sort with name \npress 6 to get the unique marks of all student"
			+ "\npress 7 to add all student \npress 8 exit");
	Scanner input = new Scanner(System.in);
     int choice = Integer.parseInt(input.nextLine());
    
     if(choice == 1) {
    	 System.out.println("Enter the id");
		 int id = Integer.parseInt(input.nextLine());
    	 System.out.println("Enter the student name");
    	 String name = input.nextLine();
    	 System.out.println("Enter the marks");
    	 int marks = Integer.parseInt(input.nextLine());
    	 System.out.println("Enter the section ");
    	 String section = input.nextLine();
    	 System.out.println("Enter the city");
    	 String city= input.nextLine();
    	 System.out.println("Enter the state");
    	 String state= input.nextLine();
    	 System.out.println("Enter the pincode");
    	 String pincode= input.nextLine();
    	 Student student = new Student(id,name,marks,section,new Address(city,state,pincode));
    	System.out.println(sservice.addStudent(student)); 
    	
     }
     if(choice == 2) {
    	 System.out.println("Enter the student id");
    	 int id = Integer.parseInt(input.nextLine());
    	 System.out.println(sservice.deleteStudent(id));
    	 
     }
     if(choice == 3) {
    	 System.out.println("Enter the student id");
    	 int id = Integer.parseInt(input.nextLine());
    	 System.out.println(sservice.findStudent(id));
     }
     if(choice == 4) {
    	 System.out.println("Enter the the pincode");
    	 String pincode = (input.nextLine());
    	 sservice.findStudentWithPincode(pincode).forEach(s->System.out.println(s));
    	 
     }
     if(choice == 5) {
    	 sservice.sortWithName().forEach(s->System.out.println(s));
     }
     if(choice == 6) {
    	 sservice.setOfMarks().forEach(s->System.out.println(s));
     }
     if(choice == 7) {
    	 System.out.println("Enter the number of students");
    	 int count = 0;
    	 int n =Integer.parseInt(input.nextLine());
    	 List<Student> list = new ArrayList<>();
    	 while(count <n) {
    		 System.out.println("Enter the id");
    		 int id = Integer.parseInt(input.nextLine());
    		 System.out.println("Enter the student name");
        	 String name = input.nextLine();
        	 System.out.println("Enter the marks");
        	 int marks = Integer.parseInt(input.nextLine());
        	 System.out.println("Enter the section ");
        	 String section = input.nextLine();
        	 System.out.println("Enter the city");
        	 String city= input.nextLine();
        	 System.out.println("Enter the state");
        	 String state= input.nextLine();
        	 System.out.println("Enter the pincode");
        	 String pincode= input.nextLine();
        	 
        	 Student student = new Student(id,name,marks,section,new Address(city,state,pincode));
        	 list.add(student);
        	 count++;
    	 }
    	 sservice.addAllStudent(list);
     }
}
	}
}
