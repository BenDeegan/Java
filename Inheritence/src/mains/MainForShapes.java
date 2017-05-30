package mains;

import classes.Circle;
import classes.Rectangle;
import classes.Shape;
import classes.Triangle;

public class MainForShapes {

	public static void main(String[] args) {
		Shape s1 = new Shape();
		Shape s2 = new Shape();
		Rectangle r1 = new Rectangle();
		r1.setColour("blue");
		Rectangle r2 = new Rectangle();
		r2.setHeight(10);
		r2.setWidth(20);
		Triangle t1 = new Triangle();
		t1.setColour("red");
		Triangle t2 = new Triangle();
		t2.setColour("black");
		Circle c1 = new Circle();
		c1.setRadius(20);
		Circle c2 = new Circle();
		c2.setColour("blue");
		
		Shape [] arr = new Shape []{s1,s2,r1,r2,t1,t2,c1,c2};
		for(int i = 0; i<arr.length;i++){
			System.out.println(arr[i].draw());
			if(arr[i] instanceof Circle){
				Circle c3 = (Circle) arr[i];
				System.out.println("radius is " + c3.getRadius());
			}
		}
		
		
	}

}
