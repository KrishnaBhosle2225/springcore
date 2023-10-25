package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/product_config.xml");
		
//		Product  product=(Product) context.getBean("product");
//		System.out.println(product);
		
		//enabling register shutdown hook so that we can see the destroy method 
		context.registerShutdownHook();
		
//		ColdDrink pepsi = (ColdDrink) context.getBean("coldDrink");
//		System.out.println(pepsi);
		
		Example example = (Example) context.getBean("example");
		System.out.println(example);
				
 	}

}
