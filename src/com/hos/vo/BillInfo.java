package com.hos.vo;

import java.util.Date;

public class BillInfo {

	long billId;
	Date billDate;
	long patientId ;
	Date dischargeDate;
	long roomId ;
	long doctorId;
	double totalAmount;
	double paidAmount;
	double balance;
	String paymentType;
	
	
	public BillInfo(long billId, Date billDate, long patientId, Date dischargeDate, long roomId, long doctorId,
			double totalAmount, double paidAmount, double balance, String paymentType) {
		super();
		this.billId = billId;
		this.billDate = billDate;
		this.patientId = patientId;
		this.dischargeDate = dischargeDate;
		this.roomId = roomId;
		this.doctorId = doctorId;
		this.totalAmount = totalAmount;
		this.paidAmount = paidAmount;
		this.balance = balance;
		this.paymentType = paymentType;
	}
	
	public long getBillId() {
		return billId;
	}
	public void setBillId(long billId) {
		this.billId = billId;
	}
	public Date getBillDate() {
		return billDate;
	}
	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
	public long getPatientId() {
		return patientId;
	}
	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}
	public Date getDischargeDate() {
		return dischargeDate;
	}
	public void setDischargeDate(Date dischargeDate) {
		this.dischargeDate = dischargeDate;
	}
	public long getRoomId() {
		return roomId;
	}
	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}
	public long getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public double getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	
	
}
