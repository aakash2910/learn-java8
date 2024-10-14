package _04_predefined_functional_interface;

import java.util.Date;
import java.util.function.Supplier;

// Return new date using supplier
public class SupplierExampleOne {

	public static void main(String[] args) {
		
		Supplier<Date> supply = () -> new Date();
		System.out.println(supply.get());
	}
}
