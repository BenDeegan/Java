package mains;

import exercises5.Gym;

public class MainForGym {

	public static void main(String[] args) {
		Gym g1 = new Gym(true);
		
		System.out.println(g1.toString());
		
		Gym g2 = new Gym(true);
		
		System.out.println(g2.toString());
		
		Gym g3 = new Gym(false);
		
		System.out.println(g3.toString());
		

	}

}
