package classes;

public class Owner {
	private String name;
	private String address;
	private int phone;
	private Pet [] pets;
	
	public Owner(){
		
	}

	public Owner(String name, String address, int phone, Pet [] pets) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.pets = pets;
	}
	
	public String makeCatWalk(){
		String s = "";
		for (Pet pet : pets) {
			if(pet instanceof Cat){
				Cat cat = (Cat)pet;
				s = cat.walk() + "\n";
			}
		}
		return s;
	}
	
	public String makeDogWalk(){
		String s = "";
		for(Pet pet: pets){
			if(pet instanceof Dog){
			Dog dog = (Dog)pet;
			s = dog.walk() + "\n";
		
	}
		}
		return s;
			
	}
		


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	public Pet[] getPets() {
		return pets;
	}

	public void setPets(Pet[] pets) {
		this.pets = pets;
	}

	@Override
	public String toString() {
		return "Owner [name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}
	
	
	
	

}
