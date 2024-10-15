package _05_method_and_constructor_reference;

interface Interf
{
	Student get();
}

class Student
{
	Student(){
		System.out.println("This is student class constructor");
	}
	
	@Override
	public String toString() {
		
		return "This is Student class";
	}
}

public class ConstructorRefExample {

	public static void main(String[] args) {
		
		Interf i = Student :: new;
		Student john = i.get();
		System.out.println(john);
	}
}

