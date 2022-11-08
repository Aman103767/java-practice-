package com.masai.exception;

import java.time.LocalDate;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(StudentException.class)
	public ResponseEntity<MyErrorDetails> EmployeeExcepitonHandler(StudentException ee , WebRequest wr){
		
		MyErrorDetails ed = new MyErrorDetails(LocalDate.now(),ee.getMessage(),wr.getDescription(false));
		
		return new  ResponseEntity<MyErrorDetails>(ed,HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyErrorDetails> EmployeeExcepitonHandler(MethodArgumentNotValidException md){
		
		MyErrorDetails ed = new MyErrorDetails(LocalDate.now(),md.getMessage(),md.getBindingResult().getFieldError().getDefaultMessage());
		
		return new  ResponseEntity<MyErrorDetails>(ed,HttpStatus.BAD_REQUEST);
	}
	
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> EmployeeExcepitonHandler(Exception ee , WebRequest wr){
		
		MyErrorDetails ed = new MyErrorDetails(LocalDate.now(),ee.getMessage(),wr.getDescription(false));
		
		return new  ResponseEntity<MyErrorDetails>(ed,HttpStatus.BAD_REQUEST);
	}
}
