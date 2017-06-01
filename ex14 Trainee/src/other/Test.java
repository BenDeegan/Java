package other;

import java.time.LocalDate;

import classes.Carpenter;
import classes.ComputerAidedDesign;
import classes.Electrician;
import classes.SoftwareDev;
import classes.Trainee;

public class Test {
	public static void main(String[] args) {
		Electrician e1 = new Electrician("James", LocalDate.of(1992, 04, 20), 12345, "ESB", Apprentice.PHASE_FOUR);
		Carpenter c1 = new Carpenter("Fred", LocalDate.of(1980, 05, 27), 6567, "FAS", Apprentice.PHASE_FIVE);
		SoftwareDev s1 = new SoftwareDev("Ben", LocalDate.of(1995, 04, 20), 848);
		ComputerAidedDesign cad1 = new ComputerAidedDesign("Shane", LocalDate.now(), 44555);
		
		Trainee [] arr = new Trainee []{e1,c1,s1,cad1};
		for (Trainee trainee : arr) {
			if(trainee instanceof Electrician){
				Electrician elec = (Electrician)trainee;
				System.out.println(elec.getEmployersName());
			}
			
			if(trainee instanceof Carpenter){
				Carpenter carp = (Carpenter)trainee;
				System.out.println(carp.getEmployersName() );
			}
		}
	}

}
