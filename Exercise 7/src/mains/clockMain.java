package mains;

import classes.Clock;
import classes.InvalidTimeException;

public class clockMain {
	static Clock c1;
	public static void main(String[] args) {
		try{
			c1 = new Clock(23, 59, 35);
		 } catch(InvalidTimeException e){
			 e.printStackTrace();
		 }
		 System.out.println(c1.toString());
		
		
	}

}
