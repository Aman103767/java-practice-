package com.masai.security.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.masai.security.model.User;
import com.masai.security.repository.UserRepository;

public class UserDetialsServiceImpl implements UserDetailsService {
	
	@Autowired
	private UserRepository repository;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = repository.findByUsername(username).orElseThrow(()-> new UsernameNotFoundException("User does not exist..!"));
		
		return UserDetailsImpl.build(user);
	}

}
