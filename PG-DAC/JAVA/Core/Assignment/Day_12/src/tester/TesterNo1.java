package tester;

import static utils.CollectionUtils.populateData;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import com.app.core.Student;

public class TesterNo1 {
	public static void main(String[] args) {
		HashMap<Integer,Student> hm = populateData();
		//hm.forEach((k,v)->System.out.println(v));
		
		List<Student> list = new ArrayList<>(hm.values());
		//System.out.println(list);
		/*for(Student s:list)
		*	System.out.println(s);
		*/
		
		//list.stream().forEach(i->System.out.println(i));			//Sequential
		//list.parallelStream().forEach(i->System.out.println(i));			//Parallel / Concurrent

		//double avg = list.stream().filter(i->i.getSubject().equals("Java")).mapToDouble(j->j.getGpa()).average().getAsDouble();
		//System.out.println(avg);
		
		//LocalDate date = LocalDate.now();
		//list.stream().filter(i->i.getDob().until(date,ChronoUnit.YEARS) > 23).forEach(i->System.out.println(i));
	
		//Comparator<Student> cmp = (s1,s2)->s1.getDob().compareTo(s2.getDob());
		Comparator<Student> cmp = (s1,s2)->s2.getDob().compareTo(s1.getDob());
		list.stream().sorted(cmp).forEach(i->System.out.println(i));

	}
}
