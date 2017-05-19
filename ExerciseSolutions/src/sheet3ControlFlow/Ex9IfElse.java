package sheet3ControlFlow;

import java.util.Scanner;

public class Ex9IfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an Int");
		int num = sc.nextInt();
		
		System.out.println("You entered " + num);
		if(num >= 1 && num <= 10){
			System.out.println("You typed between 1 - 10");
		}
		
		
	}

}
