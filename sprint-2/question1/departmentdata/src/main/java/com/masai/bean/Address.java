package com.masai.bean;

public class Address {
	
	private String city;
	private String state;
	private String pincode;
	public Address() {
		
	}
	public Address(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
		this.city = string;
		this.state = string2;
		this.pincode = string3;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
}
