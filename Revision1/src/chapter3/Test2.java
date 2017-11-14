package chapter3;

public class Test2 extends Test {
	String age = "22";
	
	public static void main(String[] args) {
		Test t = new Test();
		Test t2 = new Test2();
		Test2 t3 = new Test2();
		
		t3 = (Test2) t2;
		
		
		
		
		
		
		
		System.out.println(t.name);
		
		
	}
}
