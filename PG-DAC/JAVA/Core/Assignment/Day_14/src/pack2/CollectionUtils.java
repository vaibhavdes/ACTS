package pack2;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class CollectionUtils {
	public static Map<Integer,Emp> populateData()
	{
		HashMap<Integer,Emp> h1 = new HashMap<Integer,Emp>();
		h1.put(1,new Emp(1,"Naav","RnD",2500.34,LocalDate.parse("2019-12-01"),23.2));
		h1.put(2,new Emp(2,"Naav2","Account",1200.50,LocalDate.parse("2018-06-01"),50.4));
		h1.put(3,new Emp(3,"Naav3","Science",6540.40,LocalDate.parse("2020-08-05"),89.21));
		return h1;
	}
}