package _07_date_and_time;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTimeExampleTwo {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println("Current year is : " + date.getYear());
		System.out.println("Current month is : " + date.getMonth());
		System.out.println("Current day is : " + date.getDayOfMonth());
		
		System.out.println("******************************");
		
		LocalTime time = LocalTime.now();
		System.out.println("Current hour is : " + time.getHour());
		System.out.println("Current minute is : " + time.getMinute());
		System.out.println("Current second is : " + time.getSecond());
	}
}
