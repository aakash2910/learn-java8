package _02_default_method;

// Example of overriding default method 

interface Flyable
{
	default void fly(String bird)
	{
		System.out.println(bird + " is flying");
	}
}

public class ExampleTwo implements Flyable{

	public static void main(String[] args) {
		
		Flyable f = new ExampleTwo();
		f.fly("Eagle");
	}
	
	@Override
	public void fly(String bird)
	{
		System.out.println("Bird's name is : " + bird);
		System.out.println(bird + " is flying high");
	}
}
