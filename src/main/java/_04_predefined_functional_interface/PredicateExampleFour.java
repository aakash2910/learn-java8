package _04_predefined_functional_interface;

import java.util.function.Predicate;

// Print names that starts with "K"

public class PredicateExampleFour {

	public static void main(String[] args) {
		
		String[] names = {"Mallika", "Katrina", "Kareena", "Kajal", "Shruti", "Priya"};
		Predicate<String> p = name -> name.startsWith("K");
		
		for(String name : names)
		{
			if(p.test(name))
			{
				System.out.println(name);
			}
		}

	}
}
