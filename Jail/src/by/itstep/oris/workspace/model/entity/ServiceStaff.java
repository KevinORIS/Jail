package by.itstep.oris.workspace.model.entity;

public class ServiceStaff extends Human {
	private double salary;

	public ServiceStaff() {
		super();
		salary = 100;
	}

	public ServiceStaff(String name, double salary) {
		super(name);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Service member " + super.toString() 
			 + " with salary " + salary;
	}
}
