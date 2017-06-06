package testing;

public class TestingStrings {

	public static void main(String[] args) {
	String strA = "Monday";
	String strB = "Monday";
	String strC = "Tuesday", strD = "Tuesday";
	String strE = "Tuesday";
	
	if(strA == strB){
		System.out.println("True");
	}
	
	if(strC == strD){
		System.out.println("True");
	}
	
	if(strA.equals(strB)){
		System.out.println("true 3");
	}
	
	if(strC.equals(strD)){
		System.out.println("true 4");
	}
	
	if(strD == strE){
		System.out.println("true 5");
	}
	
	strC = strC.toUpperCase();
	
	if(strC == strD){
		System.out.println("true 6");
	}
	
	if(strC.equals(strD)){
		System.out.println("true 7");
	}
	

	}
	
	

}
