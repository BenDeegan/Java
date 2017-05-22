package classes;

public class Bed extends Furniture{
	private boolean hasHeadboard;
	private int size;
	//for size
	public static final int SINGLE = 1;
	public static final int DOUBLE = 2;
	public static final int BUNK = 3;
	public static final int KING = 4;
	public Bed(){
		
	}
	
	public Bed(boolean hasHeadbaord, int size){
		this.hasHeadboard = hasHeadbaord;
		this.size = size;
	}
	public boolean isHasHeadboard() {
		return hasHeadboard;
	}
	public void setHasHeadboard(boolean hasHeadboard) {
		this.hasHeadboard = hasHeadboard;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String toString() {
		return "Bed [hasHeadboard=" + hasHeadboard + ", size=" + size + "]";
	}
}
