package classes;

public class Weekday {
	private String weekday;
	
	public Weekday(){
		
	}
	
	public Weekday(String weekday) throws InvalidWeekdayException{
		setWeekday(weekday);
		
	}

	public String getWeekday() {
		return weekday;
	}

	public void setWeekday(String weekday) throws InvalidWeekdayException {
		if(weekday.equals("Monday") || weekday.equals("Tuesday") || weekday.equals("Wednesday") || weekday.equals("Thursday") ||
		   weekday.equals("Friday") || weekday.equals("Saturday") || weekday.equals("Sunday")	){
			this.weekday = weekday;
		}else{
			throw new InvalidWeekdayException(weekday + " not valid");
		}
	}

	@Override
	public String toString() {
		return "Weekday [weekday=" + weekday + "]";
	}
	
	

}
