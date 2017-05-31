package classes;

public class Snake extends Pet{

	public Snake() {
		super();
	}

	public Snake(String name, String breed, int age, boolean isMale) {
		super(name, breed, age, isMale);
	}

	public String toString() {
		return "Snake [getName()=" + getName() + ", getBreed()=" + getBreed() + ", getAge()=" + getAge() + ", isMale()="
				+ isMale() + "]";
	}
	
	
	

}
