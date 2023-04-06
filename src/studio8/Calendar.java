package studio8;

import java.util.LinkedList;

public class Calendar {

	
	private LinkedList<Appointment> appointments;
	
	
	
	public Calendar() { //list is initialized but still empty 
		
		this.appointments = new LinkedList<>();
	}

	public void addToCalendar(Appointment a) {
		this.appointments.add(a);
	}


	public static void main(String[] args) {
		Calendar thisYear = new Calendar();
		Date today = new Date(4,6,2023);
		Time forToday = new Time(2,10, false);
		Appointment app1  = new Appointment(today,forToday);
		thisYear.addToCalendar(app1);
		
		

	}

}
