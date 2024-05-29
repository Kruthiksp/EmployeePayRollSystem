
public class PartTimeEmployee extends Employee {
	
	private int workingHours;
	private double paymentPerHour;
	private int workingDays;
	
	public PartTimeEmployee(String name, int id, int workingHours, double paymentPerHour,int workingDays) {
		super(name, id);
		this.workingHours = workingHours;
		this.paymentPerHour = paymentPerHour;
		this.workingDays = workingDays;
	}


	@Override
	public double calculateSalary() {
		
		return workingHours * paymentPerHour * workingDays;
	}
	
	

}
