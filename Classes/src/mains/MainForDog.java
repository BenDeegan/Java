package mains;

import exercises5.Dog;

public class MainForDog {
	public static void main(String[] args) {
		Dog d1 = new Dog("Dalmation","brown", "Bob");
		System.out.println(d1.toString());
		
		Dog d2 = new Dog();
		d2.setBreed("Mixed");
		System.out.println(d2.toString());
		
		Dog d3 = new Dog();
		d3.setColour("red");
		System.out.println(d3.toString());
	}
	


}
