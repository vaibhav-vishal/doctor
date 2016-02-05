package com.training.domains;

public class Patient implements Comparable<Patient> {

	private long patientId;
	private String patientName;
	private int patientAge;

	public Patient(long patientId, String patientName, int patientAge) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAge = patientAge;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", patientAge=" + patientAge + "]";
	}

	@Override
	public int compareTo(Patient o) {
		if (patientId < o.patientId)
			return -1;
		else if (patientId > o.patientId)
			return 1;

		return 0;
	}

}
