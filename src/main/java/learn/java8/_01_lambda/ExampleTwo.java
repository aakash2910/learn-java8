package learn.java8._01_lambda;

@FunctionalInterface
interface Addable
{
	int add(int numberOne, int numberTwo);
}


public class ExampleTwo {

	public static void main(String[] args) {
		
		Addable a = (numOne, numTwo) -> numOne+numTwo;
		System.out.println("Sum of two numbers is : " + a.add(10, 20));
	}
}
