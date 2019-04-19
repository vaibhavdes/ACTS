package Inheritance;

public abstract class Emp {
	private int id;
	private String name;
	private String email;
	private int deptId;
	private double basic;
	private static int count;
	
	static {
		count = 100;
	}
	
	public Emp(String name,String email,int deptId,double basic)
	{
		count++;
		this.id = count;
		this.name = name;
		this.email = email;
		this.deptId = deptId;
		this.basic = basic;
	}
	
	public double getBasic()
	{
		return basic;
	}

	public void setBasic(double basic)
	{
		this.basic = basic;
	}
	
	public abstract void computeNetSalary();

	@Override
	public String toString()
	{
		return "ID:" + id + " Name:" + name + " Email:" + email;
	}
	
}
