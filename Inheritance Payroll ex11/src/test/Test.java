package test;

import java.time.LocalDate;
import java.time.Month;

import classes.Boss;
import classes.CommisionWorker;
import classes.Employee;
import classes.HourlyWorker;
import classes.PieceWorker;

public class Test {
	public static void main(String[] args) {
		Boss b1 = new Boss(800, "Ben", "Deegan", LocalDate.of(1990, Month.APRIL, 20));
		Boss b2 = new Boss(1000, "Chief", "Keef", LocalDate.of(1990, Month.APRIL, 20) );
		
		CommisionWorker c1 = new CommisionWorker("James", "Doe", 20000, 5, 15, LocalDate.of(1990, Month.APRIL, 20));
		CommisionWorker c2 = new CommisionWorker("Roger", "Roger", 30000, 7, 25, LocalDate.now());
		
		PieceWorker p1 = new PieceWorker("Fred", "Shed", 5, 500, LocalDate.of(1970, Month.MARCH, 20));
		HourlyWorker h1 = new HourlyWorker("Josh", "Kling", 12.30, 40, LocalDate.of(1950, Month.MAY, 20));
		
//		System.out.println(b1.toString());
//		System.out.println(c1.toString());
		
		Employee [] arr = new Employee[]{b1,b2,c1,c2,p1,h1};
		for (Employee employee : arr) {
			System.out.println(employee.earnings());
		}
	}

}
  