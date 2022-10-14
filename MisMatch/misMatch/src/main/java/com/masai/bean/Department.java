package com.masai.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO )
	private int deptId;
	private String dname ;
	private String location;
	
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", dname=" + dname + ", location=" + location + ", emp=" + emp + "]";
	}

	private List<Employee> emp = new ArrayList<>();

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	
}


