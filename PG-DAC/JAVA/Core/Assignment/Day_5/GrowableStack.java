package stack;

public class GrowableStack implements Stack
{
	private int top;
	private Emp[] e;
	
	public GrowableStack(){
		this.top = -1;
		e = new Emp[SIZE];
	}
	
	@Override
	public void push(Emp temp)
	{
		if(this.top < SIZE)
			e[++top] = temp;	
		else
		{
			Emp[] newTemp = new Emp[e.length * 2];
			for(int i=0;i<e.length; i++)
			{
				newTemp[i] = e[i];
			}
			e = newTemp;
			e[++top] = temp;
		}
	}
	
	@Override
	public Emp pop()
	{
		if(this.top != -1)
			return e[top--];
		else
			System.out.println("Shuru Nahi Hua");
		return null;
	}
}
