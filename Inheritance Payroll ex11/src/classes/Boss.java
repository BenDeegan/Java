package classes;

import java.time.LocalDate;

public final class Boss extends Employee {
	private double weeklySalary;
	
	public Boss(){
		super();
	}
	
	public Boss(double weeklySalary, String fName, String lName, LocalDate dob){
		super(fName,lName,dob);
		this.weeklySalary = weeklySalary;
	}
	@Override
	public double earnings(){
		return weeklySalary;
		
	}
	
	public void setWeeklySalary(double weeklySalary){
		this.weeklySalary = weeklySalary;
	}
	public double getWeeklySalary(){
		return weeklySalary;
	}
	
	public String toString(){
		return "Employee type : Boss \n" + super.toString() + " \nEarnings : " + earnings();
	}

}
