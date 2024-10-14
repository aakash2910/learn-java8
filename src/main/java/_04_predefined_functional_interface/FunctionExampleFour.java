package _04_predefined_functional_interface;

import java.util.function.Function;

// Count number of spaces in given sentence
public class FunctionExampleFour {

	public static void main(String[] args) {
		
		Function<String, Integer> func = name -> {
			int count = 0;
			for(int i = 0; i < name.length(); i++)
			{
				if(name.charAt(i) == ' ')
					count++;
			}
			return count;
		};
		
		System.out.println(func.apply("This is just a demo of Function functional interface"));	
	}
}
