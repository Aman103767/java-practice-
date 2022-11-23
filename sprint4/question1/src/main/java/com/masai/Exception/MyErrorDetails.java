package com.masai.Exception;

import java.time.LocalDate;

public class MyErrorDetails {
	
private	LocalDate date;
private String message;
private String details;

public MyErrorDetails(LocalDate date, String message , String details) {
	this.date = date;
	this.message = message;
	this.details = details;
	
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getDetails() {
	return details;
}
public void setDetails(String details) {
	this.details = details;
}
public MyErrorDetails() {
	super();
	// TODO Auto-generated constructor stub
}

}
