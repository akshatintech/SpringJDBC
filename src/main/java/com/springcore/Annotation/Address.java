package com.springcore.Annotation;

public class Address {
	private String street;
	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
