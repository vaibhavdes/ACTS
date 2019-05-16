package com.app.tester;
import static com.app.util.DummyData.populateData;
import static com.app.util.ValidationRules.changePassword;
import static com.app.util.ValidationRules.validateApp;
import static com.app.util.ValidationRules.validateLogin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

import com.app.core.Customer;
import com.app.cust_excs.CustomerHandlingException;

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
						Customer c1 = validateApp(sc.next(), sc.next(), sc.nextDouble(), sc.next(),cust);						
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
						//System.out.println(cust);			//It will print in json like format
						for(Customer c : cust.values())		//SET
							System.out.println(c);
						
						System.out.println("Only Keys");
						for(String k : cust.keySet())		//COLLECTIONS
							System.out.println(k);
						
						System.out.println("Only RegAmount of Users");
						for(Entry<String,Customer> e : cust.entrySet())		//ENTRY
							System.out.println(e.getKey() + " " + e.getValue().getReg_amount());
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
					case 6:
						//NaturalOrdering
						TreeMap<String, Customer>tm=new TreeMap<>(cust);
						for(Customer c : cust.values())
							System.out.println(c);

						break;
					case 7:
						
						List<Customer> l1=new ArrayList<>(cust.values());
	
						/*Collections.sort(l1,new Comparator<Customer>() {
							@Override
							public int compare(Customer  c1,Customer c2 ) {
									return c1.getRegDate().compareTo(c2.getRegDate());
							}
							
						});*/
						
						Collections.sort(l1,(c3,c2)->c3.getRegDate().compareTo(c2.getRegDate()));	//Lamba Expression
						
						//cust.clear();
						
						for(Customer c:l1)
						{
							System.out.println(c);
						//put(c.getEmail(), c);
						}
						
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
