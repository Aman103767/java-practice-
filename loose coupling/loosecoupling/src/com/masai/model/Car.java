package com.masai.model;

public class Car implements Vehical{
	
	public void start1() {
		System.out.println("Car started ...");
	}

	@Override
	public void go() {
		// TODO Auto-generated method stub
		start1();
		
	}
	
	

}
