package _04_predefined_functional_interface;

import java.util.function.Supplier;

// Returns random number using supplier 
public class SupplierExampleTwo {

	public static void main(String[] args) {
		
		Supplier<Double> supply = () -> Math.random();
		System.out.println(supply.get());
	}
}
