package dao;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import static utils.HibernateUtils.*;

import java.util.ArrayList;
import java.util.List;

import pojos.Vendor;

public class VendorDaoImpl implements VendorDao {

	@Override
	public String registerVendor(Vendor v) {
		Session sf = getSf().openSession();
		Transaction tx = sf.beginTransaction();
		try {
			sf.persist(v);
			tx.commit();
		}catch(HibernateException e)
		{
			if(tx != null)
				tx.rollback();
			return "failure";
		}finally {
			if(sf!=null)
				sf.close();
		}
		return "success";
	}

	@Override
	public String updateVendor(int id, String city, String cell_no) {
		Session sf = getSf().getCurrentSession();
		Transaction tx = sf.beginTransaction();
		Vendor v = null;
		try {
			v = sf.get(Vendor.class, id);
			if(v != null) {
				v.setCity(city);
				v.setCell_no(cell_no);
			}
			tx.commit();
		}catch(HibernateException e)
		{
			if(tx != null)
				tx.rollback();
			return "failure";
		}finally {
			if(sf!=null)
				sf.close();
		}
		return "success";
	}

	@Override
	public String deleteVendor(int id) {
		Session sf = getSf().getCurrentSession();
		Transaction tx = sf.beginTransaction();
		Vendor v = null;
		try {
			v = sf.get(Vendor.class, id);
			if(v != null)
				sf.delete(v);
			tx.commit();
		}catch(HibernateException e)
		{
			if(tx != null)
				tx.rollback();
			return "failure";
		}finally {
			if(sf!=null)
				sf.close();
		}
		return "success";
	}

	@Override
	public List<Vendor> getAllVendors(){
		String jpql = "select v from Vendor v";
		List<Vendor> vlist = null;
		Session sf = getSf().getCurrentSession();
		Transaction tx = sf.beginTransaction();
		try {
			vlist = sf.createQuery(jpql, Vendor.class).getResultList();
			tx.commit();
		}catch(HibernateException e)
		{
			if(tx != null)
				tx.rollback();
			return null;
		}finally {
			if(sf!=null)
				sf.close();
		}
		return vlist;
	}


}

