package testing;

import java.util.Scanner;

public class EX6randomwords {
	static String [] arr = new String []{"fire", "water", "burn", "genius"};
	
	public static void main(String[] args) {
		program();
	}
	
	public static void program(){
		int randomNumber = (int)(Math.random()*4);
		int counter = 0;
		char [] cArr = arr[randomNumber].toCharArray();
				//arr[randomNumber].toCharArray();
		Scanner sc = new Scanner(System.in);
		outerloop:
		for (int i = 0; i < 8; i++) {
			
			
			
				System.out.println("Please enter a character to check");
				char c = sc.next(".").charAt(0);
			for (int j = 0; j < cArr.length; j++) {
				if(cArr[j] == c){
					System.out.println("Letter " + c + " was found at index " + j);
					counter++;
				} 
				if(counter == arr[randomNumber].length()){
					System.out.println("You got it");
					break outerloop;
				}
			}
		}
	}

}
