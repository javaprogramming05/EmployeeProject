package weeek2;

public class TestDriver {

	//display method
	public static void display(Employee e,int hoursWorked)
	{
	
		System.out.println("Name and Department: "+e.getNameAndDepartment());
		System.out.println("\t Weekly pay: "+e.getWeeklyPay(hoursWorked));
		
	}
	
	public static void main(String[] args) {
		       
		Employee unionemployee = new UnionEmployee("Tom Roberts","SupplyChain Dept",15.00,30.00);
		Employee commissionemployee = new CommissionEmployee("John Patrick","Marketing Dept",15.00,3.00,500.00);
		
		
		//display using union Employee object
		System.out.println("\nUNION EMPLOYEE DETAILS:\n");
		
		display(unionemployee,30);
		System.out.println("\tHours worked: 35\n");
		
		display(unionemployee,40);
		System.out.println("\tHours worked: 40\n");
		
		display(unionemployee,50);
		System.out.println("\tHours worked: 45\n");
		
		System.out.println("---------------------------------------------");
		
		//display using commission employee object
		System.out.println("COMMISSION EMPLOYEE DETAILS:\n");
		
		
		display(commissionemployee,30);
		System.out.println("\tHours worked: 35\n");
		
		display(commissionemployee,40);
		System.out.println("\tHours worked: 40\n");
		
		display(commissionemployee,50);
		System.out.println("\tHours worked: 45\n");

	}

}