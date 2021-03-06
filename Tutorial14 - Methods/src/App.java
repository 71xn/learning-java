
// Tutorial 14
// Classes and Objects and Methods (subroutines)

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
		
		/**
		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person2.name);
		System.out.println(person2.age);
		**/
		person1.speak();
		person2.speak(); // Calling the speak method from the person2 object
		
		person1.sayHello();
	}
	
}


class Person {
	// This person class is a way of creating person objects
	// Almost like a type
	
	// Instance variables
	String name;
	int age;
	
	void speak() {
		System.out.println("Hello, my name is: " + name + " and I am " + age + " years old!");
	}
	
	void sayHello() {
		System.out.println("Hello There!");
	}
	
}
