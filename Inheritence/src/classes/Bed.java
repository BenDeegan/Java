package classes;

public class Bed extends Furniture{
	private boolean hasHeadboard;
	private Size size;
	//for size
//	public static final int SINGLE = 1;
//	public static final int DOUBLE = 2;
//	public static final int BUNK = 3;
//	public static final int KING = 4;
	
	public enum Size{
		SINGLE,
		DOUBLE,
		BUNK,
		KING
	}
	public Bed(){
		
	}
	
	public Bed(boolean hasHeadbaord, Size size, int colour, int material){
		super(colour,material);
		this.hasHeadboard = hasHeadbaord;
		this.size = size;
	}
	public boolean isHasHeadboard() {
		return hasHeadboard;
	}
	public void setHasHeadboard(boolean hasHeadboard) {
		this.hasHeadboard = hasHeadboard;
	}
	public Size getSize() {
		return size;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	public String toString() {
		return "Bed [hasHeadboard=" + hasHeadboard + ", size=" + size + " colour = " + getColour() + " material = " + getMaterial() +"]";
	}
}
