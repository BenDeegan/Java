package classes;

public class Clock {
	private int hours;
	private int seconds;
	private int minutes;
	
	public Clock(){
		hours = 0;
		seconds = 0;
		minutes = 0;
	}
	
	public Clock(int hours, int seconds, int minutes) throws InvalidTimeException{
		if(hours >=0 && hours <=23 && minutes >=0 && minutes <=59 && seconds >=0 && seconds <=59){
			setHours(hours);
			setMinutes(minutes);
			setSeconds(seconds);
		}else{
			throw new InvalidTimeException("Time not valid");
		}
		
	}
	
	public void increment(int hour, int second, int minute){
		hours += hour;
		seconds += second;
		minutes += minute;
	}
	
	public void reset(){
		hours =0;
		seconds = 0;
		minutes = 0;
	}
	
	
	
	
	
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	@Override
	public String toString() {
		return "Clock [hours=" + hours + ", seconds=" + seconds + ", minutes=" + minutes + "]";
	}
	

}
