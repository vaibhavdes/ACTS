package tester;
import java.util.Scanner;
import com.cdac.core.Student;

class TestStudent2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Student[] s;
		System.out.println("Enter Number of Students");
		s = new Student[sc.nextInt()];
		double highGPA = 0;
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Enter Name - Email - Age");
			s[i] = new Student(sc.next(),sc.next(),sc.nextInt());
			System.out.println("Enter Quiz Score - Test Score - Assignment Score");
			s[i].computeGPA(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());

		}
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Student Info " + s[i].getDetails());
		}
				
		System.out.println("Enter Student To with you want to compare whom ");
		
		if(s[sc.nextInt()].getGPA()  > s[sc.nextInt()].getGPA() )
			System.out.println("First Student Has greater");
		else
			System.out.println("Second Student has greater");
		
		for(int i=0;i<s.length;i++)
		{
			if( s[i].getGPA > highGPA)
				highGPA = s[i].getGPA;
		}
		System.out.println("Highest Score is " + highGPA);
		
		if(sc!=null)
			sc.close();
	}
}
