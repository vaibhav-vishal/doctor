package com.training.domains;

import java.util.ArrayList;
import java.util.Collections;

import com.training.utils.MyComparators;

public class NursingHome {

	private ArrayList<Doctor> docList;

	public NursingHome() {
		docList = new ArrayList<Doctor>();
	}

	public boolean addDoctor(Doctor doc) {
		boolean result = docList.add(doc);
		return result;
	}

	public void printDoctorList() {

		for (Doctor doc : docList) {

			System.out.println(doc);
			if (doc.getPatients() != null) {

				System.out.println("Appointment list");

				for (Patient pat : doc.getPatients()) {
					System.out.println(pat);
				}
			} else
				System.out.println("No Appointments");
		}
	}

	public void printSorted() {
		Collections.sort(docList);
		printDoctorList();
	}

	public void printSorted(int key) {
		MyComparators comp = new MyComparators();
		switch (key) {

		case 1:
			MyComparators.NameComparator comp1 = comp.new NameComparator();
			Collections.sort(docList, comp1);
			printDoctorList();
			break;
		case 2:
			MyComparators.SpecializationComparator comp2 = comp.new SpecializationComparator();
			Collections.sort(docList, comp2);
			printDoctorList();
			break;
		default:
			System.out.println("Invalid Choice!");
		}
	}
}
