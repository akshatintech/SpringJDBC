package com.springcore.Stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/Stereotype/stereoconfig.xml");
		Student student = con.getBean("student" , Student.class);
		System.out.println(student.getCity());
		System.out.println(student.getAddress());
		System.out.println(student.getAddress().getClass().getName());
		
		System.out.println(student.hashCode());
		Student student2 = con.getBean("student", Student.class);
		System.out.println(student2.hashCode());
		
		Teacher teach1 = con.getBean("teacher" , Teacher.class);
		Teacher teach2 = con.getBean("teacher" , Teacher.class);
		
		System.out.println(teach1.hashCode());
		System.out.println(teach2.hashCode());
	}

}
