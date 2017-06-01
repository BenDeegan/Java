package classes;

import java.time.LocalDate;

import other.Apprentice;

public class Carpenter extends Trainee implements Apprentice{
	private String EmployersName;
	private int phase;
	public Carpenter() {
		super();
	}

	public Carpenter(String name, LocalDate dateOfBirth, int PPSN, String EmployersName, int phase) {
		super(name, dateOfBirth, PPSN);
		setEmployersName(EmployersName);
		setPhase(phase);
	}

	@Override
	public void setEmployersName(String EmployersName) {
		this.EmployersName = EmployersName;
	}

	@Override
	public String getEmployersName() {
		return EmployersName;
	}

	@Override
	public void setPhase(int phase) {
		if(phase <=6 && phase > 0){
			this.phase = phase;
		} else {
			System.out.println("Phase length is incorrect");
		}
		
	}

	@Override
	public int getPhase() {
		return phase;
	}

	@Override
	public String toString() {
		return "Carpenter [EmployersName=" + EmployersName + ", phase=" + phase + ", getName()=" + getName()
				+ ", getLocalDate()=" + getLocalDate() + ", getPPSN()=" + getPPSN() + "]";
	}
	
	
	
	
	

}
