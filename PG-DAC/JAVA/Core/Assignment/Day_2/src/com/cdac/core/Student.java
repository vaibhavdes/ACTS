package com.cdac.core;
public class Student
{
	private int id;
	static int count = 1;
	private String name;
	private String email;
	private int age;
	private double gpa;
	
	public Student(String name,String email,int age)
	{
		id = count++;
		this.name = name;
		this.email = email;
		this.age = age;
	}
	public String getDetails()
	{
		return ("Name: " + name + " Email: " + email + " Age: " + age);
	}
	public void computeGPA (double q, double t, double a)
	{
		 q*=0.20;
		 t*=0.50;
		 a*=0.10;
		 gpa = q + t + a;
	}
	public double getGPA()
	{
		return gpa;
	}
}
