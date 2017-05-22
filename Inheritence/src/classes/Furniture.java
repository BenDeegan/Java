package classes;

public class Furniture {
	private int colour;
	private int material;
	//for colours
	public static final int LIGHT_OAK = 1;
	public static final int MAHOGANY = 2;
	public static final int CLEAR = 3;
	public static final int DARK_OAK = 4;
	public static final int BLACK = 5;
	
	//for material
	public static final int WOOD = 1;
	public static final int GLASS = 2;
	public static final int METAL = 3;
	
	public Furniture(){
		
	}
	public Furniture(int colour, int material){
		this.colour = colour;
		this.material = material;
	}
	public int getColour() {
		return colour;
	}
	public void setColour(int colour) {
		this.colour = colour;
	}
	public int getMaterial() {
		return material;
	}
	public void setMaterial(int material) {
		this.material = material;
	}
	public String toString() {
		return "Furniture [colour=" + colour + ", material=" + material + "]";
	}
}






