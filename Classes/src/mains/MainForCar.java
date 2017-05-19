package mains;

import exercises5.Car;

public class MainForCar {
	public static void main(String[] args) {
		Car c1 = new Car("Nissan", "Micra", 1.2);
		// System.out.println(c1.toString());

		Car c2 = new Car("Ford", "Fiesta", 1.4);
		// System.out.println(c2.toString());

		Car c3 = new Car("Nissan", "Almera", 1.4);
		Car c4 = new Car("Ford", "Focus", 1.4);
		Car c5 = new Car("Honda", "Civic", 1.4);

		Car[] arr = new Car[] { c1, c2, c3, c4, c5 };

		print(arr);
	}

	public static void print(Car[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString());
		}
	}

}
