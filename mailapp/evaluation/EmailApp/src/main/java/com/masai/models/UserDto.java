package com.masai.models;

import java.time.LocalDate;

import javax.validation.constraints.Future;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

	private String Email;
	private String fistName;
	private String lastName;
	//@Size(min = 10 ,max = 11 ,message = "mobile number should be 10 digit")
	private String mobileNumber;
	private String dateOfBirth;
	@Size(min = 6,max = 12,message = "password length should be between 5 & 8.")
	private String password;
}
