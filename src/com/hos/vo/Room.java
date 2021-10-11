package com.hos.vo;

public class Room {
	private long roomNo;
	private long patientId;
	private long doctyId;
	private boolean isAvailable=true;
	
	public Room() {
		
	}
	public Room(long roomNo, long patientId, long doctyId, boolean isAvailable) {
		super();
		this.roomNo = roomNo;
		this.patientId = patientId;
		this.doctyId = doctyId;
		this.isAvailable = isAvailable;
	}
	public long getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(long roomNo) {
		this.roomNo = roomNo;
	}
	public long getPatientId() {
		return patientId;
	}
	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}
	public long getDoctyId() {
		return doctyId;
	}
	public void setDoctyId(long doctyId) {
		this.doctyId = doctyId;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	 
}
