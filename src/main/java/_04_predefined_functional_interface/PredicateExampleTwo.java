package _04_predefined_functional_interface;

import java.util.function.Predicate;

// Check if the length of the string is > 5 or not

public class PredicateExampleTwo {

	public static void main(String[] args) {

		Predicate<String> predicate = (name) -> name.length() > 5;
		System.out.println(predicate.test("Aakash"));
		System.out.println(predicate.test("Akash"));
	}

}
