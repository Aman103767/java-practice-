package com.masai.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor 
public class User {
	
	@Id
	private String email;
	private String fistName;
	private String lastName;
	private String mobileNumber;
	private LocalDate dateOfBirth;
	private String password;

	@OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
	List<Email> emails = new ArrayList<>();
}
