package classes;

public class Circle extends Shape {
	private int radius;
	
	public Circle(){
		
	}

	public Circle(String colour, int radius) {
		super(colour);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public String draw(){
		return "Drawing a circle";
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getColour()=" + getColour() + "]";
	}
	
	

}
