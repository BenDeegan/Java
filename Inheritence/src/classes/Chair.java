package classes;

public class Chair extends Furniture{
	private boolean hasGasLift;
	private int type;
	//for type
	public static final int STOOL = 1;
	public static final int ARM_CHAIR = 2;
	public static final int DINING_CHAIR = 3;
	public static final int OFFICE_CHAIR = 4;
	public Chair(){
		
	}
	public Chair(boolean hasGasLift, int type){
		
	}
	public boolean isHasGasLift() {
		return hasGasLift;
	}
	public void setHasGasLift(boolean hasGasLift) {
		this.hasGasLift = hasGasLift;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String toString() {
		return "Chair [hasGasLift=" + hasGasLift + ", type=" + type + "]";
	}
}
