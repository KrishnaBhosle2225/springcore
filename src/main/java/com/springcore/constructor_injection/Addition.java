package com.springcore.constructor_injection;

//This program mainly used to show the ambiguity problem of the constructor order
//1. if the proper type is not found to the bean then the top most constructor is 
//	selected regardless of data type of the parameters.
//2. if the required type constructor present in the file at the bottom or somewhere 
//	in the file but not at the topmost then the matching is called automatically based on data types.
//3. To solve the ambiguity problem of the constructor we can use type, index attribute in the config file
	

public class Addition {
	
	private int a;
	private int b;
	
	public Addition(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Constructor : String, String ");
	}
	
	public Addition(double a, double b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Constructor : double, double ");
	}
	
	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Constructor : int, int ");
	}
	
	
	public void doSum() {
		System.out.println("Value of a is : " + this.a);
		System.out.println("Value of b is : " + this.b);
		System.out.println(a+b);
	}
}
