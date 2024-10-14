package _04_predefined_functional_interface;

import java.util.function.*;

public class ConsumerExampleOne {

	public static void main(String[] args) {
		
		Consumer<String> c = name -> System.out.println(name);
		c.accept("Hello world");
	}
}
