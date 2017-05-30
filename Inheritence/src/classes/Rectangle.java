package classes;

public class Rectangle extends Shape{
	private double height;
	private double width;
	private double area;
	
	public Rectangle(){
		
	}

	public Rectangle(String colour, double height, double width) {
		super(colour);
		this.height = height;
		this.width = width;
		setArea(height,width);
		
		
		
	}
	
	public double setArea(double height, double width){
		area = height * width;
		return area;
	}
	@Override
	public String draw(){
		return "Drawing a rectangle";
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getArea() {
		return area;
	}
	


	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + ", area=" + area + ", getColour()=" + getColour()
				+ "]";
	}
	
	
}
