package com.app.core;

import java.util.ArrayList;

public class Dept {
	private String name;
	private ArrayList<Emp> emps;
	
	
	public Dept(String name, ArrayList<Emp> emps) {
		this.name = name;
		this.emps = emps;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Emp> getEmps() {
		return emps;
	}
	public void setEmps(ArrayList<Emp> emps) {
		this.emps = emps;
	}
	@Override
	public String toString() {
		return "Dept [ name=" + name + ", emps=" + emps + "]";
	}
	
		
}
