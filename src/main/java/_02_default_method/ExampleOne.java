package _02_default_method;

// Default method example

interface Addable
{
	String message = "This interface contains default method";
	default int add(int num1, int num2)
	{
		return num1+num2;
	}
}

public class ExampleOne implements Addable{

	public static void main(String[] args) {
		
		Addable example = new ExampleOne();
		int total = example.add(10,	20);
		System.out.println(Addable.message);
		System.out.println(total);
	}
}
