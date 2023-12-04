package com.springcore.lifecycle;

import javax.annotation.PostConstruct;

public class Annotation {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Annotation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Annotation [subject=" + subject + "]";
	}
	

	public void start() {
		System.out.println("Starint the method");
	}
	
	public void end() {
		System.out.println("Ending the method");
	}

}
