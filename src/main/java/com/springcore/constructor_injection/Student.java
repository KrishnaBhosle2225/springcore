package com.springcore.constructor_injection;

public class Student {
	
	private int id;
	private String name;
	private Address address;
	
	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id is : "+ this.id +", Name is : "+ this.name+" Address is : "+this.address;
	}
	
		
}
