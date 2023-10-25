package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/autoconfig.xml");
//		Address address = context.getBean("address", Address.class);
//		System.out.println(address);
		
		Emp emp = context.getBean("emp", Emp.class);
		System.out.println(emp);
	}

}
