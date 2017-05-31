package classes;

public class Hamster extends Pet{

	public Hamster() {
		super();
	}

	public Hamster(String name, String breed, int age, boolean isMale) {
		super(name, breed, age, isMale);
	}

	public String toString() {
		return "Hamster [getName()=" + getName() + ", getBreed()=" + getBreed() + ", getAge()=" + getAge()
				+ ", isMale()=" + isMale() + "]";
	}
	
	
	

}
