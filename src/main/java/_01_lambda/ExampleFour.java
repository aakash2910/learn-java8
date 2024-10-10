package _01_lambda;

import java.util.TreeSet;

// TreeSet descending order sort using lambda

public class ExampleFour {

	public static void main(String[] args) {
		
		TreeSet<Integer> numbers = new TreeSet<Integer>((num1,num2) -> (num1 > num2) ? -1 : (num1 < num2) ? 1 : 0);
		numbers.add(30);
		numbers.add(20);
		numbers.add(40);
		numbers.add(10);
		numbers.add(50);
		
		System.out.println(numbers);
	}
}
