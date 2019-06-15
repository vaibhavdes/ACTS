package dao;

import org.testng.annotations.Test;

import pojos.Vendors;
import utils.HibernateUtils;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertNotNull;

import org.hibernate.SessionFactory;
import org.testng.annotations.AfterTest;

public class DaoTest {
	
	 private VendorDaoImpl vendor;
	 private SessionFactory sf;
	  
	  @Test
	  public void f() {
	      assertNotNull(vendor.addVendor(new Vendors("rama", "ssd@fd.com","pune",343434),sf)); 
	  }
	  
	  @BeforeTest
	  public void beforeTest() {
		  vendor = new VendorDaoImpl();
		  sf = new HibernateUtils().getSf();
	  }

	  @AfterTest
	  public void afterTest() {
	  }
}
