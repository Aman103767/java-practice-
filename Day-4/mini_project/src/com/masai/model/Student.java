package com.masai.model;

public class Student {
	private int id ;
	private String name;
	private int marks;
	private String section;
	private Address address;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getMarks() {
		return marks;
	}
	public String getSection() {
		return section;
	}
	public Address getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", section=" + section + ", address="
				+ address + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, int marks, String section, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.section = section;
		this.address = address;
	}
	

}
