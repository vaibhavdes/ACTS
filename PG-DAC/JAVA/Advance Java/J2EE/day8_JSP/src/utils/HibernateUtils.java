package utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.*;

public class HibernateUtils {
	private static SessionFactory sf;
	static {
		System.out.println("in hiberutils");
		try {
			StandardServiceRegistry reg = new StandardServiceRegistryBuilder().configure().build();
			sf= new MetadataSources(reg).buildMetadata().buildSessionFactory();
			System.out.println("sf created");			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static SessionFactory getSf() {
		return sf;
	}
}
