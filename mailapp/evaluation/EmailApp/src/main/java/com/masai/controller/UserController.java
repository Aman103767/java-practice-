package com.masai.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exceptions.UserException;
import com.masai.models.Email;
import com.masai.models.User;
import com.masai.models.UserDto;
import com.masai.service.UserService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/masaimail")
public class UserController {
     @Autowired
	private UserService userService;
     @PostMapping("/register")
     public ResponseEntity<User> createUser(@Valid @RequestBody UserDto user){
    	User u =  userService.createUser(user);
    	return new ResponseEntity<User>(u,HttpStatus.CREATED);
     }
     @PutMapping("/user")
     public ResponseEntity<User> UpdateUser(@Valid @RequestBody UserDto user,@RequestParam String key) throws UserException{
     	User u =  userService.updateUser(user,key);
     	return new ResponseEntity<User>(u,HttpStatus.OK);
      }
     @GetMapping("/mail")
     public ResponseEntity<List<Email>> getAllMail(@RequestParam String email,@RequestParam String key) throws UserException{
    	 List<Email> emails = userService.getAllMails(email,key);
    	 return new ResponseEntity<List<Email>>(emails,HttpStatus.OK);
     }
     @GetMapping("/starred")
     public ResponseEntity<List<Email>> getAllStarredMail(@RequestParam String email,@RequestParam String key) throws UserException{
    	 List<Email> emails = userService.getAllStarredMails(email,key);
    	 return new ResponseEntity<List<Email>>(emails,HttpStatus.OK);
     }
}
