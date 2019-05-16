package com.app.core;

import java.time.LocalDate;

public class Student {
	
	private int rollNo;			//Primary Key
	private String email;
	private double gpa;
	private String subject;
	private LocalDate dob;
	
	public Student(int rollNo, String email, double gpa, String subject, LocalDate dob) {
		super();
		this.rollNo = rollNo;
		this.email = email;
		this.gpa = gpa;
		this.subject = subject;
		this.dob = dob;
	}
	
	//No Need to Overload Constructor Just for ID as Primary Key as we are using HashMap (Map Interface) which need something as key
	
	public int getRollNo() {
		return rollNo;
	}

	public String getEmail() {
		return email;
	}

	public double getGpa() {
		return gpa;
	}

	public String getSubject() {
		return subject;
	}

	public LocalDate getDob() {
		return dob;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", email=" + email + ", gpa=" + gpa + ", subject=" + subject + ", dob="
				+ dob + "]";
	}

	
}
