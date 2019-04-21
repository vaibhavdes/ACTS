package stack;

public class FixedStack implements Stack
{
	private int top;
	private Emp[] e;
	
	public FixedStack(){
		this.top = -1;
		e = new Emp[SIZE];
	}
	
	@Override
	public void push(Emp temp)
	{
		if(this.top < SIZE)
			e[++top] = temp;	
		else
			System.out.println("Khatam");
	}
	@Override
	public Emp pop()
	{
		if(this.top != -1)
			return e[top--];
		else
			System.out.println("Picture Abhi Baki hai");
		
		return null;
	}
}
