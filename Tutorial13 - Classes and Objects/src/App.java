import java.util.ArrayList;
import java.util.List;

// Tutorial 13
// Classes and Objects

public class App {
	
	// Class names need to start with a capital letter
	// Only one public class per Java file
	// A class is a blueprint for creating objects
	
	// Classes can contain:
	// 1. Data
	// Instance variables (data or "state")
	// 2. Subroutines (methods)
	
	public static void main(String[] args) {
		Person person1 = new Person(); // Creating a person object using the Person class
		person1.name = "Joe Bloggs";
		person1.age = 37;
		
		Person person2 = new Person();
		person2.name = "Sarah Smith";
		person2.age = 20;
		
		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person2.name);
		System.out.println(person2.age);
		
		// Objects can be decalred using a superclass such as List for declaring a new ArrayList Object
		List<String> list = new ArrayList<String>();
	}
	
}

// You can have two different classes but only one public one
class Person {
	// This person class is a way of creating person objects
	// Almost like a type
	
	String name;
	int age;
	
}
