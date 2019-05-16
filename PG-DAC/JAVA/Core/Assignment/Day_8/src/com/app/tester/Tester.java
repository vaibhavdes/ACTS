package com.app.tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import com.app.core.*;
import com.app.cust_excs.CustomerHandlingException;

import static com.app.util.ValidationRules.*;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			boolean exit = false;
			ArrayList<Customer> cust = new ArrayList<>();
			
			while (!exit) {
				System.out.println("1. Create Account  2. Check Customer  3. Show Customers  4. Exit");
				try {

					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter Email , Password, RegAmount , RegDate");
						String em = sc.next();
						String ps = sc.next();
						double rg = sc.nextDouble();
						String dt = sc.next();

						checkEmail(em);
						matches(ps);
						amount(rg);
						LocalDate dts = validateDate(dt);

						Customer c1 = new Customer(em, ps, rg, dts);
						
						cust.add(c1);
						break;
					case 2:
						System.out.println("Enter Email and Password");
						Customer c2 = new Customer(sc.next());

						//System.out.println(cust.contains(c2)?"Account Exist":"Does not Exist!");
						
						int index = cust.indexOf(c2);
						if(index == -1)
							throw new CustomerHandlingException("Invalid A/C");
						System.out.println(cust.get(index));
							
						break;
					case 3:
						for(Customer c : cust)
							System.out.println(c);
						break;
					case 4:
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
