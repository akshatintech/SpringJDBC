package com.springcore.References;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/References/Refconfig.xml");
		A temp= (A) context.getBean("aref");
		System.out.println(temp.getX()); // we have printed this from the object of X
		
		System.out.println(temp.getOb().getY());  // We have printed y value from the object of B
		
		System.out.println(temp);			//Print A object 

	}

}	
