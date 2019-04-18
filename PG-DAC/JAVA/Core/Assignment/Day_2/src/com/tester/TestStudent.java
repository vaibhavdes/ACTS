package tester;
import java.util.Scanner;
import com.cdac.core.Student;

class TestStudent
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Student s1,s2;
		double res1,res2;
		
		System.out.println("Enter Name - Email - Age");
		s1 = new Student(sc.next(),sc.next(),sc.nextInt());
		System.out.println("Enter Name - Email - Age");
		s2 = new Student(sc.next(),sc.next(),sc.nextInt());
		
		System.out.println("Student Info " + s1.getDetails());
		System.out.println("Student Info " + s2.getDetails());
		
		System.out.println("Enter Quiz Score - Test Score - Assignment Score");
		res1 = s1.computeGPA(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());	
		
		System.out.println("Enter Quiz Score - Test Score - Assignment Score");
		res2 = s2.computeGPA(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
	
		if(sc!=null)
			sc.close();
	}
}
