package com.springcore.StandaloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/StandaloneCollections/standaloneconfig.xml");
		Person p1 = (Person) context.getBean("person1",Person.class);
		System.out.println(p1);
		System.out.println(p1.getFriends().getClass().getName());
		System.out.println("_____________________________--");
		System.out.println(p1.getFeestructure());
		
		System.out.println(p1.getProps());
		
	}

}
