package com.hos.vo;

public class Address {

	String street;
	String hNo;
	String city;
	String State;
	int pin;
	String country;
	public Address(String street, String hNo, String city, String state, int pin, String country) {
		super();
		this.street = street;
		this.hNo = hNo;
		this.city = city;
		State = state;
		this.pin = pin;
		this.country = country;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String gethNo() {
		return hNo;
	}
	public void sethNo(String hNo) {
		this.hNo = hNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
}
