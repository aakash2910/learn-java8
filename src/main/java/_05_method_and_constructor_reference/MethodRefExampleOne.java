package _05_method_and_constructor_reference;

import java.util.function.Predicate;

public class MethodRefExampleOne {

	public static void main(String[] args) {
		
		Predicate<Integer> p = MethodRefExampleOne :: isAdult;
		System.out.println(p.test(20));;
	}
	
	public static boolean isAdult(int age)
	{
		return age > 18 ? true : false;
	}
}
