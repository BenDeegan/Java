package classes;

public class Shape {
	private String colour;
	public Shape(){
		
	}
	
	public String draw(){
		return "Printing a shape!";
	}
	
	public Shape(String colour){
		this.colour = colour;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Shape [colour=" + colour + "]";
	}
	
	
}
