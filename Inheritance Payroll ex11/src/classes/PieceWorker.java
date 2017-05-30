package classes;

import java.time.LocalDate;

public final class PieceWorker extends Employee{
	private double wage;
	private int quantity;
	
	public PieceWorker(){
		super();
	}
	
	public PieceWorker(String fName, String lName, double wage, int quantity, LocalDate dob){
		super(fName,lName,dob);
		this.wage = wage;
		this.quantity = quantity;
	}
	
	public double earnings(){
		return wage * quantity;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String toString(){
		return "Piece Worker\n" + super.toString() + "\nEarnings : " + earnings();
	}
}
