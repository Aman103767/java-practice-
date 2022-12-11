package com.masai.models;




import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Email {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
 private Integer emailId;
 private String recipients;
 private String subject;
 private String body;
 private String status;
 private boolean star = false;
 
@ManyToOne(cascade = CascadeType.ALL)
@JsonIgnore
 private User user;


}
