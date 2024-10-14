package _04_predefined_functional_interface;

import java.util.function.*;

public class ConsumerExampleTwo {

	public static void main(String[] args) {
		
		Student john = new Student("John", 35, "Computer Science");
		
		Consumer<Student> consumer = student -> {
			System.out.println("Student name is " + student.getName());
			System.out.println("Student age is " + student.getAge());
			System.out.println("Student field of study is " + student.getFieldOfStudy());
		};
		
		consumer.accept(john);
		
	}
}

class Student
{
	private int age;
	private String name;
	private String fieldOfStudy;
	
	Student(String name, int age, String fieldOfStudy)
	{
		this.age = age;
		this.name = name;
		this.fieldOfStudy = fieldOfStudy;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getFieldOfStudy()
	{
		return this.fieldOfStudy;
	}
}
