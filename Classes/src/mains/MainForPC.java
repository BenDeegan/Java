package mains;

import exercises5.PC;

public class MainForPC {
	public static void main(String[] args) {
		PC p1 = new PC(PC.RAM_4GB, PC.SIZE_15, 1, PC.windows);
		//System.out.println(p1.toString());
		
	 

		PC p2 = new PC(PC.RAM_16GB, PC.SIZE_27, 2, PC.linux);
		//System.out.println(p2.toString().toUpperCase());
		PC p3 = new PC(PC.RAM_4GB, PC.SIZE_24, 1, PC.windows);
		PC p4 = new PC(PC.RAM_16GB, PC.SIZE_27, 2, PC.linux);
		PC p5 = new PC(PC.RAM_8GB, PC.SIZE_27, 1, PC.linux);
		PC p6 = new PC(PC.RAM_8GB, PC.SIZE_15, 2, PC.windows);
		
		//BELOW IS THE ARRAY FOR SHEET 5
		
		PC [] arr = new PC[]{p1,p2,p3,p4,p5,p6};
		
		print(arr);

	}
	
	public static void print(PC [] arr){
		for(int i = 0; i<arr.length;i++){
			System.out.println(arr[i].toString());
		}
		
		
	}

}
