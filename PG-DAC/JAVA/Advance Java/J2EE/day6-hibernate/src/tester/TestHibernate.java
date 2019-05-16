package tester;

import org.hibernate.*;
import static utils.HibernateUtils.*;

import java.text.SimpleDateFormat;

public class TestHibernate {
	public static void main(String[] args)
	{
		try(SessionFactory sf=getSf())
		{
			System.out.println("hib framework bootstrap");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
