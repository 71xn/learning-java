
// Tutorial 15
// Getters and Return Values

class Person {
	
	String name;
	int age;
	
	void speak() {
		System.out.println("My name is: " + name);
	}
	
	// Methods are usually used to calculate something
	// void means return no data
	// To return data you need to replace void with the data type you are returning
	
	int yearsToRetire() {
		int yearsleft = 65 - age;
		return yearsleft;
	}
	
	// Getter method, it gets the age of the object and returns is
	int getAge() {
		return age;
	}
	
	String getName() {
		return name;
	}
	
}


public class App {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Joe";
		person1.age = 25;
		
		person1.speak();
		System.out.println(person1.yearsToRetire());
		System.out.println(person1.getAge());
		System.out.println(person1.getName());
		
	}
	
}
