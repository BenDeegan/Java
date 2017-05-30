package classes;

import java.time.LocalDate;

public final class HourlyWorker extends Employee{
	private double wage;
	private int hoursWorked;
	
	public HourlyWorker(){
		super();
	}
	
	public HourlyWorker(String fName, String lName, double wage, int hoursWorked, LocalDate dob){
		super(fName , lName, dob);
		this.wage = wage;
		this.hoursWorked = hoursWorked;
	}
	
	public double earnings(){
		return wage * hoursWorked;
	}
	
	public double getWage(){
		return wage;
	}
	
	public void setWage(double wage){
		this.wage = wage;
	}
	
	public int getHoursWorked(){
		return hoursWorked;
	}
	
	public void setHoursWorked(int hoursWorked){
		this.hoursWorked = hoursWorked;
	}
	
	public String toString(){
		return "Hourly Worker\n" + super.toString() + "\nEarnings : " + earnings();
	}
}
