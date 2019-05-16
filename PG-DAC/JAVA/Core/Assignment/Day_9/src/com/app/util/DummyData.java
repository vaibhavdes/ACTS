package com.app.util;

import java.util.ArrayList;
import java.util.List;
import static com.app.util.ValidationRules.*;
import com.app.core.Customer;

public class DummyData {
	public static List<Customer> populateData() throws Exception {
		ArrayList<Customer> l1 = new ArrayList<>();
		l1.add(validateApp("abc@gmail.com", "abc@123", 1000, "23/4/2018",l1));
		
		return l1;
	}
	
}
