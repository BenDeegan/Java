package classes;

import java.time.LocalDate;

public class Trainee {
	String name;
	String address;
	LocalDate birthday;
	
	public Trainee(){
		
	}
	
	public Trainee(String name, String address, LocalDate birthday){
		this.name = name;
		this.address = address;
		this.birthday = birthday;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public void setBirthday(LocalDate birthday){
		this.birthday = birthday;
	}
	
	public String getName(){
		return name;
	}
	
	public String getAddress(){
		return address;
	}
	
	public LocalDate getBirthday(){
		return birthday;
	}
	
	public String toString(){
		return "Name  " + name + "\nAddress " + address + "\nBirthday " + birthday;
	}
	@Override
	public boolean equals(Object obj){
		Trainee other = (Trainee)obj;
		if(this.name.equals(other.name) 
			&& this.address.equals(other.address)
			&& this.birthday.equals(other.birthday)){
			return true;
		} else
			return false;
	}

}
