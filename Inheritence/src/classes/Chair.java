package classes;

public class Chair extends Furniture{
	private boolean hasGasLift;
	private Type type;
	//for type
//	public static final int STOOL = 1;
//	public static final int ARM_CHAIR = 2;
//	public static final int DINING_CHAIR = 3;
//	public static final int OFFICE_CHAIR = 4;
	
	public enum Type{
		STOOL,
		ARM_CHAIR,
		DINING_CHAIR,
		OFFICE_CHAIR
	}
	public Chair(){
		
	}
	public Chair(boolean hasGasLift, Type type, int colour, int material){
		super(colour,material);
		this.hasGasLift = hasGasLift;
		this.type = type;
		
	}
	public boolean isHasGasLift() {
		return hasGasLift;
	}
	public void setHasGasLift(boolean hasGasLift) {
		this.hasGasLift = hasGasLift;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public String toString() {
		return "Chair [hasGasLift=" + hasGasLift + ", type=" + type + " colour = " + getColour() + " material =  " + getMaterial();
	}
}
