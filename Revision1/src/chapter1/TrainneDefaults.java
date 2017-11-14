package chapter1;

public class TrainneDefaults {

	public static void main(String[] args) {
		
		Trainee t = new Trainee();
		System.out.println(t.name);
		System.out.println(t.age);
		System.out.println(t.favouriteNumbers);
		System.out.println(t.favouriteYears[1]);
		

	}

}

	class Trainee{
		String name;
		int age;
		int [] favouriteNumbers;
		int [] favouriteYears = new int [3];
	}
