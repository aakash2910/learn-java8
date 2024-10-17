package _07_date_and_time;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTimeExampleOne {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		
		System.out.println("Today's date is : " + date + " and current time is : " + time);
	}	
}
