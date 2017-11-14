package chapter1;

public class NullPointerExample {

	public static void main(String[] args) {
		Book b = new Book();
		System.out.println(b.title);
		
		// Calling a method on a null -- you will get a null pointer exception
		System.out.println(b.title.length());
		
		// NUll MEANS no memory assigned!!!!!!!!!!!!!!!!

	}
	

}

	class Book{
		// Global or member variable -- will get a null value
		String title;
		
	}
