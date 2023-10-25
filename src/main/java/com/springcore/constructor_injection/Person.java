package com.springcore.constructor_injection;

import java.util.List;
import java.util.Set;

public class Person {

	private String name;
	private int id;
	private Certificate certificate;
	private List<String> list;
	private Set<String> set;
	
	public Person(String name, int id, Certificate certificate, List<String> list, Set<String> set) {
		super();
		this.name = name;
		this.id = id;
		this.certificate = certificate;
		this.list = list;
		this.set = set;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+" : "+this.id + " { " + this.certificate.certicateName + " } " 
				+ this.list +" " + this.set;
	}
		
}
