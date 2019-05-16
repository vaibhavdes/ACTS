package com.app.core;

import java.time.LocalDate;

public class Customer {
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
	
	
}
