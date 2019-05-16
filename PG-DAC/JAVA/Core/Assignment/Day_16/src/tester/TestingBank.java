package tester;

import java.util.Scanner;
import dao.BankDaoImpl;
import pojos.Bank;

public class TestingBank {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			BankDaoImpl dao = new BankDaoImpl();
			int choice = 1;
			while (choice != 0) {
				System.out.println("Enter Your Choice");
				System.out.println(
						"1. Create Account 2. Display Account Summary 3. Display Account (NRO/NRE/SAV) 0. Exit");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter Acct No, ID, Type, Bal");
					String out = dao.addAccount(new Bank(sc.nextInt(), sc.nextInt(), sc.next(), sc.nextDouble()));
					System.out.println(out);
					break;
				case 2:
					dao.getSummary().forEach(System.out::println);
					break;
				case 3:
					System.out.println("Enter Type");
					dao.getBankAccountDetails(sc.next()).forEach(System.out::println);
					break;
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
