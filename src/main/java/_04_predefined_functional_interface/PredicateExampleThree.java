package _04_predefined_functional_interface;

import java.util.ArrayList;
import java.util.function.*;

// Check if given collection is empty or not

public class PredicateExampleThree {

	public static void main(String[] args) {
		
		Predicate<ArrayList<Integer>> predicate = list -> list.isEmpty();
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		
		System.out.println(predicate.test(list));
	}

}
