package com.springcore.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/Constructor/Constructorconfig.xml");
		Person p = (Person) context.getBean("person");
		System.out.println(p);
		
		Addition add = (Addition) context.getBean("add");
		add.doSum();
		
		
		
		

	}

}
