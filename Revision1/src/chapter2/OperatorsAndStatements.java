package chapter2;

public class OperatorsAndStatements {

	public static void main(String[] args) {
		int a  = 13;
		int b = 4;
		//% Modulus operator returns the remainder after the integer division
		System.out.println("a % b " + a % b); // 1
		
		/*	When plus + finds a string on the left: String concatenation.
		 * 	When a + finds numbers on the left: addition.
		 * 
		 * 
		 * 	When an int is added to a double, the result will be a double.
		 * */
		System.out.println(12 + 4 + "hello");
		System.out.println("hello" + 12 + 4);
		System.out.println("" + 12 + 4);
		
		// ++ increment
		// -- decrement
		
		// ++i pre-increment
		// i++ post increment
		
		//players++ will use players and the add one one.
		int players = 0;
		System.out.println(players++);		//0
		System.out.println(players);		//1
		// ++players will increment players by one before printing
		System.out.println(++players);		//2
		
		
		
		
	}

}
