package _04_predefined_functional_interface;
import java.util.function.*;

// Check if number is greater than zero or not

public class PredicateExampleOne {

	public static void main(String[] args) {
		
		Predicate<Integer> predicate = (number) -> number > 0;
		System.out.println(predicate.test(0));
	}
}
