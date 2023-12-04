package com.springcore.Constructor;

public class Person {
	private String name;
	private int personid;
	private Cert certificate;
	
	public Person(String name , int personid, Cert certificate) {
		this.name  = name;
		this.personid = personid;
		this.certificate = certificate;
		}

	@Override
	public String toString() {
		return this.name + " : " + this.personid  + this.certificate.name;
	}
	
	

}
