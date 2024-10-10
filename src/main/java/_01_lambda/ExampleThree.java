package _01_lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Comparator using Lambda

public class ExampleThree {

	public static void main(String[] args) 
	{
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(30);
		numbers.add(10);
		numbers.add(40);
		numbers.add(20);
		
		
		//Collections.sort(numbers, new MyComparator());
		Collections.sort(numbers, (n1, n2) -> (n1 > n2) ? -1 : (n1 > n2) ? 1 : 0);
		System.out.println(numbers);

	}
}

class MyComparator implements Comparator<Integer>
{

	@Override
	public int compare(Integer num1, Integer num2) 
	{
		if(num1 > num2)
			return -1;
		else if(num1 < num2)
			return +1;
		else
			return 0;
		
		// return (num1 > num2) ? -1 : (num1 < num2) ? 1 : 0
	}
}
