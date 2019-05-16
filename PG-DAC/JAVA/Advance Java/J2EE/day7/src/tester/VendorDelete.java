package tester;

import static utils.HibernateUtils.getSf;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.VendorDaoImpl;

public class VendorDelete {
	public static void main(String[] args) {
		try (SessionFactory sf = getSf(); Scanner sc = new Scanner(System.in)) {
			VendorDaoImpl dao = new VendorDaoImpl();
			System.out.println("Enter Vendor id,");
			System.out.println("Status: " + dao.deleteVendor(sc.nextInt()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
