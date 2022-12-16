package com.masai.security.payload.request;

import java.util.Set;

import com.masai.security.model.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignupRequest {
	private String username;
	private String email;
	private String password;
	private Set<Role> role;

}
