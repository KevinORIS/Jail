package by.itstep.oris.workspace.model.entity;

public class Guard extends Human{
	private double salary;
	private double suppression;
	
	public Guard() {
		super();
		salary = 200;
		suppression = 5;
	}
	
	public Guard(String name, double salary, double suppression) {
		super(name);
		this.salary = salary;
		this.suppression = suppression;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSuppression() {
		return suppression;
	}
	
	public void setSuppression(double suppression) {
		this.suppression = suppression;
	}
	
	@Override
	public String toString() {
		return "Guard member " + super.toString() 
		 + "\nwith salary " + salary
		 + "\nwith suppression " + suppression;
	}
}
