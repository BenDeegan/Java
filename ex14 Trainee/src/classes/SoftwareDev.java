package classes;

import java.time.LocalDate;

public class SoftwareDev extends Trainee{

	public SoftwareDev() {
		super();
	}

	public SoftwareDev(String name, LocalDate dateOfBirth, int PPSN) {
		super(name, dateOfBirth, PPSN);
	}

	@Override
	public String toString() {
		return "SoftwareDev [getName()=" + getName() + ", getLocalDate()=" + getLocalDate() + ", getPPSN()=" + getPPSN()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
