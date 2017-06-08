package testing;

import java.util.Scanner;

public class EX8WordCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sentance");
		String sent = sc.nextLine();
		
		String [] words = sent.split(" ");
		int numOfWords = words.length;
		int totalChar = 0;
		
		for (int i = 0; i < words.length; i++) {
			totalChar += words[i].length();
		}
		
		System.out.println("Num of Words " + numOfWords);
		System.out.println("Num of Characters without spaces " + totalChar);
		System.out.println("Num of Characters with spaces " + (totalChar + words.length - 1));
		
		sc.close();
	}
	

}
