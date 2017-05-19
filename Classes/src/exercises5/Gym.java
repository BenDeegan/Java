package exercises5;

public class Gym {
	private int memNum;
	private double memCost =450;
	private boolean freq = false;
	private static int counter = 1000;
	
	public Gym(){
		memNum = counter;
		counter++;
		
		
	}
	
	public Gym(boolean freq){
		setFreq(freq);
		double paymentDue = 0;
		if(freq = false){
			memNum = counter;
			paymentDue = memCost;
			counter++;
			
			System.out.println("counter is " + counter);
		} else {
			memNum = counter;
			paymentDue = memCost / 12;
			counter++;
			
			System.out.println("counter is " + counter);
		}
		
	}
	
	
	
	
	
	
	
	
	public int getMemNum() {
		return memNum;
	}
	public void setMemNum(int memNum) {
		
		this.memNum = memNum;
	}
	public double getMemCost() {
		return memCost;
	}
	public void setMemCost(double memCost) {
		this.memCost = memCost;
	}
	public boolean isFreq() {
		return freq;
	}
	public void setFreq(boolean freq) {
		this.freq = freq;
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}

	
	public String toString() {
		return "Gym [memNum=" + memNum + ", memCost=" + memCost + ", freq=" + freq + ", counter=" + counter + "]";
	}

}
