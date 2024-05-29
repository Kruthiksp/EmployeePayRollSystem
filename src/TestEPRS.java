
public class TestEPRS {

	public static void main(String[] args) {
		
		PayRollSystem p=new PayRollSystem();
		FullTimeEmployee emp1 = new FullTimeEmployee("virat",18,80000);
		PartTimeEmployee emp2 = new PartTimeEmployee("dhoni",7,4,650,26);
		
		p.addEmployee(emp1);
		p.addEmployee(emp2);
		
		System.out.println("*** CURRENT EMPLOYEES *** \n");
		p.displayEmployee();
		
		System.out.println("\n *** REMOVING AN EMPLOYEE ***");
		p.removeEmployee();
		
		System.out.println("\n *** REMAINING EMPLOYEES ***");
		p.displayEmployee();
	}
}
