package weeek2;

public class UnionEmployee extends Employee {

	private double dueAmount;

	//constructor
	public UnionEmployee(String name,String department,double hourRatePay,double dueAmount) {
		super(name,department,hourRatePay);
		
		this.dueAmount = dueAmount;
		
	}

	public double getDueAmount() {
		return dueAmount;
	}

	public void setDueAmount(double dueAmount) {
		this.dueAmount = dueAmount;
	}
	
	//method to calculate weeklyPay
	@Override
	public double getWeeklyPay(int hoursWorked)
	{
		double payAmount = 0;
		
		if(hoursWorked < 40)
		{
			payAmount = super.getWeeklyPay(hoursWorked);
		}
		else if(hoursWorked >= 40)
		{
			int extrahour = hoursWorked - 40;
			payAmount= super.getWeeklyPay(40) + (1.5 * hourRatePay * extrahour) - dueAmount;

		}
		return payAmount;
	}


}

