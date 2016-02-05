package com.training.domains;

import java.util.TreeSet;

public class Doctor implements Comparable<Doctor>{

	private long doctorId;
	private String doctorName;
	private String specialization;
	
	private TreeSet<Patient> patients;
	
	
	
	public TreeSet<Patient> getPatients() {
		return patients;
	}
	
	
	public void setPatients(TreeSet<Patient> patients) {
		this.patients = patients;
	}
	
	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}
	
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	public long getDoctorId() {
		return doctorId;
	}
	
	public String getDoctorName() {
		return doctorName;
	}
	
	public String getSpecialization() {
		return specialization;
	}
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Doctor(long doctorId, String doctorName, String specialization) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.specialization = specialization;
	}
	
	@Override
	public String toString() {
		return "Doctor [doctorId= " + doctorId + ", doctorName= " + doctorName + ", specialization= " + specialization
				+ "]";
	}
	
	@Override
	public int compareTo(Doctor o) {
		if(doctorId<o.doctorId) return -1;
		else if(doctorId>o.doctorId) return 1;
		return 0;
	}
}
