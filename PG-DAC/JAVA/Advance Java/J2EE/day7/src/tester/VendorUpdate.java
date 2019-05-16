package tester;

import static utils.HibernateUtils.getSf;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.VendorDaoImpl;

public class VendorUpdate {
	public static void main(String[] args) {
		try (SessionFactory sf = getSf(); Scanner sc = new Scanner(System.in)) {
			VendorDaoImpl dao = new VendorDaoImpl();
			System.out.println("Enter Vendor id, City and Cell No");
			System.out.println("Updated dtls " + dao.updateVendorDetails(sc.nextInt(), sc.next(), sc.next()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
