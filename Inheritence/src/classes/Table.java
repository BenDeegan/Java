package classes;

public class Table extends Furniture{
	private boolean isExpandable;
	private int shape;
	//shapes
	public static final int SQUARE =1;
	public static final int RECTANGLE =2;
	public static final int CIRCLE =3;
	
	public Table(){
		
	}
	
	public Table(boolean isExpandable, int shape){
		this.isExpandable = isExpandable;
		this.shape = shape;
	}
	
	public boolean isExpandable() {
		return isExpandable;
	}
	public void setExpandable(boolean isExpandable) {
		this.isExpandable = isExpandable;
	}
	public int getShape() {
		return shape;
	}
	public void setShape(int shape) {
		this.shape = shape;
	}
	public String toString() {
		return "Table [isExpandable=" + isExpandable + ", shape=" + shape + "]";
	}
}