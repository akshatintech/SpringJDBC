package com.springcore.lifecycle;

public class Samosa {
	private double price;

	public Samosa() {
		super();
	
	}

	@Override
	public String toString() {
		System.out.println("Setting property");
		return "Samosa [price=" + price + "]";
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void init() {
		System.out.println("Inside Init method");
	}
	
	public void destroy() {
		System.out.println("Inside Destroy method");
	}

}
