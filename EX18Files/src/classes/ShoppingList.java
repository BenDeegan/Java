package classes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ShoppingList {
	public static void main(String[] args) {
		try{
			PrintWriter pw = new PrintWriter("ShoppingList.txt");
			Scanner sc = new Scanner(System.in);
			String input;
			double price;
			for (int i = 0; i < 1; ) {
				
				System.out.println("Please enter your item");
				input = sc.next();
				if(input.equals("exit")){
					sc.close();
					pw.close();
					break;
				} else{
				System.out.println("Please enter the price");
				price = sc.nextDouble();
				
				}
				pw.println(input + " " + price);
			}
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
		try{
		FileReader fr = new FileReader("ShoppingList.txt");
		BufferedReader br = new BufferedReader(fr);
		String current;
		while((current = br.readLine())!= null){
			System.out.println(current);
		}
		br.close();
		
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
