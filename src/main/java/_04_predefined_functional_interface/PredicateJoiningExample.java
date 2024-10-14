package _04_predefined_functional_interface;

import java.util.function.Predicate;

// Predicate joining example

public class PredicateJoiningExample {

	public static void main(String[] args) {
		
		int[] numbers = {0,5,10,15,20,25,30};
		
		Predicate<Integer> p1 = number -> number > 10;
		Predicate<Integer> p2 = number -> number % 2 == 0;
		
		CheckConditions(p1.and(p2), numbers);
		System.out.println("****************");
		CheckConditions(p1.or(p2), numbers);
	}
	
	public static void CheckConditions(Predicate<Integer> p, int[] nums)
	{
		for(int number : nums)
		{
			if(p.test(number))
			{
				System.out.println(number);
			}
		}
	}
}
