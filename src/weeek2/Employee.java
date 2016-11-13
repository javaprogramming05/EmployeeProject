package weeek2;

public class Employee {

	 String name;
	 String department;
	 double hourRatePay;

	//constructor
	public Employee(String name, String department, double hourRatePay) {

		this.name = name;
		this.department = department;
		this.hourRatePay = hourRatePay;
	}

	//mutator methods to set department and hourRatePay
	public void setDeptartment(String department) {
		this.department = department;
	}

	public void setHourRatePay(double hourRatePay) {
		this.hourRatePay = hourRatePay;
	}
	
	//accessor method to get employee name and department
	public String getNameAndDepartment() {
		
		return  this.name + " , " + this.department;
	}
	
	//method to calculate weeklyPay
	
	public double getWeeklyPay(int hoursWorked)
	{
		double payAmount = 0;

		if(hoursWorked < 40)
		{
			payAmount = hoursWorked * this.hourRatePay;
		}
		else if(hoursWorked >= 40)
		{
			payAmount = 40 * this.hourRatePay;

		}
		return payAmount;
	}

	
}