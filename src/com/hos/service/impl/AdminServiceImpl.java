package com.hos.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.hos.service.AdminService;
import com.hos.vo.BillInfo;
import com.hos.vo.Doctor;
import com.hos.vo.Patient;
import com.hos.vo.PatientInfo;
import com.hos.vo.PaymentData;
import com.hos.vo.Room;
import com.hos.vo.Rooms;

public class AdminServiceImpl implements AdminService {
	Rooms allRooms =new Rooms();
	Map<Long , Patient> allPatients= new HashMap<>();
	static Map<Long, Doctor> doctors = new HashMap<>();
	static {
		doctors.put(1001l, new Doctor(1001, "Ram", "S", new Date()));
		
	}
	
	@SuppressWarnings("unlikely-arg-type")
	private void addDoctorPatient(Patient p) {
		
		if(doctors.get(0).getPatients().size()>doctors.get(1).getPatients().size()) {
			doctors.get(0).addPatient(p);
			p.setDoctor(doctors.get(0));
		}else {
			doctors.get(1).addPatient(p);
			p.setDoctor(doctors.get(1));
		}
	}

	@Override
	public Room addRoom(Patient p, Room r, Doctor d) {
	
		p.setRoom(r);
		r.setPatientId(p.getPatientId());
		r.setDoctyId(d.getDoctorId());
		r.setAvailable(false);
		return r;
	}

	@Override
	public Room vacateRoom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Room assignDoctor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BillInfo generateBill() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BillInfo makePayment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean roonShift(Room r, Patient p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Room findRoom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Patient createPatientInfo(PatientInfo patientInfo) {
		
		Patient p =addPatient(patientInfo.getPatient());
		p.setAddress(patientInfo.getPatientAddr());
		PaymentData pd=patientInfo.getPay();
		pd.setPatientAddr(patientInfo.getBillAddr());
		addPatient(p);
		return p;
	}

	@Override
	public Patient addPatient(Patient p) {
		// TODO Auto-generated method stub
		addDoctorPatient(p);
		Room room=findRoom();
		addRoom(p, room, p.getDoctor());
		
		return p;
	}

}
