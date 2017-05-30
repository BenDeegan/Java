package classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Employee {
	private String fName;
	private String lName;
	private LocalDate dob;
	
	public Employee(){
		
	}
	
	public Employee(String fName, String lName, LocalDate dob){
		this.fName = fName;
		this.lName = lName;
		this.dob = dob;
	}
	
	public void setFName(String fName){
		this.fName = fName;	
	}
	public String getFName(){
		return fName;
	}
	public void  setLName(String lName){
		this.lName = lName;
	}
	public String getLName(){
		return lName;
	}
	public LocalDate getDob(){
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public abstract double earnings();
	
	public String toString(){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "Employee Name = " + fName + " " + lName +
				"\nDate of Birth :  " +   dob.format(formatter);
		
	}

}
