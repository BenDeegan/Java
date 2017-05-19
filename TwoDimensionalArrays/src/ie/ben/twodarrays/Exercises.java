package ie.ben.twodarrays;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Exercises {
	public static void main(String[] args) {
		// ex1FootballTeams();
		// ex2NamesAndAddresses();
		ex3Clock();

	}
	
	public static void ex3Clock(){
		int [] hours = new int [24];
		int [] minutes = new int[60];
		
		for(int i = 0; i < hours.length; i++){
			hours[i] = i;
		}
		
		for (int j = 0; j <minutes.length;j++){
			minutes[j] = j;
		}
		
		printInt(hours, minutes);
		
	}
	
	



	public static void ex2NamesAndAddresses() {
		String[][] addressBook = { { "Joe Murphy", "12 main street", "Dublin" },
				{ "Mary Jones", "36 amiens street", "Galway" }, { "Pat Conner", "26 suez desert", "Dublin" } };

		String compare = "26 suez desert";

		for (int i = 0; i < addressBook.length; i++) {
			for (int j = 0; j < addressBook[i].length; j++) {
				String temp = "";
				temp = addressBook[i][j];
				String name = addressBook[i][0];
				int result = temp.compareTo(compare);
				if (result == 0) {
					System.out.println("We found a match");
					System.out.printf("%s lives here", name);

				}
			}
		}

	}

	public static void ex1FootballTeams() {
		String[][] teams = new String[3][3];
		Scanner sc = new Scanner(System.in);
		String input = "";

		for (int k = 0; k < teams.length; k++) {
			System.out.println("Please enter a team name");
			input = sc.next();
			teams[k][0] = input;
		}
		for (int i = 0; i < teams.length; i++) {
			for (int j = 0; j < teams[i].length; j++) {
				if (j == 0) {
				} else {
					String temp = teams[i][0];
					System.out.println("Please enter player for team: " + temp);
					input = sc.next();
					teams[i][j] = input;
				}
			}
		}
		printArr(teams);
		sc.close();

	}
	
public static void printInt(int[] arr, int[] arr2) {
	int hours;
	int minutes;
		
		for (int i = 0; i < 24; i++) {
			for(int j = 0; j <60; j++){
				if(i<=9){
					hours = arr[i];
					minutes = arr2[j];
					System.out.print("0" + hours + " : " + minutes + "\n");
				} else {
					System.out.print(arr[i] + " : " + arr2[j] + "\n");
				}
				
			}
			
	
				
				
				

			
		}

	}


	public static void printArr(String[][] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				
				System.out.println(arr[i][j]);
				

			}
		}

	}

}
