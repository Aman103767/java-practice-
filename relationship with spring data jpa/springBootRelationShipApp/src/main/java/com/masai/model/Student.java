package com.masai.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Student {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer roll;
	private String name;
	private Integer marks;
	
	@Embedded
	private Address addr;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Course> courses = new HashSet<>();
	
}
