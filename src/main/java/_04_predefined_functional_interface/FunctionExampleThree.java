package _04_predefined_functional_interface;

import java.util.function.Function;

// Trim given string using Function
public class FunctionExampleThree {

	public static void main(String[] args) {
		
		Function<String, String> func = name -> name.trim();
		System.out.println(func.apply("  aakash  jiyani  "));
	}
}
