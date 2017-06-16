package classes;

import java.time.LocalDate;
import java.util.ArrayList;

public class TraineeMain {
	public static void main(String[] args) {
		Trainee t1 = new Trainee("Ben", "Finglas", LocalDate.ofYearDay(2005, 1));
		Trainee tCopy = new Trainee("Ben", "Finglas", LocalDate.ofYearDay(2005, 1));
		Trainee t2 = new Trainee("Jim", "Oaklahoma", LocalDate.of(1994, 3, 12));
		Trainee t3 = new Trainee("Shaun", "Swords", LocalDate.of(1992, 11, 22));
		Trainee t4 = new Trainee("Craig", "Dublin", LocalDate.of(1980, 5, 13));
		
		ArrayList<Trainee> list = new ArrayList<Trainee>();
		list.add(t3);
		list.add(t2);
		list.add(t1);
		list.add(t4);
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).equals(tCopy)){
				System.out.println("Match found at index of " + i);
			}
		}
		
		list.get(1).setName("Fred");
		
		for (Trainee trainee : list) {
			System.out.println(trainee + "\n");
		}
			
	}

}
