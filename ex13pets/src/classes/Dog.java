package classes;

public class Dog extends Pet  implements Mammal{
	private int microChipNumber;
	private boolean isMicroChipped;
	
	public Dog() {
		super();
	}
	public Dog(String name, String breed, int age, boolean isMale, int microChipNumber, boolean isMicroChipped) {
		super(name, breed, age, isMale);
		this.microChipNumber = microChipNumber;
		this.isMicroChipped = isMicroChipped;
	}
	
	public String walk(){
		return "The dog " + getName() + "is walking";
	}
	
	public String sleep(){
		return "The dog " + getName() + "is sleeping";
	}
	public int getMicroChipNumber() {
		return microChipNumber;
	}
	public void setMicroChipNumber(int microChipNumber) {
		this.microChipNumber = microChipNumber;
	}
	public boolean isMicroChipped() {
		return isMicroChipped;
	}
	public void setMicroChipped(boolean isMicroChipped) {
		this.isMicroChipped = isMicroChipped;
	}
	public String toString() {
		return "Dog [microChipNumber=" + microChipNumber + ", isMicroChipped=" + isMicroChipped + ", getName()="
				+ getName() + ", getBreed()=" + getBreed() + ", getAge()=" + getAge() + ", isMale()=" + isMale() + "]";
	}
	
	
	
	

}
