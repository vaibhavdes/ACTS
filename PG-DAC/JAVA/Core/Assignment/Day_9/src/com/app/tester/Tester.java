package com.app.tester;
//Duplicate Account Check Not Working
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.app.comparator.RegComparator;
import com.app.core.*;
import com.app.cust_excs.CustomerHandlingException;

import static com.app.util.ValidationRules.*;
import static com.app.util.DummyData.*;

public class Tester {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		try {
			boolean exit = false;
			//ArrayList<Customer> cust = new ArrayList<>();
			//List<Customer> cust = new ArrayList<>();
			List<Customer> cust = populateData();
			while (!exit) {
				System.out.println("1. Create Account  2. Customer Login  3. Show Customers  4. Change Password 5. UnSubscribe 20. Exit 6. Sort By Email 7. Sort by RegDate 8. Sort By RegAmount 9. Sort By RegAmount and RegDate");
				try {

					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter Email , Password, RegAmount , RegDate");
						String em = sc.next();
						String ps = sc.next();
						double rg = sc.nextDouble();
						String dt = sc.next();

						Customer c1 = validateApp(em, ps, rg, dt,cust);
						
						cust.add(c1);
						break;
					case 2:
						System.out.println("Enter Email and Password");
						String email = sc.next();
						String password = sc.next();
						
						Customer c2 = new Customer(email);
						
						//System.out.println(cust.contains(c2)?"Account Exist":"Does not Exist!");
						
						//Used to Check whether really user exist
						//Internally calls equals method
						int index = cust.indexOf(c2);
						if(index == -1)
							throw new CustomerHandlingException("Invalid A/C");
						//System.out.println(cust.get(index));
						
						if(password.equals(cust.get(index).getPassword()))
							System.out.println("Login Sucessfull");
						else
							System.out.println("Password Incorret");
						//Comparator Used to Compare Two Elements from same Class
													
						break;
					case 3:
						for(Customer c : cust)
							System.out.println(c);
						break;
					case 4:
						System.out.println("Enter Email Password");
						String email1 = sc.next();
						String password1 = sc.next();
						
						Customer c3 = new Customer(email1);
						
						int index1 = cust.indexOf(c3);
						if(index1 == -1)
							throw new CustomerHandlingException("Invalid A/C");
						
						if(password1.equals(cust.get(index1).getPassword()))
						{
							System.out.println("Enter New Password");
							cust.get(index1).setPassword("sc.next");
						}
						else
							System.out.println("Password Incorret");
						
					case 5: 
						System.out.println("Enter Email ");
						Customer c4= new Customer(sc.next());
						
						int index2 = cust.indexOf(c4);
						if(index2 == -1)
							throw new CustomerHandlingException("Invalid Subscription Details");
						
						System.out.println(
								cust.remove(c4) ? "UnScribed Succesfully" : "UnScribtion Unsuccesfull");
						break;
					case 6:
						//NaturalOrdering
						Collections.sort(cust);
						break;
					case 9:
						//Custom Ordering
						//Comparator to Compare Applicable along Two Fields
						// sort a/cs as per email
						Collections.sort(cust, new RegComparator());
						break;
					case 7:
						Collections.sort(cust, new Comparator<Customer>() 
						{
							@Override
							public int compare(Customer a1, Customer a2) {
								System.out.println("compare : nm --desc ");
								int ret = a2.getRegDate().compareTo(a1.getRegDate());
								if(ret == 0)
									return ((Double)a2.getReg_amount()).compareTo(a1.getReg_amount());
								return ret;
							}
						}
						);
						break;
					case 20:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
			}
		} finally {
			if(sc!=null)
				sc.close();
		}
	}
}
