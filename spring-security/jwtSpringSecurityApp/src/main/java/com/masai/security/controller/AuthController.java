package com.masai.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.security.payload.request.LoginRequest;
import com.masai.security.payload.request.SignupRequest;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@RequestBody LoginRequest loginRequest){
    	// login to load user from database by mapping provided username & password
    	return null;
    }
    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@RequestBody SignupRequest signupRequest){
    	// Login for saving user details in database
    	return null;
    }
}
