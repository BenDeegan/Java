package classes;

public class Pet {
	private String name;
	private String breed;
	private int age;
	private boolean isMale;
	
	public Pet(){
		
	}
	
	public Pet(String name, String breed, int age, boolean isMale){
		this.age = age;
		this.breed = breed;
		this.isMale = isMale;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", breed=" + breed + ", age=" + age + ", isMale=" + isMale + "]";
	}
	
	

}
