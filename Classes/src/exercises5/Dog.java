package exercises5;

public class Dog {
	private String breed;
	private String colour;
	private String ownerName;
	

	public Dog(){
		
	}
	
	public Dog(String breed, String colour, String ownerName){
		this.breed = breed;
		this.colour = colour;
		this.ownerName = ownerName;
	}
	
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	
	public String toString() {
		return "MainForDog [breed=" + breed + ", colour=" + colour + ", ownerName=" + ownerName + "]";
	}


}
