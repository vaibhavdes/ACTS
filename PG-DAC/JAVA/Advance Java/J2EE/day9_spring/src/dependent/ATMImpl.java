package dependent;

import dependency.Transport;

public class ATMImpl implements ATM {
	private Transport transport;
	
	public ATMImpl()
	{
		System.out.println("in constr " + getClass().getName());
	}
	
	@Override
	public void withdrawn(double amt) {
		// TODO Auto-generated method stub
		byte[] data = ("withdrawn " + amt).getBytes();
		transport.informBank(data);
	}

	@Override
	public void deposit(double amt) {
		// TODO Auto-generated method stub
		byte[] data = ("deposit " + amt).getBytes();
		transport.informBank(data);		
	}

	public void setTransport(Transport myTransport)
	{
		this.transport = myTransport;
	}
}
