package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.models.User;

public interface UserDao extends JpaRepository<User, String> {
   public User findByMobileNumber(String string);
	public User findByEmail(String string);
}
