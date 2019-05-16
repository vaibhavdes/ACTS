package tester;

import static utils.HibernateUtils.getSf;
import org.hibernate.SessionFactory;
import dao.VendorDaoImpl;

public class VendorsList {
	public static void main(String[] args) {
		try (SessionFactory sf = getSf();) {
			VendorDaoImpl dao = new VendorDaoImpl();
			System.out.println("Details");
			dao.getVendorsDetails().forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
