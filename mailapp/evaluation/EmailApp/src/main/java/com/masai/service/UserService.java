package com.masai.service;

import java.util.List;

import com.masai.exceptions.UserException;
import com.masai.models.Email;
import com.masai.models.User;
import com.masai.models.UserDto;

public interface UserService {

	public User createUser(UserDto user);
	
	public User updateUser(UserDto user,String key) throws UserException;

	List<Email> getAllMails(String email, String key) throws UserException;

	List<Email> getAllStarredMails(String email, String key) throws UserException;
}
