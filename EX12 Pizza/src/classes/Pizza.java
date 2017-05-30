package classes;

import java.util.Arrays;

public class Pizza {
	private String [] toppings;
	private double price;
	private PizzaSize size;
	
	public Pizza(){
		
	}
	
	public Pizza(String[] toppings, PizzaSize size){
		this.toppings = toppings;
		this.size = size;
	}
	
	public enum PizzaSize{
		SMALL(7,1),
		MEDIUM(9,1.2),
		LARGE(12,1.3),
		EXTRA_LARGE(15,1.5);
		
		private int diameter;
		private double toppingPrice;
		private PizzaSize(int diameter,double toppingPrice){
			this.diameter = diameter;
			this.toppingPrice = toppingPrice;
		}
		
		public void setDiameter(int diameter){
			this.diameter = diameter;
		}
		
		public int getDiameter(){
			return diameter;
		}
		
		public void setToppingPrice(){
			this.toppingPrice = toppingPrice;
		}
		
		public double getToppingPrice(){
			return toppingPrice;
		}
	}
	
	public double calculatePrice(){
		
		price = toppings.length * size.getToppingPrice() + size.getDiameter();
		return price; 	
	}

	public String[] getToppings() {
		return toppings;
	}

	public void setToppings(String[] toppings) {
		this.toppings = toppings;
	}

	public double getPrice() {
		return price;
	}
	
	public void setSize(PizzaSize size){
		this.size = size;
	}
	
	public void displayToppings(){
		for (String string : toppings) {
			System.out.println(string);
		}
	}

	public String toString() {
		return "Pizza [toppings=" + Arrays.toString(toppings) + ", price=" + price + ", size=" + size + "]";
	}
	
	

	
	
	
	
	
}
