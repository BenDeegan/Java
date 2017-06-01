package classes;

import java.time.LocalDate;

public class ComputerAidedDesign extends Trainee{

	public ComputerAidedDesign() {
		super();
	}

	public ComputerAidedDesign(String name, LocalDate dateOfBirth, int PPSN) {
		super(name, dateOfBirth, PPSN);
	}

	@Override
	public String toString() {
		return "ComputerAidedDesign [getName()=" + getName() + ", getLocalDate()=" + getLocalDate() + ", getPPSN()="
				+ getPPSN() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	

}
