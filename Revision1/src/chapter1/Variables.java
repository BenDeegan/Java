package chapter1;

public class Variables {

	public static void main(String[] args) {
		
		/*Size of primatives from smallest to largest:
		 * 
		 * byte = -128 to 127
		 * short = -32768 to 32767
		 * int
		 * long
		 * float
		 * double
		 * 
		 * char = single letter
		 * boolean = true or false
		 * 
		 * 
		 * 
		 * */
		
		
		
		/* Variable names cannot not start with a number 
		 * 
		 * can have _ and currency symbols: $ £ 
		 * No spaces 
		 * 
		 * */ 
		int length = 1_000;
		
		/* 
		 * In a literal, underscores can go in between numbers but not at the beginning or the end, or next to a decimal point.
		 * */
		double price = 12.3_4;
		
		int binary = 0b100; // thats 4.
		
		/*A literal without decimal places is seen as an int.
		 * A literal with decimal places is seen as a double.
		 * 
		 * */
		
		long aLongNumber = 1234556891828938L;
		
		/* A double is twice the size of a float, when the compiler sees 12.5, it is seen as double and therefore will not fit into a float, so an F is needed at the end of a float
		 * */
		float priceNum = 1234.22221233f;
		
		char letter = 'a';
		char another = 100; // ascii value of d
		
		byte b1 = 127;
		byte b3 = (byte)128;
		
		//Any bytes, shorts and ints added / divided / multiplied / subtracted  ---- the result will be an int. Can cast it downwards
		
		// you can declare multiple variables on same line of same type
		
		int a , b , c;
		
		// cannot declare different types on same line.
		// int a, String d;
		
		
		

	}

}
