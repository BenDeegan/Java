package testing;

import java.util.Scanner;

public class EX5search {
	public static void main(String[] args) {
		String word = "";
		String chara = "";
		
		Scanner sc = new Scanner(System .in);
		System.out.println("Please enter the word to be checked");
		word = sc.next();
		System.out.println("Please enter the letter to check for");
		chara = sc.next();
		char c = chara.charAt(0);
		
		
		for (int i = 0; i < word.length(); i++) {
			if(word.indexOf(c) >=0){
			System.out.println("Letter " + c + " was found at index "+ word.indexOf(c));
		}
			
		}
			
	}

}
