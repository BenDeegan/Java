package chapter1;


/* To compile from the command line
 * 
 * >javac [packageName]/[class].java
 * 
 * >java [packageName].[class]
 * 
 * >java [packageName].[class] 1 "Arg 2" Three
 * 
 * Arguments go into the main args
 * 
 * [1, "Arg 2" , "three"]
 * 
 * */
public class ArgsInMain {

	public static void main(String[] args) {
		System.out.println(args[0]);

	}

}
