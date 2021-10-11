package com.hos.vo;

import java.io.Serializable;

public class PatientInfo implements Serializable {
	public Patient patient;
	public Doctor doctor;
	public PaymentData pay;
	public Address billAddr;
	public Address patientAddr;
	public Room roomInfo;
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public PaymentData getPay() {
		return pay;
	}
	public void setPay(PaymentData pay) {
		this.pay = pay;
	}
	public Address getBillAddr() {
		return billAddr;
	}
	public void setBillAddr(Address billAddr) {
		this.billAddr = billAddr;
	}
	public Address getPatientAddr() {
		return patientAddr;
	}
	public void setPatientAddr(Address patientAddr) {
		this.patientAddr = patientAddr;
	}
	public Room getRoomInfo() {
		return roomInfo;
	}
	public void setRoomInfo(Room roomInfo) {
		this.roomInfo = roomInfo;
	}

	
}
