package _06_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExampleOne {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);

		List<Integer> evenNumberList = list.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNumberList);

		List<Integer> newList = list.stream().map(number -> number * 2).collect(Collectors.toList());
		System.out.println(newList);
	}
}
