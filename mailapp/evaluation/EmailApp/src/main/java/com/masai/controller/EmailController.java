package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exceptions.EmailException;
import com.masai.models.Email;
import com.masai.models.EmailDto;
import com.masai.models.UserDto;
import com.masai.service.EmailService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/masaiEmail")
public class EmailController {
	
	@Autowired
	private EmailService emailService;
	
	@PostMapping("/mail")
	public ResponseEntity<Email> sendEmail(@RequestParam String Email,@RequestBody EmailDto emaildto) throws EmailException{
	Email email =	emailService.sendEmail(Email, emaildto);
	return new ResponseEntity<Email>(email,HttpStatus.CREATED);
		
	}
	@GetMapping("/starred/{id}")
	public ResponseEntity<String> starredEmail(@RequestParam Integer mailId) throws EmailException{
		String str = emailService.starred(mailId);
		 return new ResponseEntity<String>(str,HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteMail(@RequestParam Integer mailId) throws EmailException{
		String str = emailService.deleteEmail(mailId);
		 return new ResponseEntity<String>(str,HttpStatus.OK);
	}
	
 

}
