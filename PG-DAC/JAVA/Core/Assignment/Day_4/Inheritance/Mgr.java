package Inheritance;

public class Mgr extends Emp{
	private int perfBonus;
	
	public Mgr(String name,String email,int deptId,double basic,int perfBonus)
	{
		super(name,email,deptId,basic);
		this.perfBonus = perfBonus;
	}
	
	public void computeNetSalary()
	{
		System.out.println("Sal: " + super.getBasic() + perfBonus);
	}
	
	@Override
	public String toString()
	{
		return "Details " + super.toString() + " PerfBonus:" + perfBonus;
	}
}
