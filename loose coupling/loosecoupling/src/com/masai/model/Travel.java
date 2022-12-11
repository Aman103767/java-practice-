package com.masai.model;

public class Travel {
	
	Vehical v;

	public Vehical getV() {
		return v;
	}

	public void setV(Vehical v) {
		this.v = v;
	}
	
	public void journey() {
		v.go();
		System.out.println("Jounrey started....");
	}
	
	

}
