package com.springcore.Constructor;

public class Addition {
	private int a;
	private int b;
	public Addition(int a , int b) {
		this.a = a;
		this.b = b;
		System.out.println("Constructor: int  , int	");
	}
	
	public Addition(double a , int b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Constructor: double , int ");
	}
	
	public void doSum() {
		System.out.println("Value of a is " + this.a);
		System.out.println("Value of b is " + this.b);
		System.out.print("SUm is  " + (this.a + this.b));
	}

}
