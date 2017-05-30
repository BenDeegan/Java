package classes;

public class Table extends Furniture{
	private boolean isExpandable;
	private Shape shape;
	//shapes
//	public static final int SQUARE =1;
//	public static final int RECTANGLE =2;
//	public static final int CIRCLE =3;
	
	public enum Shape{
		SQUARE,
		RECTANGLE,
		CIRCLE
	}
	
	public Table(){
		
	}
	
	public Table(boolean isExpandable, Shape shape, int colour, int material){
		super(colour,material);
		this.isExpandable = isExpandable;
		this.shape = shape;
		
		
	}
	
	public boolean isExpandable() {
		return isExpandable;
	}
	public void setExpandable(boolean isExpandable) {
		this.isExpandable = isExpandable;
	}
	public Shape getShape() {
		return shape;
	}
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	public String toString() {
		return "Table [isExpandable=" + isExpandable + ", shape=" + shape + " colour " + getColour() +  " material " + getMaterial() +    "]";
	}
}