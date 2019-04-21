package stack;

public class Emp
{
	private int id;
	private String name;
	
	Emp(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString()
	{
		return "ID:" + id + " Name:" + name;
		
	}
}
