package com.hos.vo;

import java.util.Date;

public class Patient {

	long patientId;
	String fName;
	String lName;
	Date dob;
	Doctor doctor;
	Address address;
	PaymentData cardDetails;
	Room room;
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public PaymentData getCardDetails() {
		return cardDetails;
	}

	public void setCardDetails(PaymentData cardDetails) {
		this.cardDetails = cardDetails;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Patient(long patientId, String fName, String lName, Date dob) {
		super();
		this.patientId = patientId;
		this.fName = fName;
		this.lName = lName;
		this.dob = dob;
	}
	
	public long getPatientId() {
		return patientId;
	}
	
	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
}
