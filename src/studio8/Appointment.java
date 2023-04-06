package studio8;

import java.util.Objects;

public class Appointment {

	private Date date;
	private Time time;
	
	public Appointment(Date date, Time time) {
		this.date = date;
		this.time = time;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return date == other.date && time == other.time;
	}

	@Override
	public String toString() {
		return "Appointment: " + date.toString() + ", " +  time.toString();
	}
	
	
	public static void main(String[] args) {
		Date today = new Date(4,6,2023);
		Time forToday = new Time(1,54,false);
		Appointment app1 = new Appointment(today, forToday);
		System.out.println(app1);
	}
	
}

