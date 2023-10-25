package com.springcore.lifecycle;

public class Product {
	
	private int price;
	
	
	public int getPrice() {
		System.out.println("Bean lifecycle : ");
		return price;
	}

	public void setPrice(int price) {
		System.out.println("Setting Properties");
		this.price = price;
	}

	public Product(int price) {
		super();
		this.price = price;
	}


	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("I am in init() method");
	}
	
	public void destroy() {
		System.out.println("I am in destroy() method");
	}
	
}
