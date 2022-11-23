package com.masai.controller;


public class Student {
 private Integer roll;
 private String name;
 private String address;
public Student(int roll2, String name2, String address2) {
	// TODO Auto-generated constructor stub
	this.roll = roll2;
	this.name = name2;
	this.address = address2;
	
}
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
}
 
 
}
