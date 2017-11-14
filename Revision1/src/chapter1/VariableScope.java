package chapter1;

public class VariableScope {
	
	// Local variables live as long as the method there in is running. 
	
	//Block variables live as long as the block (curly brackets i.e loops) lives/loops.

	public static void main(String[] args) {
		Animal a = new Animal();
		System.out.println(a.name);
		
		a.printDetails();
		System.out.println(Animal.animalCounter);
		
		for(int i = 0; i< 4; i++){
			int result = i*10;
			System.out.println("result " + result);
		}

	}
	
	void aMethod(){
		int num = 10;
		System.out.println("number" + num);
	}

}

class Animal{
	/*
	 *  Member variables live as long as the object exists e.g. Animal a = new Animal();
	 *  name will exist for as long as "a" refers to the anomal object.
	 *  
	 *  You can make "a" refer to something else: 
	 *  Animal a2 = new Animal();
	 *  a = a2;
	 *  a = new Animal();
	 *  a = null;
	 * */
	String name;
	
	/*
	 * A static variable belongs to the class. It is created when the class is mentioned and it will die when main is finished, or when the program exits.
	 * */
	static int animalCounter;
	
	Animal(){
		int age = 4;
	}
	
	void printDetails(){
		String message = "Animals details: ";
		
		
	}
}
