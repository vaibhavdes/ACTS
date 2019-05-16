package dao;

import pojos.Customer;
import org.hibernate.*;
import static utils.HibernateUtils.*;

public class ICustomerDaoImpl implements ICustomerDao {

	@Override
	public String registerCustomer(Customer c) {
		//hib Session From SessionFactory
		Session hs = getSf().openSession();
		//begin transaction
		Transaction tx = hs.beginTransaction();
		try {
			hs.save(c);
			tx.commit();
		}catch(HibernateException e) {
			//tx failed ... rollback tx
			if(tx != null)
					tx.rollback();
			throw e;
		}finally {
			if(hs!=null)
				hs.close();
		}
		return "customer regd succesfully ID " + c.getId();
	}

}
