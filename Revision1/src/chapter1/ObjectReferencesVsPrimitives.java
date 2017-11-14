package chapter1;

public class ObjectReferencesVsPrimitives {

	public static void main(String[] args) {
		int a = 10;
		int b = a;
		a = 12;
		
		// b will get a copy
		//a == 12
		// b == 10
		
		Person p1 = new Person();
		Person p2 = p1;

	}

}

class Person{
	String name;
}
