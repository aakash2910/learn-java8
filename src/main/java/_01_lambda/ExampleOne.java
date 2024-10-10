package _01_lambda;

@FunctionalInterface
interface Printable
{
	void print(String message);
}

public class ExampleOne {

	public static void main(String[] args) {
		
		Printable p = message -> System.out.println("Message is : " + message);
		p.print("Hello Lambda");
	}
}
