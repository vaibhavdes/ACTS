package tester;

import static utils.HibernateUtils.getSf;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.VendorDaoImpl;

public class VendorProfileSet {
	public static void main(String[] args) {
		try (SessionFactory sf = getSf(); Scanner sc = new Scanner(System.in)) {
			VendorDaoImpl dao = new VendorDaoImpl();
			System.out.println("Enter File Path& Vendor id");
			System.out.println(dao.setProfileImage(sc.next(), sc.nextInt()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
