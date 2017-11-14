package chapter4;

public class VarArgsEncapsulation {
	
	/*
	 *   ... means a variable length array.
	 *   You can pass in 	- no parameters
	 *   				 	- one parameter
	 *   					- two parameters
	 *   					-three parameters
	 *   					-an array
	 * 
	 * */

	public static void main(String... args) {
		printArray(); // no parameters
		printArray(65);
		printArray(12,23);
		printArray(1,2,3);
		printArray(new int[]{2,4,6});
		

	}
	
	static void printArray(int... nums){
		//System.out.println(nums[0]); //might cause an array Index out of bounds
		
	}
	
	// Only one paramter can be VarArgs and must be last 
	static void print(String name, int... nums){
		
	}

}
