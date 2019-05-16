package tester;

import java.time.LocalDate;
import java.util.Scanner;
import static utils.HibernateUtils.*;

import org.hibernate.SessionFactory;

import dao.VendorDaoImpl;
import pojos.Vendor;
import pojos.VendorType;

public class RegisterVendor {
	public static void main(String[] args) {
		try(SessionFactory sf = getSf();
				Scanner sc = new Scanner(System.in)){
			
			System.out.println("Enter Vendor Details : email,name,city,cell,regAmt,regDate,role");
			VendorDaoImpl dao = new VendorDaoImpl();
			
			Vendor vendor = new Vendor(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),LocalDate.parse(sc.next()),VendorType.valueOf(sc.next().toUpperCase()));
			System.out.println(dao.registerVendor(vendor));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
