package sheet3ControlFlow;

import java.util.Scanner;

public class Ex8RandomNumberOfInputs {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		int total = 0;
		
		do {
			System.out.print("Please type an int");
			
			num = scanner.nextInt();
			
		} while (num != -1);
		
		System.out.println("Total = " + total);
		scanner.close();
	}

}
