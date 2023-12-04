package com.springcore.Collections;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/Collections/collectionconfig.xml");
		Emp emp1 = (Emp) context.getBean("emp1");
		
		System.out.println(emp1.getName());
		System.out.println(emp1.getPhones().getClass().getName());				//Give the name of implementation list
		System.out.println(emp1.getAddress());
		System.out.println(emp1.getCourses());
	}

}
