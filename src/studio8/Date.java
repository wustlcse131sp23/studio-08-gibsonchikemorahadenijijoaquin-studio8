package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	private int month;
	private int day;
	private int year;
/**
 * This method creates a new Date
 * @param month month of the year
 * @param day day of the month
 * @param year year
 */
	public Date(int month, int day, int year) {
		super();
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	
	@Override
	public String toString() {
		return "Date: " + month + "/" + day + "/" + year ;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}


	public static void main(String[] args) {
		Date today = new Date(4,6,2023);
		System.out.println(today);
		Date nextYear = new Date(4,6,2024);
		System.out.println(nextYear);
		System.out.println(today.equals(nextYear));
		Date tomorrow = new Date(4,7,2023);
		Date yesterday = new Date(4,5,2023);
		Date birthday = new Date (6,18,2004);
		LinkedList<Date> list = new LinkedList<Date>();
		list.add(yesterday);
		list.add(tomorrow);
		list.add(birthday);
		list.add(nextYear);
		list.add(today);
		list.add(yesterday);
		System.out.println(list); //lists contain duplicates!!
		
		HashSet<Date> set = new HashSet<Date>();
		set.add(yesterday);
		set.add(birthday);
		set.add(yesterday);
		set.add(tomorrow);
		System.out.println(set); //sets remove duplicates!!
	}
	







	

}
