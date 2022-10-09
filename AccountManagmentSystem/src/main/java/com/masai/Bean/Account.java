package com.masai.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
     @Id
     private int id;
     private String email;
     private String address;
     private double balance;
     
     public Account() {
    	 
     }
     public Account(int id,String email, String address , double balance) {
    	 this.id = id;
    	 this.email = email;
    	 this.address = address;
    	 this.balance = balance;
     }
     
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	@Override
	public String toString() {
		return "Account23 [id=" + id + ", email=" + email + ", address=" + address + ", balance=" + balance + "]";
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
