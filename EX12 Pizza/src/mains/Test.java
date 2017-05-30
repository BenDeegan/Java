package mains;

import classes.Customer;
import classes.Pizza;
import classes.Pizza.PizzaSize;

public class Test {

	public static void main(String[] args) {
		Pizza p1 = new Pizza(new String []{"Cheese", "Peperoni", "Ham"}, PizzaSize.LARGE);
		
		Pizza p2 = new Pizza(new String []{"Cheese", "Peperoni", "Ham", "Pineapple"}, PizzaSize.SMALL);
		Pizza p3 = new Pizza(new String []{"Cheese", "Peperoni", "Ham", "Olives"}, PizzaSize.MEDIUM);
		Pizza p4 = new Pizza(new String []{"Cheese", "Peperoni", "Ham", }, PizzaSize.EXTRA_LARGE);
		
		Customer c1 = new Customer("Ben", "Finglas",01, new Pizza[]{p1,p2});
		Customer c2 = new Customer("Didier", "Vancouver",911, new Pizza[]{p3,p4});
		
		System.out.println();
		
		Customer [] customers = new Customer []{c1,c2};
		for (Customer customer : customers) {
			
			System.out.println(customer.getTotalCost());
				
			}
		}
	}
		


