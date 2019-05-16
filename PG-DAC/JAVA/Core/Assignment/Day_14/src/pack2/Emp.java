package pack2;

import java.io.Serializable;
import java.time.LocalDate;

public class Emp implements Serializable{
	private int id;// unique ID
	private String  name,dept;
	private double salary;
	private LocalDate hireDate;
	private double performanceIndex;
	public Emp(int id, String name, String dept, double salary, LocalDate hireDate, double performanceIndex) {
		super();
		this.id = id;
		this.dept = dept;
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
		this.performanceIndex = performanceIndex;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", dept=" + dept + ", name=" + name + ", salary=" + salary + ", hireDate=" + hireDate
				+ ", performanceIndex=" + performanceIndex + "]";
	}
	public int getId() {
		return id;
	}
	public String getDept() {
		return dept;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public double getPerformanceIndex() {
		return performanceIndex;
	}
	

}
