package com.masai.Exception;

import java.time.LocalDate;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(EmployeeException.class)
	public ResponseEntity<MyErrorDetails> EmployeeExcepitonHandler(EmployeeException ee , WebRequest wr){
		
		MyErrorDetails ed = new MyErrorDetails(LocalDate.now(),ee.getMessage(),wr.getDescription(false));
		
		return new  ResponseEntity<MyErrorDetails>(ed,HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> EmployeeExcepitonHandler(Exception ee , WebRequest wr){
		
		MyErrorDetails ed = new MyErrorDetails(LocalDate.now(),ee.getMessage(),wr.getDescription(false));
		
		return new  ResponseEntity<MyErrorDetails>(ed,HttpStatus.BAD_REQUEST);
	}
}
