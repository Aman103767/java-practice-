
package com.masai.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	
@Id
@GeneratedValue(strategy =GenerationType.AUTO)
private int empId;
@Override
public String toString() {
	return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
}
private String name;
private int salary ;
@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "did")
private Department dept;

public Department getDept() {
	return dept;
}
public void setDept(Department dept) {
	this.dept = dept;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
}



