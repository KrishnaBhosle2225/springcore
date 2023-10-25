package com.springcore.constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructor_injection/ci_config.xml");
//		Person person = (Person) context.getBean("person");
//		System.out.println(person);
		
		//produces name output as above
//		Person person2 = (Person) context.getBean("person");
//		System.out.println(person2);
		
//		Addition add = (Addition) context.getBean("add");
//		add.doSum();
		
//		Address address = (Address) context.getBean("address");
//		System.out.println(address);
		
		Student student = (Student) context.getBean("student");
		System.out.println(student);
	}

}
