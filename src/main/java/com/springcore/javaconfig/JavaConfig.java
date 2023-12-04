package com.springcore.javaconfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//  @ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig {
	
	@Bean
	public Samosa getSamosa() {
		System.out.println("I am return the object form Samosa class");
		return new Samosa();
	}
	
	@Bean(name=  {"student" , "temp" , "cona"})
	//Creating a student object
	public Student getStudent() {
		Student student = new Student(getSamosa());
		System.out.println("I am calling the method getSamosa");
		return student;
	}

}
