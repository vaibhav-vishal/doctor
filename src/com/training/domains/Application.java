package com.training.domains;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {
		Doctor doc1 = new Doctor(1001, "Shariq", "ENT");
		Doctor doc2 = new Doctor(1002, "Rasik", "Women");
		Doctor doc3 = new Doctor(1003, "Vaibhav", "Physican");
		Doctor doc4 = new Doctor(1004, "Rajan", "Heart");

		NursingHome nur = new NursingHome();

		nur.addDoctor(doc1);
		nur.addDoctor(doc2);
		nur.addDoctor(doc3);
		nur.addDoctor(doc4);
		nur.printDoctorList();

		Patient pat1 = new Patient(101, "Suri", 29);
		Patient pat2 = new Patient(102, "Puri", 21);
		Patient pat3 = new Patient(103, "Gauri", 23);
		// Patient pat4 = new Patient(103, "Gauri", 23);
		TreeSet<Patient> patients = new TreeSet<Patient>();
		// HashSet is not ordered so comparator not required
		// HashSet<Patient> patients = new HashSet<Patient>();

		patients.add(pat1);
		patients.add(pat2);
		patients.add(pat3);
		// patients.add(pat4);
		doc1.setPatients(patients);

		System.out.println("Choose sort type 1.Name 2. Specialization :");

		Scanner sc = new Scanner(System.in);

		int key = sc.nextInt();

		nur.printSorted(key);

		sc.close();
	}
}
