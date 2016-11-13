package weeek2;

public class CommissionEmployee extends Employee{

	private double commissionRate;
	private double salesAmount;
	
	//constructor
	public CommissionEmployee(String name,String department,double hourRatePay,double commissionRate, double salesAmount) {
		super(name,department,hourRatePay);		
		
		this.commissionRate = commissionRate;
		this.salesAmount = salesAmount;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	public double getSalesAmount() {
		return salesAmount;
	}

	public void setSalesAmount(double salesAmount) {
		this.salesAmount = salesAmount;
	}

	//method to calculate weeklyPay
	@Override
	public double getWeeklyPay(int hoursWorked)
	{
		double payAmount = 0;
		payAmount = super.getWeeklyPay(hoursWorked) + (getCommissionRate() * getSalesAmount());
		return payAmount;
	}

}