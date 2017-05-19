package exercises5;

import java.util.Objects;

public class PC {
	private int pNum;
	public static int counter = 1000;
	private int ram;
	private int screenSize;
	private int hdd;
	private int OS;
	private  double cost;
	public static final int windows = 1;
	public static final int linux = 2;
	public static final int RAM_4GB = 1;
	public static final int RAM_8GB = 2;
	public static final int RAM_16GB = 3;
	
	public static final int SIZE_15 = 1;
	public static final int SIZE_24 = 2;
	public static final int SIZE_27 = 3;
	

	public PC() {
		pNum += counter;
		counter++;

	}

	public PC(int ram, int screenSize, int hdd, int OS) {
		this();
		
		setRam(ram);
		setScreenSize(screenSize);
		setHdd(hdd);
		setOS(OS);

	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
		switch (ram) {
		case RAM_4GB:
			cost += 20;
			break;
		case RAM_8GB:
			cost+=40;
			break;
		case RAM_16GB:
			cost+=65;
			break;
		default:
			break;
		}
		
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
		switch (screenSize) {
		case SIZE_15:
			cost+=100;
			break;
		case SIZE_24:
			cost+= 150;
			break;
		case SIZE_27:
			cost+= 200;
			break;

		default:
			break;
		}
	}

	public int getHdd() {
		return hdd;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
		if (hdd == 1) {
			cost += 50;
		}

		if (hdd == 2) {
			cost += 75;
		}
	}

	public int getOS() {
		return OS;
	}

	public void setOS(int oS) {
		OS = oS;
		if (Objects.equals(windows, oS)) {
			cost += 100;
		}
		if (Objects.equals(linux, oS)) {
			cost += 20;
		}
	}

	public double getCost() {
		return cost;
	}

	public String toString() {
		return "PC order# " + pNum + "  [ram=" + ram + ", screenSize=" + screenSize + ", hdd=" + hdd + ", OS=" + OS
				+ ", cost=" + cost + "]";
	}

}
