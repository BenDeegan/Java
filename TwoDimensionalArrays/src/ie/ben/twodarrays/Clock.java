package ie.ben.twodarrays;


public class Clock {
	
	// THIS IS NOT MEANT TO WORK
	public static void main(String[] args) {
		ex3Clock();
		
	}
public static void ex3Clock() {
	
		
		int[][] clock = new int[24][60];
		for (int i = 0; i < clock.length; i++) {
			for (int j = 0, num = 0; j < clock[i].length; j++) {
				
				clock[i][0] = i;
				
				clock[i][j] = num;
				
				num++;
			}
		}
		printArrClock(clock);

	}

public static void printArrClock(int[][] arr) {
	int hour = 0;
	int minute = 0;
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			hour = arr[i][0];
			minute = arr[i][j];
		
				
	
				
			
			if(i<=9){
				System.out.println("0" + hour + " : " + minute);
			}
			 else {
				 System.out.println(hour + " : " + minute);
			 }
			}
			
		
	}

}

}
