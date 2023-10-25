package com.springcore.lifecycle;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//this 2 interfaces are used to initialize and destroy the beans by implementing the methods

public class ColdDrink implements InitializingBean,DisposableBean{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting Properties");
		this.name = name;
	}

	public ColdDrink() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ColdDrink [name=" + name + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("Initializing beans / init method");		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroy beans : destroy method");
	}
	
	
}
