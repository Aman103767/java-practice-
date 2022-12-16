package com.masai.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.security.payload.request.LoginRequest;
import com.masai.security.payload.request.SignupRequest;

@RestController
public class AuthController {
    @PostMapping("signin")
    public ResponseEntity<?> authenticateUser(@RequestBody LoginRequest loginRequest){
    	return null;
    }
    
    public ResponseEntity<?> registerUser(@RequestBody SignupRequest signupRequest){
    	return null;
    }
}
