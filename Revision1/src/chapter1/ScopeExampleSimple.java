package chapter1;


public class ScopeExampleSimple {

	public static void main(String[] args) {
		// if a variable is declared inside curly brackets of a method
		// or an if block, that variable cannot be seen outside the scope of those curly brackets/block
		if(true){
			int blockVariable = 10;
		}
		
		//System.out.println(BlockVariable);
		//cannot be seen
		
		
		int i = 0;
		do {
			String name = "Ted";
			i++;
		} while ( i <10);
		
		// cannot see name
		
		for (int j = 0;j<10;j++){
			;
		}
		
		// j cannot be seen.
		
		int num = 2;
		switch(num){
		case 2:
			int a = 10;
			break;
			
		case 4: 
			a=10; 							// A CAN be seen but may not be initialized
			System.out.println(a);
		}
		
		//System.out.println(a);			// A CANNOT be seen

	}
	
	/*
	 * A local variable can only be accessed within the cope of the method it is declared in, i.e, within those {}
	 * */
	public void methodA(){
		int num = 10;
	}
	
	public  void methodB(){
		methodA();
		//cant print num here
	}

}
