package utils;

import cust_exception.EmpCustomException;

public class ValidationUtils {
	
	private static int MIN_LENGTH;
	private static int MAX_LENGTH;
	
	static 
	{
		MIN_LENGTH = 5;
		MAX_LENGTH = 10;
	}
	public static void checkEmail(String email) throws EmpCustomException
	{
		if(email.length() > MIN_LENGTH && email.length() < MAX_LENGTH)
		{
			throw new EmpCustomException("Google cha Ceo ka tu Chota Email Asayala");
		}
		else if(!email.contains("@"))
		{
			throw new EmpCustomException("@ tak re");
		}
	}
	
	public static void checkSal(double basic) throws EmpCustomException {
		if(basic % 1000 !=0) {
			throw new EmpCustomException("1000 cha table yeto ka?");
		}
	}
	
	public static void chechDept(String deptId) throws EmpCustomException {
		if(!deptId.matches("Sales|HR|RND|Marketing"))
			throw new EmpCustomException("He department nahi ikde");
	}

}
