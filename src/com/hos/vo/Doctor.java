package com.hos.vo;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Doctor {

	long doctorId;
	String fName;
	String lName;
	Date dob;
	Map<Long, Patient> activePatients=new HashMap<>();
	
	
	public Doctor(long doctorId, String fName, String lName, Date dob) {
		super();
		this.doctorId = doctorId;
		this.fName = fName;
		this.lName = lName;
		this.dob = dob;
	}
	
	public long getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
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
	public Map<Long, Patient> getPatients() {
		return activePatients;
	}
	public void setPatients(Map<Long, Patient> patients) {
		this.activePatients = patients;
	}
	
	public void addPatient(Patient p) {
		activePatients.put(p.getPatientId(), p);
		
	}
	
	public Patient removePatient(Long pId) {
		return activePatients.remove(pId);
	}
}
