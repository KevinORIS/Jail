package by.itstep.oris.workspace.model.entity;

public class ServiceStaff extends Human {
	private double salary;
	private double serviceSpeed;
	
	public ServiceStaff() {
		super();
		salary = 100;
		serviceSpeed = 1;
	}

	public ServiceStaff(String name, double salary, double serviceSpeed) {
		super(name);
		this.salary = salary;
		this.serviceSpeed = serviceSpeed;
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
			 + "\nwith salary " + salary
			 + "\nwith service speed " + serviceSpeed;
	}
}
