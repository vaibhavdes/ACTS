package tester;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dependent.ATMImpl;

public class Tester {
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext ctx=
				new ClassPathXmlApplicationContext
				("spring_conf.xml"))
		{
			ATMImpl ref1=ctx.getBean("my_atm", ATMImpl.class);
			ref1.withdrawn(100);
			ATMImpl ref2=ctx.getBean("my_atm", ATMImpl.class);
			System.out.println(ref1==ref2);
	
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
