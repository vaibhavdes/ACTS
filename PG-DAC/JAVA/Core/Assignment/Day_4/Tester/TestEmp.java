package Tester;
import Inheritance.*;
import java.util.Scanner;

public class TestEmp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean menu = false;
		int option;
		int counter = 0;
		System.out.println("Enter Number of Employees");
		Emp[] e1 = new Emp[sc.nextInt()];
		
		while(!menu)
		{
			System.out.println("1. Hire Manager 2. Hire Worker 3. Display All Employees 4. View Employee 5. Fire Employee 6. Salary Increment");
			option = sc.nextInt();
			
			switch(option)
			{
			case 1:
					if(counter < e1.length)
					{
						System.out.println("Enter name, email, deptId, basic, perfBonus");
						e1[counter] = new Mgr(sc.next(),sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextInt());
						e1[counter].computeNetSalary();
						System.out.println();
						counter++;
					}
					break;
			case 2:
					if(counter < e1.length)
					{
						System.out.println("Enter name, email, deptId, basic, perfBonus");
						e1[counter] = new Worker(sc.next(),sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextInt(),sc.nextInt());
						e1[counter].computeNetSalary();
						System.out.println();
						counter++;
					}
					break;
			case 3:
					for(Emp e : e1)
					{	
						if(e!=null)
						{
							System.out.println(e);
							e.computeNetSalary();
							System.out.println();
						}						
					}
					break;
			case 4:
					int temp;
					System.out.println("Enter Number to See Details");
					temp = sc.nextInt() - 1;
					if(temp < e1.length && counter!=0)
					{
							System.out.println(e1[temp]);
					}
					else
					{
							System.out.println("Invalid Option or User Not Exist");
					}
					break;
			case 5:
					int temp1;
					System.out.println("Enter Number to Fire");
					temp1 = sc.nextInt() - 1;
					if(temp1 < e1.length && counter!=0)
					{
							System.out.println("Employee Deleted");
							e1[counter] = null;
							counter--;
					}
					else
					{
							System.out.println("Invalid Option User Not Exist");
					}
					break;
			case 6:
					int temp11;
					System.out.println("Enter Number to Increment Salary");
					temp11 = sc.nextInt() - 1;
					if(temp11 < e1.length && counter!=0)
					{
							System.out.println("Enter New Salary");
							e1[counter].setBasic(sc.nextDouble());
					}
					else
					{
							System.out.println("Invalid Option User Not Exist");
					}
					break;
			case 7:
					menu = true;
			}
		}
		
		if(sc!=null)
			sc.close();
		
	}

}
