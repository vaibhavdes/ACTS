package tester;

import static utils.HibernateUtils.getSf;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.VendorDaoImpl;

public class VendorProfileGet {
	public static void main(String[] args) {
		try (SessionFactory sf = getSf(); Scanner sc = new Scanner(System.in)) {
			VendorDaoImpl dao = new VendorDaoImpl();
			System.out.println("Enter File Location to Store & Vendor id");
			System.out.println( dao.getProfileImage(sc.next(), sc.nextInt()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
