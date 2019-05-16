package com.app.comparator;

import java.util.Comparator;

import com.app.core.Customer;

public class RegComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer a1, Customer a2) {
		System.out.println("in compare : dt");
		return a1.getRegDate().compareTo(a2.getRegDate());
	}
}
