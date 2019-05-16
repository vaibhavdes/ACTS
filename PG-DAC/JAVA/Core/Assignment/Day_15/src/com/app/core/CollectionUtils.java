package com.app.core;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CollectionUtils {
	
	public static HashMap<String, Dept> populateData()
	{
		HashMap<String,Dept> h1 = new HashMap<String,Dept>();
		h1.putIfAbsent("rnd",new Dept("rnd",rndEmp()));
		h1.putIfAbsent("prod",new Dept("prod",prodEmp()));
		h1.putIfAbsent("sales",new Dept("sales",salesEmp()));
		return h1;
	}
	
	public static ArrayList<Emp> rndEmp()
	{
		ArrayList<Emp> arrList = new ArrayList<>();
		arrList.add(new Emp(1,"Naav",2500.34,LocalDate.parse("2019-12-01")));
		arrList.add(new Emp(4,"Naav4",2450.40,LocalDate.parse("2021-08-05")));
		return arrList;
	}
	
	public static ArrayList<Emp> prodEmp()
	{
		ArrayList<Emp> arrList = new ArrayList<>();
		arrList.add(new Emp(3,"Naav3",6540.40,LocalDate.parse("2020-08-05")));
		arrList.add(new Emp(2,"Naav2",1200.50,LocalDate.parse("2018-06-01")));
		arrList.add(new Emp(9,"Naav4",32000.50,LocalDate.parse("2012-09-23")));

		return arrList;
	}
	
	public static ArrayList<Emp> salesEmp()
	{
		ArrayList<Emp> arrList = new ArrayList<>();
		arrList.add(new Emp(6,"Naav7",1230.80,LocalDate.parse("2001-04-23")));
		arrList.add(new Emp(7,"Naav8",6750.30,LocalDate.parse("2002-07-18")));
		return arrList;
	}
}