package com.app.core;

import java.time.LocalDate;

import com.app.cust_excs.CustomerHandlingException;

public class Customer implements Comparable<Customer> {
	//Used to implement Collection.sort(obj) method
	//Must implement CompareTo Method
	
	private String email;
	private String password;
	private double reg_amount;
	private LocalDate regDate;
	//private int id;
	//private static int offset;
	
	/*static
	{
		offset = 0;
	}*/
	
	public Customer(String email,String password,double reg_amount,LocalDate regDate)
	{
		//this.id = ++offset;
		this.email = email;
		this.password = password;
		this.reg_amount = reg_amount;
		this.regDate = regDate;
	}
	
	public Customer(String email)
	{
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [email=" + email + ", password=" + password + ", reg_amount=" + reg_amount + ", regDate="
				+ regDate + "]";
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o instanceof Customer)
			return email.equals(((Customer) o).email);
		return false;
	}
	
	//For Single Member Comparision and Can be used for Sort Purpose
	//Internally Collection.sort(obj) calls compareTo
	@Override
	public int compareTo(Customer a2)
	{
		System.out.println("in acct's compareTo");
		
		/* Comparable
		 * if(acctNo < a2.acctNo) return -1; 
		 * if(acctNo == a2.acctNo) return 0;
		 * return 1;
		 */
		//Sort By Email : Natural Ordering
		return ((String)email).compareTo(a2.email);
		//Implicitly Parameter to CompareTo is also converted to Similar Type Object (Wrapper Class)

	}
	
	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) throws CustomerHandlingException{
		if(!password.matches("[a-z]+[@,%,#,&,*][0-9]+"))
		{	
			throw new CustomerHandlingException("Password Neet Tak");
		}
		this.password = password;
	}

	public double getReg_amount() {
		return reg_amount;
	}

	public LocalDate getRegDate() {
		return regDate;
	}

}
