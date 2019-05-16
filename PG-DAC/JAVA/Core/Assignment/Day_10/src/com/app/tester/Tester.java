package com.app.tester;
//Duplicate Account Check Not Working
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
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
			Map<String,Customer> cust = populateData();
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
						
						cust.put(c1.getEmail(),c1);
						break;
					case 2:
						System.out.println("Enter Email and Password");
						String email = sc.next();
						String password = sc.next();
						
						boolean ret = cust.containsKey(email);
						if(!ret)
							throw new CustomerHandlingException("No Account Exist");
						
						validateLogin(email,password,cust);
						
						break;
					case 3:
						System.out.println(cust);
						break;
					case 4:
						System.out.println("Enter Email Password");
						String email1 = sc.next();
						String password1 = sc.next();

						boolean ret1 = cust.containsKey(email1);
						if(!ret1)
							throw new CustomerHandlingException("No Account Exist");
						
						System.out.println("Enter New Password");
						String password2 = sc.next();

						changePassword(email1,password1,password2,cust);
						break;
						
					case 5: 
						System.out.println("Enter Email ");
						String email2 = sc.next();
						if(!cust.containsKey(email2))
							throw new CustomerHandlingException("Invalid Subscription Details");
						
						System.out.println(
								cust.remove(email2) != null ? "UnScribed Succesfully" : "UnScribtion Unsuccesfull");
						break;
				/*	case 6:
						//NaturalOrdering
						//Collections.sort(cust);
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
						*/
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
