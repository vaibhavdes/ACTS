package pojos;

public class Bank {
	private int actNo;
	private int id;
	private String type;
	private double bal;
	
	public Bank(int actNo,int id,String type,double bal)
	{
		this.actNo = actNo;
		this.id = id;
		this.type = type;
		this.bal = bal;
	}

	public int getActNo() {
		return actNo;
	}

	public void setActNo(int actNo) {
		this.actNo = actNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public double getBal() {
		return bal;
	}


	public void setBal(double bal) {
		this.bal = bal;
	}


	@Override
	public String toString() {
		return "Bank [actNo=" + actNo + ", id=" + id + ", type=" + type + ", bal=" + bal + "]";
	}
	
}
