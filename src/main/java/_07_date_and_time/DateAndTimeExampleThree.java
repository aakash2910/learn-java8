package _07_date_and_time;

import java.time.LocalDate;
import java.time.Period;

//Find age
//Find remaining days of a person's life on earth. Consider he is going to live 70 years

public class DateAndTimeExampleThree {

	public static void main(String[] args) {
		
		LocalDate bday = LocalDate.of(1988, 10, 29);
		LocalDate today = LocalDate.now();
		
		Period p = Period.between(bday, today);
		System.out.printf("Your age is %d years, %d months %d days", p.getYears(), p.getMonths(), p.getDays());
		
		LocalDate deathDay = LocalDate.of(1988+70, 10, 29);
		Period p1 = Period.between(today, deathDay);
		int d = p1.getYears()*365 + p1.getMonths() * 30 + p1.getDays();
		System.out.printf("\nYou have %d days left on earth. Hurry up do something exciting", d);
	}	
}
