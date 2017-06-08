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
		
		char [] arr = word.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == c){
				System.out.println("Letter " + c + " was found at index " + i);
			}
			
			
			
//			
//			if(word.indexOf(c) >=i){
//				System.out.println(i);
//			System.out.println("Letter " + c + " was found at index "+ word.indexOf(c, i));
//
//		}
//			if(word.lastIndexOf(c) <=100){
//				System.out.println("Letter "+ c + " was found at index" + word.lastIndexOf(c));
//			}
			
		}
			sc.close();
	}

}
