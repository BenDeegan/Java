package classes;

import javax.swing.JOptionPane;

public class BankAcc {
	private String name;
	private String address;
	private int accNum;
	private double bal;
	public static final float interestR = 2f;
	public static int counter = 1000;
	
	public BankAcc(){
		accNum+=counter;
		counter++;
	}
	
	public BankAcc(String name, String address){
		this();
		setName(name);
		setAddress(address);
	}
	
	public double deposit(double depo){
		bal += depo;
		return bal;
	}
	
	public void withdraw(double wit){
		if(bal < wit){
			JOptionPane.showMessageDialog(null, "Not enough balance");
		} else {
			bal -= wit;
			JOptionPane.showMessageDialog(null, "New balance: " + bal);
		}
	}
	
	public double interest(){
		double temp  = (bal * interestR) /100;
		bal += temp;
		return bal;
	}
	
	public void withdrawAll(){
		JOptionPane.showMessageDialog(null, "You just withdrew" + bal);
		bal -= bal;
		JOptionPane.showMessageDialog(null, "New balance : " + bal);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAccNum() {
		return accNum;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	public static float getInterestR() {
		return interestR;
	}
	public static int getCounter() {
		return counter;
	}

	
	public String toString() {
		return "BankAcc #" + accNum +  "[name=" + name + ", address=" + address + ", accNum=" + accNum + ", bal=" + bal + "]";
	}
	
	
	
	

}
