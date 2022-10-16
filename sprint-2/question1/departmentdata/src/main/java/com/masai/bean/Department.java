package com.masai.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;

@Entity
public class Department {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
 private int deptId;
private String deptName;
 private String locaiton;
 
 @OneToMany(cascade = CascadeType.ALL)
 List<Department> employees = new ArrayList<>();
 
@Override
public String toString() {
	return "Department [deptId=" + deptId + ", deptName=" + deptName + ", locaiton=" + locaiton + "]";
}
public int getDeptId() {
	return deptId;
}
public void setDeptId(int deptId) {
	this.deptId = deptId;
}
public String getDeptName() {
	return deptName;
}
public void setDeptName(String deptName) {
	this.deptName = deptName;
}
public String getLocaiton() {
	return locaiton;
}
public void setLocaiton(String locaiton) {
	this.locaiton = locaiton;
}

 
}
