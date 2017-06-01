package classes;

import java.time.LocalDate;

public class Trainee {
	private String name;
	private LocalDate dateOfBirth;
	private int PPSN;
	
	public Trainee(){
		
	}
	
	public Trainee(String name, LocalDate dateOfBirth, int PPSN){
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.PPSN = PPSN;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setLocalDate(LocalDate dateOfBirth){
		this.dateOfBirth = dateOfBirth;
	}
	public void setPPSN(int PPSN){
		this.PPSN = PPSN;
	}
	public String getName(){
		return name;
	}
	public LocalDate getLocalDate(){
		return dateOfBirth;
	}
	public int getPPSN(){
		return PPSN;
	}

	@Override
	public String toString() {
		return "Trainee [name=" + name + ", dateOfBirth=" + dateOfBirth + ", PPSN=" + PPSN + "]";
	}
	
	

}
