package ie.ben.twodarrays;

public class Ex4TotalSales {
	public static void main (String [] args){
		int [][][] arr = new int [4][5][1];
		int price = 10;
		
		for(int i = 0;i<4;i++){
			for(int j =0; j<5;j++){
				for(int k = 0; k<1;k++){
					
					arr[i][j][k] = price;
					price+= 10;
				}
			}
		}
		
		printArr(arr);
		
		
	}
	
	
	
	
	
	
	
	
	public static void printArr(int[][][] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				for(int k =0; k<1;k++){
					System.out.println(arr[i][j][k]);
				}
				
				
				

			}
		}
	}
	
	
	

}
