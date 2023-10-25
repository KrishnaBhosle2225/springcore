package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		
		System.out.println("I am in Class A");
		A a = (A) context.getBean("a");
		System.out.println(a.getX());
		System.out.println(a.getObjB().getY());
		
		
		System.out.println("I am in class B");
		B b = (B) context.getBean("b");
		System.out.println(b.getY());
	}
}
