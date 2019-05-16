package com.app.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.app.util.ValidationRules.*;
import com.app.core.Customer;

public class DummyData {
	public static Map<String,Customer> populateData() throws Exception {
		HashMap<String,Customer> l1 = new HashMap<>();
		//Requires Key of type Integer as mentioned in signature 
		l1.put("abc@gmail.com",validateApp("abc@gmail.com", "abc@123", 1000, "23/4/2018",l1));
		l1.put("xyz@gmail.com",validateApp("xyz@gmail.com", "xyz@123", 2000, "021/08/2018",l1));

		return l1;
	}
	
}
