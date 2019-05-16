package tester;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import org.hibernate.SessionFactory;

import dao.ICustomerDaoImpl;

import static utils.HibernateUtils.*;
import pojos.Customer;

public class RegisterCustomer {
	public static void main(String[] args)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try(SessionFactory sf = getSf(); 
				Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter customer details amt em nm pass dt role");
			Customer c1 = new Customer(sc.nextDouble(),sc.next(),sc.next(),sc.next(),sdf.parse(sc.next()),sc.next());
			ICustomerDaoImpl dao = new ICustomerDaoImpl();
			System.out.println("Reg status "+dao.registerCustomer(c1));
		}catch(Exception e)
		{
			
		}
				
	}
}
