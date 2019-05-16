package utils;

import java.util.HashMap;
import static java.time.LocalDate.now;
import static java.time.LocalDate.of;
import static java.time.LocalDate.parse;
import com.app.core.*;
public class CollectionUtils {

	public static HashMap<Integer,Student> populateData(){
		HashMap<Integer,Student> map = new HashMap<>();
		map.put(10, new Student(10,"abc@gmail.com",96.25,"Java",parse("1990-04-12")));
		map.put(11, new Student(11,"xyz@gmail.com",81.63,"Java",now()));
		map.put(23, new Student(23,"hen@gmail.com",76.42,"CPP",of(2012,05,12)));
		map.put(25, new Student(25,"oio@gmail.com",54.45,"CPP",of(2011,12,24)));
		map.put(31, new Student(31,"wer@gmail.com",68.21,"JAVA",of(2011,11,24)));
		return map;
	}
}
