package mains;

import classes.Cat;
import classes.Dog;
import classes.Hamster;
import classes.Owner;
import classes.Pet;
import classes.Snake;

public class TestPets {
	public static void main(String[] args) {
		Cat c1 = new Cat("Whiskers", "CatsHaveBreeds?", 6, true, 8);
		Cat c2 = new Cat("Ears", "Hairless?", 2, false, 5);
		
		Dog d1 = new Dog("Snoop Dogg", "Mixed", 12, true, 12345, true);
		Dog d2 = new Dog("Spot", "Dalmation", 3, true, 2234325, true);
		
		Hamster h1 = new Hamster("Hayden", "dwarf", 1, true);
		
		Snake s1 = new Snake("sssssss", "Tree Snake", 2, false);
		
		Pet[] pets1 = new Pet[]{c1,d1,h1};
		Pet[] pets2 = new Pet[]{c2,d2,s1};
		
		Owner o1 = new Owner("Ben", "Finglas", 911, pets1);
		Owner o2 = new Owner("Jim", "Oaklahoma", 999, pets2);
		Owner [] owners = new Owner[]{o1,o2};
		for (int i = 0; i < owners.length; i++) {
			System.out.print(owners[i].makeCatWalk());
			System.out.print(owners[i].makeDogWalk());
			
		}
	}

}
