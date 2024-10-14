package _04_predefined_functional_interface;

import java.util.function.Function;

// Calculate the length of the string using Function
public class FunctionExampleTwo {

	public static void main(String[] args) {
		
		Function<String, Integer> func = name -> name.length();
		System.out.println(func.apply("Aakash"));
	}
}
