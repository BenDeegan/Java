package chapter1;

public class VariableShadowing {
		public static void main(String[] args) {
					Dog d = new Dog("Patch");
					System.out.println(d.name);
				}
}

class Dog{
	 String name;
	
	Dog(String name){
		// not setting the member variable, sets the local value
		name = "Ted";
		System.out.println(name);
	}
}
