package com.masai.service;

import com.masai.exceptions.EmailException;
import com.masai.models.Email;
import com.masai.models.EmailDto;

public interface EmailService {

	public Email sendEmail(String Email,EmailDto emailDto) throws EmailException;
	
	public String starred(Integer emailId) throws EmailException;
	
	public String deleteEmail(Integer emailId) throws EmailException;
}
