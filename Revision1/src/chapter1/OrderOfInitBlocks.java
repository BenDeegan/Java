package chapter1;

public class OrderOfInitBlocks {
	
	

	public static void main(String[] args) {
		
		Init i1 = new Init();
		
		Init i2 = new Init();
		

	}

}

class Init{
	A a = new A();
	{
		System.out.println("Init block 1");
	}
	
	public Init(){
		System.out.println("In the constructor");
	}
	
	{
		System.out.println("Init block 2");
	}
	
}

class A{
	A(){
		System.out.println("In A");
	}
}
