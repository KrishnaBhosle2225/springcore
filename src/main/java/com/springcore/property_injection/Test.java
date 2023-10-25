package com.springcore.property_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/property_injection/pi_config.xml");
		
		Address address = (Address) context.getBean("address");
		System.out.println(address);
		
		Stuent student = (Stuent) context.getBean("student");
		System.out.println("My Id is " + student.getId() + ", Name is " + student.getName() 
			+", Address is : "+ student.getAddress());
	}

}
