package com.hos.service;

import com.hos.vo.BillInfo;
import com.hos.vo.Doctor;
import com.hos.vo.Patient;
import com.hos.vo.PatientInfo;
import com.hos.vo.Room;

public interface AdminService {
		

	 Room addRoom(Patient P, Room r, Doctor d);
	 Room vacateRoom();
	 Room assignDoctor();
	 BillInfo generateBill();
	 BillInfo makePayment();
	 Boolean roonShift(Room r, Patient p);
	 Room findRoom();
	Patient addPatient(Patient p);
	Patient createPatientInfo(PatientInfo patientInfo); 

	 
	;
}
