package classes;

import java.time.LocalDate;

public final class CommisionWorker extends Employee {
	private double salary;
	private double commision;
	private int quantity;
	
	public CommisionWorker(){
		super();
	}
	
	public CommisionWorker(String fName, String lName, double salary, double commision, int quantity, LocalDate dob){
		super(fName, lName, dob);
		this.salary = salary;
		this.commision = commision;
		this.quantity = quantity;
	}
	
	public double earnings(){
		double total = 0;
		for (int i = 0; i < quantity; i++) {
			double temp = salary / 100 * commision;
			total += temp;
		}
		return total/52;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getCommision() {
		return commision;
	}

	public void setCommision(double commision) {
		this.commision = commision;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String toString(){
		return "Commision Worker \n" + super.toString() + "\nWeekly Earnings : " + earnings();
	}
	
	
	

}
