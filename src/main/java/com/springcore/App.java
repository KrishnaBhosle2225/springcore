package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/config.xml");
		Student s1 = (Student) context.getBean("student1");
		Student s2 = (Student) context.getBean("student2");
		Student s3 = (Student) context.getBean("student3");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
