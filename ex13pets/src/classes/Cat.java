package classes;

public class Cat extends Pet implements Mammal{
	private int numOfLives;

	public Cat() {
		super();
	}

	public Cat(String name, String breed, int age, boolean isMale, int numOfLives) {
		super(name, breed, age, isMale);
		this.numOfLives = numOfLives;
	}
	
	public String walk(){
		return "The cat " + getName() + " is walking";
	}
	public String sleep(){
		return "The cat " + getName() + " is sleeping";
	}
	
	
	public int lostLife(){
		numOfLives--;
		return numOfLives;
	}

	public int getNumOfLives() {
		return numOfLives;
	}

	public void setNumOfLives(int numOfLives) {
		this.numOfLives = numOfLives;
	}

	public String toString() {
		return "Cat [numOfLives=" + numOfLives + ", getName()=" + getName() + ", getBreed()=" + getBreed()
				+ ", getAge()=" + getAge() + ", isMale()=" + isMale() + "]";
	}
	
	
	
	

}
