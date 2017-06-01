package classes;

import java.time.temporal.WeekFields;

public class Test  {
	
	public static void main(String[] args) throws InvalidWeekdayException {
		Weekday w1 = new Weekday();
	
	try{
		w1.setWeekday("Sunday");
	} catch(InvalidWeekdayException e){
		e.printStackTrace();
	}
	System.out.println(w1.toString());
	}
	

}
