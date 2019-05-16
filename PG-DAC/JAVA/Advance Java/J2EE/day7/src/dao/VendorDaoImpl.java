package dao;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import static org.apache.commons.io.FileUtils.*;
import static utils.HibernateUtils.*;
import pojos.Vendor;

public class VendorDaoImpl implements VendorDao {

	@Override
	public String registerVendor(Vendor v) {
		Session sf = getSf().openSession(); // create new session
		Transaction tx = sf.beginTransaction();
		try {
			sf.save(v); // Insert Operation
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback(); // if operation fails
			throw e;
		} finally {
			if (sf != null)
				sf.close(); // openSession is not auto-closable
		}
		return "Vendor Reged with ID " + v.getId();
	}

	@Override
	public Vendor getVendorDetails(int id) {
		Session sf = getSf().getCurrentSession(); // get previous session

		Vendor v = null;
		Transaction tx = sf.beginTransaction();
		System.out.println("open " + sf.isOpen() + " connected " + sf.isConnected());
		try {
			v = sf.get(Vendor.class, id); // SELECT
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		System.out.println("open " + sf.isOpen() + " connected " + sf.isConnected());

		return v;
	}

	@Override
	public List<Vendor> getVendorsDetails() {
		String jpql = "select v from Vendor v";
		Session sf = getSf().getCurrentSession();
		Transaction tx = sf.beginTransaction();
		List<Vendor> list = null;
		try {
			list = sf.createQuery(jpql, Vendor.class).getResultList(); // SELECT *
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return list;
	}

	@Override
	public String updateVendorDetails(int id, String city, String cell_no) {
		Session sf = getSf().getCurrentSession(); // create new session
		Transaction tx = sf.beginTransaction();
		Vendor v = null;
		try {
			v = sf.get(Vendor.class, id);
			if (v != null) {
				v.setCell_no(cell_no);
				v.setCity(city);
			}
			tx.commit(); // Check whether operation changes reflected in table
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback(); // if operation fails
			throw e;
		} finally {
			if (sf != null)
				sf.close(); // openSession is not auto-closable
		}
		return "Vendor Details Updated with ID " + v.getId();
	}

	@Override
	public String deleteVendor(int id) {
		String jpql = "delete Vendor v where v.id :id";
		Session sf = getSf().getCurrentSession();
		Transaction tx = sf.beginTransaction();
		int deleteCount;
		try {
			deleteCount = sf.createQuery(jpql, Vendor.class).setParameter("id", id).executeUpdate();
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return "deleted " + deleteCount + " user";
	}

	@Override
	public String setProfileImage(String fileName, int id) {
		String mesg = "File stored successfully";
		File file = new File(fileName);
		if (file.exists() && file.isFile() && file.canRead()) {
			Session hs = getSf().getCurrentSession();
			Transaction tx = hs.beginTransaction();
			try {
				Vendor v = hs.get(Vendor.class, id);
				if (v != null)
					v.setProfileImage(readFileToByteArray(file));
				else
					mesg = "File storing failed : invalid customer id";
				tx.commit();// update
			} catch (HibernateException e) {
				if (tx != null)
					tx.rollback();
				throw e;
			} catch (IOException e) {
				System.out.println("err in storing image " + e);
			}
		}
		return mesg;
	}

	@Override
	public String getProfileImage(String fileName, int id) {
			String mesg = "Image restored from DB successfully";
			File file = new File(fileName);	
			Session hs = getSf().getCurrentSession();
			Transaction tx = hs.beginTransaction();
			try {
				Vendor v = hs.get(Vendor.class, id);
				if (v != null)
					writeByteArrayToFile(file,v.getProfileImage());
				else
					mesg = "File storing failed : invalid customer id";
				tx.commit();// update
			}catch (HibernateException e) {
				if (tx != null)
					tx.rollback();
				throw e;
			} catch (IOException e) {
				System.out.println("err in storing image " + e);
			}
	return null;
	}
}

