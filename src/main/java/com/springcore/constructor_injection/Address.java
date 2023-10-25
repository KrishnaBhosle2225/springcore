package com.springcore.constructor_injection;


public class Address {
	
	private String street;
	private String city;
	private String state;
	
	public Address(String street, String city, String state) {
		this.street = street;
		this.city = city;
		this.state = state;
	}
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.street+", "+this.city+", "+this.state;
	}
	
	
	
}
