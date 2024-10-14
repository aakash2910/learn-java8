package _04_predefined_functional_interface;

import java.util.function.Function;

// Square of the number using Function 
public class FunctionExampleOne {

	public static void main(String[] args) {
		
		Function<Integer, Integer> func = number -> number*number;
		
		System.out.println(func.apply(10));

	}
}
