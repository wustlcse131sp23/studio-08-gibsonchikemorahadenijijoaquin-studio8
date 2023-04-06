package studio8;

import java.util.Objects;

public class Time {

	private int hour;
	private int minute;
	private boolean militaryTime;
	
	/**
	 * This method creates a new object of Time
	 * @param hour hour of the time
	 * @param minute minute of the time
	 * @param militaryTime whether it is military time or 12-hour system
	 */
	public Time(int hour, int minute, boolean militaryTime) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.militaryTime = militaryTime;
	}

	@Override
	public String toString() {
		if (militaryTime == true) {
			return "Time: " + hour + ":" + minute;
		}
		else if (hour < 12) {
			return "Time: " + hour + ":" + minute;
		}
		else {
			return "Time: " + (hour-12) + ":" + minute;
		}
					
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}
	
	
	
	public static void main(String[] args) {
 
    	Time now = new Time(1,26, true);
    	Time then = new Time(1,24,false);
    	System.out.println(now);
    	System.out.println(then);
    	System.out.print(now.equals(then));
    	
    }

	





	

}