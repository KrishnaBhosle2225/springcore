package com.springcore.constructor_injection;

public class Certificate {

	public String certicateName;


	public Certificate(String name) {
		super();
		this.certicateName = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.certicateName;
	}
	
	
}
