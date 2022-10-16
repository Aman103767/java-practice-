package com.masai.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Department {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO )
	private int deptId;
	private String dname ;
	private String location;
	
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", dname=" + dname + ", location=" + location +  "]";
	}
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "dept")
    //@JoinTable(name = "dept_emp",joinColumns = @JoinColumn(name = "did"),inverseJoinColumns = @JoinColumn(name="empid" ))
	private List<Employee> emp = new ArrayList<>();

	public int getDeptId() {
		return deptId;
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
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

	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	
}


