package testing;

import java.util.Scanner;

public class EX7CompareWords {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first word");
		String one = sc.next();
		System.out.println("Enter second word");
		String two = sc.next();
		
		if(one.compareTo(two) >0 ){
			System.out.println(one + " follows " + two);
		}
		
		if(one.compareTo(two) < 0){
			System.out.println(one + " precedes " + two);
		} 
		
		if(one.compareTo(two) == 0){
			System.out.println("They are the same");
		}
		
		
	}

}
