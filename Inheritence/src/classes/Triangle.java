package classes;

public class Triangle extends Shape {
	
	public Triangle(){
		
	}
	
	@Override
	public String draw(){
		return "Drawing a triangle";
	}
	public Triangle(String colour) {
		super(colour);
	}

	@Override
	public String toString() {
		return "Triangle [draw()=" + draw() + ", getColour()=" + getColour() + "]";
	}

	
}
