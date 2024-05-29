import java.util.*;

public class PayRollSystem {

	private List <Employee> emplst;

	public PayRollSystem() {
		
		emplst = new ArrayList<> ();
	}
	
	public void addEmployee(Employee emp) {
		emplst.add(emp);
	}
	
	public void removeEmployee()
	{
		int id;
		
		System.out.println("Enter the ID of the employee you want to remove");
		
		Scanner sc=new Scanner(System.in);
		id=sc.nextInt();
		
		Employee employeeToRemove = null;
		
		for(Employee emp:emplst)
		{
			if(emp.getId()==id) 
			{
				employeeToRemove=emp;	
				break;
			}
		}
		if(employeeToRemove != null)
		{
			emplst.remove(employeeToRemove);
			System.out.println("\n * Employee with Id No." + id +" REMOVED SUCCESSFULLY *");
		}
	}
	public void displayEmployee() {
		
		for(Employee emp:emplst)
		{
			System.out.println(emp);
		}
		
	}
}
