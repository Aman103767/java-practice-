package com.masai.security.model;

import java.util.HashSet;
import java.util.Objects;
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

@Table(name = "users")
@Data

@NoArgsConstructor
@AllArgsConstructor
public class User {


	@Id
	@GeneratedValue
	private Long id;
	
	private String username;
	private String password;
	private String email;
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_roles",
	          joinColumns = @JoinColumn(name ="user_id"),
	          inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles = new HashSet<>();
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(email, other.email) && Objects.equals(id, other.id)
				&& Objects.equals(password, other.password) && Objects.equals(username, other.username);
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, id, password, username);
	}
}
