
public class FullTimeEmployee extends Employee {
	
	private double salary;

	public FullTimeEmployee(String name, int id,double salary) {
		super(name, id);
		this.salary=salary;
	}

	@Override
	public double calculateSalary() {
		
		return this.salary;
	}
	
	

}
