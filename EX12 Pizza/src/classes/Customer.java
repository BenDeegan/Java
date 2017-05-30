package classes;

import java.util.Arrays;

public class Customer {
	private String name;
	private String address;
	private int phone;
	private Pizza [] pizzas;
	public Customer(){
		
	}
	
	public Customer(String name, String address, int phone, Pizza [] pizzas){
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.pizzas = pizzas;
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
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public Pizza[] getPizzas() {
		return pizzas;
	}
	public void setPizzas(Pizza[] pizzas) {
		this.pizzas = pizzas;
	}
	public double getTotalCost() {
		double total = 0;
		for (int i = 0; i < pizzas.length; i++) {
			total += pizzas[i].calculatePrice();
		}
		return total;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", phone=" + phone + ", pizzas="
				+ Arrays.toString(pizzas) + ", totalCost=" + getTotalCost() + "]";
	}
	
	
	

}
