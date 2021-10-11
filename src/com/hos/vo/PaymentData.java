package com.hos.vo;

import java.util.Date;

public class PaymentData {

	Long ccNo;
	Date expDate;
	Address patientAddr;
	public Long getCcNo() {
		return ccNo;
	}
	public void setCcNo(Long ccNo) {
		this.ccNo = ccNo;
	}
	public Date getExpDate() {
		return expDate;
	}
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}
	public Address gePaptientAddr() {
		return patientAddr;
	}
	public void setPatientAddr(Address aptientAddr) {
		this.patientAddr = aptientAddr;
	}
	
	
}
