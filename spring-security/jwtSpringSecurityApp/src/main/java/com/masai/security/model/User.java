package com.masai.security.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String username;
	private String password;
	private String email;
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_roles",
	          joinColumns = @JoinColumn(name ="user_id"),
	          inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles = new HashSet<>();
}
