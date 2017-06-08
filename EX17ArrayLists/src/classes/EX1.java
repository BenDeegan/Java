package classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EX1 {
	public static void main(String[] args) {
		int counter = 0;
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ben");
		list.add("Travis");
		list.add("Tom");
		list.add("Mark");
		list.add("Glen");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name to search for");
		String search = sc.next();
		Outerloop:
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).compareTo(search) == 0){
				System.out.println("Your search was found at index " + i);
				break Outerloop;
			} else{
				counter++;
			}
			
			if(counter  == list.size()){
				System.out.println("No match found");
			}
		}
		
		System.out.println("Enter a name to be removed");
		String enter = sc.next();
		for(int i =0;i<list.size();i++){
			if(list.get(i).compareTo(enter) == 0){
				list.remove(i);
				System.out.println("Person removed");
			}
		}
		//sorting
		Collections.sort(list);
		//list.set(2, "Kiedis");
		for (String string : list) {
			System.out.println(string);
		}
		//delete everything in list
		System.out.println(list.isEmpty());
		list.removeAll(list);
		System.out.println(list.isEmpty());
		
		for (String string : list) {
			System.out.println(string);
		}
		
		
		
	}

}
