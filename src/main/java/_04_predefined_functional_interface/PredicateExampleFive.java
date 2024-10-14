package _04_predefined_functional_interface;
import java.util.function.*;

// Print names which are not empty and not null

public class PredicateExampleFive {

	public static void main(String[] args) {
		
		String[] names = {"Mallika", "", "Katrina", null, "Kareena", "Kajal", "", "Shruti", "Priya"};
		
		Predicate<String> predicate = name -> name != null && !name.isEmpty();
		
		for(String name : names)
		{
			if(predicate.test(name))
			{
				System.out.println(name);
			}
		}
		
	}
}
