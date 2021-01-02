
// Tutorial 42
// Equals Method

// Only use the == to compare primitive types, use .equals for Objects and non-primitive types

class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}

public class App {

	public static void main(String[] args) {
		
		System.out.println(new Object()); // Has no toString method so returns the Objects HashCode, unique ID that each object has
		
		Person person1 = new Person(5, "Bob");
		Person person2 = new Person(5, "Bob");
		
		// Outputs false because the references are not pointing to the same object
		// This is comparing non-primitive types
		System.out.println(person1 == person2);
		
		// The equals method is a method inherited from the Object superclass, we can override it to compare the fields we want to use
		System.out.println(person1.equals(person2));
		
		
		// Numbers
		
		Double value1 = 7.2;
		Double value2 = 7.2;
		
		// False because we have declared the doubles as non-primitive types, they are Objects of the Double class
		System.out.println(value1 == value2);
		// THis returns true because we are comparing the instance variables rather then the whole object pointer
		System.out.println(value1.equals(value2));
		
		// Java making a pointer to number1 with number2 as it already has an Object for the integer 6
		Integer number1 = 6;
		Integer number2 = 6;
		
		System.out.println(number1 == number2);
		
		
		// Strings
		
		String text1 = "Hello";
		String text2 = "Hello";
		
		System.out.println(text1 == text2);
		System.out.println(text1.equals(text2));
		
		
		
	}

}
