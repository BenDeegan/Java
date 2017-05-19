package exercises5;

public class Car {
	private int carNum;
	private String make;
	private String model;
	private double engineSize;
	public static int counter;

	public Car() {
		counter++;
		carNum += counter;

	}

	public Car(String make, String model, double engineSize) {
		this();
		this.make = make;
		this.model = model;
		this.engineSize = engineSize;

	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}

	public int getCarNum() {
		return carNum;
	}

	public String toString() {
		return " Your Car Details for car#" + carNum + " [ make=" + make + ", model=" + model + ", engineSize="
				+ engineSize + "]";
	}

}
