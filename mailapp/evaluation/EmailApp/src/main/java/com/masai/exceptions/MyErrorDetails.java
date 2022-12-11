package com.masai.exceptions;

import java.time.LocalDateTime;


import lombok.Data;


@Data
public class MyErrorDetails {

	private LocalDateTime timestamp;
	private String message;
	private String details;
	
	
	public MyErrorDetails() {
		// TODO Auto-generated constructor stub
	}


	public MyErrorDetails(LocalDateTime timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}


	
	
	
	
}