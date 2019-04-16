import java.util.Scanner;
class FoodMenu
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		boolean menu = true;
		int billAmount = 0;
		
		while(menu)
		{
			int choice,rate,qty;
			System.out.println("What you would like to have today");
			System.out.println("1. Dosa");
			System.out.println("2. Samose");
			System.out.println("3. MisalPav");
			System.out.println("0. Exit");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 0:
						menu = false;
						break;
				case 1:
						System.out.println("Enter Quantity");
						qty = sc.nextInt();
						rate = 10 * qty;
						System.out.println("Added to Cart: Dosa - Rs." + rate + "/- " );
						billAmount = billAmount + rate;
						break;
				case 2:
						System.out.println("Enter Quantity");
						qty = sc.nextInt();
						rate = 20 * qty;
						System.out.println("Added to Cart: Samosa - " + qty + " - " + rate + " /- " );
						billAmount = billAmount + rate;
						break;
				case 3:
						System.out.println("Enter Quantity");
						qty = sc.nextInt();
						rate = 15 * qty;
						System.out.println("Added to Cart: Misalpav - " + qty + " - " + rate + " /- " );
						billAmount = billAmount + rate;
						break;
				default:
						System.out.println("Enter Valid Choice");
			}
		}
		
		if(billAmount > 0)
				System.out.println("Total Bill Amount : Rs." + billAmount);
	}
}
