package stack;

import java.util.Scanner;

public class Tester{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		boolean menu = false;
		int option;
		Stack st = null;
		while(!menu)
		{
			System.out.println("Enter Choice: 1.Fixed | 2. Growable | 3.Push | 4.Pop | 5.Exit");
			option = sc.nextInt();
			
			switch(option)
			{
				case 1:
					st = new FixedStack();
					break;
				case 2:
					st = new GrowableStack();
					break;
				case 3:
					if(st!=null)
					{	
						System.out.println("Enter Id and Name");
						Emp e = new Emp(sc.nextInt(),sc.next());
						st.push(e);
					}
					break;
				case 4:
					if(st!=null)
					{	
						Emp temp;
						temp = st.pop();
						if(temp!=null)
							System.out.println(temp);
					}
					break;
				case 5:
					menu = true;
					break;					
			}
		}
		
		sc.close();
	}
}
