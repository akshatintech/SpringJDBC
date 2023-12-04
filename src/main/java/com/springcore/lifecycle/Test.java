package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
//		
//		Samosa s1 = (Samosa) context.getBean("samosa");		//Name of the Bean
//		System.out.println(s1);
		
//		((AbstractApplicationContext) context).registerShutdownHook();			//registering shutdown hook
//		
//		System.out.println("++++++++++++++++++++++++++++++++++");
//		
//		
//		Pepsi p1 = (Pepsi) context.getBean("pepsi");				//Calling the second class using bean
//		System.out.println(p1);		
//		((AbstractApplicationContext) context).registerShutdownHook();			//registering shutdown hook
		
		
		Annotation a1 = (Annotation) context.getBean("anno");
		System.out.println(a1);
		((AbstractApplicationContext) context).registerShutdownHook();			//registering shutdown hook
	}

}
		