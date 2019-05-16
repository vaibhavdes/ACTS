package tester;

import static utils.HibernateUtils.getSf;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.VendorDaoImpl;

public class VendorDetail {
	public static void main(String[] args) {
		try (SessionFactory sf = getSf(); Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Vendor id");
			VendorDaoImpl dao = new VendorDaoImpl();
			System.out.println("Vendor dtls " + dao.getVendorDetails(sc.nextInt()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
